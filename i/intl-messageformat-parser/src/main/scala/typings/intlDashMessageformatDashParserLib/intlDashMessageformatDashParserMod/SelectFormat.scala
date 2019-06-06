package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFormat extends ElementFormat {
  var location: Location
  var options: js.Array[OptionalFormatPattern]
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.selectFormat
}

object SelectFormat {
  @scala.inline
  def apply(
    location: Location,
    options: js.Array[OptionalFormatPattern],
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.selectFormat
  ): SelectFormat = {
    val __obj = js.Dynamic.literal(location = location, options = options)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectFormat]
  }
}

