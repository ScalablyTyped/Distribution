package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownOpenedEventUIParam extends StObject {
  
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[Any] = js.undefined
}
object FilterDropDownOpenedEventUIParam {
  
  inline def apply(): FilterDropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOpenedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDropDownOpenedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDropDownElement(value: String): Self = StObject.set(x, "dropDownElement", value.asInstanceOf[js.Any])
    
    inline def setDropDownElementUndefined: Self = StObject.set(x, "dropDownElement", js.undefined)
    
    inline def setHierarchy(value: Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
