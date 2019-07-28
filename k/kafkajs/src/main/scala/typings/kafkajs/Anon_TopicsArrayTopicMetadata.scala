package typings.kafkajs

import typings.kafkajs.kafkajsMod.TopicMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicsArrayTopicMetadata extends js.Object {
  var topics: js.Array[TopicMetadata]
}

object Anon_TopicsArrayTopicMetadata {
  @scala.inline
  def apply(topics: js.Array[TopicMetadata]): Anon_TopicsArrayTopicMetadata = {
    val __obj = js.Dynamic.literal(topics = topics)
  
    __obj.asInstanceOf[Anon_TopicsArrayTopicMetadata]
  }
}

