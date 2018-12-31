package typings
package makerDotJsLib.MakerJsNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenJsCad export options.
  */
trait IOpenJsCadOptions
  extends makerDotJsLib.MakerJsNs.IFindLoopsOptions {
  /**
    * Optional depth of 3D extrusion.
    */
  var extrusion: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional size of curve facets.
    */
  var facetSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional options applied to specific first-child models by model id.
    */
  var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.undefined
}

