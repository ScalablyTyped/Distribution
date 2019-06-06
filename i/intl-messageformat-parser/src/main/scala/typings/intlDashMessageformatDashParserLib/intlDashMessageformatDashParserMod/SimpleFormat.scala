package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleFormat extends ElementFormat {
  var location: Location
  var style: java.lang.String
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.numberFormat | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.dateFormat | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.timeFormat
}

object SimpleFormat {
  @scala.inline
  def apply(
    location: Location,
    style: java.lang.String,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.numberFormat | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.dateFormat | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.timeFormat
  ): SimpleFormat = {
    val __obj = js.Dynamic.literal(location = location, style = style)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFormat]
  }
}

