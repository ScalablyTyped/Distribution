package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Roomid
import typings.matrixAppserviceBridge.anon.`0`
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.none
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.per_room
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.single
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventQueueMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueue")
  @js.native
  class EventQueue protected () extends StObject {
    def this(`type`: none, consumeFn: ConsumeCallback) = this()
    def this(`type`: per_room, consumeFn: ConsumeCallback) = this()
    def this(`type`: single, consumeFn: ConsumeCallback) = this()
    
    /**
      * Starts consuming the queue.
      *
      * As long as events are enqueued they will continue to be consumed.
      */
    def consume(): Unit = js.native
    
    /* protected */ def consumeFn(error: Null, event: js.Any): Unit = js.native
    /* protected */ def consumeFn(error: Error, event: js.Any): Unit = js.native
    @JSName("consumeFn")
    var consumeFn_Original: ConsumeCallback = js.native
    
    var getQueue: js.Any = js.native
    
    /**
      * Push the event and its related data to the queue.
      *
      * @param {IMatrixEvent} event The event to enqueue.
      * @param {Promise<object>} dataReady Promise containing data related to the event.
      */
    def push(event: Roomid, dataReady: DataReady): Unit = js.native
    
    /**
      * Private constructor.
      *
      * @constructor
      * @param {"none"|"single"|"per_room"} type The type of event queue to create.
      * @param {consumeCallback} consumeFn Function which is called when an event
      *     is consumed.
      */
    var queues: js.Any = js.native
    
    var takeNext: js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  /* static members */
  object EventQueue {
    
    /**
      * Factory for EventQueues.
      *
      * @param {"none"|"single"|"per_room"} opts.type Type of the queue to create.
      * @param {consumeCallback} consumeFn Function which is called when an event
      *     is consumed.
      * @return {EventQueue} The newly created EventQueue.
      */
    @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueue.create")
    @js.native
    def create(opts: `0`, consumeFn: ConsumeCallback): EventQueueSingle | EventQueuePerRoom | EventQueueNone = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueueNone")
  @js.native
  class EventQueueNone protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
    
    def push(event: js.Any, dataReady: DataReady): Unit = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueuePerRoom")
  @js.native
  class EventQueuePerRoom protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueueSingle")
  @js.native
  class EventQueueSingle protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
  }
  
  type ConsumeCallback = js.Function2[/* error */ Error | Null, /* event */ js.Any, Unit]
  
  type DataReady = js.Promise[Record[String, js.Any]]
}
