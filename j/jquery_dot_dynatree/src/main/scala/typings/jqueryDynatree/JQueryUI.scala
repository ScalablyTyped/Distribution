package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryUI {
  
  trait UI extends StObject {
    
    var dynatree: DynatreeNamespace
  }
  object UI {
    
    inline def apply(dynatree: DynatreeNamespace): UI = {
      val __obj = js.Dynamic.literal(dynatree = dynatree.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UI] (val x: Self) extends AnyVal {
      
      inline def setDynatree(value: DynatreeNamespace): Self = StObject.set(x, "dynatree", value.asInstanceOf[js.Any])
    }
  }
}
