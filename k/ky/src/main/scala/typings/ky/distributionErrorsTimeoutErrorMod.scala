package typings.ky

import typings.std.Error
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionErrorsTimeoutErrorMod {
  
  @JSImport("ky/distribution/errors/TimeoutError", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends StObject
       with Error {
    def this(request: Request) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var request: Request = js.native
  }
}
