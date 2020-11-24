package typings.jsforce

import typings.jsforce.streamingMod.Streaming
import typings.jsforce.streamingMod.StreamingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/topic", JSImport.Namespace)
@js.native
object topicMod extends js.Object {
  
  @js.native
  class Topic protected () extends js.Object {
    def this(streaming: Streaming, name: String) = this()
    
    def subscribe(listener: js.Function1[/* streamingMessage */ StreamingMessage, Unit]): js.Any = js.native
    
     // Faye Subscription
    def unsubscribe(listener: js.Function1[/* streamingMessage */ StreamingMessage, Unit]): Topic = js.native
  }
}
