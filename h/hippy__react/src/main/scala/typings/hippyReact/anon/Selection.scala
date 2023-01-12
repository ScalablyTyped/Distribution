package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  var selection: End
}
object Selection {
  
  inline def apply(selection: End): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    inline def setSelection(value: End): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
