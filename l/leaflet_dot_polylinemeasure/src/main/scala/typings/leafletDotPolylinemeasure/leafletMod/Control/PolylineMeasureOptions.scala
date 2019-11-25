package typings.leafletDotPolylinemeasure.leafletMod.Control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineMeasureOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var clearControlClasses: js.UndefOr[js.Array[_]] = js.undefined
  var clearControlLabel: js.UndefOr[String] = js.undefined
  var clearControlTitle: js.UndefOr[String] = js.undefined
  var clearMeasurementsOnStop: js.UndefOr[Boolean] = js.undefined
  var currentCircle: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var endCircle: js.UndefOr[js.Any] = js.undefined
  var fixedLine: js.UndefOr[js.Any] = js.undefined
  var intermedCircle: js.UndefOr[js.Any] = js.undefined
  var measureControlClasses: js.UndefOr[js.Array[_]] = js.undefined
  var measureControlLabel: js.UndefOr[String] = js.undefined
  var measureControlTitleOff: js.UndefOr[String] = js.undefined
  var measureControlTitleOn: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showMeasurementsClearControl: js.UndefOr[Boolean] = js.undefined
  var showUnitControl: js.UndefOr[Boolean] = js.undefined
  var startCircle: js.UndefOr[js.Any] = js.undefined
  var tempLine: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object PolylineMeasureOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    clearControlClasses: js.Array[_] = null,
    clearControlLabel: String = null,
    clearControlTitle: String = null,
    clearMeasurementsOnStop: js.UndefOr[Boolean] = js.undefined,
    currentCircle: js.Any = null,
    cursor: String = null,
    endCircle: js.Any = null,
    fixedLine: js.Any = null,
    intermedCircle: js.Any = null,
    measureControlClasses: js.Array[_] = null,
    measureControlLabel: String = null,
    measureControlTitleOff: String = null,
    measureControlTitleOn: String = null,
    position: String = null,
    showMeasurementsClearControl: js.UndefOr[Boolean] = js.undefined,
    showUnitControl: js.UndefOr[Boolean] = js.undefined,
    startCircle: js.Any = null,
    tempLine: js.Any = null,
    unit: String = null
  ): PolylineMeasureOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (clearControlClasses != null) __obj.updateDynamic("clearControlClasses")(clearControlClasses.asInstanceOf[js.Any])
    if (clearControlLabel != null) __obj.updateDynamic("clearControlLabel")(clearControlLabel.asInstanceOf[js.Any])
    if (clearControlTitle != null) __obj.updateDynamic("clearControlTitle")(clearControlTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(clearMeasurementsOnStop)) __obj.updateDynamic("clearMeasurementsOnStop")(clearMeasurementsOnStop.asInstanceOf[js.Any])
    if (currentCircle != null) __obj.updateDynamic("currentCircle")(currentCircle.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (endCircle != null) __obj.updateDynamic("endCircle")(endCircle.asInstanceOf[js.Any])
    if (fixedLine != null) __obj.updateDynamic("fixedLine")(fixedLine.asInstanceOf[js.Any])
    if (intermedCircle != null) __obj.updateDynamic("intermedCircle")(intermedCircle.asInstanceOf[js.Any])
    if (measureControlClasses != null) __obj.updateDynamic("measureControlClasses")(measureControlClasses.asInstanceOf[js.Any])
    if (measureControlLabel != null) __obj.updateDynamic("measureControlLabel")(measureControlLabel.asInstanceOf[js.Any])
    if (measureControlTitleOff != null) __obj.updateDynamic("measureControlTitleOff")(measureControlTitleOff.asInstanceOf[js.Any])
    if (measureControlTitleOn != null) __obj.updateDynamic("measureControlTitleOn")(measureControlTitleOn.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeasurementsClearControl)) __obj.updateDynamic("showMeasurementsClearControl")(showMeasurementsClearControl.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnitControl)) __obj.updateDynamic("showUnitControl")(showUnitControl.asInstanceOf[js.Any])
    if (startCircle != null) __obj.updateDynamic("startCircle")(startCircle.asInstanceOf[js.Any])
    if (tempLine != null) __obj.updateDynamic("tempLine")(tempLine.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineMeasureOptions]
  }
}

