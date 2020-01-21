package typings.highcharts.dataMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * The data parser for this chart.
    */
  var data: js.UndefOr[Data] = js.undefined
}

object Chart {
  @scala.inline
  def apply(data: Data = null): Chart = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
}

