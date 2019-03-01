package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementOptions extends js.Object {
  var clip: js.UndefOr[kendoDashUiLib.kendoNs.drawingNs.Path] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var transform: js.UndefOr[kendoDashUiLib.kendoNs.geometryNs.Transformation] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ElementOptions {
  @scala.inline
  def apply(
    clip: kendoDashUiLib.kendoNs.drawingNs.Path = null,
    cursor: java.lang.String = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    transform: kendoDashUiLib.kendoNs.geometryNs.Transformation = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ElementOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ElementOptions]
  }
}

