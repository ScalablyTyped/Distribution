package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalInventory extends js.Object {
  
  /** Availability of the product. For accepted attribute values, see the local product inventory feed specification. */
  var availability: js.UndefOr[String] = js.native
  
  /** In-store product location. */
  var instoreProductLocation: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#localInventory`" */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Supported pickup method for this offer. Unless the value is "not supported", this field must be submitted together with `pickupSla`. For accepted attribute values, see the local
    * product inventory feed // specification.
    */
  var pickupMethod: js.UndefOr[String] = js.native
  
  /**
    * Expected date that an order will be ready for pickup relative to the order date. Must be submitted together with `pickupMethod`. For accepted attribute values, see the local product
    * inventory feed specification.
    */
  var pickupSla: js.UndefOr[String] = js.native
  
  /** Price of the product. */
  var price: js.UndefOr[Price] = js.native
  
  /** Quantity of the product. Must be nonnegative. */
  var quantity: js.UndefOr[Double] = js.native
  
  /** Sale price of the product. Mandatory if `sale_price_effective_date` is defined. */
  var salePrice: js.UndefOr[Price] = js.native
  
  /** A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates may be specified as 'null' if undecided. */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  
  /** Required. Store code of this local inventory resource. */
  var storeCode: js.UndefOr[String] = js.native
}
object LocalInventory {
  
  @scala.inline
  def apply(): LocalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalInventory]
  }
  
  @scala.inline
  implicit class LocalInventoryOps[Self <: LocalInventory] (val x: Self) extends AnyVal {
    
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
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setInstoreProductLocation(value: String): Self = this.set("instoreProductLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstoreProductLocation: Self = this.set("instoreProductLocation", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPickupMethod(value: String): Self = this.set("pickupMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupMethod: Self = this.set("pickupMethod", js.undefined)
    
    @scala.inline
    def setPickupSla(value: String): Self = this.set("pickupSla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupSla: Self = this.set("pickupSla", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setSalePrice(value: Price): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
  }
}
