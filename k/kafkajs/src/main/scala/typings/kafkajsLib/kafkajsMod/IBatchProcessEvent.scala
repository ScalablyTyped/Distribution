package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchProcessEvent extends js.Object {
  var batchSize: scala.Double
  var firstOffset: java.lang.String
  var highWatermark: java.lang.String
  var lastOffset: java.lang.String
  var offsetLag: java.lang.String
  var partition: scala.Double
  var topic: java.lang.String
}

object IBatchProcessEvent {
  @scala.inline
  def apply(
    batchSize: scala.Double,
    firstOffset: java.lang.String,
    highWatermark: java.lang.String,
    lastOffset: java.lang.String,
    offsetLag: java.lang.String,
    partition: scala.Double,
    topic: java.lang.String
  ): IBatchProcessEvent = {
    val __obj = js.Dynamic.literal(batchSize = batchSize, firstOffset = firstOffset, highWatermark = highWatermark, lastOffset = lastOffset, offsetLag = offsetLag, partition = partition, topic = topic)
  
    __obj.asInstanceOf[IBatchProcessEvent]
  }
}

