package typings.ionicCore.rangeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeChangeEventDetail extends js.Object {
  var value: RangeValue
}

object RangeChangeEventDetail {
  @scala.inline
  def apply(value: RangeValue): RangeChangeEventDetail = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeChangeEventDetail]
  }
}

