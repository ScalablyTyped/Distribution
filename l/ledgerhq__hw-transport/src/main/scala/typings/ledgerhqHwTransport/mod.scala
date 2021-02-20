package typings.ledgerhqHwTransport

import typings.ledgerhqHwTransport.ledgerhqHwTransportStrings.add
import typings.ledgerhqHwTransport.ledgerhqHwTransportStrings.remove
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport", JSImport.Default)
  @js.native
  class default[TDescriptor /* <: Descriptor */] () extends Transport[TDescriptor]
  object default {
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport", "default.create")
    @js.native
    def create(): js.Promise[Transport[Descriptor]] = js.native
    @JSImport("@ledgerhq/hw-transport", "default.create")
    @js.native
    def create(openTimeout: js.UndefOr[scala.Nothing], listenTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
    @JSImport("@ledgerhq/hw-transport", "default.create")
    @js.native
    def create(openTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
    @JSImport("@ledgerhq/hw-transport", "default.create")
    @js.native
    def create(openTimeout: Double, listenTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport", "default.isSupported")
    @js.native
    def isSupported(): js.Promise[Boolean] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport", "default.list")
    @js.native
    def list(): js.Promise[js.Array[Descriptor]] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport", "default.listen")
    @js.native
    def listen(observer: Observer[DescriptorEvent[Descriptor]]): Subscription = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport", "default.open")
    @js.native
    def open(descriptor: Descriptor): js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
        ]
      ] = js.native
    @JSImport("@ledgerhq/hw-transport", "default.open")
    @js.native
    def open(descriptor: Descriptor, timeout: Double): js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
        ]
      ] = js.native
  }
  
  @JSImport("@ledgerhq/hw-transport", "getAltStatusMessage")
  @js.native
  def getAltStatusMessage(code: Double): String = js.native
  
  type Descriptor = String
  
  @js.native
  trait DescriptorEvent[Descriptor] extends StObject {
    
    var descriptor: Descriptor = js.native
    
    var device: js.UndefOr[Device] = js.native
    
    var `type`: add | remove = js.native
  }
  object DescriptorEvent {
    
    @scala.inline
    def apply[Descriptor](descriptor: Descriptor, `type`: add | remove): DescriptorEvent[Descriptor] = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorEvent[Descriptor]]
    }
    
    @scala.inline
    implicit class DescriptorEventMutableBuilder[Self <: DescriptorEvent[_], Descriptor] (val x: Self with DescriptorEvent[Descriptor]) extends AnyVal {
      
      @scala.inline
      def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setType(value: add | remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Device = js.Any
  
  @js.native
  trait Observer[Ev] extends StObject {
    
    def complete(): js.Any = js.native
    
    def error(e: js.Any): js.Any = js.native
    
    def next(event: Ev): js.Any = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[Ev](complete: () => js.Any, error: js.Any => js.Any, next: Ev => js.Any): Observer[Ev] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[Ev]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_], Ev] (val x: Self with Observer[Ev]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => js.Any): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: Ev => js.Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Transport[TDescriptor /* <: Descriptor */] extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def decorateAppAPIMethods(self: js.Any, methods: js.Array[String], scrambleKey: String): Unit = js.native
    
    def exchange(apdu: Buffer): js.Promise[Buffer] = js.native
    
    def off(eventName: String, cb: js.Any): Unit = js.native
    
    def on(eventName: String, cb: js.Any): Unit = js.native
    
    /**
      * A wrapper around exchange to simplify work of the implementation.
      * @param data The data to be sent. Defaults to a zero-length Buffer.
      * @param statusList A list of accepted status code (shorts). [0x9000] by default.
      * @return A Promise of the response Buffer
      */
    def send(cla: Double, ins: Double, p1: Double, p2: Double): js.Promise[Buffer] = js.native
    def send(
      cla: Double,
      ins: Double,
      p1: Double,
      p2: Double,
      data: js.UndefOr[scala.Nothing],
      statusList: js.Array[Double]
    ): js.Promise[Buffer] = js.native
    def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer): js.Promise[Buffer] = js.native
    def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer, statusList: js.Array[Double]): js.Promise[Buffer] = js.native
    
    def setDebugMode(debug: js.Function1[/* log */ String, Unit]): Unit = js.native
    def setDebugMode(debug: Boolean): Unit = js.native
    
    def setExchangeTimeout(exchangeTimeout: Double): Unit = js.native
    
    def setScrambleKey(key: String): Unit = js.native
  }
}
