package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Roomid
import typings.matrixAppserviceBridge.anon.`0`
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.none
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.per_room
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.single
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsEventQueueMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueue")
  @js.native
  open class EventQueue protected () extends StObject {
    def this(`type`: none | single | per_room, consumeFn: ConsumeCallback) = this()
    
    /**
      * Starts consuming the queue.
      *
      * As long as events are enqueued they will continue to be consumed.
      */
    def consume(): Unit = js.native
    
    /* protected */ def consumeFn(error: js.Error, event: Any): Unit = js.native
    /* protected */ def consumeFn(error: Null, event: Any): Unit = js.native
    /* protected */ @JSName("consumeFn")
    var consumeFn_Original: ConsumeCallback = js.native
    
    /* private */ var getQueue: Any = js.native
    
    /**
      * Push the event and its related data to the queue.
      *
      * @param {IMatrixEvent} event The event to enqueue.
      * @param {Promise<object>} dataReady Promise containing data related to the event.
      */
    def push(event: Roomid, dataReady: js.Promise[Record[String, Any]]): Unit = js.native
    
    /**
      * Private constructor.
      *
      * @constructor
      * @param {"none"|"single"|"per_room"} type The type of event queue to create.
      * @param {consumeCallback} consumeFn Function which is called when an event
      *     is consumed.
      */
    /* private */ var queues: Any = js.native
    
    /* private */ var takeNext: Any = js.native
    
    /* private */ var `type`: Any = js.native
  }
  /* static members */
  object EventQueue {
    
    @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory for EventQueues.
      *
      * @param {"none"|"single"|"per_room"} opts.type Type of the queue to create.
      * @param {consumeCallback} consumeFn Function which is called when an event
      *     is consumed.
      * @return {EventQueue} The newly created EventQueue.
      */
    inline def create(opts: `0`, consumeFn: ConsumeCallback): EventQueueSingle | EventQueuePerRoom | EventQueueNone = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any], consumeFn.asInstanceOf[js.Any])).asInstanceOf[EventQueueSingle | EventQueuePerRoom | EventQueueNone]
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueueNone")
  @js.native
  open class EventQueueNone protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
    
    def push(event: Any, dataReady: js.Promise[Record[String, Any]]): Unit = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueuePerRoom")
  @js.native
  open class EventQueuePerRoom protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/event-queue", "EventQueueSingle")
  @js.native
  open class EventQueueSingle protected () extends EventQueue {
    def this(consumeFn: ConsumeCallback) = this()
  }
  
  type ConsumeCallback = js.Function2[/* error */ js.Error | Null, /* event */ Any, Unit]
  
  type DataReady = js.Promise[Record[String, Any]]
}
