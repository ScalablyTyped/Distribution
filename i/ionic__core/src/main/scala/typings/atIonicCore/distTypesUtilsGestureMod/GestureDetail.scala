package typings.atIonicCore.distTypesUtilsGestureMod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDetail extends js.Object {
  var currentX: Double
  var currentY: Double
  var data: js.UndefOr[js.Any] = js.undefined
  var deltaX: Double
  var deltaY: Double
  var event: UIEvent
  var startTimeStamp: Double
  var startX: Double
  var startY: Double
  var timeStamp: Double
  var `type`: String
  var velocityX: Double
  var velocityY: Double
}

object GestureDetail {
  @scala.inline
  def apply(
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    startTimeStamp: Double,
    startX: Double,
    startY: Double,
    timeStamp: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double,
    data: js.Any = null
  ): GestureDetail = {
    val __obj = js.Dynamic.literal(currentX = currentX, currentY = currentY, deltaX = deltaX, deltaY = deltaY, event = event, startTimeStamp = startTimeStamp, startX = startX, startY = startY, timeStamp = timeStamp, velocityX = velocityX, velocityY = velocityY)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[GestureDetail]
  }
}

