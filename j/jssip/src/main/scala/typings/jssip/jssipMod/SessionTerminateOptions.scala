package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTerminateOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var reason_phrase: js.UndefOr[String] = js.undefined
  var status_code: js.UndefOr[Double] = js.undefined
}

object SessionTerminateOptions {
  @scala.inline
  def apply(
    body: String = null,
    extraHeaders: js.Array[String] = null,
    reason_phrase: String = null,
    status_code: Int | Double = null
  ): SessionTerminateOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (reason_phrase != null) __obj.updateDynamic("reason_phrase")(reason_phrase)
    if (status_code != null) __obj.updateDynamic("status_code")(status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionTerminateOptions]
  }
}

