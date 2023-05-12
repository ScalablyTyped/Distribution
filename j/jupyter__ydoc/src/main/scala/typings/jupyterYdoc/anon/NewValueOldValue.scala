package typings.jupyterYdoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueOldValue extends StObject {
  
  var newValue: js.UndefOr[Double] = js.undefined
  
  var oldValue: js.UndefOr[Double] = js.undefined
}
object NewValueOldValue {
  
  inline def apply(): NewValueOldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewValueOldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewValueOldValue] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
