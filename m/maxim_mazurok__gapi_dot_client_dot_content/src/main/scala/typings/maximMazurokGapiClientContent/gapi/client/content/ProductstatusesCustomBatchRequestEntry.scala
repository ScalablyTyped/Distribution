package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductstatusesCustomBatchRequestEntry extends js.Object {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination. */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** The method of the batch entry. Acceptable values are: - "`get`" */
  var method: js.UndefOr[String] = js.native
  
  /** The ID of the product whose status to get. */
  var productId: js.UndefOr[String] = js.native
}
object ProductstatusesCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): ProductstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductstatusesCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ProductstatusesCustomBatchRequestEntryOps[Self <: ProductstatusesCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setDestinationsVarargs(value: String*): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = this.set("includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttributes: Self = this.set("includeAttributes", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
}
