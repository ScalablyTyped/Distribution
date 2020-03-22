package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var default: String
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(default: String, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

