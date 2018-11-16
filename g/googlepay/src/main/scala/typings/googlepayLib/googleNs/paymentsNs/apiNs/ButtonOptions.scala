package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  var buttonType: js.UndefOr[ButtonType] = js.native
  @JSName("onClick")
  var onClick_Original: stdLib.EventListener = js.native
  def onClick(evt: stdLib.Event): scala.Unit = js.native
}

