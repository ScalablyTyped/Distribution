package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendAccessibilityOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
    * for the legend.
    */
  var keyboardNavigation: js.UndefOr[LegendAccessibilityKeyboardNavigationOptions] = js.native
}
object LegendAccessibilityOptions {
  
  @scala.inline
  def apply(): LegendAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendAccessibilityOptions]
  }
  
  @scala.inline
  implicit class LegendAccessibilityOptionsOps[Self <: LegendAccessibilityOptions] (val x: Self) extends AnyVal {
    
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
    def setKeyboardNavigation(value: LegendAccessibilityKeyboardNavigationOptions): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
  }
}
