package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.selectInterfaceMod.SelectChangeEventDetail
import typings.ionicCore.selectInterfaceMod.SelectCompareFn
import typings.ionicCore.selectInterfaceMod.SelectInterface
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSelect extends js.Object {
  /**
    * The text to display on the cancel button.
    */
  var cancelText: js.UndefOr[String] = js.native
  /**
    * A property name or function used to compare object values
    */
  var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.native
  /**
    * If `true`, the user cannot interact with the select.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The interface the select should use: `action-sheet`, `popover` or `alert`.
    */
  var interface: js.UndefOr[SelectInterface] = js.native
  /**
    * Any additional options that the `alert`, `action-sheet` or `popover` interface can take. See the [ion-alert docs](../alert), the [ion-action-sheet docs](../action-sheet) and the [ion-popover docs](../popover) for the create options for each interface.  Note: `interfaceOptions` will not override `inputs` or `buttons` with the `alert` interface.
    */
  var interfaceOptions: js.UndefOr[js.Any] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * If `true`, the select can accept multiple values.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The text to display on the ok button.
    */
  var okText: js.UndefOr[String] = js.native
  /**
    * Emitted when the select loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the selection is cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SelectChangeEventDetail[_]], Unit]] = js.native
  /**
    * Emitted when the select has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * The text to display when the select is empty.
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  /**
    * The text to display instead of the selected option's value.
    */
  var selectedText: js.UndefOr[String | Null] = js.native
  /**
    * the value of the select.
    */
  var value: js.UndefOr[js.Any | Null] = js.native
}

object IonSelect {
  @scala.inline
  def apply(): IonSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSelect]
  }
  @scala.inline
  implicit class IonSelectOps[Self <: IonSelect] (val x: Self) extends AnyVal {
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setCompareWithFunction2(value: (/* currentValue */ js.Any, /* compareValue */ js.Any) => Boolean): Self = this.set("compareWith", js.Any.fromFunction2(value))
    @scala.inline
    def setCompareWith(value: String | SelectCompareFn): Self = this.set("compareWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareWith: Self = this.set("compareWith", js.undefined)
    @scala.inline
    def setCompareWithNull: Self = this.set("compareWith", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInterface(value: SelectInterface): Self = this.set("interface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    @scala.inline
    def setInterfaceOptions(value: js.Any): Self = this.set("interfaceOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceOptions: Self = this.set("interfaceOptions", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonBlur: Self = this.set("onIonBlur", js.undefined)
    @scala.inline
    def setOnIonCancel(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonCancel: Self = this.set("onIonCancel", js.undefined)
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[SelectChangeEventDetail[_]] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonFocus: Self = this.set("onIonFocus", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    @scala.inline
    def setSelectedText(value: String): Self = this.set("selectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedText: Self = this.set("selectedText", js.undefined)
    @scala.inline
    def setSelectedTextNull: Self = this.set("selectedText", null)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

