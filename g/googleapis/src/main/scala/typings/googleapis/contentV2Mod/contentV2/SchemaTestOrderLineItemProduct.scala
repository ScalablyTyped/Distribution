package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrderLineItemProduct extends js.Object {
  /**
    * Brand of the item.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Deprecated.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * Condition or state of the item.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Global Trade Item Number (GTIN) of the item. Optional.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * URL of an image of the item.
    */
  var imageLink: js.UndefOr[String] = js.native
  /**
    * Shared identifier for all variants of the same product. Optional.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * Manufacturer Part Number (MPN) of the item. Optional.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * An identifier of the item.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * The price for the product. Tax is automatically calculated for MFL
    * orders. For non-MFL orders, tax settings from Merchant Center are
    * applied.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * The CLDR territory code of the target country of the product.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Variant attributes for the item. Optional.
    */
  var variantAttributes: js.UndefOr[js.Array[SchemaOrderLineItemProductVariantAttribute]] = js.native
}

object SchemaTestOrderLineItemProduct {
  @scala.inline
  def apply(): SchemaTestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderLineItemProduct]
  }
  @scala.inline
  implicit class SchemaTestOrderLineItemProductOps[Self <: SchemaTestOrderLineItemProduct] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setGtin(value: String): Self = this.set("gtin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGtin: Self = this.set("gtin", js.undefined)
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
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVariantAttributesVarargs(value: SchemaOrderLineItemProductVariantAttribute*): Self = this.set("variantAttributes", js.Array(value :_*))
    @scala.inline
    def setVariantAttributes(value: js.Array[SchemaOrderLineItemProductVariantAttribute]): Self = this.set("variantAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantAttributes: Self = this.set("variantAttributes", js.undefined)
  }
  
}

