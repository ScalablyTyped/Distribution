package typings.atIonicCore.distTypesComponentsMod.LocalJSX

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
  var onIonChange: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RadioGroupChangeEventDetail */ _
      ], 
      Unit
    ]
  ] = js.undefined
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
    onIonChange: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RadioGroupChangeEventDetail */ _
    ] => Unit = null,
    value: js.Any = null
  ): IonRadioGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptySelection)) __obj.updateDynamic("allowEmptySelection")(allowEmptySelection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRadioGroup]
  }
}

