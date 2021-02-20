package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxDraggable extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var hint: js.UndefOr[js.Function | String | JQuery] = js.native
  
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.native
}
object ListBoxDraggable {
  
  @scala.inline
  def apply(): ListBoxDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxDraggable]
  }
  
  @scala.inline
  implicit class ListBoxDraggableMutableBuilder[Self <: ListBoxDraggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHint(value: js.Function | String | JQuery): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Function | String | JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
