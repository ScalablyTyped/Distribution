package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordMetadata extends js.Object {
  var errorCode: scala.Double
  var offset: java.lang.String
  var partition: scala.Double
  var timestamp: java.lang.String
  var topicName: java.lang.String
}

object RecordMetadata {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    offset: java.lang.String,
    partition: scala.Double,
    timestamp: java.lang.String,
    topicName: java.lang.String
  ): RecordMetadata = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, offset = offset, partition = partition, timestamp = timestamp, topicName = topicName)
  
    __obj.asInstanceOf[RecordMetadata]
  }
}

