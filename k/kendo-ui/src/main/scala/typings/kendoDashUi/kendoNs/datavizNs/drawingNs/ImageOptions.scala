package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import typings.kendoDashUi.kendoNs.geometryNs.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  var clip: js.UndefOr[typings.kendoDashUi.kendoNs.drawingNs.Path] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[typings.kendoDashUi.kendoNs.drawingNs.TooltipOptions] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    clip: typings.kendoDashUi.kendoNs.drawingNs.Path = null,
    cursor: String = null,
    name: String = null,
    opacity: Int | Double = null,
    tooltip: typings.kendoDashUi.kendoNs.drawingNs.TooltipOptions = null,
    transform: Transformation = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ImageOptions]
  }
}

