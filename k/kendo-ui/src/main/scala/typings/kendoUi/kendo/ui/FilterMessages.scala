package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMessages extends StObject {
  
  var and: js.UndefOr[String] = js.undefined
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  
  var or: js.UndefOr[String] = js.undefined
}
object FilterMessages {
  
  inline def apply(): FilterMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterMessages] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: String): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
  }
}
