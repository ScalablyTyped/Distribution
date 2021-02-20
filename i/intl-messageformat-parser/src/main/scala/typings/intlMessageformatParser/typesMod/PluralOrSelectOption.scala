package typings.intlMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralOrSelectOption extends StObject {
  
  var location: js.UndefOr[Location] = js.native
  
  var value: js.Array[MessageFormatElement] = js.native
}
object PluralOrSelectOption {
  
  @scala.inline
  def apply(value: js.Array[MessageFormatElement]): PluralOrSelectOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralOrSelectOption]
  }
  
  @scala.inline
  implicit class PluralOrSelectOptionMutableBuilder[Self <: PluralOrSelectOption] (val x: Self) extends AnyVal {
    
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
