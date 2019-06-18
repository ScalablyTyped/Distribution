package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerMessage extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var key: java.lang.String
  var offset: scala.Double
  var timestamp: scala.Double
  var value: nodeLib.Buffer
}

object ConsumerMessage {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    key: java.lang.String,
    offset: scala.Double,
    timestamp: scala.Double,
    value: nodeLib.Buffer
  ): ConsumerMessage = {
    val __obj = js.Dynamic.literal(headers = headers, key = key, offset = offset, timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[ConsumerMessage]
  }
}

