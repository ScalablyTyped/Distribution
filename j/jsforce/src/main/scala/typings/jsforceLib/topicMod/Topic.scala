package typings
package jsforceLib.topicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/topic", "Topic")
@js.native
class Topic protected () extends js.Object {
  def this(streaming: jsforceLib.streamingMod.Streaming, name: java.lang.String) = this()
  def subscribe(
    listener: js.Function1[/* streamingMessage */ jsforceLib.streamingMod.StreamingMessage, scala.Unit]
  ): js.Any = js.native
   // Faye Subscription
  def unsubscribe(
    listener: js.Function1[/* streamingMessage */ jsforceLib.streamingMod.StreamingMessage, scala.Unit]
  ): Topic = js.native
}

