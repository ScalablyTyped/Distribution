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
    maxNum: js.UndefOr[Double] = js.undefined,
    partition: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): OffsetRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNum)) __obj.updateDynamic("maxNum")(maxNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRequest]
  }
}

