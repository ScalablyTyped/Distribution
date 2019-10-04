package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsSelectSelectDashInterfaceMod.SelectChangeEventDetail
import typings.atIonicCore.distTypesComponentsSelectSelectDashInterfaceMod.SelectCompareFn
import typings.atIonicCore.distTypesComponentsSelectSelectDashInterfaceMod.SelectInterface
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelect extends js.Object {
  /**
    * The text to display on the cancel button.
    */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
    * A property name or function used to compare object values
    */
  var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.undefined
  /**
    * If `true`, the user cannot interact with the select.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The interface the select should use: `action-sheet`, `popover` or `alert`.
    */
  var interface: js.UndefOr[SelectInterface] = js.undefined
  /**
    * Any additional options that the `alert`, `action-sheet` or `popover` interface can take. See the [AlertController API docs](../../alert/AlertController/#create), the [ActionSheetController API docs](../../action-sheet/ActionSheetController/#create) and the [PopoverController API docs](../../popover/PopoverController/#create) for the create options for each interface.
    */
  var interfaceOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * If `true`, the select can accept multiple values.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The text to display on the ok button.
    */
  var okText: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the select loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the selection is cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SelectChangeEventDetail], Unit]] = js.undefined
  /**
    * Emitted when the select has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * The text to display when the select is empty.
    */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  /**
    * The text to display instead of the selected option's value.
    */
  var selectedText: js.UndefOr[String | Null] = js.undefined
  /**
    * the value of the select.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonSelect {
  @scala.inline
  def apply(
    cancelText: String = null,
    compareWith: String | SelectCompareFn = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    interface: SelectInterface = null,
    interfaceOptions: js.Any = null,
    mode: ios | md = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    okText: String = null,
    onIonBlur: /* event */ CustomEvent[Unit] => Unit = null,
    onIonCancel: /* event */ CustomEvent[Unit] => Unit = null,
    onIonChange: /* event */ CustomEvent[SelectChangeEventDetail] => Unit = null,
    onIonFocus: /* event */ CustomEvent[Unit] => Unit = null,
    placeholder: String = null,
    selectedText: String = null,
    value: js.Any = null
  ): IonSelect = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (compareWith != null) __obj.updateDynamic("compareWith")(compareWith.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (interface != null) __obj.updateDynamic("interface")(interface)
    if (interfaceOptions != null) __obj.updateDynamic("interfaceOptions")(interfaceOptions)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonCancel != null) __obj.updateDynamic("onIonCancel")(js.Any.fromFunction1(onIonCancel))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSelect]
  }
}

