package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import typings.got.gotStrings.connect
import typings.got.gotStrings.lookup
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.secureConnect
import typings.got.gotStrings.send
import typings.got.gotStrings.socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutError
  extends StdError
     with GotError {
  
  var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  
  @JSName("name")
  var name_TimeoutError: typings.got.gotStrings.TimeoutError = js.native
}
object TimeoutError {
  
  @JSImport("got", "TimeoutError")
  @js.native
  val ^ : Instantiable0[TimeoutError] = js.native
  
  @scala.inline
  implicit class TimeoutErrorMutableBuilder[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: lookup | connect | secureConnect | socket | response | send | request): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.got.gotStrings.TimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
