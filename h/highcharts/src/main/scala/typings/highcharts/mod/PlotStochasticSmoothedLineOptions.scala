package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotStochasticSmoothedLineOptions extends js.Object {
  
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotStochasticSmoothedLineStylesOptions] = js.native
}
object PlotStochasticSmoothedLineOptions {
  
  @scala.inline
  def apply(): PlotStochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticSmoothedLineOptions]
  }
  
  @scala.inline
  implicit class PlotStochasticSmoothedLineOptionsOps[Self <: PlotStochasticSmoothedLineOptions] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: PlotStochasticSmoothedLineStylesOptions): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
