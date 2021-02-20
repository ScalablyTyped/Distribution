package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[SwitchMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object SwitchOptions {
  
  @scala.inline
  def apply(): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchOptions]
  }
  
  @scala.inline
  implicit class SwitchOptionsMutableBuilder[Self <: SwitchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ SwitchChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMessages(value: SwitchMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
