package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String | nodeLib.Buffer | stdLib.ArrayBuffer
}

object ProducerMessage {
  @scala.inline
  def apply(
    value: java.lang.String | nodeLib.Buffer | stdLib.ArrayBuffer,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    key: java.lang.String = null,
    partition: scala.Int | scala.Double = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (key != null) __obj.updateDynamic("key")(key)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
}

