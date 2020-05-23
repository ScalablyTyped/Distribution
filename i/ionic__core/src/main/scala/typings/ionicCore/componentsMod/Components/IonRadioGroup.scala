package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRadioGroup extends js.Object {
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: Boolean
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonRadioGroup {
  @scala.inline
  def apply(allowEmptySelection: Boolean, name: String, value: js.UndefOr[Null | js.Any] = js.undefined): IonRadioGroup = {
    val __obj = js.Dynamic.literal(allowEmptySelection = allowEmptySelection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRadioGroup]
  }
}

