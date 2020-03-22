package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinItems extends js.Object {
  var items: AnonTypeString
  var minItems: Double
  var `type`: String
}

object AnonMinItems {
  @scala.inline
  def apply(items: AnonTypeString, minItems: Double, `type`: String): AnonMinItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinItems]
  }
}

