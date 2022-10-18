package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("lib0/queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/queue", "Queue")
  @js.native
  open class Queue () extends StObject {
    
    /**
      * @type {QueueNode | null}
      */
    var end: QueueNode | Null = js.native
    
    /**
      * @type {QueueNode | null}
      */
    var start: QueueNode | Null = js.native
  }
  
  @JSImport("lib0/queue", "QueueNode")
  @js.native
  open class QueueNode () extends StObject {
    
    /**
      * @type {QueueNode|null}
      */
    var next: QueueNode | Null = js.native
  }
  
  inline def create(): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Queue]
  
  inline def dequeue(queue: Queue): QueueNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dequeue")(queue.asInstanceOf[js.Any]).asInstanceOf[QueueNode | Null]
  
  inline def enqueue(queue: Queue, n: QueueNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enqueue")(queue.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEmpty(queue: Queue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(queue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
