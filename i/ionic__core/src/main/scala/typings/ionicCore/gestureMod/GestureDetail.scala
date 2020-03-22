package typings.ionicCore.gestureMod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDetail extends js.Object {
  var currentTime: Double
  var currentX: Double
  var currentY: Double
  var data: js.UndefOr[js.Any] = js.undefined
  var deltaX: Double
  var deltaY: Double
  var event: UIEvent
  var startTime: Double
  var startX: Double
  var startY: Double
  var `type`: String
  var velocityX: Double
  var velocityY: Double
}

object GestureDetail {
  @scala.inline
  def apply(
    currentTime: Double,
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    startTime: Double,
    startX: Double,
    startY: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double,
    data: js.Any = null
  ): GestureDetail = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureDetail]
  }
}

