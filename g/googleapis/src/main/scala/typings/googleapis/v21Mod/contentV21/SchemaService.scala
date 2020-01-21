package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaService extends js.Object {
  /**
    * A boolean exposing the active status of the shipping service. Required.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The CLDR code of the currency to which this service applies. Must match
    * that of the prices in rate groups.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code of the country to which the service applies.
    * Required.
    */
  var deliveryCountry: js.UndefOr[String] = js.native
  /**
    * Time spent in various aspects from order to the delivery of the product.
    * Required.
    */
  var deliveryTime: js.UndefOr[SchemaDeliveryTime] = js.native
  /**
    * Eligibility for this service.
    */
  var eligibility: js.UndefOr[String] = js.native
  /**
    * Minimum order value for this service. If set, indicates that customers
    * will have to spend at least this amount. All prices within a service must
    * have the same currency.
    */
  var minimumOrderValue: js.UndefOr[SchemaPrice] = js.native
  /**
    * Free-form name of the service. Must be unique within target account.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an
    * empty applicableShippingLabels, which means &quot;everything else&quot;.
    * The other applicableShippingLabels must not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[SchemaRateGroup]] = js.native
}

object SchemaService {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    currency: String = null,
    deliveryCountry: String = null,
    deliveryTime: SchemaDeliveryTime = null,
    eligibility: String = null,
    minimumOrderValue: SchemaPrice = null,
    name: String = null,
    rateGroups: js.Array[SchemaRateGroup] = null
  ): SchemaService = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (deliveryCountry != null) __obj.updateDynamic("deliveryCountry")(deliveryCountry.asInstanceOf[js.Any])
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime.asInstanceOf[js.Any])
    if (eligibility != null) __obj.updateDynamic("eligibility")(eligibility.asInstanceOf[js.Any])
    if (minimumOrderValue != null) __obj.updateDynamic("minimumOrderValue")(minimumOrderValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rateGroups != null) __obj.updateDynamic("rateGroups")(rateGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaService]
  }
}

