package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralFormat
  extends PluralStyle
     with ElementFormat {
  var ordinal: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`false`
}

object PluralFormat {
  @scala.inline
  def apply(
    location: Location,
    offset: scala.Double,
    options: js.Array[OptionalFormatPattern],
    ordinal: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`false`,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.pluralFormat
  ): PluralFormat = {
    val __obj = js.Dynamic.literal(location = location, offset = offset, options = options, ordinal = ordinal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PluralFormat]
  }
}

