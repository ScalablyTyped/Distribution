package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.plural
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.cardinal
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.ordinal
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralElement
  extends BaseElement[plural]
     with _MessageFormatElement {
  var offset: Double
  var options: Record[ValidPluralRule, PluralOrSelectOption]
  var pluralType: js.UndefOr[cardinal | ordinal] = js.undefined
}

object PluralElement {
  @scala.inline
  def apply(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String,
    location: Location = null,
    pluralType: cardinal | ordinal = null
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset, options = options, value = value)
    __obj.updateDynamic("type")(`type`)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pluralType != null) __obj.updateDynamic("pluralType")(pluralType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
}

