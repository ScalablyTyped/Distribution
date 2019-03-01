package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions extends js.Object {
  var alignContent: js.UndefOr[java.lang.String] = js.undefined
  var alignItems: js.UndefOr[java.lang.String] = js.undefined
  var justifyContent: js.UndefOr[java.lang.String] = js.undefined
  var lineSpacing: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply(
    alignContent: java.lang.String = null,
    alignItems: java.lang.String = null,
    justifyContent: java.lang.String = null,
    lineSpacing: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    orientation: java.lang.String = null,
    spacing: scala.Int | scala.Double = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent)
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[LayoutOptions]
  }
}

