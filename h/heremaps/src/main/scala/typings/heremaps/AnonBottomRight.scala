package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomRight extends js.Object {
  var BottomRight: AnonLatitudeLongitude
  var TopLeft: AnonLatitudeLongitude
}

object AnonBottomRight {
  @scala.inline
  def apply(BottomRight: AnonLatitudeLongitude, TopLeft: AnonLatitudeLongitude): AnonBottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottomRight]
  }
}

