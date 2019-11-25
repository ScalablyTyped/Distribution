package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsInfinityLineTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsInfinityLineTypeLineOptions {
  @scala.inline
  def apply(fill: String = null): AnnotationsInfinityLineTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsInfinityLineTypeLineOptions]
  }
}

