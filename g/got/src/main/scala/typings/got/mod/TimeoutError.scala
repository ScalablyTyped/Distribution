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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutError
  extends StObject
     with StdError
     with GotError {
  
  var event: lookup | connect | secureConnect | socket | response | send | request
  
  @JSName("name")
  var name_TimeoutError: typings.got.gotStrings.TimeoutError
}
object TimeoutError {
  
  @JSImport("got", "TimeoutError")
  @js.native
  val ^ : Instantiable0[TimeoutError] = js.native
  
  extension [Self <: TimeoutError](x: Self) {
    
    inline def setEvent(value: lookup | connect | secureConnect | socket | response | send | request): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.got.gotStrings.TimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
