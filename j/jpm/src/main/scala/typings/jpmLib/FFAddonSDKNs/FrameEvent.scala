package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameEvent extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var origin: java.lang.String
  var source: Frame
}

object FrameEvent {
  @scala.inline
  def apply(origin: java.lang.String, source: Frame, data: js.Any = null): FrameEvent = {
    val __obj = js.Dynamic.literal(origin = origin, source = source)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[FrameEvent]
  }
}

