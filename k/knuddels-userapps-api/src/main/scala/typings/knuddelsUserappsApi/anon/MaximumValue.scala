package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumValue extends StObject {
  
  var maximumValue: js.UndefOr[Double] = js.native
  
  var minimumValue: js.UndefOr[Double] = js.native
}
object MaximumValue {
  
  @scala.inline
  def apply(): MaximumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumValue]
  }
  
  @scala.inline
  implicit class MaximumValueMutableBuilder[Self <: MaximumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
  }
}
