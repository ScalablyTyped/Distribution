package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseProduct extends js.Object {
  var can_share_to_story: Boolean
  var checkout_style: String
  var current_price: String
  var current_price_stripped: String
  var description: String
  var external_url: String
  var full_price: String
  var full_price_stripped: String
  var has_viewer_saved: Boolean
  var main_image: SavedFeedResponseMain_image
  var merchant: SavedFeedResponseMerchant
  var name: String
  var price: String
  var product_id: String
  var retailer_id: String
  var review_status: String
  var thumbnail_image: SavedFeedResponseThumbnail_image
  var variant_values: js.UndefOr[js.Array[SavedFeedResponseVariantValuesItem]] = js.undefined
}

object SavedFeedResponseProduct {
  @scala.inline
  def apply(
    can_share_to_story: Boolean,
    checkout_style: String,
    current_price: String,
    current_price_stripped: String,
    description: String,
    external_url: String,
    full_price: String,
    full_price_stripped: String,
    has_viewer_saved: Boolean,
    main_image: SavedFeedResponseMain_image,
    merchant: SavedFeedResponseMerchant,
    name: String,
    price: String,
    product_id: String,
    retailer_id: String,
    review_status: String,
    thumbnail_image: SavedFeedResponseThumbnail_image,
    variant_values: js.Array[SavedFeedResponseVariantValuesItem] = null
  ): SavedFeedResponseProduct = {
    val __obj = js.Dynamic.literal(can_share_to_story = can_share_to_story, checkout_style = checkout_style, current_price = current_price, current_price_stripped = current_price_stripped, description = description, external_url = external_url, full_price = full_price, full_price_stripped = full_price_stripped, has_viewer_saved = has_viewer_saved, main_image = main_image, merchant = merchant, name = name, price = price, product_id = product_id, retailer_id = retailer_id, review_status = review_status, thumbnail_image = thumbnail_image)
    if (variant_values != null) __obj.updateDynamic("variant_values")(variant_values)
    __obj.asInstanceOf[SavedFeedResponseProduct]
  }
}

