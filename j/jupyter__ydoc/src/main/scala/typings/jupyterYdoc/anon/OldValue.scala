package typings.jupyterYdoc.anon

import typings.jupyterlabNbformat.mod.IAttachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  var newValue: js.UndefOr[IAttachments] = js.undefined
  
  var oldValue: js.UndefOr[IAttachments] = js.undefined
}
object OldValue {
  
  inline def apply(): OldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldValue] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: IAttachments): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: IAttachments): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
