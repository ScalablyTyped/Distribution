package typings.ipfsHttpServer.anon

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var assign: String
  
  def method(request: Request[ReqRefDefaults], _h: ResponseToolkit[ReqRefDefaults]): js.Promise[DataAny]
}
object `0` {
  
  inline def apply(
    assign: String,
    method: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[DataAny]
  ): `0` = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[DataAny]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
