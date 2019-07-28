package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is added to the chart.
    */
  var add: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is updated (e.g. drag and droppped or resized by control points).
    */
  var afterUpdate: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is removed from the chart.
    */
  var remove: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
}

object AnnotationsEventsOptions {
  @scala.inline
  def apply(
    add: EventCallbackFunction[Annotation] = null,
    afterUpdate: EventCallbackFunction[Annotation] = null,
    remove: EventCallbackFunction[Annotation] = null
  ): AnnotationsEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[AnnotationsEventsOptions]
  }
}

