package typings.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchasedItem extends js.Object {
    // only Apple
  var appItemId: js.UndefOr[String] = js.native
  var bundleId: js.UndefOr[String] = js.native
   // only Apple
  var cancellationDate: js.UndefOr[Double] = js.native
   // only Apple/Google
  // iTunes, windows and amazon subscription only
  // Google subscriptions only with google play store api info
  var expirationDate: js.UndefOr[Double | String] = js.native
  var isTrial: js.UndefOr[Boolean] = js.native
  var orderId: js.UndefOr[String] = js.native
  var originalPurchaseDate: js.UndefOr[String] = js.native
   // only Google
  var originalTransactionId: js.UndefOr[String] = js.native
  var productId: String = js.native
   // only Apple
  var purchaseDate: Double | String = js.native
  var quantity: Double = js.native
   // only Apple
  var transactionId: String = js.native
}

object PurchasedItem {
  @scala.inline
  def apply(productId: String, purchaseDate: Double | String, quantity: Double, transactionId: String): PurchasedItem = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasedItem]
  }
  @scala.inline
  implicit class PurchasedItemOps[Self <: PurchasedItem] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchaseDate(value: Double | String): Self = this.set("purchaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppItemId(value: String): Self = this.set("appItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppItemId: Self = this.set("appItemId", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCancellationDate(value: Double): Self = this.set("cancellationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellationDate: Self = this.set("cancellationDate", js.undefined)
    @scala.inline
    def setExpirationDate(value: Double | String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setIsTrial(value: Boolean): Self = this.set("isTrial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTrial: Self = this.set("isTrial", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setOriginalPurchaseDate(value: String): Self = this.set("originalPurchaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPurchaseDate: Self = this.set("originalPurchaseDate", js.undefined)
    @scala.inline
    def setOriginalTransactionId(value: String): Self = this.set("originalTransactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalTransactionId: Self = this.set("originalTransactionId", js.undefined)
  }
  
}

