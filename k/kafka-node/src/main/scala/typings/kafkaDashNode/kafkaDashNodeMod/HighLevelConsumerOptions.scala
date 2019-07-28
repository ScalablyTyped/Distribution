package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighLevelConsumerOptions extends ConsumerOptions {
  var id: js.UndefOr[String] = js.undefined
  var maxNumSegments: js.UndefOr[Double] = js.undefined
  var maxTickMessages: js.UndefOr[Double] = js.undefined
  var rebalanceRetry: js.UndefOr[RetryOptions] = js.undefined
}

object HighLevelConsumerOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    autoCommitIntervalMs: Int | Double = null,
    encoding: String = null,
    fetchMaxBytes: Int | Double = null,
    fetchMaxWaitMs: Int | Double = null,
    fetchMinBytes: Int | Double = null,
    fromOffset: js.UndefOr[Boolean] = js.undefined,
    groupId: String = null,
    id: String = null,
    keyEncoding: String = null,
    maxNumSegments: Int | Double = null,
    maxTickMessages: Int | Double = null,
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

