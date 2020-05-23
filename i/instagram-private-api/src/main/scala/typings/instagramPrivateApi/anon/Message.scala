package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var previewHeight: js.UndefOr[Double | String] = js.undefined
  var previewWidth: js.UndefOr[Double | String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    message: String = null,
    previewHeight: Double | String = null,
    previewWidth: Double | String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

