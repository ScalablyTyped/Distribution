package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseError
  extends StObject
     with StdError
     with GotError {
  
  @JSName("name")
  var name_ParseError: typings.got.gotStrings.ParseError
  
  var statusCode: Double
  
  var statusMessage: String
}
object ParseError {
  
  @JSImport("got", "ParseError")
  @js.native
  val ^ : Instantiable0[ParseError] = js.native
  
  @scala.inline
  implicit class ParseErrorMutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.got.gotStrings.ParseError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
