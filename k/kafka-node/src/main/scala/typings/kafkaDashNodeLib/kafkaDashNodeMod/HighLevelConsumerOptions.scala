package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighLevelConsumerOptions extends ConsumerOptions {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maxNumSegments: js.UndefOr[scala.Double] = js.undefined
  var maxTickMessages: js.UndefOr[scala.Double] = js.undefined
  var rebalanceRetry: js.UndefOr[RetryOptions] = js.undefined
}

object HighLevelConsumerOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[scala.Boolean] = js.undefined,
    autoCommitIntervalMs: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    fetchMaxBytes: scala.Int | scala.Double = null,
    fetchMaxWaitMs: scala.Int | scala.Double = null,
    fetchMinBytes: scala.Int | scala.Double = null,
    fromOffset: js.UndefOr[scala.Boolean] = js.undefined,
    groupId: java.lang.String = null,
    id: java.lang.String = null,
    keyEncoding: java.lang.String = null,
    maxNumSegments: scala.Int | scala.Double = null,
    maxTickMessages: scala.Int | scala.Double = null,
    rebalanceRetry: RetryOptions = null
  ): HighLevelConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(fromOffset)) __obj.updateDynamic("fromOffset")(fromOffset)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding)
    if (maxNumSegments != null) __obj.updateDynamic("maxNumSegments")(maxNumSegments.asInstanceOf[js.Any])
    if (maxTickMessages != null) __obj.updateDynamic("maxTickMessages")(maxTickMessages.asInstanceOf[js.Any])
    if (rebalanceRetry != null) __obj.updateDynamic("rebalanceRetry")(rebalanceRetry)
    __obj.asInstanceOf[HighLevelConsumerOptions]
  }
}

