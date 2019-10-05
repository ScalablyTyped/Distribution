package typings.inDashAppDashPurchase.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", "validateOnce")
@js.native
object validateOnce extends js.Object {
  def apply(receipt: Receipt, secretOrPubKey: js.Any): js.Promise[ValidationResponse] = js.native
  def apply(
    receipt: Receipt,
    secretOrPubKey: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  def apply(
    service: Service,
    secretOrPubKey: js.Any,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
}

