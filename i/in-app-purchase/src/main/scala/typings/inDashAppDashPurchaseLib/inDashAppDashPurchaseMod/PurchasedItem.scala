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

