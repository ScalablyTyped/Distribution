package typings
package inDashAppDashPurchaseLib.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AMAZON: /* amazon */ java.lang.String = js.native
  val APPLE: /* apple */ java.lang.String = js.native
  val GOOGLE: /* google */ java.lang.String = js.native
  val ROKU: /* roku */ java.lang.String = js.native
  val UNITY: /* unity */ java.lang.String = js.native
  val WINDOWS: /* windows */ java.lang.String = js.native
  def config(params: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Config): scala.Unit = js.native
  def getPurchaseData(): js.Array[inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.PurchasedItem] | scala.Null = js.native
  def getPurchaseData(purchaseData: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse): js.Array[inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.PurchasedItem] | scala.Null = js.native
  def getPurchaseData(
    purchaseData: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse,
    options: inDashAppDashPurchaseLib.Anon_IgnoreCanceled
  ): js.Array[inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.PurchasedItem] | scala.Null = js.native
  def getService(receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt): inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Service = js.native
  def isCanceled(item: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.PurchasedItem): scala.Boolean = js.native
  def isExpired(item: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.PurchasedItem): scala.Boolean = js.native
  def isValidated(response: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse): scala.Boolean = js.native
  def refreshGoogleToken(): js.Promise[scala.Unit] = js.native
  def refreshGoogleToken(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setup(): js.Promise[scala.Unit] = js.native
  def setup(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def validate(receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt): js.Promise[inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse] = js.native
  def validate(
    receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt,
    callback: js.Function2[
      /* err */ js.Any, 
      /* res */ inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validate(
    service: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Service,
    receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt,
    callback: js.Function2[
      /* err */ js.Any, 
      /* res */ inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validateOnce(receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt, secretOrPubKey: js.Any): js.Promise[inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse] = js.native
  def validateOnce(
    receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt,
    secretOrPubKey: js.Any,
    callback: js.Function2[
      /* err */ js.Any, 
      /* res */ inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validateOnce(
    service: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Service,
    secretOrPubKey: js.Any,
    receipt: inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.Receipt,
    callback: js.Function2[
      /* err */ js.Any, 
      /* res */ inDashAppDashPurchaseLib.inDashAppDashPurchaseMod.ValidationResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

