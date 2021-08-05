package typings.httperr.mod

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of the HttpError class. */
trait HttpError
  extends StObject
     with Error {
  
  var code: String
  
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double
  
  /** A human-readable title for the HTTP error. */
  var title: String
  
  def toObject(skip: (String | RegExp)*): js.Any
}
object HttpError {
  
  inline def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | RegExp => js.Any
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[HttpError]
  }
  
  extension [Self <: HttpError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setToObject(value: /* repeated */ String | RegExp => js.Any): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
