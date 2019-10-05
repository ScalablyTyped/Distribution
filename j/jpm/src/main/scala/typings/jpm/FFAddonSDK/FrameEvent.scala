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
    val __obj = js.Dynamic.literal(origin = origin, source = source)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[FrameEvent]
  }
}

