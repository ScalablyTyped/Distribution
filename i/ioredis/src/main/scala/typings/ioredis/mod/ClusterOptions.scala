package typings.ioredis.mod

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
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
  def apply(
    clusterRetryStrategy: (/* times */ Double, /* reason */ js.UndefOr[Error]) => Double | Null = null,
    dnsLookup: (/* hostname */ String, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    enableOfflineQueue: js.UndefOr[Boolean] = js.undefined,
    enableReadyCheck: js.UndefOr[Boolean] = js.undefined,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    maxRedirections: js.UndefOr[Double] = js.undefined,
    natMap: NatMap = null,
    redisOptions: RedisOptions = null,
    retryDelayOnClusterDown: js.UndefOr[Double] = js.undefined,
    retryDelayOnFailover: js.UndefOr[Double] = js.undefined,
    retryDelayOnTryAgain: js.UndefOr[Double] = js.undefined,
    scaleReads: String = null,
    slotsRefreshInterval: js.UndefOr[Double] = js.undefined,
    slotsRefreshTimeout: js.UndefOr[Double] = js.undefined
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (clusterRetryStrategy != null) __obj.updateDynamic("clusterRetryStrategy")(js.Any.fromFunction2(clusterRetryStrategy))
    if (dnsLookup != null) __obj.updateDynamic("dnsLookup")(js.Any.fromFunction2(dnsLookup))
    if (!js.isUndefined(enableOfflineQueue)) __obj.updateDynamic("enableOfflineQueue")(enableOfflineQueue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReadyCheck)) __obj.updateDynamic("enableReadyCheck")(enableReadyCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirections)) __obj.updateDynamic("maxRedirections")(maxRedirections.get.asInstanceOf[js.Any])
    if (natMap != null) __obj.updateDynamic("natMap")(natMap.asInstanceOf[js.Any])
    if (redisOptions != null) __obj.updateDynamic("redisOptions")(redisOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelayOnClusterDown)) __obj.updateDynamic("retryDelayOnClusterDown")(retryDelayOnClusterDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelayOnFailover)) __obj.updateDynamic("retryDelayOnFailover")(retryDelayOnFailover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelayOnTryAgain)) __obj.updateDynamic("retryDelayOnTryAgain")(retryDelayOnTryAgain.get.asInstanceOf[js.Any])
    if (scaleReads != null) __obj.updateDynamic("scaleReads")(scaleReads.asInstanceOf[js.Any])
    if (!js.isUndefined(slotsRefreshInterval)) __obj.updateDynamic("slotsRefreshInterval")(slotsRefreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slotsRefreshTimeout)) __obj.updateDynamic("slotsRefreshTimeout")(slotsRefreshTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

