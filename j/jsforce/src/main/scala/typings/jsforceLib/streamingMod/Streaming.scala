package typings
package jsforceLib.streamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/streaming", "Streaming")
@js.native
class Streaming protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(connection: jsforceLib.connectionMod.Connection) = this()
  def channel(channelId: java.lang.String): jsforceLib.channelMod.Channel = js.native
  def subscribe(name: java.lang.String, listener: StreamingMessage): js.Any = js.native
   // Faye Subscription
  def topic(namne: java.lang.String): jsforceLib.topicMod.Topic = js.native
  def unsubscribe(name: java.lang.String, listener: StreamingMessage): Streaming = js.native
}

