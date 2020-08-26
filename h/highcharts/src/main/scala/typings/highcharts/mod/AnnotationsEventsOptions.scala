package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is added to the chart.
    */
  var add: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is updated (e.g. drag and droppped or resized by control points).
    */
  var afterUpdate: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is removed from the chart.
    */
  var remove: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
}

object AnnotationsEventsOptions {
  @scala.inline
  def apply(): AnnotationsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsEventsOptions]
  }
  @scala.inline
  implicit class AnnotationsEventsOptionsOps[Self <: AnnotationsEventsOptions] (val x: Self) extends AnyVal {
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
    def setAdd(value: EventCallbackFunction[Annotation]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAfterUpdate(value: EventCallbackFunction[Annotation]): Self = this.set("afterUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    @scala.inline
    def setRemove(value: EventCallbackFunction[Annotation]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
  
}

