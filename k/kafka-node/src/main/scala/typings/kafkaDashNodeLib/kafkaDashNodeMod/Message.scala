package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var highWaterOffset: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
  var value: java.lang.String | nodeLib.Buffer
}

object Message {
  @scala.inline
  def apply(
    topic: java.lang.String,
    value: java.lang.String | nodeLib.Buffer,
    highWaterOffset: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    partition: scala.Int | scala.Double = null
  ): Message = {
    val __obj = js.Dynamic.literal(topic = topic, value = value.asInstanceOf[js.Any])
    if (highWaterOffset != null) __obj.updateDynamic("highWaterOffset")(highWaterOffset.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

