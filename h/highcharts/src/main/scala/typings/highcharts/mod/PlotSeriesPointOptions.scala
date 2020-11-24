package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSeriesPointOptions extends js.Object {
  
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
}
object PlotSeriesPointOptions {
  
  @scala.inline
  def apply(): PlotSeriesPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesPointOptions]
  }
  
  @scala.inline
  implicit class PlotSeriesPointOptionsOps[Self <: PlotSeriesPointOptions] (val x: Self) extends AnyVal {
    
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
    def setEvents(value: PointEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
}
