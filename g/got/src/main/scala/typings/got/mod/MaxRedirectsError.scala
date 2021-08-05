package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxRedirectsError
  extends StObject
     with StdError
     with GotError {
  
  @JSName("name")
  var name_MaxRedirectsError: typings.got.gotStrings.MaxRedirectsError
  
  var redirectUrls: js.Array[String]
  
  var statusCode: Double
  
  var statusMessage: String
}
object MaxRedirectsError {
  
  @JSImport("got", "MaxRedirectsError")
  @js.native
  val ^ : Instantiable0[MaxRedirectsError] = js.native
  
  extension [Self <: MaxRedirectsError](x: Self) {
    
    inline def setName(value: typings.got.gotStrings.MaxRedirectsError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrls(value: js.Array[String]): Self = StObject.set(x, "redirectUrls", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlsVarargs(value: String*): Self = StObject.set(x, "redirectUrls", js.Array(value :_*))
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
