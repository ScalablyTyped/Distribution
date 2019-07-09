package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOption extends js.Object {
  var id: java.lang.String
  var location: js.UndefOr[Location] = js.undefined
  var value: js.Array[MessageFormatElement]
}

object SelectOption {
  @scala.inline
  def apply(id: java.lang.String, value: js.Array[MessageFormatElement], location: Location = null): SelectOption = {
    val __obj = js.Dynamic.literal(id = id, value = value)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SelectOption]
  }
}

