package typings.ioredis.mod

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOptions extends js.Object {
  
  var clusterRetryStrategy: js.UndefOr[js.Function2[/* times */ Double, /* reason */ js.UndefOr[Error], Double | Null]] = js.native
  
  var dnsLookup: js.UndefOr[DNSLookupFunction] = js.native
  
  var enableOfflineQueue: js.UndefOr[Boolean] = js.native
  
  var enableReadyCheck: js.UndefOr[Boolean] = js.native
  
  var lazyConnect: js.UndefOr[Boolean] = js.native
  
  var maxRedirections: js.UndefOr[Double] = js.native
  
  var natMap: js.UndefOr[NatMap] = js.native
  
  var redisOptions: js.UndefOr[RedisOptions] = js.native
  
  var retryDelayOnClusterDown: js.UndefOr[Double] = js.native
  
  var retryDelayOnFailover: js.UndefOr[Double] = js.native
  
  var retryDelayOnTryAgain: js.UndefOr[Double] = js.native
  
  var scaleReads: js.UndefOr[String] = js.native
  
  var slotsRefreshInterval: js.UndefOr[Double] = js.native
  
  var slotsRefreshTimeout: js.UndefOr[Double] = js.native
}
object ClusterOptions {
  
  @scala.inline
  def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterRetryStrategy(value: (/* times */ Double, /* reason */ js.UndefOr[Error]) => Double | Null): Self = this.set("clusterRetryStrategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClusterRetryStrategy: Self = this.set("clusterRetryStrategy", js.undefined)
    
    @scala.inline
    def setDnsLookup(
      value: (/* hostname */ String, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("dnsLookup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDnsLookup: Self = this.set("dnsLookup", js.undefined)
    
    @scala.inline
    def setEnableOfflineQueue(value: Boolean): Self = this.set("enableOfflineQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOfflineQueue: Self = this.set("enableOfflineQueue", js.undefined)
    
    @scala.inline
    def setEnableReadyCheck(value: Boolean): Self = this.set("enableReadyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReadyCheck: Self = this.set("enableReadyCheck", js.undefined)
    
    @scala.inline
    def setLazyConnect(value: Boolean): Self = this.set("lazyConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyConnect: Self = this.set("lazyConnect", js.undefined)
    
    @scala.inline
    def setMaxRedirections(value: Double): Self = this.set("maxRedirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirections: Self = this.set("maxRedirections", js.undefined)
    
    @scala.inline
    def setNatMap(value: NatMap): Self = this.set("natMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatMap: Self = this.set("natMap", js.undefined)
    
    @scala.inline
    def setRedisOptions(value: RedisOptions): Self = this.set("redisOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedisOptions: Self = this.set("redisOptions", js.undefined)
    
    @scala.inline
    def setRetryDelayOnClusterDown(value: Double): Self = this.set("retryDelayOnClusterDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelayOnClusterDown: Self = this.set("retryDelayOnClusterDown", js.undefined)
    
    @scala.inline
    def setRetryDelayOnFailover(value: Double): Self = this.set("retryDelayOnFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelayOnFailover: Self = this.set("retryDelayOnFailover", js.undefined)
    
    @scala.inline
    def setRetryDelayOnTryAgain(value: Double): Self = this.set("retryDelayOnTryAgain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelayOnTryAgain: Self = this.set("retryDelayOnTryAgain", js.undefined)
    
    @scala.inline
    def setScaleReads(value: String): Self = this.set("scaleReads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleReads: Self = this.set("scaleReads", js.undefined)
    
    @scala.inline
    def setSlotsRefreshInterval(value: Double): Self = this.set("slotsRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotsRefreshInterval: Self = this.set("slotsRefreshInterval", js.undefined)
    
    @scala.inline
    def setSlotsRefreshTimeout(value: Double): Self = this.set("slotsRefreshTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotsRefreshTimeout: Self = this.set("slotsRefreshTimeout", js.undefined)
  }
}
