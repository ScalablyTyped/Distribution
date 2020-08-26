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
  def apply(): SchemaBillingInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfoList]
  }
  @scala.inline
  implicit class SchemaBillingInfoListOps[Self <: SchemaBillingInfoList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: SchemaBillingInfo*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaBillingInfo]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

