package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementReport extends js.Object {
  
  /** The end date on which all transactions are included in the report, in ISO 8601 format. */
  var endDate: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#settlementReport`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The residual amount from the previous invoice. This is set only if the previous invoices are not paid because of negative balance. */
  var previousBalance: js.UndefOr[Price] = js.native
  
  /** The ID of the settlement report. */
  var settlementId: js.UndefOr[String] = js.native
  
  /** The start date on which all transactions are included in the report, in ISO 8601 format. */
  var startDate: js.UndefOr[String] = js.native
  
  /** The money due to the merchant. */
  var transferAmount: js.UndefOr[Price] = js.native
  
  /** Date on which transfer for this payment was initiated by Google, in ISO 8601 format. */
  var transferDate: js.UndefOr[String] = js.native
  
  /** The list of bank identifiers used for the transfer. e.g. Trace ID for Federal Automated Clearing House (ACH). This may also be known as the Wire ID. */
  var transferIds: js.UndefOr[js.Array[String]] = js.native
}
object SettlementReport {
  
  @scala.inline
  def apply(): SettlementReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementReport]
  }
  
  @scala.inline
  implicit class SettlementReportOps[Self <: SettlementReport] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPreviousBalance(value: Price): Self = this.set("previousBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousBalance: Self = this.set("previousBalance", js.undefined)
    
    @scala.inline
    def setSettlementId(value: String): Self = this.set("settlementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettlementId: Self = this.set("settlementId", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTransferAmount(value: Price): Self = this.set("transferAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferAmount: Self = this.set("transferAmount", js.undefined)
    
    @scala.inline
    def setTransferDate(value: String): Self = this.set("transferDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferDate: Self = this.set("transferDate", js.undefined)
    
    @scala.inline
    def setTransferIdsVarargs(value: String*): Self = this.set("transferIds", js.Array(value :_*))
    
    @scala.inline
    def setTransferIds(value: js.Array[String]): Self = this.set("transferIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferIds: Self = this.set("transferIds", js.undefined)
  }
}
