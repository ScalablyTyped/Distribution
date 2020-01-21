package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IPoint
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
  var origin: js.UndefOr[IPoint] = js.undefined
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object IPDFRenderOptions {
  @scala.inline
  def apply(origin: IPoint = null, stroke: String = null, units: String = null): IPDFRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPDFRenderOptions]
  }
}

