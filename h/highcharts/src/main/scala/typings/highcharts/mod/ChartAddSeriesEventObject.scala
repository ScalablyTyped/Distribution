package typings.highcharts.mod

import typings.highcharts.highchartsStrings.addSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAddSeriesEventObject extends js.Object {
  /**
    * The series options that were passed to the `addSeries` method.
    */
  var options: SeriesOptionsType = js.native
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  /**
    * The event type.
    */
  var `type`: addSeries = js.native
}

object ChartAddSeriesEventObject {
  @scala.inline
  def apply(options: SeriesOptionsType, preventDefault: js.Function, target: Chart_, `type`: addSeries): ChartAddSeriesEventObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAddSeriesEventObject]
  }
  @scala.inline
  implicit class ChartAddSeriesEventObjectOps[Self <: ChartAddSeriesEventObject] (val x: Self) extends AnyVal {
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
    def setOptions(value: SeriesOptionsType): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Chart_): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: addSeries): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

