package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinItems extends js.Object {
  var items: TypeString
  var minItems: Double
  var `type`: String
}

object MinItems {
  @scala.inline
  def apply(items: TypeString, minItems: Double, `type`: String): MinItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinItems]
  }
}

