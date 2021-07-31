package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.typesMod.TYPE.select
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectElement
  extends StObject
     with BaseElement[select]
     with _MessageFormatElement {
  
  var options: Record[String, PluralOrSelectOption]
}
object SelectElement {
  
  @scala.inline
  def apply(options: Record[String, PluralOrSelectOption], `type`: select, value: String): SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectElement]
  }
  
  @scala.inline
  implicit class SelectElementMutableBuilder[Self <: SelectElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Record[String, PluralOrSelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
