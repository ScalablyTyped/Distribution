package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardNavigationOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
    * drawn around elements while navigating through them.
    */
  var focusBorder: js.UndefOr[KeyboardNavigationFocusBorderOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
    * chart. Determines which elements are tabbed to first. Available elements
    * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
    * addition, any custom components can be added here.
    */
  var order: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
    * navigation of data points and series.
    */
  var seriesNavigation: js.UndefOr[KeyboardNavigationSeriesNavigationOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
    * when reaching the end of arrow-key navigation for an element in the
    * chart.
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}
object KeyboardNavigationOptionsObject {
  
  @scala.inline
  def apply(): KeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationOptionsObject]
  }
  
  @scala.inline
  implicit class KeyboardNavigationOptionsObjectOps[Self <: KeyboardNavigationOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setFocusBorder(value: KeyboardNavigationFocusBorderOptionsObject): Self = this.set("focusBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusBorder: Self = this.set("focusBorder", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setSeriesNavigation(value: KeyboardNavigationSeriesNavigationOptionsObject): Self = this.set("seriesNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesNavigation: Self = this.set("seriesNavigation", js.undefined)
    
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
}
