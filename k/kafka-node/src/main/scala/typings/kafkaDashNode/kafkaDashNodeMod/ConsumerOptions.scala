package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.kafkaDashNodeStrings.buffer
import typings.kafkaDashNode.kafkaDashNodeStrings.utf8
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
    autoCommitIntervalMs: Int | Double = null,
    encoding: buffer | utf8 = null,
    fetchMaxBytes: Int | Double = null,
    fetchMaxWaitMs: Int | Double = null,
    fetchMinBytes: Int | Double = null,
    fromOffset: js.UndefOr[Boolean] = js.undefined,
    groupId: String = null,
    keyEncoding: buffer | utf8 = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(fromOffset)) __obj.updateDynamic("fromOffset")(fromOffset)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

