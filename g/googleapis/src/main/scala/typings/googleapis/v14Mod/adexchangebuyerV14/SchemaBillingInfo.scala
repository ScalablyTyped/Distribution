package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange billing info.
  */
@js.native
trait SchemaBillingInfo extends js.Object {
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  
  /**
    * Account name.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * A list of adgroup IDs associated with this particular account. These IDs
    * may show up as part of a realtime bidding BidRequest, which indicates a
    * bid request for this account.
    */
  var billingId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBillingInfo {
  
  @scala.inline
  def apply(): SchemaBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfo]
  }
  
  @scala.inline
  implicit class SchemaBillingInfoOps[Self <: SchemaBillingInfo] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: Double): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setBillingIdVarargs(value: String*): Self = this.set("billingId", js.Array(value :_*))
    
    @scala.inline
    def setBillingId(value: js.Array[String]): Self = this.set("billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingId: Self = this.set("billingId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
