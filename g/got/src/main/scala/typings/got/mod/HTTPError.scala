package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPError
  extends StdError
     with GotError {
  
  var body: Buffer | String | js.Object = js.native
  
  var headers: IncomingHttpHeaders = js.native
  
  @JSName("name")
  var name_HTTPError: typings.got.gotStrings.HTTPError = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
}
object HTTPError {
  
  @JSImport("got", "HTTPError")
  @js.native
  val ^ : Instantiable0[HTTPError] = js.native
  
  @scala.inline
  implicit class HTTPErrorMutableBuilder[Self <: HTTPError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Buffer | String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.got.gotStrings.HTTPError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
