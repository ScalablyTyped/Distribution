package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait origin extends js.Object {
  var horizontal: horizontal
  var vertical: vertical
}

object origin {
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): origin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontal")(horizontal)
    __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[origin]
  }
}

