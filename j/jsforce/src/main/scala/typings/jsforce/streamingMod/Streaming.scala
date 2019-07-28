package typings.jsforce.streamingMod

import typings.jsforce.channelMod.Channel
import typings.jsforce.connectionMod.Connection
import typings.jsforce.topicMod.Topic
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/streaming", "Streaming")
@js.native
class Streaming protected () extends EventEmitter {
  def this(connection: Connection) = this()
  def channel(channelId: String): Channel = js.native
  def subscribe(name: String, listener: StreamingMessage): js.Any = js.native
   // Faye Subscription
  def topic(namne: String): Topic = js.native
  def unsubscribe(name: String, listener: StreamingMessage): Streaming = js.native
}

