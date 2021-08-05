package typings.jsend

import typings.jsend.jsend.jsendExpress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait Response extends StObject {
    
    def jsend(err: String): Unit
    def jsend(err: String, json: js.Object): Unit
    def jsend(err: js.Object): Unit
    def jsend(err: js.Object, json: js.Object): Unit
    @JSName("jsend")
    var jsend_Original: jsendExpress
  }
  object Response {
    
    inline def apply(jsend: jsendExpress): Response = {
      val __obj = js.Dynamic.literal(jsend = jsend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setJsend(value: jsendExpress): Self = StObject.set(x, "jsend", value.asInstanceOf[js.Any])
    }
  }
}
