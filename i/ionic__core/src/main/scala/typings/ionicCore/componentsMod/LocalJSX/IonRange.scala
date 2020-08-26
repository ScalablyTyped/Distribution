package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.rangeInterfaceMod.RangeChangeEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.std.CustomEvent
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
  var debounce: js.UndefOr[Double] = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Show two knobs.
    */
  var dualKnobs: js.UndefOr[Boolean] = js.native
  /**
    * Maximum integer value of the range.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum integer value of the range.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Emitted when the range loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RangeChangeEventDetail], Unit]] = js.native
  /**
    * Emitted when the range has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the value granularity.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: js.UndefOr[Boolean] = js.native
  /**
    * the value of the range.
    */
  var value: js.UndefOr[RangeValue] = js.native
}

object IonRange {
  @scala.inline
  def apply(): IonRange = {
    val __obj = js.Dynamic.literal()
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDualKnobs(value: Boolean): Self = this.set("dualKnobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDualKnobs: Self = this.set("dualKnobs", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonBlur: Self = this.set("onIonBlur", js.undefined)
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[RangeChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonFocus: Self = this.set("onIonFocus", js.undefined)
    @scala.inline
    def setPin(value: Boolean): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    @scala.inline
    def setSnaps(value: Boolean): Self = this.set("snaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnaps: Self = this.set("snaps", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTicks(value: Boolean): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setValue(value: RangeValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

