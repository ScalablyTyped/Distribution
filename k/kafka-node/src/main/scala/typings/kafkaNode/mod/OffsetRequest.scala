package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetRequest extends js.Object {
  var maxNum: js.UndefOr[Double] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var topic: String
}

object OffsetRequest {
  @scala.inline
  def apply(
    topic: String,
    maxNum: Int | Double = null,
    partition: Int | Double = null,
    time: Int | Double = null
  ): OffsetRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (maxNum != null) __obj.updateDynamic("maxNum")(maxNum.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRequest]
  }
}

