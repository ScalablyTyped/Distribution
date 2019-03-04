package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetRequest extends js.Object {
  var maxNum: js.UndefOr[scala.Double] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object OffsetRequest {
  @scala.inline
  def apply(
    topic: java.lang.String,
    maxNum: scala.Int | scala.Double = null,
    partition: scala.Int | scala.Double = null,
    time: scala.Int | scala.Double = null
  ): OffsetRequest = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (maxNum != null) __obj.updateDynamic("maxNum")(maxNum.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRequest]
  }
}

