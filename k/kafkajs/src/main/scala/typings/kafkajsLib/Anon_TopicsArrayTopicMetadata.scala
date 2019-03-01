package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicsArrayTopicMetadata extends js.Object {
  var topics: js.Array[kafkajsLib.kafkajsMod.TopicMetadata]
}

object Anon_TopicsArrayTopicMetadata {
  @scala.inline
  def apply(topics: js.Array[kafkajsLib.kafkajsMod.TopicMetadata]): Anon_TopicsArrayTopicMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_TopicsArrayTopicMetadata]
  }
}

