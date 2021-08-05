package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.srcTypesMod.TYPE.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagElement
  extends StObject
     with _MessageFormatElement {
  
  var children: js.Array[MessageFormatElement]
  
  var location: js.UndefOr[Location] = js.undefined
  
  var `type`: tag
  
  var value: String
}
object TagElement {
  
  inline def apply(children: js.Array[MessageFormatElement], `type`: tag, value: String): TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagElement]
  }
  
  extension [Self <: TagElement](x: Self) {
    
    inline def setChildren(value: js.Array[MessageFormatElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: MessageFormatElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
