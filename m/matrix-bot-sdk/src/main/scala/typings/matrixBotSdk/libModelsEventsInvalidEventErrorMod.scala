package typings.matrixBotSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsInvalidEventErrorMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/InvalidEventError", "EventRedactedError")
  @js.native
  open class EventRedactedError () extends InvalidEventError {
    def this(message: String) = this()
  }
  
  @JSImport("matrix-bot-sdk/lib/models/events/InvalidEventError", "InvalidEventError")
  @js.native
  open class InvalidEventError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
