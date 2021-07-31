package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerPromptOptions
  extends StObject
     with LayerOptions {
  
  @JSName("area")
  var area_LayerPromptOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var formType: js.UndefOr[Double] = js.undefined
  
  var maxlength: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object LayerPromptOptions {
  
  @scala.inline
  def apply(): LayerPromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerPromptOptions]
  }
  
  @scala.inline
  implicit class LayerPromptOptionsMutableBuilder[Self <: LayerPromptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
    
    @scala.inline
    def setFormType(value: Double): Self = StObject.set(x, "formType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTypeUndefined: Self = StObject.set(x, "formType", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
