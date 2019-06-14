package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConfigQuery extends js.Object {
  var configNames: js.Array[java.lang.String]
  var name: java.lang.String
  var `type`: ResourceType
}

object ResourceConfigQuery {
  @scala.inline
  def apply(configNames: js.Array[java.lang.String], name: java.lang.String, `type`: ResourceType): ResourceConfigQuery = {
    val __obj = js.Dynamic.literal(configNames = configNames, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceConfigQuery]
  }
}

