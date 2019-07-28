package typings.kikDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikMessage extends js.Object {
  var big: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var noForward: js.UndefOr[Boolean] = js.undefined
  var pic: js.UndefOr[String] = js.undefined
  var text: String
  var title: String
}

object KikMessage {
  @scala.inline
  def apply(
    text: String,
    title: String,
    big: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    noForward: js.UndefOr[Boolean] = js.undefined,
    pic: String = null
  ): KikMessage = {
    val __obj = js.Dynamic.literal(text = text, title = title)
    if (!js.isUndefined(big)) __obj.updateDynamic("big")(big)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(noForward)) __obj.updateDynamic("noForward")(noForward)
    if (pic != null) __obj.updateDynamic("pic")(pic)
    __obj.asInstanceOf[KikMessage]
  }
}

