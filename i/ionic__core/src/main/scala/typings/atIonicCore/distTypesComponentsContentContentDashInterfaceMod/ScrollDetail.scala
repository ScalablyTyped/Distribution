package typings.atIonicCore.distTypesComponentsContentContentDashInterfaceMod

import typings.atIonicCore.distTypesUtilsGestureMod.GestureDetail
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollDetail
  extends GestureDetail
     with ScrollBaseDetail {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollDetail {
  @scala.inline
  def apply(
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    isScrolling: Boolean,
    scrollLeft: Double,
    scrollTop: Double,
    startTimeStamp: Double,
    startX: Double,
    startY: Double,
    timeStamp: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double,
    data: js.Any = null
  ): ScrollDetail = {
    val __obj = js.Dynamic.literal(currentX = currentX, currentY = currentY, deltaX = deltaX, deltaY = deltaY, event = event, isScrolling = isScrolling, scrollLeft = scrollLeft, scrollTop = scrollTop, startTimeStamp = startTimeStamp, startX = startX, startY = startY, timeStamp = timeStamp, velocityX = velocityX, velocityY = velocityY)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ScrollDetail]
  }
}

