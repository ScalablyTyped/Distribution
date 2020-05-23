package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramLayout extends js.Object {
  var endRadialAngle: js.UndefOr[Double] = js.undefined
  var grid: js.UndefOr[DiagramLayoutGrid] = js.undefined
  var horizontalSeparation: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var layerSeparation: js.UndefOr[Double] = js.undefined
  var nodeDistance: js.UndefOr[Double] = js.undefined
  var radialFirstLevelSeparation: js.UndefOr[Double] = js.undefined
  var radialSeparation: js.UndefOr[Double] = js.undefined
  var startRadialAngle: js.UndefOr[Double] = js.undefined
  var subtype: js.UndefOr[String] = js.undefined
  var tipOverTreeStartLevel: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underneathHorizontalOffset: js.UndefOr[Double] = js.undefined
  var underneathVerticalSeparation: js.UndefOr[Double] = js.undefined
  var underneathVerticalTopOffset: js.UndefOr[Double] = js.undefined
  var verticalSeparation: js.UndefOr[Double] = js.undefined
}

object DiagramLayout {
  @scala.inline
  def apply(
    endRadialAngle: js.UndefOr[Double] = js.undefined,
    grid: DiagramLayoutGrid = null,
    horizontalSeparation: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    layerSeparation: js.UndefOr[Double] = js.undefined,
    nodeDistance: js.UndefOr[Double] = js.undefined,
    radialFirstLevelSeparation: js.UndefOr[Double] = js.undefined,
    radialSeparation: js.UndefOr[Double] = js.undefined,
    startRadialAngle: js.UndefOr[Double] = js.undefined,
    subtype: String = null,
    tipOverTreeStartLevel: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    underneathHorizontalOffset: js.UndefOr[Double] = js.undefined,
    underneathVerticalSeparation: js.UndefOr[Double] = js.undefined,
    underneathVerticalTopOffset: js.UndefOr[Double] = js.undefined,
    verticalSeparation: js.UndefOr[Double] = js.undefined
  ): DiagramLayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endRadialAngle)) __obj.updateDynamic("endRadialAngle")(endRadialAngle.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalSeparation)) __obj.updateDynamic("horizontalSeparation")(horizontalSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layerSeparation)) __obj.updateDynamic("layerSeparation")(layerSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeDistance)) __obj.updateDynamic("nodeDistance")(nodeDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialFirstLevelSeparation)) __obj.updateDynamic("radialFirstLevelSeparation")(radialFirstLevelSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialSeparation)) __obj.updateDynamic("radialSeparation")(radialSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRadialAngle)) __obj.updateDynamic("startRadialAngle")(startRadialAngle.get.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (!js.isUndefined(tipOverTreeStartLevel)) __obj.updateDynamic("tipOverTreeStartLevel")(tipOverTreeStartLevel.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(underneathHorizontalOffset)) __obj.updateDynamic("underneathHorizontalOffset")(underneathHorizontalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underneathVerticalSeparation)) __obj.updateDynamic("underneathVerticalSeparation")(underneathVerticalSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underneathVerticalTopOffset)) __obj.updateDynamic("underneathVerticalTopOffset")(underneathVerticalTopOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSeparation)) __obj.updateDynamic("verticalSeparation")(verticalSeparation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramLayout]
  }
}

