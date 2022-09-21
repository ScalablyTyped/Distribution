package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownOpeningEventUIParam extends StObject {
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[Any] = js.undefined
}
object FilterDropDownOpeningEventUIParam {
  
  inline def apply(): FilterDropDownOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOpeningEventUIParam]
  }
  
  extension [Self <: FilterDropDownOpeningEventUIParam](x: Self) {
    
    inline def setHierarchy(value: Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
