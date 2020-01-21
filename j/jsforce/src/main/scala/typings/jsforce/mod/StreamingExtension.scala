package typings.jsforce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "StreamingExtension")
@js.native
object StreamingExtension extends js.Object {
  @js.native
  class AuthFailure protected ()
    extends typings.jsforce.streamingMod.StreamingExtension.AuthFailure {
    def this(failureCallback: js.Function0[_]) = this()
  }
  
  @js.native
  class Replay protected ()
    extends typings.jsforce.streamingMod.StreamingExtension.Replay {
    def this(channel: String, replayId: Double) = this()
  }
  
}

