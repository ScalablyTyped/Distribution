package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRadioGroup extends js.Object {
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: scala.Boolean
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | scala.Null] = js.undefined
}

object IonRadioGroup {
  @scala.inline
  def apply(allowEmptySelection: scala.Boolean, name: java.lang.String, value: js.Any = null): IonRadioGroup = {
    val __obj = js.Dynamic.literal(allowEmptySelection = allowEmptySelection, name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonRadioGroup]
  }
}

