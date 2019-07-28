package typings.kafkajs.kafkajsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var value: String | Buffer | ArrayBuffer
}

object ProducerMessage {
  @scala.inline
  def apply(
    value: String | Buffer | ArrayBuffer,
    headers: StringDictionary[String] = null,
    key: String = null,
    partition: Int | Double = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (key != null) __obj.updateDynamic("key")(key)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
}

