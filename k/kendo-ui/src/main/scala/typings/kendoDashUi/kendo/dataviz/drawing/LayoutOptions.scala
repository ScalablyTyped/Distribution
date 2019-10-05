package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions extends js.Object {
  var alignContent: js.UndefOr[String] = js.undefined
  var alignItems: js.UndefOr[String] = js.undefined
  var justifyContent: js.UndefOr[String] = js.undefined
  var lineSpacing: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    justifyContent: String = null,
    lineSpacing: Int | Double = null,
    name: String = null,
    orientation: String = null,
    spacing: Int | Double = null,
    wrap: js.UndefOr[Boolean] = js.undefined
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

