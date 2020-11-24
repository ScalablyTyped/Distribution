package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyCustomBatchRequestEntry extends js.Object {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The Merchant Center account ID. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" */
  var method: js.UndefOr[String] = js.native
  
  /** The return policy to submit. This should be set only if the method is `insert`. */
  var returnPolicy: js.UndefOr[ReturnPolicy] = js.native
  
  /** The return policy ID. This should be set only if the method is `delete` or `get`. */
  var returnPolicyId: js.UndefOr[String] = js.native
}
object ReturnpolicyCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): ReturnpolicyCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ReturnpolicyCustomBatchRequestEntryOps[Self <: ReturnpolicyCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setReturnPolicy(value: ReturnPolicy): Self = this.set("returnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPolicy: Self = this.set("returnPolicy", js.undefined)
    
    @scala.inline
    def setReturnPolicyId(value: String): Self = this.set("returnPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPolicyId: Self = this.set("returnPolicyId", js.undefined)
  }
}
