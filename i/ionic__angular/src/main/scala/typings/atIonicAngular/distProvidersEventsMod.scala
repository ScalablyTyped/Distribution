package typings.atIonicAngular

import typings.atIonicAngular.distProvidersEventsMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/events", JSImport.Namespace)
@js.native
object distProvidersEventsMod extends js.Object {
  @js.native
  class Events () extends js.Object {
    var c: js.Any = js.native
    /**
      * Publish an event to the given topic.
      *
      * @param topic the topic to publish to
      * @param eventData the data to send as the event
      */
    def publish(topic: String, args: js.Any*): js.Array[_] | Null = js.native
    /**
      * Subscribe to an event topic. Events that get posted to that topic will trigger the provided handler.
      *
      * @param topic the topic to subscribe to
      * @param handler the event handler
      */
    def subscribe(topic: String, handlers: EventHandler*): Unit = js.native
    /**
      * Unsubscribe from the given topic. Your handler will no longer receive events published to this topic.
      *
      * @param topic the topic to unsubscribe from
      * @param handler the event handler
      *
      * @return true if a handler was removed
      */
    def unsubscribe(topic: String): Boolean = js.native
    def unsubscribe(topic: String, handler: EventHandler): Boolean = js.native
  }
  
  type EventHandler = js.Function1[/* repeated */ js.Any, js.Any]
}

