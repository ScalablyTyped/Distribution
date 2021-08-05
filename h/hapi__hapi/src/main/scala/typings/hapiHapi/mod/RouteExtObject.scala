package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteExtObject extends StObject {
  
  def method(request: Request, h: ResponseToolkit): ReturnValue
  def method(request: Request, h: ResponseToolkit, err: Error): ReturnValue
  @JSName("method")
  var method_Original: Method
  
  var options: js.UndefOr[ServerExtOptions] = js.undefined
}
object RouteExtObject {
  
  inline def apply(
    method: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
  ): RouteExtObject = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction3(method))
    __obj.asInstanceOf[RouteExtObject]
  }
  
  extension [Self <: RouteExtObject](x: Self) {
    
    inline def setMethod(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = StObject.set(x, "method", js.Any.fromFunction3(value))
    
    inline def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
