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

