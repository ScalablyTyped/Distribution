package typings.ibmMobilefirst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WLAuthorizationManager {
  
  @js.native
  trait RequestObject extends StObject {
    
    def setRequestHeader(header: String, value: String): Unit = js.native
  }
  object RequestObject {
    
    @scala.inline
    def apply(setRequestHeader: (String, String) => Unit): RequestObject = {
      val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader))
      __obj.asInstanceOf[RequestObject]
    }
    
    @scala.inline
    implicit class RequestObjectMutableBuilder[Self <: RequestObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    }
  }
}
