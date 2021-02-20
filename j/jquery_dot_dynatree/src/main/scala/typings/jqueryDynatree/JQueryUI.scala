package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryUI {
  
  @js.native
  trait UI extends StObject {
    
    var dynatree: DynatreeNamespace = js.native
  }
  object UI {
    
    @scala.inline
    def apply(dynatree: DynatreeNamespace): UI = {
      val __obj = js.Dynamic.literal(dynatree = dynatree.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    @scala.inline
    implicit class UIMutableBuilder[Self <: UI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynatree(value: DynatreeNamespace): Self = StObject.set(x, "dynatree", value.asInstanceOf[js.Any])
    }
  }
}
