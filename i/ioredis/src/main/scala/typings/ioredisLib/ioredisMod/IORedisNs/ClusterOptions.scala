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

