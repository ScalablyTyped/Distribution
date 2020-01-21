package typings.googlepay.google.payments.api

import typings.std.EventListener
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  var buttonType: js.UndefOr[ButtonType] = js.native
  @JSName("onClick")
  var onClick_Original: EventListener = js.native
  def onClick(evt: Event_): Unit = js.native
}

