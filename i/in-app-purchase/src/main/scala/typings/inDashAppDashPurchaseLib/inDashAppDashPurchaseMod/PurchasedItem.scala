package typings
package inDashAppDashPurchaseLib.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchasedItem extends js.Object {
    // only Apple
  var appItemId: js.UndefOr[java.lang.String] = js.undefined
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
   // only Apple
  var cancellationDate: js.UndefOr[scala.Double] = js.undefined
   // only Apple/Google
  // iTunes, windows and amazon subscription only
  // Google subscriptions only with google play store api info
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  var isTrial: js.UndefOr[scala.Boolean] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var originalPurchaseDate: js.UndefOr[java.lang.String] = js.undefined
   // only Google
  var originalTransactionId: js.UndefOr[java.lang.String] = js.undefined
  var productId: java.lang.String
   // only Apple
  var purchaseDate: scala.Double | java.lang.String
  var quantity: scala.Double
   // only Apple
  var transactionId: java.lang.String
}

object PurchasedItem {
  @scala.inline
  def apply(
    productId: java.lang.String,
    purchaseDate: scala.Double | java.lang.String,
    quantity: scala.Double,
    transactionId: java.lang.String,
    appItemId: java.lang.String = null,
    bundleId: java.lang.String = null,
    cancellationDate: scala.Int | scala.Double = null,
    expirationDate: scala.Int | scala.Double = null,
    isTrial: js.UndefOr[scala.Boolean] = js.undefined,
    orderId: java.lang.String = null,
    originalPurchaseDate: java.lang.String = null,
    originalTransactionId: java.lang.String = null
  ): PurchasedItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("productId")(productId)
    __obj.updateDynamic("purchaseDate")(purchaseDate.asInstanceOf[js.Any])
    __obj.updateDynamic("quantity")(quantity)
    __obj.updateDynamic("transactionId")(transactionId)
    if (appItemId != null) __obj.updateDynamic("appItemId")(appItemId)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (cancellationDate != null) __obj.updateDynamic("cancellationDate")(cancellationDate.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrial)) __obj.updateDynamic("isTrial")(isTrial)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (originalPurchaseDate != null) __obj.updateDynamic("originalPurchaseDate")(originalPurchaseDate)
    if (originalTransactionId != null) __obj.updateDynamic("originalTransactionId")(originalTransactionId)
    __obj.asInstanceOf[PurchasedItem]
  }
}

