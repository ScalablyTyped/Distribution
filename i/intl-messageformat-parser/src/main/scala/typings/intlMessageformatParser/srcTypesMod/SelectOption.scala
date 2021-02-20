package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectOption extends StObject {
  
  var id: String = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var value: js.Array[MessageFormatElement] = js.native
}
object SelectOption {
  
  @scala.inline
  def apply(id: String, value: js.Array[MessageFormatElement]): SelectOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
  
  @scala.inline
  implicit class SelectOptionMutableBuilder[Self <: SelectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[MessageFormatElement]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: MessageFormatElement*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
