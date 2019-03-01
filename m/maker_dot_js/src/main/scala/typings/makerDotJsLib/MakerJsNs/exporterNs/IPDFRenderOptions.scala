package typings
package makerDotJsLib.MakerJsNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PDF rendering options.
  */
trait IPDFRenderOptions extends IExportOptions {
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[makerDotJsLib.MakerJsNs.IPoint] = js.undefined
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
}

object IPDFRenderOptions {
  @scala.inline
  def apply(
    origin: makerDotJsLib.MakerJsNs.IPoint = null,
    stroke: java.lang.String = null,
    units: java.lang.String = null
  ): IPDFRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IPDFRenderOptions]
  }
}

