package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a linked account.
  */
@js.native
trait SchemaAccountRef extends js.Object {
  /**
    * Link for this account.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Analytics account reference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAccountRef {
  @scala.inline
  def apply(href: String = null, id: String = null, kind: String = null, name: String = null): SchemaAccountRef = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountRef]
  }
}

