package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountdownStickerOptions extends js.Object {
  var digitCardColor: js.UndefOr[String] = js.undefined
  var digitColor: js.UndefOr[String] = js.undefined
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  var endTs: Double
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  var text: String
  var textColor: js.UndefOr[String] = js.undefined
}

object CountdownStickerOptions {
  @scala.inline
  def apply(
    endTs: Double,
    text: String,
    digitCardColor: String = null,
    digitColor: String = null,
    endBackgroundColor: String = null,
    startBackgroundColor: String = null,
    textColor: String = null
  ): CountdownStickerOptions = {
    val __obj = js.Dynamic.literal(endTs = endTs.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (digitCardColor != null) __obj.updateDynamic("digitCardColor")(digitCardColor.asInstanceOf[js.Any])
    if (digitColor != null) __obj.updateDynamic("digitColor")(digitColor.asInstanceOf[js.Any])
    if (endBackgroundColor != null) __obj.updateDynamic("endBackgroundColor")(endBackgroundColor.asInstanceOf[js.Any])
    if (startBackgroundColor != null) __obj.updateDynamic("startBackgroundColor")(startBackgroundColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountdownStickerOptions]
  }
}

