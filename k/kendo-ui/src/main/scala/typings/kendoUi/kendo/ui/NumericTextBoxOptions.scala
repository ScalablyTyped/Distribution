package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericTextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ NumericTextBoxChangeEvent, Unit]] = js.native
  var culture: js.UndefOr[String] = js.native
  var decimals: js.UndefOr[Double] = js.native
  var downArrowText: js.UndefOr[String] = js.native
  var factor: js.UndefOr[Double] = js.native
  var format: js.UndefOr[String] = js.native
  var label: js.UndefOr[String | js.Function | NumericTextBoxLabel] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var restrictDecimals: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var spin: js.UndefOr[js.Function1[/* e */ NumericTextBoxSpinEvent, Unit]] = js.native
  var spinners: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
  var upArrowText: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object NumericTextBoxOptions {
  @scala.inline
  def apply(): NumericTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTextBoxOptions]
  }
  @scala.inline
  implicit class NumericTextBoxOptionsOps[Self <: NumericTextBoxOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ NumericTextBoxChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setDownArrowText(value: String): Self = this.set("downArrowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownArrowText: Self = this.set("downArrowText", js.undefined)
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLabel(value: String | js.Function | NumericTextBoxLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRestrictDecimals(value: Boolean): Self = this.set("restrictDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictDecimals: Self = this.set("restrictDecimals", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSpin(value: /* e */ NumericTextBoxSpinEvent => Unit): Self = this.set("spin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setSpinners(value: Boolean): Self = this.set("spinners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinners: Self = this.set("spinners", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setUpArrowText(value: String): Self = this.set("upArrowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpArrowText: Self = this.set("upArrowText", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

