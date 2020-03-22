package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: Boolean
  var `type`: String
}

object AnonDefault {
  @scala.inline
  def apply(default: Boolean, `type`: String): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

