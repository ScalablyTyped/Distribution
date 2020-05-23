package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerOptions extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  var autoCommitIntervalMs: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[buffer | utf8] = js.undefined
  var fetchMaxBytes: js.UndefOr[Double] = js.undefined
  var fetchMaxWaitMs: js.UndefOr[Double] = js.undefined
  var fetchMinBytes: js.UndefOr[Double] = js.undefined
  var fromOffset: js.UndefOr[Boolean] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var keyEncoding: js.UndefOr[buffer | utf8] = js.undefined
}

object ConsumerOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    autoCommitIntervalMs: js.UndefOr[Double] = js.undefined,
    encoding: buffer | utf8 = null,
    fetchMaxBytes: js.UndefOr[Double] = js.undefined,
    fetchMaxWaitMs: js.UndefOr[Double] = js.undefined,
    fetchMinBytes: js.UndefOr[Double] = js.undefined,
    fromOffset: js.UndefOr[Boolean] = js.undefined,
    groupId: String = null,
    keyEncoding: buffer | utf8 = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommitIntervalMs)) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMaxBytes)) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMaxWaitMs)) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMinBytes)) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fromOffset)) __obj.updateDynamic("fromOffset")(fromOffset.get.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

