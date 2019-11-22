package typings.intlDashMessageformatDashParser.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralOrSelectOption extends js.Object {
  var location: js.UndefOr[Location] = js.undefined
  var value: js.Array[MessageFormatElement]
}

object PluralOrSelectOption {
  @scala.inline
  def apply(value: js.Array[MessageFormatElement], location: Location = null): PluralOrSelectOption = {
    val __obj = js.Dynamic.literal(value = value)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[PluralOrSelectOption]
  }
}

