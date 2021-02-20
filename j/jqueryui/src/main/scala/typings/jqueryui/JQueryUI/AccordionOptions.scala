package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Accordion //////////////////////////////////////////////////
@js.native
trait AccordionOptions extends AccordionEvents {
  
  var active: js.UndefOr[js.Any] = js.native
  
  // boolean or number
  var animate: js.UndefOr[js.Any] = js.native
  
  // boolean, number, string or object
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var heightStyle: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
}
object AccordionOptions {
  
  @scala.inline
  def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  
  @scala.inline
  implicit class AccordionOptionsMutableBuilder[Self <: AccordionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: js.Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeightStyle(value: String): Self = StObject.set(x, "heightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightStyleUndefined: Self = StObject.set(x, "heightStyle", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
