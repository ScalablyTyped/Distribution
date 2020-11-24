package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSunburstTraverseUpButtonOptions extends js.Object {
  
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotSunburstTraverseUpButtonPositionOptions] = js.native
}
object PlotSunburstTraverseUpButtonOptions {
  
  @scala.inline
  def apply(): PlotSunburstTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstTraverseUpButtonOptions]
  }
  
  @scala.inline
  implicit class PlotSunburstTraverseUpButtonOptionsOps[Self <: PlotSunburstTraverseUpButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: PlotSunburstTraverseUpButtonPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
