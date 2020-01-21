package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInventory extends js.Object {
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel0: js.UndefOr[String] = js.native
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel1: js.UndefOr[String] = js.native
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel2: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel3: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel4: js.UndefOr[String] = js.native
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.native
  /**
    * The instore product location. Supported only for local products.
    */
  var instoreProductLocation: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.native
  /**
    * Store pickup information. Only supported for local inventory. Not setting
    * pickup means &quot;don&#39;t update&quot; while setting it to the empty
    * value ({} in JSON) means &quot;delete&quot;. Otherwise, pickupMethod and
    * pickupSla must be set together, unless pickupMethod is &quot;not
    * supported&quot;.
    */
  var pickup: js.UndefOr[SchemaInventoryPickup] = js.native
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * The quantity of the product. Must be equal to or greater than zero.
    * Supported only for local products.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}

object SchemaInventory {
  @scala.inline
  def apply(
    availability: String = null,
    customLabel0: String = null,
    customLabel1: String = null,
    customLabel2: String = null,
    customLabel3: String = null,
    customLabel4: String = null,
    installment: SchemaInstallment = null,
    instoreProductLocation: String = null,
    kind: String = null,
    loyaltyPoints: SchemaLoyaltyPoints = null,
    pickup: SchemaInventoryPickup = null,
    price: SchemaPrice = null,
    quantity: Int | Double = null,
    salePrice: SchemaPrice = null,
    salePriceEffectiveDate: String = null,
    sellOnGoogleQuantity: Int | Double = null
  ): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0.asInstanceOf[js.Any])
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1.asInstanceOf[js.Any])
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2.asInstanceOf[js.Any])
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3.asInstanceOf[js.Any])
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4.asInstanceOf[js.Any])
    if (installment != null) __obj.updateDynamic("installment")(installment.asInstanceOf[js.Any])
    if (instoreProductLocation != null) __obj.updateDynamic("instoreProductLocation")(instoreProductLocation.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints.asInstanceOf[js.Any])
    if (pickup != null) __obj.updateDynamic("pickup")(pickup.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice.asInstanceOf[js.Any])
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate.asInstanceOf[js.Any])
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventory]
  }
}

