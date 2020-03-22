package typings.ionicCore.contentInterfaceMod

import typings.ionicCore.gestureMod.GestureDetail
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
    currentTime: Double,
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    isScrolling: Boolean,
    scrollLeft: Double,
    scrollTop: Double,
    startTime: Double,
    startX: Double,
    startY: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double,
    data: js.Any = null
  ): ScrollDetail = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDetail]
  }
}

