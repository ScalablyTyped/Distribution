package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeOptions extends StObject {
  
  var appearance: js.UndefOr[String] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ BadgeChangeEvent, Unit]] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.undefined
  
  var look: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BadgeOptions {
  
  inline def apply(): BadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeOptions]
  }
  
  extension [Self <: BadgeOptions](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setChange(value: /* e */ BadgeChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setHide(value: /* e */ BadgeEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLook(value: String): Self = StObject.set(x, "look", value.asInstanceOf[js.Any])
    
    inline def setLookUndefined: Self = StObject.set(x, "look", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShow(value: /* e */ BadgeEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
