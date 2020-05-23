package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var default: js.Array[scala.Nothing]
  var items: Ref
  var `type`: String
}

object Items {
  @scala.inline
  def apply(default: js.Array[scala.Nothing], items: Ref, `type`: String): Items = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

