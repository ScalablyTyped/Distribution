package typings.httpErrors.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpError
  extends StObject
     with Error
     with /* key */ StringDictionary[js.Any] {
  
  var expose: Boolean
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var status: Double
  
  var statusCode: Double
}
object HttpError {
  
  inline def apply(expose: Boolean, message: String, name: String, status: Double, statusCode: Double): HttpError = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError]
  }
  
  extension [Self <: HttpError](x: Self) {
    
    inline def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
