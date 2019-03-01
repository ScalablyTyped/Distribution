package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramLayout extends js.Object {
  var endRadialAngle: js.UndefOr[scala.Double] = js.undefined
  var grid: js.UndefOr[DiagramLayoutGrid] = js.undefined
  var horizontalSeparation: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var layerSeparation: js.UndefOr[scala.Double] = js.undefined
  var nodeDistance: js.UndefOr[scala.Double] = js.undefined
  var radialFirstLevelSeparation: js.UndefOr[scala.Double] = js.undefined
  var radialSeparation: js.UndefOr[scala.Double] = js.undefined
  var startRadialAngle: js.UndefOr[scala.Double] = js.undefined
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  var tipOverTreeStartLevel: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var underneathHorizontalOffset: js.UndefOr[scala.Double] = js.undefined
  var underneathVerticalSeparation: js.UndefOr[scala.Double] = js.undefined
  var underneathVerticalTopOffset: js.UndefOr[scala.Double] = js.undefined
  var verticalSeparation: js.UndefOr[scala.Double] = js.undefined
}

object DiagramLayout {
  @scala.inline
  def apply(
    endRadialAngle: scala.Int | scala.Double = null,
    grid: DiagramLayoutGrid = null,
    horizontalSeparation: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null,
    layerSeparation: scala.Int | scala.Double = null,
    nodeDistance: scala.Int | scala.Double = null,
    radialFirstLevelSeparation: scala.Int | scala.Double = null,
    radialSeparation: scala.Int | scala.Double = null,
    startRadialAngle: scala.Int | scala.Double = null,
    subtype: java.lang.String = null,
    tipOverTreeStartLevel: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    underneathHorizontalOffset: scala.Int | scala.Double = null,
    underneathVerticalSeparation: scala.Int | scala.Double = null,
    underneathVerticalTopOffset: scala.Int | scala.Double = null,
    verticalSeparation: scala.Int | scala.Double = null
  ): DiagramLayout = {
    val __obj = js.Dynamic.literal()
    if (endRadialAngle != null) __obj.updateDynamic("endRadialAngle")(endRadialAngle.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (horizontalSeparation != null) __obj.updateDynamic("horizontalSeparation")(horizontalSeparation.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (layerSeparation != null) __obj.updateDynamic("layerSeparation")(layerSeparation.asInstanceOf[js.Any])
    if (nodeDistance != null) __obj.updateDynamic("nodeDistance")(nodeDistance.asInstanceOf[js.Any])
    if (radialFirstLevelSeparation != null) __obj.updateDynamic("radialFirstLevelSeparation")(radialFirstLevelSeparation.asInstanceOf[js.Any])
    if (radialSeparation != null) __obj.updateDynamic("radialSeparation")(radialSeparation.asInstanceOf[js.Any])
    if (startRadialAngle != null) __obj.updateDynamic("startRadialAngle")(startRadialAngle.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    if (tipOverTreeStartLevel != null) __obj.updateDynamic("tipOverTreeStartLevel")(tipOverTreeStartLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (underneathHorizontalOffset != null) __obj.updateDynamic("underneathHorizontalOffset")(underneathHorizontalOffset.asInstanceOf[js.Any])
    if (underneathVerticalSeparation != null) __obj.updateDynamic("underneathVerticalSeparation")(underneathVerticalSeparation.asInstanceOf[js.Any])
    if (underneathVerticalTopOffset != null) __obj.updateDynamic("underneathVerticalTopOffset")(underneathVerticalTopOffset.asInstanceOf[js.Any])
    if (verticalSeparation != null) __obj.updateDynamic("verticalSeparation")(verticalSeparation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramLayout]
  }
}

