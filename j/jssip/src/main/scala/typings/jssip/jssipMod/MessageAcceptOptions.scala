package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAcceptOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object MessageAcceptOptions {
  @scala.inline
  def apply(body: String = null, extraHeaders: js.Array[String] = null): MessageAcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[MessageAcceptOptions]
  }
}

