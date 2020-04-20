package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomRight extends js.Object {
  var BottomRight: AnonLongitude
  var TopLeft: AnonLongitude
}

object AnonBottomRight {
  @scala.inline
  def apply(BottomRight: AnonLongitude, TopLeft: AnonLongitude): AnonBottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomRight]
  }
}

