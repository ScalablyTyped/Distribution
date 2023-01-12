package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchMessages extends StObject {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var unchecked: js.UndefOr[String] = js.undefined
}
object SwitchMessages {
  
  inline def apply(): SwitchMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchMessages] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setUnchecked(value: String): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
  }
}
