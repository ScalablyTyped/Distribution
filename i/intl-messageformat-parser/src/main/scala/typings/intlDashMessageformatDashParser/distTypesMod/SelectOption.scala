package typings.intlDashMessageformatDashParser.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOption extends js.Object {
  var id: String
  var location: js.UndefOr[Location] = js.undefined
  var value: js.Array[MessageFormatElement]
}

object SelectOption {
  @scala.inline
  def apply(id: String, value: js.Array[MessageFormatElement], location: Location = null): SelectOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
}

