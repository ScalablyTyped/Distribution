package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubInit extends StObject {
  
  /**
    * if can relay messages not subscribed
    */
  var canRelayMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if publish should emit to self, if subscribed
    */
  var emitSelf: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * defines how signatures should be handled
    */
  var globalSignaturePolicy: js.UndefOr[SignaturePolicy] = js.undefined
  
  /**
    * How many parallel incoming streams to allow on the pubsub protocol per-connection
    */
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  /**
    * How many parallel outgoing streams to allow on the pubsub protocol per-connection
    */
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  
  /**
    * handle this many incoming pubsub messages concurrently
    */
  var messageProcessingConcurrency: js.UndefOr[Double] = js.undefined
  
  var multicodecs: js.UndefOr[js.Array[String]] = js.undefined
}
object PubSubInit {
  
  inline def apply(): PubSubInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubSubInit] (val x: Self) extends AnyVal {
    
    inline def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
    
    inline def setCanRelayMessageUndefined: Self = StObject.set(x, "canRelayMessage", js.undefined)
    
    inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
    
    inline def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGlobalSignaturePolicy(value: SignaturePolicy): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    inline def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    
    inline def setMessageProcessingConcurrency(value: Double): Self = StObject.set(x, "messageProcessingConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMessageProcessingConcurrencyUndefined: Self = StObject.set(x, "messageProcessingConcurrency", js.undefined)
    
    inline def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
    
    inline def setMulticodecsUndefined: Self = StObject.set(x, "multicodecs", js.undefined)
    
    inline def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value*))
  }
}
