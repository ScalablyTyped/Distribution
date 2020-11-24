package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosCustomBatchRequestEntry extends js.Object {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The inventory to submit. This should be set only if the method is `inventory`. */
  var inventory: js.UndefOr[PosInventory] = js.native
  
  /** The ID of the POS data provider. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** The method of the batch entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" - "`inventory`" - "`sale`" */
  var method: js.UndefOr[String] = js.native
  
  /** The sale information to submit. This should be set only if the method is `sale`. */
  var sale: js.UndefOr[PosSale] = js.native
  
  /** The store information to submit. This should be set only if the method is `insert`. */
  var store: js.UndefOr[PosStore] = js.native
  
  /** The store code. This should be set only if the method is `delete` or `get`. */
  var storeCode: js.UndefOr[String] = js.native
  
  /** The ID of the account for which to get/submit data. */
  var targetMerchantId: js.UndefOr[String] = js.native
}
object PosCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): PosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class PosCustomBatchRequestEntryOps[Self <: PosCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setInventory(value: PosInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setSale(value: PosSale): Self = this.set("sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSale: Self = this.set("sale", js.undefined)
    
    @scala.inline
    def setStore(value: PosStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
    
    @scala.inline
    def setTargetMerchantId(value: String): Self = this.set("targetMerchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetMerchantId: Self = this.set("targetMerchantId", js.undefined)
  }
}
