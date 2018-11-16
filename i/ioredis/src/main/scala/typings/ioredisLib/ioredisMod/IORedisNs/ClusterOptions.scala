package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClusterOptions extends js.Object {
  var clusterRetryStrategy: js.UndefOr[js.Function1[/* times */ scala.Double, scala.Double]] = js.undefined
  var enableOfflineQueue: js.UndefOr[scala.Boolean] = js.undefined
  var enableReadyCheck: js.UndefOr[scala.Boolean] = js.undefined
  var maxRedirections: js.UndefOr[scala.Double] = js.undefined
  var redisOptions: js.UndefOr[RedisOptions] = js.undefined
  var retryDelayOnClusterDown: js.UndefOr[scala.Double] = js.undefined
  var retryDelayOnFailover: js.UndefOr[scala.Double] = js.undefined
  var retryDelayOnTryAgain: js.UndefOr[scala.Double] = js.undefined
  var scaleReads: js.UndefOr[java.lang.String] = js.undefined
}

