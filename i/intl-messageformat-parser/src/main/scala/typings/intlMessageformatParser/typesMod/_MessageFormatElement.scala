package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.typesMod.TYPE.plural
import typings.intlMessageformatParser.typesMod.TYPE.pound
import typings.intlMessageformatParser.typesMod.TYPE.select
import typings.intlMessageformatParser.typesMod.TYPE.tag
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageFormatElement extends js.Object

object _MessageFormatElement {
  @scala.inline
  def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): _MessageFormatElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
  @scala.inline
  def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): _MessageFormatElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
  @scala.inline
  def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): _MessageFormatElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
  @scala.inline
  def PoundElement(`type`: pound): _MessageFormatElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageFormatElement]
  }
}

