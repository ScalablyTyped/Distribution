package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.srcTypesMod.TYPE.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagElement extends _MessageFormatElement {
  
  var children: js.Array[MessageFormatElement] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var `type`: tag = js.native
  
  var value: String = js.native
}
object TagElement {
  
  @scala.inline
  def apply(children: js.Array[MessageFormatElement], `type`: tag, value: String): TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagElement]
  }
  
  @scala.inline
  implicit class TagElementMutableBuilder[Self <: TagElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[MessageFormatElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: MessageFormatElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
