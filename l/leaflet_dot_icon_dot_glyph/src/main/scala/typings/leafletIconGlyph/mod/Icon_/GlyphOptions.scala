package typings.leafletIconGlyph.mod.Icon_

import typings.leaflet.mod.BaseIconOptions
import typings.leaflet.mod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphOptions extends BaseIconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.undefined
  var bgSize: js.UndefOr[PointExpression] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var glyphAnchor: js.UndefOr[PointExpression] = js.undefined
  var glyphColor: js.UndefOr[String] = js.undefined
  var glyphSize: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object GlyphOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    bgPos: PointExpression = null,
    bgSize: PointExpression = null,
    className: String = null,
    glyph: String = null,
    glyphAnchor: PointExpression = null,
    glyphColor: String = null,
    glyphSize: String = null,
    iconAnchor: PointExpression = null,
    iconRetinaUrl: String = null,
    iconSize: PointExpression = null,
    iconUrl: String = null,
    pane: String = null,
    popupAnchor: PointExpression = null,
    prefix: String = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: String = null,
    shadowSize: PointExpression = null,
    shadowUrl: String = null,
    tooltipAnchor: PointExpression = null
  ): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bgPos != null) __obj.updateDynamic("bgPos")(bgPos.asInstanceOf[js.Any])
    if (bgSize != null) __obj.updateDynamic("bgSize")(bgSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (glyphAnchor != null) __obj.updateDynamic("glyphAnchor")(glyphAnchor.asInstanceOf[js.Any])
    if (glyphColor != null) __obj.updateDynamic("glyphColor")(glyphColor.asInstanceOf[js.Any])
    if (glyphSize != null) __obj.updateDynamic("glyphSize")(glyphSize.asInstanceOf[js.Any])
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl.asInstanceOf[js.Any])
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphOptions]
  }
}

