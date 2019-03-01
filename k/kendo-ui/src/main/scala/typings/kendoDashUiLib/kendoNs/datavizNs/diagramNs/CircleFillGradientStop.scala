package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleFillGradientStop extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object CircleFillGradientStop {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): CircleFillGradientStop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleFillGradientStop]
  }
}

