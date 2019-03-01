package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetCommitRequest extends js.Object {
  var metadata: js.UndefOr[java.lang.String] = js.undefined
  var offset: scala.Double
  var partition: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object OffsetCommitRequest {
  @scala.inline
  def apply(
    offset: scala.Double,
    topic: java.lang.String,
    metadata: java.lang.String = null,
    partition: scala.Int | scala.Double = null
  ): OffsetCommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("topic")(topic)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetCommitRequest]
  }
}

