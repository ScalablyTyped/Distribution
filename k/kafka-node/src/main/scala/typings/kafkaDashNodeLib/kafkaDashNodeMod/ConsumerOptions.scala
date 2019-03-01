package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerOptions extends js.Object {
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  var autoCommitIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fetchMaxBytes: js.UndefOr[scala.Double] = js.undefined
  var fetchMaxWaitMs: js.UndefOr[scala.Double] = js.undefined
  var fetchMinBytes: js.UndefOr[scala.Double] = js.undefined
  var fromOffset: js.UndefOr[scala.Boolean] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var keyEncoding: js.UndefOr[java.lang.String] = js.undefined
}

object ConsumerOptions {
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
    keyEncoding: java.lang.String = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(fromOffset)) __obj.updateDynamic("fromOffset")(fromOffset)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding)
    __obj.asInstanceOf[ConsumerOptions]
  }
}

