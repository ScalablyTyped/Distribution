package typings.k6.httpMod

import typings.k6.k6Strings.`http-url`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === HTTP URL ===
// -----------------------
/**
  * Returned value from http.url method.
  */
trait HttpURL
  extends StObject
     with _BatchRequest
     with _RefinedBatchRequest[Any] {
  
  var __brand: `http-url`
}
object HttpURL {
  
  inline def apply(): HttpURL = {
    val __obj = js.Dynamic.literal(__brand = "http-url")
    __obj.asInstanceOf[HttpURL]
  }
  
  extension [Self <: HttpURL](x: Self) {
    
    inline def set__brand(value: `http-url`): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
