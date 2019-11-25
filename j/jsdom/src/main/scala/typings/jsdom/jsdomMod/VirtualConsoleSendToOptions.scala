package typings.jsdom.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualConsoleSendToOptions extends js.Object {
  var omitJSDOMErrors: Boolean
}

object VirtualConsoleSendToOptions {
  @scala.inline
  def apply(omitJSDOMErrors: Boolean): VirtualConsoleSendToOptions = {
    val __obj = js.Dynamic.literal(omitJSDOMErrors = omitJSDOMErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualConsoleSendToOptions]
  }
}

