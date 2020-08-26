package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomRight extends js.Object {
  var BottomRight: Longitude = js.native
  var TopLeft: Longitude = js.native
}

object BottomRight {
  @scala.inline
  def apply(BottomRight: Longitude, TopLeft: Longitude): BottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRight]
  }
  @scala.inline
  implicit class BottomRightOps[Self <: BottomRight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottomRight(value: Longitude): Self = this.set("BottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: Longitude): Self = this.set("TopLeft", value.asInstanceOf[js.Any])
  }
  
}

