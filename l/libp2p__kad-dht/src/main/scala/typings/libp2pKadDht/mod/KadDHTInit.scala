package typings.libp2pKadDht.mod

import typings.libp2pKadDht.distSrcProvidersMod.ProvidersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KadDHTInit extends StObject {
  
  /**
    * After startup by default all queries will be paused until the initial
    * self-query has run and there are some peers in the routing table.
    *
    * Pass true here to disable this behaviour. (default: false)
    */
  var allowQueryWithZeroPeers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to start up as a DHT client or server
    */
  var clientMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * During startup we run the self-query at a shorter interval to ensure
    * the containing node can respond to queries quickly. Set this interval
    * here in ms (default: 1000)
    */
  var initialQuerySelfInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * How many peers to store in each kBucket (default 20)
    */
  var kBucketSize: js.UndefOr[Double] = js.undefined
  
  /**
    * How many parallel incoming streams to allow on the DHT protocol per-connection
    */
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  /**
    * How many parallel outgoing streams to allow on the DHT protocol per-connection
    */
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  
  /**
    * How many peers to ping in parallel when deciding if they should
    * be evicted from the routing table or not (default 10)
    */
  var pingConcurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * How long to wait in ms when pinging DHT peers to decide if they
    * should be evicted from the routing table or not (default 10000)
    */
  var pingTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * A custom protocol prefix to use (default: '/ipfs')
    */
  var protocolPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Initialization options for the Providers component
    */
  var providers: js.UndefOr[ProvidersInit] = js.undefined
  
  /**
    * How often to query our own PeerId in order to ensure we have a
    * good view on the KAD address space local to our PeerId
    */
  var querySelfInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Record selectors
    */
  var selectors: js.UndefOr[Selectors] = js.undefined
  
  /**
    * Record validators
    */
  var validators: js.UndefOr[Validators] = js.undefined
}
object KadDHTInit {
  
  inline def apply(): KadDHTInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KadDHTInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KadDHTInit] (val x: Self) extends AnyVal {
    
    inline def setAllowQueryWithZeroPeers(value: Boolean): Self = StObject.set(x, "allowQueryWithZeroPeers", value.asInstanceOf[js.Any])
    
    inline def setAllowQueryWithZeroPeersUndefined: Self = StObject.set(x, "allowQueryWithZeroPeers", js.undefined)
    
    inline def setClientMode(value: Boolean): Self = StObject.set(x, "clientMode", value.asInstanceOf[js.Any])
    
    inline def setClientModeUndefined: Self = StObject.set(x, "clientMode", js.undefined)
    
    inline def setInitialQuerySelfInterval(value: Double): Self = StObject.set(x, "initialQuerySelfInterval", value.asInstanceOf[js.Any])
    
    inline def setInitialQuerySelfIntervalUndefined: Self = StObject.set(x, "initialQuerySelfInterval", js.undefined)
    
    inline def setKBucketSize(value: Double): Self = StObject.set(x, "kBucketSize", value.asInstanceOf[js.Any])
    
    inline def setKBucketSizeUndefined: Self = StObject.set(x, "kBucketSize", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    
    inline def setPingConcurrency(value: Double): Self = StObject.set(x, "pingConcurrency", value.asInstanceOf[js.Any])
    
    inline def setPingConcurrencyUndefined: Self = StObject.set(x, "pingConcurrency", js.undefined)
    
    inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    
    inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
    
    inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
    
    inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
    
    inline def setProviders(value: ProvidersInit): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setQuerySelfInterval(value: Double): Self = StObject.set(x, "querySelfInterval", value.asInstanceOf[js.Any])
    
    inline def setQuerySelfIntervalUndefined: Self = StObject.set(x, "querySelfInterval", js.undefined)
    
    inline def setSelectors(value: Selectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
  }
}
