package typings.hapiHapi.libTypesRouteMod

import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.FailAction
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsPreObject[Refs /* <: ReqRef */] extends StObject {
  
  /**
    * key name used to assign the response of the method to in request.pre and request.preResponses.
    */
  var assign: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof Refs['Pres'] */ js.Any
  ] = js.undefined
  
  /**
    * A failAction value which determine what to do when a pre-handler method throws an error. If assign is specified and the failAction setting is not 'error', the error will be assigned.
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  
  /**
    * a lifecycle method.
    */
  @JSName("method")
  def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs]): ReturnValue[Refs]
  @JSName("method")
  def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs], err: js.Error): ReturnValue[Refs]
  /**
    * a lifecycle method.
    */
  @JSName("method")
  var method_Original: Method[Refs, ReturnValue[Refs]]
}
object RouteOptionsPreObject {
  
  inline def apply[Refs /* <: ReqRef */](method: Method[Refs, ReturnValue[Refs]]): RouteOptionsPreObject[Refs] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsPreObject[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteOptionsPreObject[?], Refs /* <: ReqRef */] (val x: Self & RouteOptionsPreObject[Refs]) extends AnyVal {
    
    inline def setAssign(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof Refs['Pres'] */ js.Any
    ): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAssignUndefined: Self = StObject.set(x, "assign", js.undefined)
    
    inline def setFailAction(value: FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    inline def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    inline def setMethod(value: Method[Refs, ReturnValue[Refs]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
