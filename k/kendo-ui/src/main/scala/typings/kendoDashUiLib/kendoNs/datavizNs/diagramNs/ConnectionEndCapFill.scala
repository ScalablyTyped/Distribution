package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEndCapFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionEndCapFill {
  @scala.inline
  def apply(color: java.lang.String = null): ConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConnectionEndCapFill]
  }
}

