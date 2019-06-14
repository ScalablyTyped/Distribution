package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaMessage extends js.Object {
  var attributes: scala.Double
  var headers: js.UndefOr[IHeaders] = js.undefined
  var key: nodeLib.Buffer
  var offset: java.lang.String
  var size: scala.Double
  var timestamp: java.lang.String
  var value: nodeLib.Buffer
}

object KafkaMessage {
  @scala.inline
  def apply(
    attributes: scala.Double,
    key: nodeLib.Buffer,
    offset: java.lang.String,
    size: scala.Double,
    timestamp: java.lang.String,
    value: nodeLib.Buffer,
    headers: IHeaders = null
  ): KafkaMessage = {
    val __obj = js.Dynamic.literal(attributes = attributes, key = key, offset = offset, size = size, timestamp = timestamp, value = value)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[KafkaMessage]
  }
}

