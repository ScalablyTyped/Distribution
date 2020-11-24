package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSlowstochasticSmoothedLineOptions extends js.Object {
  
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotSlowstochasticSmoothedLineStylesOptions] = js.native
}
object PlotSlowstochasticSmoothedLineOptions {
  
  @scala.inline
  def apply(): PlotSlowstochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticSmoothedLineOptions]
  }
  
  @scala.inline
  implicit class PlotSlowstochasticSmoothedLineOptionsOps[Self <: PlotSlowstochasticSmoothedLineOptions] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: PlotSlowstochasticSmoothedLineStylesOptions): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
