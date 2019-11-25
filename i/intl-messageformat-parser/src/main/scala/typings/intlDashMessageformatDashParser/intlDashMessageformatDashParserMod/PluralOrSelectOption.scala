package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralOrSelectOption]
  }
}

