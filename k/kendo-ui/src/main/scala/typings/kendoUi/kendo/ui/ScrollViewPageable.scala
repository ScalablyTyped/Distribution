package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewPageable extends StObject {
  
  var ARIATemplate: js.UndefOr[String] = js.undefined
}
object ScrollViewPageable {
  
  inline def apply(): ScrollViewPageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewPageable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollViewPageable] (val x: Self) extends AnyVal {
    
    inline def setARIATemplate(value: String): Self = StObject.set(x, "ARIATemplate", value.asInstanceOf[js.Any])
    
    inline def setARIATemplateUndefined: Self = StObject.set(x, "ARIATemplate", js.undefined)
  }
}
