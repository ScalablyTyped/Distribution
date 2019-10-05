package typings.atIonicCore.distTypesComponentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectOption extends js.Object {
  /**
    * If `true`, the user cannot interact with the select option.
    */
  var disabled: Boolean
  /**
    * If `true`, the element is selected.
    */
  var selected: Boolean
  /**
    * The text value of the option.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonSelectOption {
  @scala.inline
  def apply(disabled: Boolean, selected: Boolean, value: js.Any = null): IonSelectOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, selected = selected)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSelectOption]
  }
}

