package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.plural
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.select
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.cardinal
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.ordinal
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageFormatElement extends js.Object

object _MessageFormatElement {
  @scala.inline
  def SelectElement(
    options: Record[String, PluralOrSelectOption],
    `type`: select,
    value: String,
    location: Location = null
  ): _MessageFormatElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
  @scala.inline
  def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String,
    location: Location = null,
    pluralType: cardinal | ordinal = null
  ): _MessageFormatElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pluralType != null) __obj.updateDynamic("pluralType")(pluralType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
}

