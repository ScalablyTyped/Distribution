package typings
package makerDotJsLib.MakerJsNs.exporterNs

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
  var annotate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * SVG fill color.
           */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
           * SVG font size and font size units.
           */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Rendered reference origin.
           */
  var origin: js.UndefOr[makerDotJsLib.MakerJsNs.IPoint] = js.undefined
  /**
           * Scale of the SVG rendering.
           */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
           * SVG color of the rendered paths.
           */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
           * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
           */
  var strokeWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional attributes to add to the root svg tag.
           */
  var svgAttrs: js.UndefOr[IXmlTagAttrs] = js.undefined
  /**
           * Use SVG < path > elements instead of < line >, < circle > etc.
           */
  var useSvgPathOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Flag to use SVG viewbox.
           */
  var viewBox: js.UndefOr[scala.Boolean] = js.undefined
}

