package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPanningOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * pan the chart. Can be one of `x`, `y`, or `xy`.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.native
}
object ChartPanningOptions {
  
  @scala.inline
  def apply(): ChartPanningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPanningOptions]
  }
  
  @scala.inline
  implicit class ChartPanningOptionsOps[Self <: ChartPanningOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setType(value: OptionsTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
