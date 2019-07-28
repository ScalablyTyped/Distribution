package typings.inDashAppDashPurchase.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchasedItem extends js.Object {
    // only Apple
  var appItemId: js.UndefOr[String] = js.undefined
  var bundleId: js.UndefOr[String] = js.undefined
   // only Apple
  var cancellationDate: js.UndefOr[Double] = js.undefined
   // only Apple/Google
  // iTunes, windows and amazon subscription only
  // Google subscriptions only with google play store api info
  var expirationDate: js.UndefOr[Double] = js.undefined
  var isTrial: js.UndefOr[Boolean] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
  var originalPurchaseDate: js.UndefOr[String] = js.undefined
   // only Google
  var originalTransactionId: js.UndefOr[String] = js.undefined
  var productId: String
   // only Apple
  var purchaseDate: Double | String
  var quantity: Double
   // only Apple
  var transactionId: String
}

object PurchasedItem {
  @scala.inline
  def apply(
    productId: String,
    purchaseDate: Double | String,
    quantity: Double,
    transactionId: String,
    appItemId: String = null,
    bundleId: String = null,
    cancellationDate: Int | Double = null,
    expirationDate: Int | Double = null,
    isTrial: js.UndefOr[Boolean] = js.undefined,
    orderId: String = null,
    originalPurchaseDate: String = null,
    originalTransactionId: String = null
  ): PurchasedItem = {
    val __obj = js.Dynamic.literal(productId = productId, purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity, transactionId = transactionId)
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

