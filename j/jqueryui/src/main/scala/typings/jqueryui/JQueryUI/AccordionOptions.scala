package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Accordion //////////////////////////////////////////////////
trait AccordionOptions
  extends StObject
     with AccordionEvents {
  
  var active: js.UndefOr[Any] = js.undefined
  
  // boolean or number
  var animate: js.UndefOr[Any] = js.undefined
  
  // boolean, number, string or object
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var heightStyle: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[Any] = js.undefined
}
object AccordionOptions {
  
  inline def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  
  extension [Self <: AccordionOptions](x: Self) {
    
    inline def setActive(value: Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeightStyle(value: String): Self = StObject.set(x, "heightStyle", value.asInstanceOf[js.Any])
    
    inline def setHeightStyleUndefined: Self = StObject.set(x, "heightStyle", js.undefined)
    
    inline def setIcons(value: Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
