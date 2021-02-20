package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalValue extends StObject {
  
  var originalValue: js.Any = js.native
  
  var property: String = js.native
}
object OriginalValue {
  
  @scala.inline
  def apply(originalValue: js.Any, property: String): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
  
  @scala.inline
  implicit class OriginalValueMutableBuilder[Self <: OriginalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
