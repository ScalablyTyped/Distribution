package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingAccessibilityOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the export menu.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object ExportingAccessibilityOptions {
  
  @scala.inline
  def apply(): ExportingAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingAccessibilityOptions]
  }
  
  @scala.inline
  implicit class ExportingAccessibilityOptionsOps[Self <: ExportingAccessibilityOptions] (val x: Self) extends AnyVal {
    
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
  }
}
