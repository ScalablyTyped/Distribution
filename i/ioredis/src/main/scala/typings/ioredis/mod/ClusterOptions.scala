package typings.ioredis.mod

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOptions extends StObject {
  
  var clusterRetryStrategy: js.UndefOr[js.Function2[/* times */ Double, /* reason */ js.UndefOr[Error], Double | Null]] = js.undefined
  
  var dnsLookup: js.UndefOr[DNSLookupFunction] = js.undefined
  
  var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
  
  var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
  
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  
  var maxRedirections: js.UndefOr[Double] = js.undefined
  
  var natMap: js.UndefOr[NatMap] = js.undefined
  
  var redisOptions: js.UndefOr[RedisOptions] = js.undefined
  
  var retryDelayOnClusterDown: js.UndefOr[Double] = js.undefined
  
  var retryDelayOnFailover: js.UndefOr[Double] = js.undefined
  
  var retryDelayOnTryAgain: js.UndefOr[Double] = js.undefined
  
  var scaleReads: js.UndefOr[String] = js.undefined
  
  var slotsRefreshInterval: js.UndefOr[Double] = js.undefined
  
  var slotsRefreshTimeout: js.UndefOr[Double] = js.undefined
}
object ClusterOptions {
  
  @scala.inline
  def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsMutableBuilder[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterRetryStrategy(value: (/* times */ Double, /* reason */ js.UndefOr[Error]) => Double | Null): Self = StObject.set(x, "clusterRetryStrategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClusterRetryStrategyUndefined: Self = StObject.set(x, "clusterRetryStrategy", js.undefined)
    
    @scala.inline
    def setDnsLookup(
      value: (/* hostname */ String, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = StObject.set(x, "dnsLookup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDnsLookupUndefined: Self = StObject.set(x, "dnsLookup", js.undefined)
    
    @scala.inline
    def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
    
    @scala.inline
    def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
    
    @scala.inline
    def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
    
    @scala.inline
    def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    
    @scala.inline
    def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
    
    @scala.inline
    def setRedisOptions(value: RedisOptions): Self = StObject.set(x, "redisOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedisOptionsUndefined: Self = StObject.set(x, "redisOptions", js.undefined)
    
    @scala.inline
    def setRetryDelayOnClusterDown(value: Double): Self = StObject.set(x, "retryDelayOnClusterDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOnClusterDownUndefined: Self = StObject.set(x, "retryDelayOnClusterDown", js.undefined)
    
    @scala.inline
    def setRetryDelayOnFailover(value: Double): Self = StObject.set(x, "retryDelayOnFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOnFailoverUndefined: Self = StObject.set(x, "retryDelayOnFailover", js.undefined)
    
    @scala.inline
    def setRetryDelayOnTryAgain(value: Double): Self = StObject.set(x, "retryDelayOnTryAgain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOnTryAgainUndefined: Self = StObject.set(x, "retryDelayOnTryAgain", js.undefined)
    
    @scala.inline
    def setScaleReads(value: String): Self = StObject.set(x, "scaleReads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleReadsUndefined: Self = StObject.set(x, "scaleReads", js.undefined)
    
    @scala.inline
    def setSlotsRefreshInterval(value: Double): Self = StObject.set(x, "slotsRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsRefreshIntervalUndefined: Self = StObject.set(x, "slotsRefreshInterval", js.undefined)
    
    @scala.inline
    def setSlotsRefreshTimeout(value: Double): Self = StObject.set(x, "slotsRefreshTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsRefreshTimeoutUndefined: Self = StObject.set(x, "slotsRefreshTimeout", js.undefined)
  }
}
