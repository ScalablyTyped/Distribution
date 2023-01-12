package typings.jjve

import typings.jjv.mod.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(jjv: typings.jjv.mod.Env): Env = ^.asInstanceOf[js.Dynamic].apply(jjv.asInstanceOf[js.Any]).asInstanceOf[Env]
  
  @JSImport("jjve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Env = js.Function3[/* schema */ js.Object, /* data */ Any, /* errors */ Errors, js.Array[Issue]]
  
  trait Issue extends StObject {
    
    var code: String
    
    var data: Any
    
    var message: String
    
    var path: String
  }
  object Issue {
    
    inline def apply(code: String, data: Any, message: String, path: String): Issue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
