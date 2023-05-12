package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMessages extends StObject {
  
  var and: js.UndefOr[String] = js.undefined
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  
  var filterExpressionLabel: js.UndefOr[String] = js.undefined
  
  var filterLogicLabel: js.UndefOr[String] = js.undefined
  
  var mainFilterLogicLabel: js.UndefOr[String] = js.undefined
  
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
    
    inline def setFilterExpressionLabel(value: String): Self = StObject.set(x, "filterExpressionLabel", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionLabelUndefined: Self = StObject.set(x, "filterExpressionLabel", js.undefined)
    
    inline def setFilterLogicLabel(value: String): Self = StObject.set(x, "filterLogicLabel", value.asInstanceOf[js.Any])
    
    inline def setFilterLogicLabelUndefined: Self = StObject.set(x, "filterLogicLabel", js.undefined)
    
    inline def setMainFilterLogicLabel(value: String): Self = StObject.set(x, "mainFilterLogicLabel", value.asInstanceOf[js.Any])
    
    inline def setMainFilterLogicLabelUndefined: Self = StObject.set(x, "mainFilterLogicLabel", js.undefined)
    
    inline def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
  }
}
