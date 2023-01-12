package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxDraggable extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[js.Function | String | JQuery] = js.undefined
  
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.undefined
}
object ListBoxDraggable {
  
  inline def apply(): ListBoxDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxDraggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxDraggable] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHint(value: js.Function | String | JQuery): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setPlaceholder(value: js.Function | String | JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
