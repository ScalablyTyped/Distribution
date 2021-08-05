package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPError
  extends StObject
     with StdError
     with GotError {
  
  var body: Buffer | String | js.Object
  
  var headers: IncomingHttpHeaders
  
  @JSName("name")
  var name_HTTPError: typings.got.gotStrings.HTTPError
  
  var statusCode: Double
  
  var statusMessage: String
}
object HTTPError {
  
  @JSImport("got", "HTTPError")
  @js.native
  val ^ : Instantiable0[HTTPError] = js.native
  
  extension [Self <: HTTPError](x: Self) {
    
    inline def setBody(value: Buffer | String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.got.gotStrings.HTTPError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
