package typings.jstimezonedetect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    def name(): String
  }
  object Name {
    
    @scala.inline
    def apply(name: () => String): Name = {
      val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    }
  }
}
