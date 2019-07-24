package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralElement
  extends BaseElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.plural]
     with _MessageFormatElement {
  var offset: scala.Double
  var options: stdLib.Record[ValidPluralRule, PluralOrSelectOption]
  var pluralType: js.UndefOr[
    intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.cardinal | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.ordinal
  ] = js.undefined
}

object PluralElement {
  @scala.inline
  def apply(
    offset: scala.Double,
    options: stdLib.Record[ValidPluralRule, PluralOrSelectOption],
    `type`: intlDashMessageformatDashParserLib.libTypesMod.TYPE.plural,
    value: java.lang.String,
    location: Location = null,
    pluralType: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.cardinal | intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.ordinal = null
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset, options = options, value = value)
    __obj.updateDynamic("type")(`type`)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pluralType != null) __obj.updateDynamic("pluralType")(pluralType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
}

