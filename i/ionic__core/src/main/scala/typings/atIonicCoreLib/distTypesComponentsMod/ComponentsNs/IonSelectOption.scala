package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectOption extends js.Object {
  /**
    * If `true`, the user cannot interact with the select option.
    */
  var disabled: scala.Boolean
  /**
    * If `true`, the element is selected.
    */
  var selected: scala.Boolean
  /**
    * The text value of the option.
    */
  var value: js.UndefOr[js.Any | scala.Null] = js.undefined
}

object IonSelectOption {
  @scala.inline
  def apply(disabled: scala.Boolean, selected: scala.Boolean, value: js.Any = null): IonSelectOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, selected = selected)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSelectOption]
  }
}

