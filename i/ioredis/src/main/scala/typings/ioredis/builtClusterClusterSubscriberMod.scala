package typings.ioredis

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtClusterClusterSubscriberMod {
  
  @JSImport("ioredis/built/cluster/ClusterSubscriber", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ClusterSubscriber {
    def this(connectionPool: typings.ioredis.builtClusterConnectionPoolMod.default, emitter: EventEmitter) = this()
    
    /* private */ /* CompleteClass */
    var connectionPool: Any = js.native
    
    /* private */ /* CompleteClass */
    var emitter: Any = js.native
    
    /* CompleteClass */
    override def getInstance(): Any = js.native
    
    /* private */ /* CompleteClass */
    var lastActiveSubscriber: Any = js.native
    
    /* private */ /* CompleteClass */
    var onSubscriberEnd: Any = js.native
    
    /* private */ /* CompleteClass */
    var selectSubscriber: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var started: Any = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var subscriber: Any = js.native
  }
  
  trait ClusterSubscriber extends StObject {
    
    /* private */ var connectionPool: Any
    
    /* private */ var emitter: Any
    
    def getInstance(): Any
    
    /* private */ var lastActiveSubscriber: Any
    
    /* private */ var onSubscriberEnd: Any
    
    /* private */ var selectSubscriber: Any
    
    def start(): Unit
    
    /* private */ var started: Any
    
    def stop(): Unit
    
    /* private */ var subscriber: Any
  }
  object ClusterSubscriber {
    
    inline def apply(
      connectionPool: Any,
      emitter: Any,
      getInstance: () => Any,
      lastActiveSubscriber: Any,
      onSubscriberEnd: Any,
      selectSubscriber: Any,
      start: () => Unit,
      started: Any,
      stop: () => Unit,
      subscriber: Any
    ): ClusterSubscriber = {
      val __obj = js.Dynamic.literal(connectionPool = connectionPool.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getInstance = js.Any.fromFunction0(getInstance), lastActiveSubscriber = lastActiveSubscriber.asInstanceOf[js.Any], onSubscriberEnd = onSubscriberEnd.asInstanceOf[js.Any], selectSubscriber = selectSubscriber.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), subscriber = subscriber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSubscriber]
    }
    
    extension [Self <: ClusterSubscriber](x: Self) {
      
      inline def setConnectionPool(value: Any): Self = StObject.set(x, "connectionPool", value.asInstanceOf[js.Any])
      
      inline def setEmitter(value: Any): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetInstance(value: () => Any): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
      
      inline def setLastActiveSubscriber(value: Any): Self = StObject.set(x, "lastActiveSubscriber", value.asInstanceOf[js.Any])
      
      inline def setOnSubscriberEnd(value: Any): Self = StObject.set(x, "onSubscriberEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectSubscriber(value: Any): Self = StObject.set(x, "selectSubscriber", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStarted(value: Any): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setSubscriber(value: Any): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    }
  }
}
