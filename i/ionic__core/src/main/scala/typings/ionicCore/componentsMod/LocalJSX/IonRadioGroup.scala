package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.radioGroupInterfaceMod.RadioGroupChangeEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRadioGroup extends js.Object {
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: js.UndefOr[Boolean] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RadioGroupChangeEventDetail], Unit]] = js.native
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | Null] = js.native
}

object IonRadioGroup {
  @scala.inline
  def apply(): IonRadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRadioGroup]
  }
  @scala.inline
  implicit class IonRadioGroupOps[Self <: IonRadioGroup] (val x: Self) extends AnyVal {
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
    def setAllowEmptySelection(value: Boolean): Self = this.set("allowEmptySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptySelection: Self = this.set("allowEmptySelection", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[RadioGroupChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

