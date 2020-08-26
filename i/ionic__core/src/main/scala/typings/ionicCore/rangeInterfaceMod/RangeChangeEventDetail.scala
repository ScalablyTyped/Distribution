package typings.ionicCore.rangeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeChangeEventDetail extends js.Object {
  var value: RangeValue = js.native
}

object RangeChangeEventDetail {
  @scala.inline
  def apply(value: RangeValue): RangeChangeEventDetail = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeChangeEventDetail]
  }
  @scala.inline
  implicit class RangeChangeEventDetailOps[Self <: RangeChangeEventDetail] (val x: Self) extends AnyVal {
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
    def setValue(value: RangeValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

