package typings
package inDashAppDashPurchaseLib.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", JSImport.Namespace)
@js.native
object inDashAppDashPurchaseModMembers extends js.Object {
  val AMAZON: /* amazon */ java.lang.String = js.native
  val APPLE: /* apple */ java.lang.String = js.native
  val GOOGLE: /* google */ java.lang.String = js.native
  val ROKU: /* roku */ java.lang.String = js.native
  val UNITY: /* unity */ java.lang.String = js.native
  val WINDOWS: /* windows */ java.lang.String = js.native
  def config(params: Config): scala.Unit = js.native
  def getPurchaseData(): js.Array[PurchasedItem] | scala.Null = js.native
  def getPurchaseData(purchaseData: ValidationResponse): js.Array[PurchasedItem] | scala.Null = js.native
  def getPurchaseData(purchaseData: ValidationResponse, options: inDashAppDashPurchaseLib.Anon_IgnoreCanceled): js.Array[PurchasedItem] | scala.Null = js.native
  def getService(receipt: Receipt): Service = js.native
  def isCanceled(item: PurchasedItem): scala.Boolean = js.native
  def isExpired(item: PurchasedItem): scala.Boolean = js.native
  def isValidated(response: ValidationResponse): scala.Boolean = js.native
  def refreshGoogleToken(): js.Promise[scala.Unit] = js.native
  def refreshGoogleToken(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setup(): js.Promise[scala.Unit] = js.native
  def setup(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def validate(receipt: Receipt): js.Promise[ValidationResponse] = js.native
  def validate(
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, scala.Unit]
  ): scala.Unit = js.native
  def validate(
    service: Service,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, scala.Unit]
  ): scala.Unit = js.native
  def validateOnce(receipt: Receipt, secretOrPubKey: js.Any): js.Promise[ValidationResponse] = js.native
  def validateOnce(
    receipt: Receipt,
    secretOrPubKey: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, scala.Unit]
  ): scala.Unit = js.native
  def validateOnce(
    service: Service,
    secretOrPubKey: js.Any,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, scala.Unit]
  ): scala.Unit = js.native
}

