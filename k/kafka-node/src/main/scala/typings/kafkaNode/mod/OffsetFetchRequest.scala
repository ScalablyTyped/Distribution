package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetFetchRequest extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var topic: String
}

object OffsetFetchRequest {
  @scala.inline
  def apply(
    topic: String,
    offset: js.UndefOr[Double] = js.undefined,
    partition: js.UndefOr[Double] = js.undefined
  ): OffsetFetchRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetFetchRequest]
  }
}

