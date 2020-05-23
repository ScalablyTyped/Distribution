package typings.kafkaNode.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var highWaterOffset: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String | Buffer] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var topic: String
  var value: String | Buffer
}

object Message {
  @scala.inline
  def apply(
    topic: String,
    value: String | Buffer,
    highWaterOffset: js.UndefOr[Double] = js.undefined,
    key: String | Buffer = null,
    offset: js.UndefOr[Double] = js.undefined,
    partition: js.UndefOr[Double] = js.undefined
  ): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterOffset)) __obj.updateDynamic("highWaterOffset")(highWaterOffset.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

