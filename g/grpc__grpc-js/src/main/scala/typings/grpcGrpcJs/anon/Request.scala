package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request[RequestType] extends StObject {
  
  var request: RequestType
}
object Request {
  
  inline def apply[RequestType](request: RequestType): Request[RequestType] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[RequestType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request[?], RequestType] (val x: Self & Request[RequestType]) extends AnyVal {
    
    inline def setRequest(value: RequestType): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
