package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoDataAttrOptions extends js.Object {
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NoDataAttrOptions {
  @scala.inline
  def apply(zIndex: Int | Double = null): NoDataAttrOptions = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoDataAttrOptions]
  }
}

