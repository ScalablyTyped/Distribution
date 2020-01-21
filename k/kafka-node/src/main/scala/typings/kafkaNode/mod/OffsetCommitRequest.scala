package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetCommitRequest extends js.Object {
  var metadata: js.UndefOr[String] = js.undefined
  var offset: Double
  var partition: js.UndefOr[Double] = js.undefined
  var topic: String
}

object OffsetCommitRequest {
  @scala.inline
  def apply(offset: Double, topic: String, metadata: String = null, partition: Int | Double = null): OffsetCommitRequest = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetCommitRequest]
  }
}

