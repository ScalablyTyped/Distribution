package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSearchField extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
}
object GridSearchField {
  
  inline def apply(): GridSearchField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSearchField]
  }
  
  extension [Self <: GridSearchField](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
