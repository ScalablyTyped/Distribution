package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOrdinalFormat
  extends PluralStyle
     with ElementFormat {
  var ordinal: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`true`
}

object SelectOrdinalFormat {
  @scala.inline
  def apply(
    location: Location,
    offset: scala.Double,
    options: js.Array[OptionalFormatPattern],
    ordinal: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`true`,
    `type`: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.pluralFormat
  ): SelectOrdinalFormat = {
    val __obj = js.Dynamic.literal(location = location, offset = offset, options = options, ordinal = ordinal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectOrdinalFormat]
  }
}

