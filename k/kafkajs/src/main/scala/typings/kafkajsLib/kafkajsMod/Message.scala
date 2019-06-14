package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var headers: js.UndefOr[IHeaders] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var partition: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var value: java.lang.String | nodeLib.Buffer | scala.Null
}

object Message {
  @scala.inline
  def apply(
    headers: IHeaders = null,
    key: java.lang.String | nodeLib.Buffer = null,
    partition: java.lang.String | scala.Double = null,
    timestamp: scala.Double | java.lang.String = null,
    value: java.lang.String | nodeLib.Buffer = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

