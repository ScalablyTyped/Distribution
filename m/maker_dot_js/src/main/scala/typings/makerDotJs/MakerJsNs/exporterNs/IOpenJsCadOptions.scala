package typings.makerDotJs.MakerJsNs.exporterNs

import typings.makerDotJs.MakerJsNs.IFindLoopsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenJsCad export options.
  */
trait IOpenJsCadOptions extends IFindLoopsOptions {
  /**
    * Optional depth of 3D extrusion.
    */
  var extrusion: js.UndefOr[Double] = js.undefined
  /**
    * Optional size of curve facets.
    */
  var facetSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[String] = js.undefined
  /**
    * Optional options applied to specific first-child models by model id.
    */
  var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.undefined
}

object IOpenJsCadOptions {
  @scala.inline
  def apply(
    extrusion: Int | Double = null,
    facetSize: Int | Double = null,
    functionName: String = null,
    modelMap: IOpenJsCadOptionsMap = null,
    pointMatchingDistance: Int | Double = null,
    removeFromOriginal: js.UndefOr[Boolean] = js.undefined
  ): IOpenJsCadOptions = {
    val __obj = js.Dynamic.literal()
    if (extrusion != null) __obj.updateDynamic("extrusion")(extrusion.asInstanceOf[js.Any])
    if (facetSize != null) __obj.updateDynamic("facetSize")(facetSize.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (modelMap != null) __obj.updateDynamic("modelMap")(modelMap)
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromOriginal)) __obj.updateDynamic("removeFromOriginal")(removeFromOriginal)
    __obj.asInstanceOf[IOpenJsCadOptions]
  }
}

