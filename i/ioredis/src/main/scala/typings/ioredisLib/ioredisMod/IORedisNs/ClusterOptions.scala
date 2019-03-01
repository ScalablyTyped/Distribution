package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var clusterRetryStrategy: js.UndefOr[
    js.Function2[
      /* times */ scala.Double, 
      /* reason */ js.UndefOr[nodeLib.Error], 
      scala.Double | scala.Null
    ]
  ] = js.undefined
  var dnsLookup: js.UndefOr[DNSLookupFunction] = js.undefined
  var enableOfflineQueue: js.UndefOr[scala.Boolean] = js.undefined
  var enableReadyCheck: js.UndefOr[scala.Boolean] = js.undefined
  var lazyConnect: js.UndefOr[scala.Boolean] = js.undefined
  var maxRedirections: js.UndefOr[scala.Double] = js.undefined
  var natMap: js.UndefOr[NatMap] = js.undefined
  var redisOptions: js.UndefOr[RedisOptions] = js.undefined
  var retryDelayOnClusterDown: js.UndefOr[scala.Double] = js.undefined
  var retryDelayOnFailover: js.UndefOr[scala.Double] = js.undefined
  var retryDelayOnTryAgain: js.UndefOr[scala.Double] = js.undefined
  var scaleReads: js.UndefOr[java.lang.String] = js.undefined
  var slotsRefreshInterval: js.UndefOr[scala.Double] = js.undefined
  var slotsRefreshTimeout: js.UndefOr[scala.Double] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    clusterRetryStrategy: js.Function2[
      /* times */ scala.Double, 
      /* reason */ js.UndefOr[nodeLib.Error], 
      scala.Double | scala.Null
    ] = null,
    dnsLookup: DNSLookupFunction = null,
    enableOfflineQueue: js.UndefOr[scala.Boolean] = js.undefined,
    enableReadyCheck: js.UndefOr[scala.Boolean] = js.undefined,
    lazyConnect: js.UndefOr[scala.Boolean] = js.undefined,
    maxRedirections: scala.Int | scala.Double = null,
    natMap: NatMap = null,
    redisOptions: RedisOptions = null,
    retryDelayOnClusterDown: scala.Int | scala.Double = null,
    retryDelayOnFailover: scala.Int | scala.Double = null,
    retryDelayOnTryAgain: scala.Int | scala.Double = null,
    scaleReads: java.lang.String = null,
    slotsRefreshInterval: scala.Int | scala.Double = null,
    slotsRefreshTimeout: scala.Int | scala.Double = null
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (clusterRetryStrategy != null) __obj.updateDynamic("clusterRetryStrategy")(clusterRetryStrategy)
    if (dnsLookup != null) __obj.updateDynamic("dnsLookup")(dnsLookup)
    if (!js.isUndefined(enableOfflineQueue)) __obj.updateDynamic("enableOfflineQueue")(enableOfflineQueue)
    if (!js.isUndefined(enableReadyCheck)) __obj.updateDynamic("enableReadyCheck")(enableReadyCheck)
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect)
    if (maxRedirections != null) __obj.updateDynamic("maxRedirections")(maxRedirections.asInstanceOf[js.Any])
    if (natMap != null) __obj.updateDynamic("natMap")(natMap)
    if (redisOptions != null) __obj.updateDynamic("redisOptions")(redisOptions)
    if (retryDelayOnClusterDown != null) __obj.updateDynamic("retryDelayOnClusterDown")(retryDelayOnClusterDown.asInstanceOf[js.Any])
    if (retryDelayOnFailover != null) __obj.updateDynamic("retryDelayOnFailover")(retryDelayOnFailover.asInstanceOf[js.Any])
    if (retryDelayOnTryAgain != null) __obj.updateDynamic("retryDelayOnTryAgain")(retryDelayOnTryAgain.asInstanceOf[js.Any])
    if (scaleReads != null) __obj.updateDynamic("scaleReads")(scaleReads)
    if (slotsRefreshInterval != null) __obj.updateDynamic("slotsRefreshInterval")(slotsRefreshInterval.asInstanceOf[js.Any])
    if (slotsRefreshTimeout != null) __obj.updateDynamic("slotsRefreshTimeout")(slotsRefreshTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

