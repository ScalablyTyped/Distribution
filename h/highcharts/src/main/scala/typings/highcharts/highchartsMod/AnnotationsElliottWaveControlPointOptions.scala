package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsElliottWaveControlPointOptions extends js.Object {
  var events: js.UndefOr[js.Any] = js.undefined
}

object AnnotationsElliottWaveControlPointOptions {
  @scala.inline
  def apply(events: js.Any = null): AnnotationsElliottWaveControlPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[AnnotationsElliottWaveControlPointOptions]
  }
}

