package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramLayoutGrid extends js.Object {
  var componentSpacingX: js.UndefOr[scala.Double] = js.undefined
  var componentSpacingY: js.UndefOr[scala.Double] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramLayoutGrid {
  @scala.inline
  def apply(
    componentSpacingX: scala.Int | scala.Double = null,
    componentSpacingY: scala.Int | scala.Double = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): DiagramLayoutGrid = {
    val __obj = js.Dynamic.literal()
    if (componentSpacingX != null) __obj.updateDynamic("componentSpacingX")(componentSpacingX.asInstanceOf[js.Any])
    if (componentSpacingY != null) __obj.updateDynamic("componentSpacingY")(componentSpacingY.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramLayoutGrid]
  }
}

