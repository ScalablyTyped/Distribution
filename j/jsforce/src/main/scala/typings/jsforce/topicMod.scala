package typings.jsforce

import typings.jsforce.streamingMod.Streaming
import typings.jsforce.streamingMod.StreamingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicMod {
  
  @JSImport("jsforce/topic", "Topic")
  @js.native
  class Topic protected () extends StObject {
    def this(streaming: Streaming, name: String) = this()
    
    def subscribe(listener: js.Function1[/* streamingMessage */ StreamingMessage, Unit]): js.Any = js.native
    
    // Faye Subscription
    def unsubscribe(listener: js.Function1[/* streamingMessage */ StreamingMessage, Unit]): Topic = js.native
  }
}
