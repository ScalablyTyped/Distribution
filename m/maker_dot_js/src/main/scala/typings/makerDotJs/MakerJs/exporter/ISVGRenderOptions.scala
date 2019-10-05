package typings.makerDotJs.MakerJs.exporter

import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SVG rendering options.
  */
trait ISVGRenderOptions extends IExportOptions {
  /**
    *  Indicate that the id's of paths should be rendered as SVG text elements.
    */
  var annotate: js.UndefOr[Boolean] = js.undefined
  /**
    * SVG fill color.
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * SVG font size and font size units.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
  /**
    * Scale of the SVG rendering.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
    */
  var strokeWidth: js.UndefOr[String] = js.undefined
  /**
    * Optional attributes to add to the root svg tag.
    */
  var svgAttrs: js.UndefOr[IXmlTagAttrs] = js.undefined
  /**
    * Use SVG < path > elements instead of < line >, < circle > etc.
    */
  var useSvgPathOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Flag to use SVG viewbox.
    */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}

object ISVGRenderOptions {
  @scala.inline
  def apply(
    annotate: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    fontSize: String = null,
    origin: IPoint = null,
    scale: Int | Double = null,
    stroke: String = null,
    strokeWidth: String = null,
    svgAttrs: IXmlTagAttrs = null,
    units: String = null,
    useSvgPathOnly: js.UndefOr[Boolean] = js.undefined,
    viewBox: js.UndefOr[Boolean] = js.undefined
  ): ISVGRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotate)) __obj.updateDynamic("annotate")(annotate)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth)
    if (svgAttrs != null) __obj.updateDynamic("svgAttrs")(svgAttrs)
    if (units != null) __obj.updateDynamic("units")(units)
    if (!js.isUndefined(useSvgPathOnly)) __obj.updateDynamic("useSvgPathOnly")(useSvgPathOnly)
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[ISVGRenderOptions]
  }
}

