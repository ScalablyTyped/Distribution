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
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], startTimeStamp = startTimeStamp.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureDetail]
  }
}

