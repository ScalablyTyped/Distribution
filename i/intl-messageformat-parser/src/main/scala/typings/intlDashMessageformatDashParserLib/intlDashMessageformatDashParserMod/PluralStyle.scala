package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralStyle extends js.Object {
  var location: Location
  var offset: scala.Double
  var options: js.Array[OptionalFormatPattern]
  var `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.pluralFormat
}

object PluralStyle {
  @scala.inline
  def apply(
    location: Location,
    offset: scala.Double,
    options: js.Array[OptionalFormatPattern],
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.pluralFormat
  ): PluralStyle = {
    val __obj = js.Dynamic.literal(location = location, offset = offset, options = options)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PluralStyle]
  }
}

