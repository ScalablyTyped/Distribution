package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChangeEventUIParam extends StObject {
  
  /**
    * Gets the previously selected value.
    */
  var oldValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets the new selected value.
    */
  var value: js.UndefOr[Double] = js.native
}
object ValueChangeEventUIParam {
  
  @scala.inline
  def apply(): ValueChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangeEventUIParam]
  }
  
  @scala.inline
  implicit class ValueChangeEventUIParamMutableBuilder[Self <: ValueChangeEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
