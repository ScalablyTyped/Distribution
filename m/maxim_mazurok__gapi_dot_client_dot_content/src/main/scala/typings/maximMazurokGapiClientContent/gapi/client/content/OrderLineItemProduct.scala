package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLineItemProduct extends js.Object {
  
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.native
  
  /** Condition or state of the item. Acceptable values are: - "`new`" - "`refurbished`" - "`used`" */
  var condition: js.UndefOr[String] = js.native
  
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /** Associated fees at order creation time. */
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.native
  
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.native
  
  /** The REST ID of the product. */
  var id: js.UndefOr[String] = js.native
  
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.native
  
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.native
  
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.native
  
  /** An identifier of the item. */
  var offerId: js.UndefOr[String] = js.native
  
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.native
  
  /** URL to the cached image shown to the user when order was placed. */
  var shownImage: js.UndefOr[String] = js.native
  
  /** The CLDR territory // code of the target country of the product. */
  var targetCountry: js.UndefOr[String] = js.native
  
  /** The title of the product. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Variant attributes for the item. These are dimensions of the product, such as color, gender, material, pattern, and size. You can find a comprehensive list of variant attributes
    * here.
    */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.native
}
object OrderLineItemProduct {
  
  @scala.inline
  def apply(): OrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProduct]
  }
  
  @scala.inline
  implicit class OrderLineItemProductOps[Self <: OrderLineItemProduct] (val x: Self) extends AnyVal {
    
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setFeesVarargs(value: OrderLineItemProductFee*): Self = this.set("fees", js.Array(value :_*))
    
    @scala.inline
    def setFees(value: js.Array[OrderLineItemProductFee]): Self = this.set("fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFees: Self = this.set("fees", js.undefined)
    
    @scala.inline
    def setGtin(value: String): Self = this.set("gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGtin: Self = this.set("gtin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageLink(value: String): Self = this.set("imageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLink: Self = this.set("imageLink", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = this.set("itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGroupId: Self = this.set("itemGroupId", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = this.set("mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpn: Self = this.set("mpn", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setShownImage(value: String): Self = this.set("shownImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShownImage: Self = this.set("shownImage", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVariantAttributesVarargs(value: OrderLineItemProductVariantAttribute*): Self = this.set("variantAttributes", js.Array(value :_*))
    
    @scala.inline
    def setVariantAttributes(value: js.Array[OrderLineItemProductVariantAttribute]): Self = this.set("variantAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariantAttributes: Self = this.set("variantAttributes", js.undefined)
  }
}
