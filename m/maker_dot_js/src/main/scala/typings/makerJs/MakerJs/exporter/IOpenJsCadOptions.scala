package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IFindLoopsOptions
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
    extrusion: js.UndefOr[Double] = js.undefined,
    facetSize: js.UndefOr[Double] = js.undefined,
    functionName: String = null,
    modelMap: IOpenJsCadOptionsMap = null,
    pointMatchingDistance: js.UndefOr[Double] = js.undefined,
    removeFromOriginal: js.UndefOr[Boolean] = js.undefined
  ): IOpenJsCadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extrusion)) __obj.updateDynamic("extrusion")(extrusion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(facetSize)) __obj.updateDynamic("facetSize")(facetSize.get.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (modelMap != null) __obj.updateDynamic("modelMap")(modelMap.asInstanceOf[js.Any])
    if (!js.isUndefined(pointMatchingDistance)) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromOriginal)) __obj.updateDynamic("removeFromOriginal")(removeFromOriginal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenJsCadOptions]
  }
}

