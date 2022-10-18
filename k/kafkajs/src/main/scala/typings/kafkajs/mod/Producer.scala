package typings.kafkajs.mod

import typings.kafkajs.kafkajsStrings.producerDotconnect
import typings.kafkajs.kafkajsStrings.producerDotdisconnect
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest_queue_size
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest_timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Producer
  extends StObject
     with Sender {
  
  def connect(): js.Promise[Unit] = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  val events: ProducerEvents = js.native
  
  def isIdempotent(): Boolean = js.native
  
  def logger(): Logger = js.native
  
  def on(
    eventName: ValueOf[ProducerEvents],
    listener: js.Function1[/* event */ InstrumentationEvent[Any], Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_producerconnect(eventName: producerDotconnect, listener: js.Function1[/* event */ ConnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_producerdisconnect(eventName: producerDotdisconnect, listener: js.Function1[/* event */ DisconnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_producernetworkrequest(eventName: producerDotnetworkDotrequest, listener: js.Function1[/* event */ RequestEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_producernetworkrequestqueuesize(
    eventName: producerDotnetworkDotrequest_queue_size,
    listener: js.Function1[/* event */ RequestQueueSizeEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_producernetworkrequesttimeout(
    eventName: producerDotnetworkDotrequest_timeout,
    listener: js.Function1[/* event */ RequestTimeoutEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  
  def transaction(): js.Promise[Transaction] = js.native
}
