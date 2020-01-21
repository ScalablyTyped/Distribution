package typings.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("in-app-purchase", "validate")
@js.native
object validate extends js.Object {
  def apply(receipt: Receipt): js.Promise[ValidationResponse] = js.native
  def apply(receipt: Receipt, callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]): Unit = js.native
  def apply(
    service: Service,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
}

