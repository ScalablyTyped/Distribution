package typings.intlMessageformatParser.mod

import typings.intlMessageformatParser.intlMessageformatParserStrings.cardinal
import typings.intlMessageformatParser.intlMessageformatParserStrings.ordinal
import typings.intlMessageformatParser.mod.TYPE.plural
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
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pluralType != null) __obj.updateDynamic("pluralType")(pluralType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
}

