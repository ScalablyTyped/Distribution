package typings.inkTestingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Write extends StObject {
    
    def write(data: Any): Boolean
  }
  object Write {
    
    inline def apply(write: Any => Boolean): Write = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Write]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: Any => Boolean): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
