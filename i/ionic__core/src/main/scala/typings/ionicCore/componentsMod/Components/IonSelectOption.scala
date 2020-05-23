package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectOption extends js.Object {
  /**
    * If `true`, the user cannot interact with the select option.
    */
  var disabled: Boolean
  /**
    * The text value of the option.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonSelectOption {
  @scala.inline
  def apply(disabled: Boolean, value: js.UndefOr[Null | js.Any] = js.undefined): IonSelectOption = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectOption]
  }
}

