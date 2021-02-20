package typings.inkTestingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Write extends StObject {
    
    def write(data: js.Any): Boolean = js.native
  }
  object Write {
    
    @scala.inline
    def apply(write: js.Any => Boolean): Write = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Write]
    }
    
    @scala.inline
    implicit class WriteMutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: js.Any => Boolean): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
