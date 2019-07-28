package typings.inDashAppDashPurchase.inDashAppDashPurchaseMod

import typings.inDashAppDashPurchase.Anon_IgnoreCanceled
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.amazon
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.apple
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.google
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.roku
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.unity
import typings.inDashAppDashPurchase.inDashAppDashPurchaseStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AMAZON: amazon = js.native
  val APPLE: apple = js.native
  val GOOGLE: google = js.native
  val ROKU: roku = js.native
  val UNITY: unity = js.native
  val WINDOWS: windows = js.native
  def config(params: Config): Unit = js.native
  def getPurchaseData(): js.Array[PurchasedItem] | Null = js.native
  def getPurchaseData(purchaseData: ValidationResponse): js.Array[PurchasedItem] | Null = js.native
  def getPurchaseData(purchaseData: ValidationResponse, options: Anon_IgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
  def getService(receipt: Receipt): Service = js.native
  def isCanceled(item: PurchasedItem): Boolean = js.native
  def isExpired(item: PurchasedItem): Boolean = js.native
  def isValidated(response: ValidationResponse): Boolean = js.native
  def refreshGoogleToken(): js.Promise[Unit] = js.native
  def refreshGoogleToken(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def reset(): Unit = js.native
  def setup(): js.Promise[Unit] = js.native
  def setup(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def validate(receipt: Receipt): js.Promise[ValidationResponse] = js.native
  def validate(receipt: Receipt, callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]): Unit = js.native
  def validate(
    service: Service,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  def validateOnce(receipt: Receipt, secretOrPubKey: js.Any): js.Promise[ValidationResponse] = js.native
  def validateOnce(
    receipt: Receipt,
    secretOrPubKey: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  def validateOnce(
    service: Service,
    secretOrPubKey: js.Any,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
}

