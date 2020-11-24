package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVbpZoneLinesOptions extends js.Object {
  
  /**
    * (Highstock) Enable/disable zone lines.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Specify the style of zone lines.
    */
  var styles: js.UndefOr[CSSObject] = js.native
}
object PlotVbpZoneLinesOptions {
  
  @scala.inline
  def apply(): PlotVbpZoneLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpZoneLinesOptions]
  }
  
  @scala.inline
  implicit class PlotVbpZoneLinesOptionsOps[Self <: PlotVbpZoneLinesOptions] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: CSSObject): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
