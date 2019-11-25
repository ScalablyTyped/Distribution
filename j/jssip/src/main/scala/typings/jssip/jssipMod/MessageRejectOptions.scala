package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRejectOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var reason_phrase: String
  var status_code: js.UndefOr[js.Array[Double]] = js.undefined
}

object MessageRejectOptions {
  @scala.inline
  def apply(
    reason_phrase: String,
    body: String = null,
    extraHeaders: js.Array[String] = null,
    status_code: js.Array[Double] = null
  ): MessageRejectOptions = {
    val __obj = js.Dynamic.literal(reason_phrase = reason_phrase.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (status_code != null) __obj.updateDynamic("status_code")(status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRejectOptions]
  }
}

