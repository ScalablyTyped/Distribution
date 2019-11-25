package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonCheckbox extends js.Object {
  /**
    * If `true`, the checkbox is selected.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the toggle loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the checked property has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CheckboxChangeEventDetail */ _
      ], 
      Unit
    ]
  ] = js.undefined
  /**
    * Emitted when the toggle has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IonCheckbox {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    mode: ios | md = null,
    name: String = null,
    onIonBlur: /* event */ CustomEvent[Unit] => Unit = null,
    onIonChange: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CheckboxChangeEventDetail */ _
    ] => Unit = null,
    onIonFocus: /* event */ CustomEvent[Unit] => Unit = null,
    value: String = null
  ): IonCheckbox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonCheckbox]
  }
}

