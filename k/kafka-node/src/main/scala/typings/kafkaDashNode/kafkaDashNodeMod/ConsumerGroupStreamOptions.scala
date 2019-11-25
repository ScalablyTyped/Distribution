package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.kafkaDashNodeStrings.buffer
import typings.kafkaDashNode.kafkaDashNodeStrings.earliest
import typings.kafkaDashNode.kafkaDashNodeStrings.latest
import typings.kafkaDashNode.kafkaDashNodeStrings.none
import typings.kafkaDashNode.kafkaDashNodeStrings.range
import typings.kafkaDashNode.kafkaDashNodeStrings.roundrobin
import typings.kafkaDashNode.kafkaDashNodeStrings.utf8
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
    autoCommitIntervalMs: Int | Double = null,
    batch: AckBatchOptions = null,
    connectOnReady: js.UndefOr[Boolean] = js.undefined,
    encoding: buffer | utf8 = null,
    fetchMaxBytes: Int | Double = null,
    fetchMaxWaitMs: Int | Double = null,
    fetchMinBytes: Int | Double = null,
    fromOffset: earliest | latest | none = null,
    heartbeatInterval: Int | Double = null,
    highWaterMark: Int | Double = null,
    id: String = null,
    kafkaHost: String = null,
    keyEncoding: buffer | utf8 = null,
    maxNumSegments: Int | Double = null,
    maxTickMessages: Int | Double = null,
    migrateHLC: js.UndefOr[Boolean] = js.undefined,
    migrateRolling: js.UndefOr[Boolean] = js.undefined,
    onRebalance: () => js.Promise[Unit] = null,
    outOfRangeOffset: earliest | latest | none = null,
    protocol: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol] = null,
    retries: Int | Double = null,
    retryFactor: Int | Double = null,
    retryMinTimeout: Int | Double = null,
    sasl: js.Any = null,
    sessionTimeout: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslOptions: js.Any = null
  ): ConsumerGroupStreamOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.asInstanceOf[js.Any])
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(connectOnReady)) __obj.updateDynamic("connectOnReady")(connectOnReady.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (fromOffset != null) __obj.updateDynamic("fromOffset")(fromOffset.asInstanceOf[js.Any])
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (maxNumSegments != null) __obj.updateDynamic("maxNumSegments")(maxNumSegments.asInstanceOf[js.Any])
    if (maxTickMessages != null) __obj.updateDynamic("maxTickMessages")(maxTickMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateHLC)) __obj.updateDynamic("migrateHLC")(migrateHLC.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateRolling)) __obj.updateDynamic("migrateRolling")(migrateRolling.asInstanceOf[js.Any])
    if (onRebalance != null) __obj.updateDynamic("onRebalance")(js.Any.fromFunction0(onRebalance))
    if (outOfRangeOffset != null) __obj.updateDynamic("outOfRangeOffset")(outOfRangeOffset.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryFactor != null) __obj.updateDynamic("retryFactor")(retryFactor.asInstanceOf[js.Any])
    if (retryMinTimeout != null) __obj.updateDynamic("retryMinTimeout")(retryMinTimeout.asInstanceOf[js.Any])
    if (sasl != null) __obj.updateDynamic("sasl")(sasl.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupStreamOptions]
  }
}

