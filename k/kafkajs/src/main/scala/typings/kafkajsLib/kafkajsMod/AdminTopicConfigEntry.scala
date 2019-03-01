package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicConfigEntry extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object AdminTopicConfigEntry {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): AdminTopicConfigEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AdminTopicConfigEntry]
  }
}

