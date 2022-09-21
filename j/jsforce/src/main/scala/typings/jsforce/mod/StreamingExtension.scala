package typings.jsforce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StreamingExtension {
  
  @JSImport("jsforce", "StreamingExtension.AuthFailure")
  @js.native
  open class AuthFailure protected ()
    extends typings.jsforce.streamingMod.StreamingExtension.AuthFailure {
    def this(failureCallback: js.Function0[Any]) = this()
  }
  
  @JSImport("jsforce", "StreamingExtension.Replay")
  @js.native
  open class Replay protected ()
    extends typings.jsforce.streamingMod.StreamingExtension.Replay {
    def this(channel: String, replayId: Double) = this()
  }
}
