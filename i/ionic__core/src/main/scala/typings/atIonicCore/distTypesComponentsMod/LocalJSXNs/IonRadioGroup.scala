package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.distTypesComponentsRadioDashGroupRadioDashGroupDashInterfaceMod.RadioGroupChangeEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRadioGroup extends js.Object {
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RadioGroupChangeEventDetail], Unit]] = js.undefined
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonRadioGroup {
  @scala.inline
  def apply(
    allowEmptySelection: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onIonChange: /* event */ CustomEvent[RadioGroupChangeEventDetail] => Unit = null,
    value: js.Any = null
  ): IonRadioGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptySelection)) __obj.updateDynamic("allowEmptySelection")(allowEmptySelection)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonRadioGroup]
  }
}

