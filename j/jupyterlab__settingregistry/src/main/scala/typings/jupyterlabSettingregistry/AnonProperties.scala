package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: AnonArgs
  var required: js.Array[String]
  var `type`: String
}

object AnonProperties {
  @scala.inline
  def apply(properties: AnonArgs, required: js.Array[String], `type`: String): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}

