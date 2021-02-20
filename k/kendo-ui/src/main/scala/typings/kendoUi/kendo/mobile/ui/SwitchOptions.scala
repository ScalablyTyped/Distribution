package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offLabel: js.UndefOr[String] = js.native
  
  var onLabel: js.UndefOr[String] = js.native
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
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffLabel(value: String): Self = StObject.set(x, "offLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffLabelUndefined: Self = StObject.set(x, "offLabel", js.undefined)
    
    @scala.inline
    def setOnLabel(value: String): Self = StObject.set(x, "onLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLabelUndefined: Self = StObject.set(x, "onLabel", js.undefined)
  }
}
