package typings.leafletPolylinemeasure.mod.Control_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineMeasureOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var clearControlClasses: js.UndefOr[js.Array[_]] = js.native
  var clearControlLabel: js.UndefOr[String] = js.native
  var clearControlTitle: js.UndefOr[String] = js.native
  var clearMeasurementsOnStop: js.UndefOr[Boolean] = js.native
  var currentCircle: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[String] = js.native
  var endCircle: js.UndefOr[js.Any] = js.native
  var fixedLine: js.UndefOr[js.Any] = js.native
  var intermedCircle: js.UndefOr[js.Any] = js.native
  var measureControlClasses: js.UndefOr[js.Array[_]] = js.native
  var measureControlLabel: js.UndefOr[String] = js.native
  var measureControlTitleOff: js.UndefOr[String] = js.native
  var measureControlTitleOn: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var showMeasurementsClearControl: js.UndefOr[Boolean] = js.native
  var showUnitControl: js.UndefOr[Boolean] = js.native
  var startCircle: js.UndefOr[js.Any] = js.native
  var tempLine: js.UndefOr[js.Any] = js.native
  var unit: js.UndefOr[String] = js.native
}

object PolylineMeasureOptions {
  @scala.inline
  def apply(): PolylineMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineMeasureOptions]
  }
  @scala.inline
  implicit class PolylineMeasureOptionsOps[Self <: PolylineMeasureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClearControlClassesVarargs(value: js.Any*): Self = this.set("clearControlClasses", js.Array(value :_*))
    @scala.inline
    def setClearControlClasses(value: js.Array[_]): Self = this.set("clearControlClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearControlClasses: Self = this.set("clearControlClasses", js.undefined)
    @scala.inline
    def setClearControlLabel(value: String): Self = this.set("clearControlLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearControlLabel: Self = this.set("clearControlLabel", js.undefined)
    @scala.inline
    def setClearControlTitle(value: String): Self = this.set("clearControlTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearControlTitle: Self = this.set("clearControlTitle", js.undefined)
    @scala.inline
    def setClearMeasurementsOnStop(value: Boolean): Self = this.set("clearMeasurementsOnStop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearMeasurementsOnStop: Self = this.set("clearMeasurementsOnStop", js.undefined)
    @scala.inline
    def setCurrentCircle(value: js.Any): Self = this.set("currentCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCircle: Self = this.set("currentCircle", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setEndCircle(value: js.Any): Self = this.set("endCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCircle: Self = this.set("endCircle", js.undefined)
    @scala.inline
    def setFixedLine(value: js.Any): Self = this.set("fixedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedLine: Self = this.set("fixedLine", js.undefined)
    @scala.inline
    def setIntermedCircle(value: js.Any): Self = this.set("intermedCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntermedCircle: Self = this.set("intermedCircle", js.undefined)
    @scala.inline
    def setMeasureControlClassesVarargs(value: js.Any*): Self = this.set("measureControlClasses", js.Array(value :_*))
    @scala.inline
    def setMeasureControlClasses(value: js.Array[_]): Self = this.set("measureControlClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureControlClasses: Self = this.set("measureControlClasses", js.undefined)
    @scala.inline
    def setMeasureControlLabel(value: String): Self = this.set("measureControlLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureControlLabel: Self = this.set("measureControlLabel", js.undefined)
    @scala.inline
    def setMeasureControlTitleOff(value: String): Self = this.set("measureControlTitleOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureControlTitleOff: Self = this.set("measureControlTitleOff", js.undefined)
    @scala.inline
    def setMeasureControlTitleOn(value: String): Self = this.set("measureControlTitleOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureControlTitleOn: Self = this.set("measureControlTitleOn", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowMeasurementsClearControl(value: Boolean): Self = this.set("showMeasurementsClearControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeasurementsClearControl: Self = this.set("showMeasurementsClearControl", js.undefined)
    @scala.inline
    def setShowUnitControl(value: Boolean): Self = this.set("showUnitControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowUnitControl: Self = this.set("showUnitControl", js.undefined)
    @scala.inline
    def setStartCircle(value: js.Any): Self = this.set("startCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCircle: Self = this.set("startCircle", js.undefined)
    @scala.inline
    def setTempLine(value: js.Any): Self = this.set("tempLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempLine: Self = this.set("tempLine", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

