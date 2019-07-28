package typings.googlepay.googleNs.paymentsNs.apiNs

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  var buttonType: js.UndefOr[ButtonType] = js.native
  @JSName("onClick")
  var onClick_Original: EventListener = js.native
  def onClick(evt: Event): Unit = js.native
}

