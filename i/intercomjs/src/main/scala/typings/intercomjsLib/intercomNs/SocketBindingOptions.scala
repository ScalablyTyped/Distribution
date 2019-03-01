package typings
package intercomjsLib.intercomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketBindingOptions extends js.Object {
   /* boolean | (name: string, message: any)=>any */ var receive: js.UndefOr[js.Any] = js.undefined
  var send: js.UndefOr[js.Any] = js.undefined
}

object SocketBindingOptions {
  @scala.inline
  def apply(receive: js.Any = null, send: js.Any = null): SocketBindingOptions = {
    val __obj = js.Dynamic.literal()
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (send != null) __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[SocketBindingOptions]
  }
}

