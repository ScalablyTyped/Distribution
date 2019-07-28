package typings.atIonicCore.distTypesComponentsSegmentSegmentDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentChangeEventDetail extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object SegmentChangeEventDetail {
  @scala.inline
  def apply(value: String = null): SegmentChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SegmentChangeEventDetail]
  }
}

