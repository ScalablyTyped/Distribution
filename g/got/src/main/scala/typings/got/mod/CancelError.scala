package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_CancelError: typings.got.gotStrings.CancelError = js.native
}
object CancelError {
  
  @JSImport("got", "CancelError")
  @js.native
  val ^ : Instantiable0[CancelError] = js.native
  
  @scala.inline
  implicit class CancelErrorMutableBuilder[Self <: CancelError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.got.gotStrings.CancelError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
