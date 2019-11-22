package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var previewHeight: js.UndefOr[Double | String] = js.undefined
  var previewWidth: js.UndefOr[Double | String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: String = null,
    previewHeight: Double | String = null,
    previewWidth: Double | String = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

