package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptions extends StObject {
  
  var paramName: js.UndefOr[String] = js.undefined
  
  var useWithBlock: js.UndefOr[Boolean] = js.undefined
}
object TemplateOptions {
  
  inline def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  
  extension [Self <: TemplateOptions](x: Self) {
    
    inline def setParamName(value: String): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
    
    inline def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
    
    inline def setUseWithBlock(value: Boolean): Self = StObject.set(x, "useWithBlock", value.asInstanceOf[js.Any])
    
    inline def setUseWithBlockUndefined: Self = StObject.set(x, "useWithBlock", js.undefined)
  }
}
