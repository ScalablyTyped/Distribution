package typings
package atIonicCoreLib.distTypesUtilsGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDetail extends js.Object {
  var currentX: scala.Double
  var currentY: scala.Double
  var data: js.UndefOr[js.Any] = js.undefined
  var deltaX: scala.Double
  var deltaY: scala.Double
  var event: stdLib.UIEvent
  var startTimeStamp: scala.Double
  var startX: scala.Double
  var startY: scala.Double
  var timeStamp: scala.Double
  var `type`: java.lang.String
  var velocityX: scala.Double
  var velocityY: scala.Double
}

object GestureDetail {
  @scala.inline
  def apply(
    currentX: scala.Double,
    currentY: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double,
    event: stdLib.UIEvent,
    startTimeStamp: scala.Double,
    startX: scala.Double,
    startY: scala.Double,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    velocityX: scala.Double,
    velocityY: scala.Double,
    data: js.Any = null
  ): GestureDetail = {
    val __obj = js.Dynamic.literal(currentX = currentX, currentY = currentY, deltaX = deltaX, deltaY = deltaY, event = event, startTimeStamp = startTimeStamp, startX = startX, startY = startY, timeStamp = timeStamp, velocityX = velocityX, velocityY = velocityY)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[GestureDetail]
  }
}

