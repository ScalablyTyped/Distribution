package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.FailAction
import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsPreObject extends StObject {
  
  /**
    * key name used to assign the response of the method to in request.pre and request.preResponses.
    */
  var assign: js.UndefOr[String] = js.undefined
  
  /**
    * A failAction value which determine what to do when a pre-handler method throws an error. If assign is specified and the failAction setting is not 'error', the error will be assigned.
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  
  /**
    * a lifecycle method.
    */
  def method(request: Request, h: ResponseToolkit): ReturnValue
  def method(request: Request, h: ResponseToolkit, err: Error): ReturnValue
  /**
    * a lifecycle method.
    */
  @JSName("method")
  var method_Original: Method
}
object RouteOptionsPreObject {
  
  inline def apply(
    method: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
  ): RouteOptionsPreObject = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction3(method))
    __obj.asInstanceOf[RouteOptionsPreObject]
  }
  
  extension [Self <: RouteOptionsPreObject](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAssignUndefined: Self = StObject.set(x, "assign", js.undefined)
    
    inline def setFailAction(value: FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    inline def setFailActionFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = StObject.set(x, "failAction", js.Any.fromFunction3(value))
    
    inline def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    inline def setMethod(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = StObject.set(x, "method", js.Any.fromFunction3(value))
  }
}
