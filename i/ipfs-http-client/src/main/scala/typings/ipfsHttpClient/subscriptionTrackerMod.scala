package typings.ipfsHttpClient

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionTrackerMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/subscription-tracker", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SubscriptionTracker {
    
    /* CompleteClass */
    var _subs: Map[js.Any, js.Any] = js.native
    
    /* CompleteClass */
    override def subscribe(topic: js.Any, handler: js.Any, signal: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def unsubscribe(topic: js.Any, handler: js.Any): Unit = js.native
  }
  @JSImport("ipfs-http-client/dist/src/pubsub/subscription-tracker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-http-client/dist/src/pubsub/subscription-tracker", "instance")
  @js.native
  val instance: js.Any = js.native
  
  /* static member */
  @scala.inline
  def singleton(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[js.Any]
  
  trait SubscriptionTracker extends StObject {
    
    var _subs: Map[js.Any, js.Any]
    
    def subscribe(topic: js.Any, handler: js.Any, signal: js.Any): js.Any
    
    def unsubscribe(topic: js.Any, handler: js.Any): Unit
  }
  object SubscriptionTracker {
    
    @scala.inline
    def apply(
      _subs: Map[js.Any, js.Any],
      subscribe: (js.Any, js.Any, js.Any) => js.Any,
      unsubscribe: (js.Any, js.Any) => Unit
    ): SubscriptionTracker = {
      val __obj = js.Dynamic.literal(_subs = _subs.asInstanceOf[js.Any], subscribe = js.Any.fromFunction3(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
      __obj.asInstanceOf[SubscriptionTracker]
    }
    
    @scala.inline
    implicit class SubscriptionTrackerMutableBuilder[Self <: SubscriptionTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnsubscribe(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_subs(value: Map[js.Any, js.Any]): Self = StObject.set(x, "_subs", value.asInstanceOf[js.Any])
    }
  }
}
