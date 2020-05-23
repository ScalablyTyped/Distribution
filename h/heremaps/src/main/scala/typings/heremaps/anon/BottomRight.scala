package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomRight extends js.Object {
  var BottomRight: Longitude
  var TopLeft: Longitude
}

object BottomRight {
  @scala.inline
  def apply(BottomRight: Longitude, TopLeft: Longitude): BottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRight]
  }
}

