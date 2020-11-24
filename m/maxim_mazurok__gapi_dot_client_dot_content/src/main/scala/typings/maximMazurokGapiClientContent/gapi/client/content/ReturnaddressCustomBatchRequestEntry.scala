package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnaddressCustomBatchRequestEntry extends js.Object {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The Merchant Center account ID. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" */
  var method: js.UndefOr[String] = js.native
  
  /** The return address to submit. This should be set only if the method is `insert`. */
  var returnAddress: js.UndefOr[ReturnAddress] = js.native
  
  /** The return address ID. This should be set only if the method is `delete` or `get`. */
  var returnAddressId: js.UndefOr[String] = js.native
}
object ReturnaddressCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): ReturnaddressCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ReturnaddressCustomBatchRequestEntryOps[Self <: ReturnaddressCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setReturnAddress(value: ReturnAddress): Self = this.set("returnAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnAddress: Self = this.set("returnAddress", js.undefined)
    
    @scala.inline
    def setReturnAddressId(value: String): Self = this.set("returnAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnAddressId: Self = this.set("returnAddressId", js.undefined)
  }
}
