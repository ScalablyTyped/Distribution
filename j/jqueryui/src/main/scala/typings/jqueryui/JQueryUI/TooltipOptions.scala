package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Tooltip //////////////////////////////////////////////////
trait TooltipOptions
  extends StObject
     with TooltipEvents {
  
  var classes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  // () or string
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var hide: js.UndefOr[js.Any] = js.undefined
  
  // boolean, number, string or object
  var items: js.UndefOr[String | JQuery] = js.undefined
  
  var position: js.UndefOr[js.Any] = js.undefined
  
  // TODO
  var show: js.UndefOr[js.Any] = js.undefined
  
  // boolean, number, string or object
  var tooltipClass: js.UndefOr[String] = js.undefined
  
  // deprecated in jQuery UI 1.12
  var track: js.UndefOr[Boolean] = js.undefined
}
object TooltipOptions {
  
  inline def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  extension [Self <: TooltipOptions](x: Self) {
    
    inline def setClasses(value: StringDictionary[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setItems(value: String | JQuery): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: js.Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
    
    inline def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
    
    inline def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
