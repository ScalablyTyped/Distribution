package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateOptions extends StObject {
  
  var paramName: js.UndefOr[String] = js.native
  
  var useWithBlock: js.UndefOr[Boolean] = js.native
}
object TemplateOptions {
  
  @scala.inline
  def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  
  @scala.inline
  implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamName(value: String): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
    
    @scala.inline
    def setUseWithBlock(value: Boolean): Self = StObject.set(x, "useWithBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWithBlockUndefined: Self = StObject.set(x, "useWithBlock", js.undefined)
  }
}
