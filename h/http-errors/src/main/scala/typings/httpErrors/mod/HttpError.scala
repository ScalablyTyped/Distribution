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
  
  @scala.inline
  def apply(expose: Boolean, message: String, name: String, status: Double, statusCode: Double): HttpError = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError]
  }
  
  @scala.inline
  implicit class HttpErrorMutableBuilder[Self <: HttpError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
