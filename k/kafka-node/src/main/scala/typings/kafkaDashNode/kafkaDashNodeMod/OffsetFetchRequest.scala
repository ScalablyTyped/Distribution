package typings.kafkaDashNode.kafkaDashNodeMod

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
  def apply(topic: String, offset: Int | Double = null, partition: Int | Double = null): OffsetFetchRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetFetchRequest]
  }
}

