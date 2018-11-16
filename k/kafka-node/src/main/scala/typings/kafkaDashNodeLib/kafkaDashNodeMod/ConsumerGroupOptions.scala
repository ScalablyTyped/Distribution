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

