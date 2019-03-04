package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConfigQuery extends js.Object {
  var configEntries: js.Array[ResourceConfigEntry]
  var configNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var `type`: ResourceTypes
}

object ResourceConfigQuery {
  @scala.inline
  def apply(
    configEntries: js.Array[ResourceConfigEntry],
    name: java.lang.String,
    `type`: ResourceTypes,
    configNames: js.Array[java.lang.String] = null
  ): ResourceConfigQuery = {
    val __obj = js.Dynamic.literal(configEntries = configEntries, name = name)
    __obj.updateDynamic("type")(`type`)
    if (configNames != null) __obj.updateDynamic("configNames")(configNames)
    __obj.asInstanceOf[ResourceConfigQuery]
  }
}

