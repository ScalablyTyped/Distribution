package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Tabs //////////////////////////////////////////////////
trait TabsOptions
  extends StObject
     with TabsEvents {
  
  var active: js.UndefOr[js.Any] = js.undefined
  
  // boolean or number
  var classes: js.UndefOr[TabClasses] = js.undefined
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[js.Any] = js.undefined
  
  // boolean or []
  var event: js.UndefOr[String] = js.undefined
  
  var heightStyle: js.UndefOr[String] = js.undefined
  
  var hide: js.UndefOr[js.Any] = js.undefined
  
  // boolean, number, string or object
  var show: js.UndefOr[js.Any] = js.undefined
}
object TabsOptions {
  
  inline def apply(): TabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsOptions]
  }
  
  extension [Self <: TabsOptions](x: Self) {
    
    inline def setActive(value: js.Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setClasses(value: TabClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setDisabled(value: js.Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHeightStyle(value: String): Self = StObject.set(x, "heightStyle", value.asInstanceOf[js.Any])
    
    inline def setHeightStyleUndefined: Self = StObject.set(x, "heightStyle", js.undefined)
    
    inline def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: js.Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
