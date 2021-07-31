package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.typesMod.TYPE.plural
import typings.intlMessageformatParser.typesMod.TYPE.pound
import typings.intlMessageformatParser.typesMod.TYPE.select
import typings.intlMessageformatParser.typesMod.TYPE.tag
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MessageFormatElement extends StObject
object _MessageFormatElement {
  
  @scala.inline
  def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): typings.intlMessageformatParser.typesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.PluralElement]
  }
  
  @scala.inline
  def PoundElement(`type`: pound): typings.intlMessageformatParser.typesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.PoundElement]
  }
  
  @scala.inline
  def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typings.intlMessageformatParser.typesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.SelectElement]
  }
  
  @scala.inline
  def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typings.intlMessageformatParser.typesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlMessageformatParser.typesMod.TagElement]
  }
}
