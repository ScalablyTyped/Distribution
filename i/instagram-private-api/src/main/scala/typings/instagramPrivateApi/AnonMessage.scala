package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var previewHeight: js.UndefOr[Double | String] = js.undefined
  var previewWidth: js.UndefOr[Double | String] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(
    message: String = null,
    previewHeight: Double | String = null,
    previewWidth: Double | String = null
  ): AnonMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

