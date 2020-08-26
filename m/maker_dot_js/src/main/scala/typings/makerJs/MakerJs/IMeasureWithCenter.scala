package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measurement of extents, with a center point.
  */
@js.native
trait IMeasureWithCenter extends IMeasure {
  /**
    * The center point of the rectangle containing the item being measured.
    */
  var center: IPoint = js.native
}

object IMeasureWithCenter {
  @scala.inline
  def apply(center: IPoint, high: IPoint, low: IPoint): IMeasureWithCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasureWithCenter]
  }
  @scala.inline
  implicit class IMeasureWithCenterOps[Self <: IMeasureWithCenter] (val x: Self) extends AnyVal {
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
    def setCenter(value: IPoint): Self = this.set("center", value.asInstanceOf[js.Any])
  }
  
}

