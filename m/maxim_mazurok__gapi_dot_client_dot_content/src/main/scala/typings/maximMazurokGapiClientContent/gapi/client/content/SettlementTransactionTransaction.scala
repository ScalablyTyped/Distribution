package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementTransactionTransaction extends js.Object {
  
  /** The time on which the event occurred in ISO 8601 format. */
  var postDate: js.UndefOr[String] = js.native
  
  /**
    * The type of the transaction that occurred. Acceptable values are: - "`order`" - "`reversal`" - "`orderRefund`" - "`reversalRefund`" - "`issueRelatedRefundAndReplacement`" -
    * "`returnLabelShippingFeeTransaction`" - "`reversalIssueRelatedRefundAndReplacement`" - "`reversalReturnLabelShippingFeeTransaction`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object SettlementTransactionTransaction {
  
  @scala.inline
  def apply(): SettlementTransactionTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionTransaction]
  }
  
  @scala.inline
  implicit class SettlementTransactionTransactionOps[Self <: SettlementTransactionTransaction] (val x: Self) extends AnyVal {
    
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
    def setPostDate(value: String): Self = this.set("postDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostDate: Self = this.set("postDate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
