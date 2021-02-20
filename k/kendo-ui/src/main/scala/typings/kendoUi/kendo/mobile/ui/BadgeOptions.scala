package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeOptions extends StObject {
  
  var appearance: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ BadgeChangeEvent, Unit]] = js.native
  
  var hide: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.native
  
  var look: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object BadgeOptions {
  
  @scala.inline
  def apply(): BadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeOptions]
  }
  
  @scala.inline
  implicit class BadgeOptionsMutableBuilder[Self <: BadgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ BadgeChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setHide(value: /* e */ BadgeEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setLook(value: String): Self = StObject.set(x, "look", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookUndefined: Self = StObject.set(x, "look", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ BadgeEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
