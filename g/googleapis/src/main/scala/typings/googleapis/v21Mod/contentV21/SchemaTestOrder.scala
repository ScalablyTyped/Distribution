package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrder extends js.Object {
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#testOrder&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[SchemaTestOrderLineItem]] = js.native
  /**
    * Determines if test order must be pulled by merchant or pushed to merchant
    * via push integration.
    */
  var notificationMode: js.UndefOr[String] = js.native
  /**
    * The billing address.
    */
  var predefinedBillingAddress: js.UndefOr[String] = js.native
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /**
    * Email address of the customer.
    */
  var predefinedEmail: js.UndefOr[String] = js.native
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.native
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  /**
    * The requested shipping option.
    */
  var shippingOption: js.UndefOr[String] = js.native
}

object SchemaTestOrder {
  @scala.inline
  def apply(
    enableOrderinvoices: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lineItems: js.Array[SchemaTestOrderLineItem] = null,
    notificationMode: String = null,
    predefinedBillingAddress: String = null,
    predefinedDeliveryAddress: String = null,
    predefinedEmail: String = null,
    promotions: js.Array[SchemaOrderPromotion] = null,
    shippingCost: SchemaPrice = null,
    shippingOption: String = null
  ): SchemaTestOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableOrderinvoices)) __obj.updateDynamic("enableOrderinvoices")(enableOrderinvoices.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (notificationMode != null) __obj.updateDynamic("notificationMode")(notificationMode.asInstanceOf[js.Any])
    if (predefinedBillingAddress != null) __obj.updateDynamic("predefinedBillingAddress")(predefinedBillingAddress.asInstanceOf[js.Any])
    if (predefinedDeliveryAddress != null) __obj.updateDynamic("predefinedDeliveryAddress")(predefinedDeliveryAddress.asInstanceOf[js.Any])
    if (predefinedEmail != null) __obj.updateDynamic("predefinedEmail")(predefinedEmail.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestOrder]
  }
}

