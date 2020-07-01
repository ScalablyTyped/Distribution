package typings.googleapis.v11Mod.androidpublisherV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An InappPurchase resource indicates the status of a user&#39;s inapp
  * product purchase.
  */
@js.native
trait SchemaInappPurchase extends js.Object {
  /**
    * The consumption state of the inapp product. Possible values are:   - Yet
    * to be consumed  - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.native
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * This kind represents an inappPurchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The order id associated with the purchase of the inapp product.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The purchase state of the order. Possible values are:   - Purchased  -
    * Canceled
    */
  var purchaseState: js.UndefOr[Double] = js.native
  /**
    * The time the product was purchased, in milliseconds since the epoch (Jan
    * 1, 1970).
    */
  var purchaseTime: js.UndefOr[String] = js.native
  /**
    * The type of purchase of the inapp product. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)  -
    * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
    * a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.native
}

object SchemaInappPurchase {
  @scala.inline
  def apply(
    consumptionState: js.UndefOr[Double] = js.undefined,
    developerPayload: String = null,
    kind: String = null,
    orderId: String = null,
    purchaseState: js.UndefOr[Double] = js.undefined,
    purchaseTime: String = null,
    purchaseType: js.UndefOr[Double] = js.undefined
  ): SchemaInappPurchase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consumptionState)) __obj.updateDynamic("consumptionState")(consumptionState.get.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (!js.isUndefined(purchaseState)) __obj.updateDynamic("purchaseState")(purchaseState.get.asInstanceOf[js.Any])
    if (purchaseTime != null) __obj.updateDynamic("purchaseTime")(purchaseTime.asInstanceOf[js.Any])
    if (!js.isUndefined(purchaseType)) __obj.updateDynamic("purchaseType")(purchaseType.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInappPurchase]
  }
}

