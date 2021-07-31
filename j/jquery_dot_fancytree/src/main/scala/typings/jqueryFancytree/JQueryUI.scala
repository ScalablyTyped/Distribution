package typings.jqueryFancytree

import typings.jqueryFancytree.Fancytree.FancytreeStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryUI {
  
  trait UI extends StObject {
    
    var fancytree: FancytreeStatic
  }
  object UI {
    
    @scala.inline
    def apply(fancytree: FancytreeStatic): UI = {
      val __obj = js.Dynamic.literal(fancytree = fancytree.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    @scala.inline
    implicit class UIMutableBuilder[Self <: UI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFancytree(value: FancytreeStatic): Self = StObject.set(x, "fancytree", value.asInstanceOf[js.Any])
    }
  }
}
