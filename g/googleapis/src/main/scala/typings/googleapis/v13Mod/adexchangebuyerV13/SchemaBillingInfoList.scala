package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A billing info feed lists Billing Info the Ad Exchange buyer account has
  * access to. Each entry in the feed corresponds to a single billing info.
  */
@js.native
trait SchemaBillingInfoList extends js.Object {
  /**
    * A list of billing info relevant for your account.
    */
  var items: js.UndefOr[js.Array[SchemaBillingInfo]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBillingInfoList {
  @scala.inline
  def apply(items: js.Array[SchemaBillingInfo] = null, kind: String = null): SchemaBillingInfoList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBillingInfoList]
  }
}

