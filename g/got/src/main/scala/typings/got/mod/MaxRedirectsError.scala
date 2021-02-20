package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxRedirectsError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_MaxRedirectsError: typings.got.gotStrings.MaxRedirectsError = js.native
  
  var redirectUrls: js.Array[String] = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
}
object MaxRedirectsError {
  
  @JSImport("got", "MaxRedirectsError")
  @js.native
  val ^ : Instantiable0[MaxRedirectsError] = js.native
  
  @scala.inline
  implicit class MaxRedirectsErrorMutableBuilder[Self <: MaxRedirectsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.got.gotStrings.MaxRedirectsError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrls(value: js.Array[String]): Self = StObject.set(x, "redirectUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlsVarargs(value: String*): Self = StObject.set(x, "redirectUrls", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
