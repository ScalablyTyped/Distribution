package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.earliest
import typings.kafkaNode.kafkaNodeStrings.latest
import typings.kafkaNode.kafkaNodeStrings.none
import typings.kafkaNode.kafkaNodeStrings.range
import typings.kafkaNode.kafkaNodeStrings.roundrobin
import typings.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerGroupStreamOptions extends ConsumerGroupOptions {
  var highWaterMark: js.UndefOr[Double] = js.undefined
}

object ConsumerGroupStreamOptions {
  @scala.inline
  def apply(
    groupId: String,
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    autoCommitIntervalMs: js.UndefOr[Double] = js.undefined,
    batch: AckBatchOptions = null,
    connectOnReady: js.UndefOr[Boolean] = js.undefined,
    encoding: buffer | utf8 = null,
    fetchMaxBytes: js.UndefOr[Double] = js.undefined,
    fetchMaxWaitMs: js.UndefOr[Double] = js.undefined,
    fetchMinBytes: js.UndefOr[Double] = js.undefined,
    fromOffset: earliest | latest | none = null,
    heartbeatInterval: js.UndefOr[Double] = js.undefined,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    id: String = null,
    kafkaHost: String = null,
    keyEncoding: buffer | utf8 = null,
    maxNumSegments: js.UndefOr[Double] = js.undefined,
    maxTickMessages: js.UndefOr[Double] = js.undefined,
    migrateHLC: js.UndefOr[Boolean] = js.undefined,
    migrateRolling: js.UndefOr[Boolean] = js.undefined,
    onRebalance: () => js.Promise[Unit] = null,
    outOfRangeOffset: earliest | latest | none = null,
    protocol: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol] = null,
    retries: js.UndefOr[Double] = js.undefined,
    retryFactor: js.UndefOr[Double] = js.undefined,
    retryMinTimeout: js.UndefOr[Double] = js.undefined,
    sasl: js.Any = null,
    sessionTimeout: js.UndefOr[Double] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslOptions: js.Any = null
  ): ConsumerGroupStreamOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommitIntervalMs)) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.get.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(connectOnReady)) __obj.updateDynamic("connectOnReady")(connectOnReady.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMaxBytes)) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMaxWaitMs)) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMinBytes)) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.get.asInstanceOf[js.Any])
    if (fromOffset != null) __obj.updateDynamic("fromOffset")(fromOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInterval)) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumSegments)) __obj.updateDynamic("maxNumSegments")(maxNumSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTickMessages)) __obj.updateDynamic("maxTickMessages")(maxTickMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateHLC)) __obj.updateDynamic("migrateHLC")(migrateHLC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateRolling)) __obj.updateDynamic("migrateRolling")(migrateRolling.get.asInstanceOf[js.Any])
    if (onRebalance != null) __obj.updateDynamic("onRebalance")(js.Any.fromFunction0(onRebalance))
    if (outOfRangeOffset != null) __obj.updateDynamic("outOfRangeOffset")(outOfRangeOffset.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryFactor)) __obj.updateDynamic("retryFactor")(retryFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryMinTimeout)) __obj.updateDynamic("retryMinTimeout")(retryMinTimeout.get.asInstanceOf[js.Any])
    if (sasl != null) __obj.updateDynamic("sasl")(sasl.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionTimeout)) __obj.updateDynamic("sessionTimeout")(sessionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupStreamOptions]
  }
}

