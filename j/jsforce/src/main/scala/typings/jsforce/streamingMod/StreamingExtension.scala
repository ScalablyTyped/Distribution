package typings.jsforce.streamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/streaming", "StreamingExtension")
@js.native
object StreamingExtension extends js.Object {
  @js.native
  class AuthFailure protected () extends js.Object {
    def this(failureCallback: js.Function0[_]) = this()
  }
  
  @js.native
  class Replay protected () extends js.Object {
    def this(channel: String, replayId: Double) = this()
  }
  
}

