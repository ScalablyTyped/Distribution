package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePayloadBase extends js.Object {
  var acks: js.UndefOr[AcksBehaviour] = js.undefined
  var compression: js.UndefOr[CompressionTypes] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object MessagePayloadBase {
  @scala.inline
  def apply(
    acks: AcksBehaviour = null,
    compression: CompressionTypes = null,
    timeout: scala.Int | scala.Double = null
  ): MessagePayloadBase = {
    val __obj = js.Dynamic.literal()
    if (acks != null) __obj.updateDynamic("acks")(acks)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayloadBase]
  }
}

