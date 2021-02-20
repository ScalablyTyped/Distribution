package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsupportedProtocolError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_UnsupportedProtocolError: typings.got.gotStrings.UnsupportedProtocolError = js.native
}
object UnsupportedProtocolError {
  
  @JSImport("got", "UnsupportedProtocolError")
  @js.native
  val ^ : Instantiable0[UnsupportedProtocolError] = js.native
  
  @scala.inline
  implicit class UnsupportedProtocolErrorMutableBuilder[Self <: UnsupportedProtocolError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.got.gotStrings.UnsupportedProtocolError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
