package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var default: js.Array[scala.Nothing]
  var items: AnonRef
  var `type`: String
}

object AnonItems {
  @scala.inline
  def apply(default: js.Array[scala.Nothing], items: AnonRef, `type`: String): AnonItems = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

