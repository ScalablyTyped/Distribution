package typings.httpErrors.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpError[N /* <: Double */]
  extends StObject
     with Error
     with /* key */ StringDictionary[Any] {
  
  var expose: Boolean
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var status: N
  
  var statusCode: N
}
object HttpError {
  
  inline def apply[N /* <: Double */](expose: Boolean, message: String, name: String, status: N, statusCode: N): HttpError[N] = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError[N]]
  }
  
  extension [Self <: HttpError[?], N /* <: Double */](x: Self & HttpError[N]) {
    
    inline def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: N): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: N): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
