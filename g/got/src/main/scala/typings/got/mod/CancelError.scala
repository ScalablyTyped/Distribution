package typings.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelError
  extends StObject
     with StdError
     with GotError {
  
  @JSName("name")
  var name_CancelError: typings.got.gotStrings.CancelError
}
object CancelError {
  
  @JSImport("got", "CancelError")
  @js.native
  val ^ : Instantiable0[CancelError] = js.native
  
  extension [Self <: CancelError](x: Self) {
    
    inline def setName(value: typings.got.gotStrings.CancelError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
