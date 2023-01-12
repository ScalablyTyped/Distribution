package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteExtObject[Refs /* <: ReqRef */] extends StObject {
  
  @JSName("method")
  def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs]): ReturnValue[Refs]
  @JSName("method")
  def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs], err: js.Error): ReturnValue[Refs]
  @JSName("method")
  var method_Original: Method[Refs, ReturnValue[Refs]]
  
  var options: js.UndefOr[ServerExtOptions] = js.undefined
}
object RouteExtObject {
  
  inline def apply[Refs /* <: ReqRef */](method: Method[Refs, ReturnValue[Refs]]): RouteExtObject[Refs] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteExtObject[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteExtObject[?], Refs /* <: ReqRef */] (val x: Self & RouteExtObject[Refs]) extends AnyVal {
    
    inline def setMethod(value: Method[Refs, ReturnValue[Refs]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
