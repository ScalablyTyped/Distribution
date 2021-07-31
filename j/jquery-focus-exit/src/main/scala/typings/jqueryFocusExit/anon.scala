package typings.jqueryFocusExit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    var debug: Boolean
  }
  object Debug {
    
    @scala.inline
    def apply(debug: Boolean): Debug = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
}
