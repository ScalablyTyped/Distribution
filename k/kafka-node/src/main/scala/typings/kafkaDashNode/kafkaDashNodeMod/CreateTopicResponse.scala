package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTopicResponse extends js.Object {
  var error: String
  var topic: String
}

object CreateTopicResponse {
  @scala.inline
  def apply(error: String, topic: String): CreateTopicResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTopicResponse]
  }
}

