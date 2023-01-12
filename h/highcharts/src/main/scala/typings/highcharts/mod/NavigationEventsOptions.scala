package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) A `closePopup` event. Fired when Popup should be
    * hidden, for example when clicking on an annotation again.
    */
  var closePopup: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock) Event fired when button state should change, for
    * example after adding an annotation.
    */
  var deselectButton: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock) Event fired on a button click.
    */
  var selectButton: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
    * example an annotation.
    */
  var showPopup: js.UndefOr[js.Function] = js.undefined
}
object NavigationEventsOptions {
  
  inline def apply(): NavigationEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setClosePopup(value: js.Function): Self = StObject.set(x, "closePopup", value.asInstanceOf[js.Any])
    
    inline def setClosePopupUndefined: Self = StObject.set(x, "closePopup", js.undefined)
    
    inline def setDeselectButton(value: js.Function): Self = StObject.set(x, "deselectButton", value.asInstanceOf[js.Any])
    
    inline def setDeselectButtonUndefined: Self = StObject.set(x, "deselectButton", js.undefined)
    
    inline def setSelectButton(value: js.Function): Self = StObject.set(x, "selectButton", value.asInstanceOf[js.Any])
    
    inline def setSelectButtonUndefined: Self = StObject.set(x, "selectButton", js.undefined)
    
    inline def setShowPopup(value: js.Function): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    inline def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
  }
}
