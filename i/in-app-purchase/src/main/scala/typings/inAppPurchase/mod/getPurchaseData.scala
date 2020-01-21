package typings.inAppPurchase.mod

import typings.inAppPurchase.AnonIgnoreCanceled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", "getPurchaseData")
@js.native
object getPurchaseData extends js.Object {
  def apply(): js.Array[PurchasedItem] | Null = js.native
  def apply(purchaseData: ValidationResponse): js.Array[PurchasedItem] | Null = js.native
  def apply(purchaseData: ValidationResponse, options: AnonIgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
}

