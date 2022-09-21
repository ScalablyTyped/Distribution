package typings.mangopay2NodejsSdk.baseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithResponse[T] extends StObject {
  
  var body: T
  
  var headers: Headers
  
  var statusCode: Double
}
object WithResponse {
  
  inline def apply[T](body: T, headers: Headers, statusCode: Double): WithResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithResponse[T]]
  }
  
  extension [Self <: WithResponse[?], T](x: Self & WithResponse[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
