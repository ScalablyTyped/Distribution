package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drilldown
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownEventObject extends js.Object {
  /**
    * If a category label was clicked, which index.
    */
  var category: js.UndefOr[Double] = js.native
  /**
    * The original browser event (usually click) that triggered the drilldown.
    */
  var originalEvent: js.UndefOr[Event] = js.native
  /**
    * The originating point.
    */
  var point: Point = js.native
  /**
    * If a category label was clicked, this array holds all points
    * corresponding to the category. Otherwise it is set to false.
    */
  var points: js.UndefOr[Boolean | js.Array[Point]] = js.native
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  /**
    * Options for the new series. If the event is utilized for async drilldown,
    * the seriesOptions are not added, but rather loaded async.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.native
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  /**
    * The event type.
    */
  var `type`: drilldown = js.native
}

object DrilldownEventObject {
  @scala.inline
  def apply(point: Point, preventDefault: js.Function, target: Chart_, `type`: drilldown): DrilldownEventObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownEventObject]
  }
  @scala.inline
  implicit class DrilldownEventObjectOps[Self <: DrilldownEventObject] (val x: Self) extends AnyVal {
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
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Chart_): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: drilldown): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: Double): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: Boolean | js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setSeriesOptions(value: SeriesOptionsType): Self = this.set("seriesOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesOptions: Self = this.set("seriesOptions", js.undefined)
  }
  
}

