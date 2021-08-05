package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownClosingEventUIParam extends StObject {
  
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}
object FilterDropDownClosingEventUIParam {
  
  inline def apply(): FilterDropDownClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownClosingEventUIParam]
  }
  
  extension [Self <: FilterDropDownClosingEventUIParam](x: Self) {
    
    inline def setDropDownElement(value: String): Self = StObject.set(x, "dropDownElement", value.asInstanceOf[js.Any])
    
    inline def setDropDownElementUndefined: Self = StObject.set(x, "dropDownElement", js.undefined)
    
    inline def setHierarchy(value: js.Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
