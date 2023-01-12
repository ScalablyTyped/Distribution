package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchOptions
  extends StObject
     with AllEditorOptions {
  
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[SwitchMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var thumbRounded: js.UndefOr[String] = js.undefined
  
  var trackRounded: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object SwitchOptions {
  
  inline def apply(): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: /* e */ SwitchChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMessages(value: SwitchMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThumbRounded(value: String): Self = StObject.set(x, "thumbRounded", value.asInstanceOf[js.Any])
    
    inline def setThumbRoundedUndefined: Self = StObject.set(x, "thumbRounded", js.undefined)
    
    inline def setTrackRounded(value: String): Self = StObject.set(x, "trackRounded", value.asInstanceOf[js.Any])
    
    inline def setTrackRoundedUndefined: Self = StObject.set(x, "trackRounded", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
