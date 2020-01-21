package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionSendInfoOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object SessionSendInfoOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String] = null): SessionSendInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendInfoOptions]
  }
}

