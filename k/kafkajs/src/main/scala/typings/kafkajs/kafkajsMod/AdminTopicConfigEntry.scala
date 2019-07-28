package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicConfigEntry extends js.Object {
  var name: String
  var value: String
}

object AdminTopicConfigEntry {
  @scala.inline
  def apply(name: String, value: String): AdminTopicConfigEntry = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[AdminTopicConfigEntry]
  }
}

