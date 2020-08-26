package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.rangeInterfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRange extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: Boolean = js.native
  /**
    * Show two knobs.
    */
  var dualKnobs: Boolean = js.native
  /**
    * Maximum integer value of the range.
    */
  var max: Double = js.native
  /**
    * Minimum integer value of the range.
    */
  var min: Double = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String = js.native
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: Boolean = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: Boolean = js.native
  /**
    * Specifies the value granularity.
    */
  var step: Double = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: Boolean = js.native
  /**
    * the value of the range.
    */
  var value: RangeValue = js.native
}

object IonRange {
  @scala.inline
  def apply(
    debounce: Double,
    disabled: Boolean,
    dualKnobs: Boolean,
    max: Double,
    min: Double,
    name: String,
    pin: Boolean,
    snaps: Boolean,
    step: Double,
    ticks: Boolean,
    value: RangeValue
  ): IonRange = {
    val __obj = js.Dynamic.literal(debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dualKnobs = dualKnobs.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], snaps = snaps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRange]
  }
  @scala.inline
  implicit class IonRangeOps[Self <: IonRange] (val x: Self) extends AnyVal {
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
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDualKnobs(value: Boolean): Self = this.set("dualKnobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPin(value: Boolean): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnaps(value: Boolean): Self = this.set("snaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicks(value: Boolean): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: RangeValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

