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
  
  @JSImport("http-errors", "HttpError")
  @js.native
  def apply(): HttpError[Double] = js.native
  @JSImport("http-errors", "HttpError")
  @js.native
  def apply(msg: String): HttpError[Double] = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpError[?], N /* <: Double */] (val x: Self & HttpError[N]) extends AnyVal {
    
    inline def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: N): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: N): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
