package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStartCapFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionStartCapFill {
  @scala.inline
  def apply(color: java.lang.String = null): ConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConnectionStartCapFill]
  }
}

