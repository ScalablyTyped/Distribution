package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleButtonOptions
  extends StObject
     with ButtonOptions {
  
  var group: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var toggle: js.UndefOr[js.Function1[/* e */ ToggleButtonToggleEvent, Unit]] = js.undefined
}
object ToggleButtonOptions {
  
  inline def apply(): ToggleButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setToggle(value: /* e */ ToggleButtonToggleEvent => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
