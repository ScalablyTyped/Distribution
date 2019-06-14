package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Batch extends js.Object {
  var highWatermark: java.lang.String
  var messages: js.Array[KafkaMessage]
  var partition: scala.Double
  var topic: java.lang.String
  def firstOffset(): java.lang.String | scala.Null
  def isEmpty(): scala.Boolean
  def lastOffset(): java.lang.String
  def offsetLag(): java.lang.String
}

object Batch {
  @scala.inline
  def apply(
    firstOffset: () => java.lang.String | scala.Null,
    highWatermark: java.lang.String,
    isEmpty: () => scala.Boolean,
    lastOffset: () => java.lang.String,
    messages: js.Array[KafkaMessage],
    offsetLag: () => java.lang.String,
    partition: scala.Double,
    topic: java.lang.String
  ): Batch = {
    val __obj = js.Dynamic.literal(firstOffset = js.Any.fromFunction0(firstOffset), highWatermark = highWatermark, isEmpty = js.Any.fromFunction0(isEmpty), lastOffset = js.Any.fromFunction0(lastOffset), messages = messages, offsetLag = js.Any.fromFunction0(offsetLag), partition = partition, topic = topic)
  
    __obj.asInstanceOf[Batch]
  }
}

