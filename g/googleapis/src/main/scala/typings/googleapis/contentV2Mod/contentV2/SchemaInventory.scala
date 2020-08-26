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
  def apply(): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventory]
  }
  @scala.inline
  implicit class SchemaInventoryOps[Self <: SchemaInventory] (val x: Self) extends AnyVal {
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
    def setCustomLabel0(value: String): Self = this.set("customLabel0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabel0: Self = this.set("customLabel0", js.undefined)
    @scala.inline
    def setCustomLabel1(value: String): Self = this.set("customLabel1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabel1: Self = this.set("customLabel1", js.undefined)
    @scala.inline
    def setCustomLabel2(value: String): Self = this.set("customLabel2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabel2: Self = this.set("customLabel2", js.undefined)
    @scala.inline
    def setCustomLabel3(value: String): Self = this.set("customLabel3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabel3: Self = this.set("customLabel3", js.undefined)
    @scala.inline
    def setCustomLabel4(value: String): Self = this.set("customLabel4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabel4: Self = this.set("customLabel4", js.undefined)
    @scala.inline
    def setInstallment(value: SchemaInstallment): Self = this.set("installment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallment: Self = this.set("installment", js.undefined)
    @scala.inline
    def setInstoreProductLocation(value: String): Self = this.set("instoreProductLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstoreProductLocation: Self = this.set("instoreProductLocation", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLoyaltyPoints(value: SchemaLoyaltyPoints): Self = this.set("loyaltyPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoyaltyPoints: Self = this.set("loyaltyPoints", js.undefined)
    @scala.inline
    def setPickup(value: SchemaInventoryPickup): Self = this.set("pickup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickup: Self = this.set("pickup", js.undefined)
    @scala.inline
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setSalePrice(value: SchemaPrice): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
    @scala.inline
    def setSellOnGoogleQuantity(value: Double): Self = this.set("sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellOnGoogleQuantity: Self = this.set("sellOnGoogleQuantity", js.undefined)
  }
  
}

