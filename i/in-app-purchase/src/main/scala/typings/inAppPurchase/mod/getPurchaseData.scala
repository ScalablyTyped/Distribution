package typings.inAppPurchase.mod

import typings.inAppPurchase.anon.IgnoreCanceled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("in-app-purchase", "getPurchaseData")
@js.native
object getPurchaseData extends js.Object {
  
  def apply(): js.Array[PurchasedItem] | Null = js.native
  def apply(purchaseData: js.UndefOr[scala.Nothing], options: IgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
  def apply(purchaseData: ValidationResponse): js.Array[PurchasedItem] | Null = js.native
  def apply(purchaseData: ValidationResponse, options: IgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
}
