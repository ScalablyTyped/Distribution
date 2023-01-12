package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownClosedEventUIParam extends StObject {
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[Any] = js.undefined
}
object FilterDropDownClosedEventUIParam {
  
  inline def apply(): FilterDropDownClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownClosedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDropDownClosedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setHierarchy(value: Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
