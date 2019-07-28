package typings.kafkajs.kafkajsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerMessage extends js.Object {
  var headers: StringDictionary[String]
  var key: String
  var offset: Double
  var timestamp: Double
  var value: Buffer
}

object ConsumerMessage {
  @scala.inline
  def apply(headers: StringDictionary[String], key: String, offset: Double, timestamp: Double, value: Buffer): ConsumerMessage = {
    val __obj = js.Dynamic.literal(headers = headers, key = key, offset = offset, timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[ConsumerMessage]
  }
}

