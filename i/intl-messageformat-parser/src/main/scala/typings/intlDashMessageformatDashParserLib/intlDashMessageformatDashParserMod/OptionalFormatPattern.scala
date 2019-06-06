package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalFormatPattern extends js.Object {
  var location: Location
  var selector: Selector
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.optionalFormatPattern
  var value: MessageFormatPattern
}

object OptionalFormatPattern {
  @scala.inline
  def apply(
    location: Location,
    selector: Selector,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.optionalFormatPattern,
    value: MessageFormatPattern
  ): OptionalFormatPattern = {
    val __obj = js.Dynamic.literal(location = location, selector = selector, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalFormatPattern]
  }
}

