package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderUIParams extends StObject {
  
  var handle: js.UndefOr[JQuery] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object SliderUIParams {
  
  @scala.inline
  def apply(): SliderUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderUIParams]
  }
  
  @scala.inline
  implicit class SliderUIParamsMutableBuilder[Self <: SliderUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: JQuery): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
