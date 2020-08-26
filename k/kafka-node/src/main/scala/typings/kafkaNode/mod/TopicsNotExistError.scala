package typings.kafkaNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "TopicsNotExistError")
@js.native
class TopicsNotExistError () extends Error {
  var topics: String | js.Array[String] = js.native
}

