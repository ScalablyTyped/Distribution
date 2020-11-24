package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventsOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock) A `closePopup` event. Fired when Popup should be
    * hidden, for example when clicking on an annotation again.
    */
  var closePopup: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) Event fired when button state should change, for
    * example after adding an annotation.
    */
  var deselectButton: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) Event fired on a button click.
    */
  var selectButton: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
    * example an annotation.
    */
  var showPopup: js.UndefOr[js.Function] = js.native
}
object NavigationEventsOptions {
  
  @scala.inline
  def apply(): NavigationEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsOptions]
  }
  
  @scala.inline
  implicit class NavigationEventsOptionsOps[Self <: NavigationEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setClosePopup(value: js.Function): Self = this.set("closePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosePopup: Self = this.set("closePopup", js.undefined)
    
    @scala.inline
    def setDeselectButton(value: js.Function): Self = this.set("deselectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeselectButton: Self = this.set("deselectButton", js.undefined)
    
    @scala.inline
    def setSelectButton(value: js.Function): Self = this.set("selectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectButton: Self = this.set("selectButton", js.undefined)
    
    @scala.inline
    def setShowPopup(value: js.Function): Self = this.set("showPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopup: Self = this.set("showPopup", js.undefined)
  }
}
