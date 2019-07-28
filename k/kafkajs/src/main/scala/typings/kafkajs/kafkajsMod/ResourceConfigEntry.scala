package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConfigEntry extends js.Object {
  var name: String
  var value: String
}

object ResourceConfigEntry {
  @scala.inline
  def apply(name: String, value: String): ResourceConfigEntry = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ResourceConfigEntry]
  }
}

