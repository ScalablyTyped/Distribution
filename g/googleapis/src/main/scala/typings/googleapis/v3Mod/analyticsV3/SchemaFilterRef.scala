package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a profile filter link.
  */
@js.native
trait SchemaFilterRef extends js.Object {
  /**
    * Account ID to which this filter belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Link for this filter.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Filter ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind value for filter reference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this filter.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFilterRef {
  @scala.inline
  def apply(
    accountId: String = null,
    href: String = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): SchemaFilterRef = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterRef]
  }
}

