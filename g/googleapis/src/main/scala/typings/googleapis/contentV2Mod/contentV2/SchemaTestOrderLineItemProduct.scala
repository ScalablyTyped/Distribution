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
  def apply(
    brand: String = null,
    channel: String = null,
    condition: String = null,
    contentLanguage: String = null,
    gtin: String = null,
    imageLink: String = null,
    itemGroupId: String = null,
    mpn: String = null,
    offerId: String = null,
    price: SchemaPrice = null,
    targetCountry: String = null,
    title: String = null,
    variantAttributes: js.Array[SchemaOrderLineItemProductVariantAttribute] = null
  ): SchemaTestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink.asInstanceOf[js.Any])
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId.asInstanceOf[js.Any])
    if (mpn != null) __obj.updateDynamic("mpn")(mpn.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variantAttributes != null) __obj.updateDynamic("variantAttributes")(variantAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestOrderLineItemProduct]
  }
}

