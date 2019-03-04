package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikMessage extends js.Object {
  var big: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var noForward: js.UndefOr[scala.Boolean] = js.undefined
  var pic: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var title: java.lang.String
}

object KikMessage {
  @scala.inline
  def apply(
    text: java.lang.String,
    title: java.lang.String,
    big: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    noForward: js.UndefOr[scala.Boolean] = js.undefined,
    pic: java.lang.String = null
  ): KikMessage = {
    val __obj = js.Dynamic.literal(text = text, title = title)
    if (!js.isUndefined(big)) __obj.updateDynamic("big")(big)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(noForward)) __obj.updateDynamic("noForward")(noForward)
    if (pic != null) __obj.updateDynamic("pic")(pic)
    __obj.asInstanceOf[KikMessage]
  }
}

