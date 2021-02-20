package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AscendingMinimumValue extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var minimumValue: js.UndefOr[Double] = js.native
}
object AscendingMinimumValue {
  
  @scala.inline
  def apply(): AscendingMinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingMinimumValue]
  }
  
  @scala.inline
  implicit class AscendingMinimumValueMutableBuilder[Self <: AscendingMinimumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
  }
}
