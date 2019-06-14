package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceConfig extends js.Object {
  var configEntries: js.Array[kafkajsLib.Anon_Name]
  var name: java.lang.String
  var `type`: ResourceType
}

object IResourceConfig {
  @scala.inline
  def apply(configEntries: js.Array[kafkajsLib.Anon_Name], name: java.lang.String, `type`: ResourceType): IResourceConfig = {
    val __obj = js.Dynamic.literal(configEntries = configEntries, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IResourceConfig]
  }
}

