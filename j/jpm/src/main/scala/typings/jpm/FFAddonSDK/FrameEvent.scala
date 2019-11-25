package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameEvent extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var origin: String
  var source: Frame
}

object FrameEvent {
  @scala.inline
  def apply(origin: String, source: Frame, data: js.Any = null): FrameEvent = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameEvent]
  }
}

