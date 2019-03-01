package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerGroupOptions extends js.Object {
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  var autoCommitIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var batch: js.UndefOr[AckBatchOptions] = js.undefined
  var connectOnReady: js.UndefOr[scala.Boolean] = js.undefined
  var fetchMaxBytes: js.UndefOr[scala.Double] = js.undefined
  var fetchMaxWaitMs: js.UndefOr[scala.Double] = js.undefined
  var fetchMinBytes: js.UndefOr[scala.Double] = js.undefined
  var fromOffset: js.UndefOr[
    kafkaDashNodeLib.kafkaDashNodeLibStrings.earliest | kafkaDashNodeLib.kafkaDashNodeLibStrings.latest | kafkaDashNodeLib.kafkaDashNodeLibStrings.none
  ] = js.undefined
  var groupId: java.lang.String
  var host: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kafkaHost: js.UndefOr[java.lang.String] = js.undefined
  var maxNumSegments: js.UndefOr[scala.Double] = js.undefined
  var maxTickMessages: js.UndefOr[scala.Double] = js.undefined
  var migrateHLC: js.UndefOr[scala.Boolean] = js.undefined
  var migrateRolling: js.UndefOr[scala.Boolean] = js.undefined
  var outOfRangeOffset: js.UndefOr[
    kafkaDashNodeLib.kafkaDashNodeLibStrings.earliest | kafkaDashNodeLib.kafkaDashNodeLibStrings.latest | kafkaDashNodeLib.kafkaDashNodeLibStrings.none
  ] = js.undefined
  var protocol: js.UndefOr[
    js.Array[
      kafkaDashNodeLib.kafkaDashNodeLibStrings.roundrobin | kafkaDashNodeLib.kafkaDashNodeLibStrings.range | CustomPartitionAssignmentProtocol
    ]
  ] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var retryFactor: js.UndefOr[scala.Double] = js.undefined
  var retryMinTimeout: js.UndefOr[scala.Double] = js.undefined
  var sessionTimeout: js.UndefOr[scala.Double] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  var zk: js.UndefOr[ZKOptions] = js.undefined
}

object ConsumerGroupOptions {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    autoCommit: js.UndefOr[scala.Boolean] = js.undefined,
    autoCommitIntervalMs: scala.Int | scala.Double = null,
    batch: AckBatchOptions = null,
    connectOnReady: js.UndefOr[scala.Boolean] = js.undefined,
    fetchMaxBytes: scala.Int | scala.Double = null,
    fetchMaxWaitMs: scala.Int | scala.Double = null,
    fetchMinBytes: scala.Int | scala.Double = null,
    fromOffset: kafkaDashNodeLib.kafkaDashNodeLibStrings.earliest | kafkaDashNodeLib.kafkaDashNodeLibStrings.latest | kafkaDashNodeLib.kafkaDashNodeLibStrings.none = null,
    host: java.lang.String = null,
    id: java.lang.String = null,
    kafkaHost: java.lang.String = null,
    maxNumSegments: scala.Int | scala.Double = null,
    maxTickMessages: scala.Int | scala.Double = null,
    migrateHLC: js.UndefOr[scala.Boolean] = js.undefined,
    migrateRolling: js.UndefOr[scala.Boolean] = js.undefined,
    outOfRangeOffset: kafkaDashNodeLib.kafkaDashNodeLibStrings.earliest | kafkaDashNodeLib.kafkaDashNodeLibStrings.latest | kafkaDashNodeLib.kafkaDashNodeLibStrings.none = null,
    protocol: js.Array[
      kafkaDashNodeLib.kafkaDashNodeLibStrings.roundrobin | kafkaDashNodeLib.kafkaDashNodeLibStrings.range | CustomPartitionAssignmentProtocol
    ] = null,
    retries: scala.Int | scala.Double = null,
    retryFactor: scala.Int | scala.Double = null,
    retryMinTimeout: scala.Int | scala.Double = null,
    sessionTimeout: scala.Int | scala.Double = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    zk: ZKOptions = null
  ): ConsumerGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupId")(groupId)
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (!js.isUndefined(connectOnReady)) __obj.updateDynamic("connectOnReady")(connectOnReady)
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (fromOffset != null) __obj.updateDynamic("fromOffset")(fromOffset.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost)
    if (maxNumSegments != null) __obj.updateDynamic("maxNumSegments")(maxNumSegments.asInstanceOf[js.Any])
    if (maxTickMessages != null) __obj.updateDynamic("maxTickMessages")(maxTickMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateHLC)) __obj.updateDynamic("migrateHLC")(migrateHLC)
    if (!js.isUndefined(migrateRolling)) __obj.updateDynamic("migrateRolling")(migrateRolling)
    if (outOfRangeOffset != null) __obj.updateDynamic("outOfRangeOffset")(outOfRangeOffset.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryFactor != null) __obj.updateDynamic("retryFactor")(retryFactor.asInstanceOf[js.Any])
    if (retryMinTimeout != null) __obj.updateDynamic("retryMinTimeout")(retryMinTimeout.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (zk != null) __obj.updateDynamic("zk")(zk)
    __obj.asInstanceOf[ConsumerGroupOptions]
  }
}

