package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetFetchRequest extends js.Object {
  var offset: js.UndefOr[scala.Double] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object OffsetFetchRequest {
  @scala.inline
  def apply(
    topic: java.lang.String,
    offset: scala.Int | scala.Double = null,
    partition: scala.Int | scala.Double = null
  ): OffsetFetchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topic")(topic)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetFetchRequest]
  }
}

