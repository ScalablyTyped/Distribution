package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed info for a selectable option.
  */
trait SelectionOption extends js.Object {
  /**
    * A descriptive text that will be displayed below option label.
    *
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the option.
    *
    * This field is required.
    */
  var id: String
  /**
    * The label to be displayed as the option.
    *
    * This field is required.
    */
  var label: String
}

object SelectionOption {
  @scala.inline
  def apply(id: String, label: String, description: String = null): SelectionOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOption]
  }
}

