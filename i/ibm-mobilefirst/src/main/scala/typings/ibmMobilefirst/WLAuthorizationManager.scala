package typings.ibmMobilefirst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WLAuthorizationManager {
  
  trait RequestObject extends StObject {
    
    def setRequestHeader(header: String, value: String): Unit
  }
  object RequestObject {
    
    inline def apply(setRequestHeader: (String, String) => Unit): RequestObject = {
      val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader))
      __obj.asInstanceOf[RequestObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestObject] (val x: Self) extends AnyVal {
      
      inline def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    }
  }
}
