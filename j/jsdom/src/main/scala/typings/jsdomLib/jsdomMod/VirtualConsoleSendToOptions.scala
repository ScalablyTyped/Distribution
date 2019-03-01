package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualConsoleSendToOptions extends js.Object {
  var omitJSDOMErrors: scala.Boolean
}

object VirtualConsoleSendToOptions {
  @scala.inline
  def apply(omitJSDOMErrors: scala.Boolean): VirtualConsoleSendToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("omitJSDOMErrors")(omitJSDOMErrors)
    __obj.asInstanceOf[VirtualConsoleSendToOptions]
  }
}

