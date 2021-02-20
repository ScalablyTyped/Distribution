package typings.jjve

import typings.jjv.mod.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jjve", JSImport.Namespace)
  @js.native
  def apply(jjv: typings.jjv.mod.Env): Env = js.native
  
  type Env = js.Function3[/* schema */ js.Object, /* data */ js.Any, /* errors */ Errors, js.Array[Issue]]
  
  @js.native
  trait Issue extends StObject {
    
    var code: String = js.native
    
    var data: js.Any = js.native
    
    var message: String = js.native
    
    var path: String = js.native
  }
  object Issue {
    
    @scala.inline
    def apply(code: String, data: js.Any, message: String, path: String): Issue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
