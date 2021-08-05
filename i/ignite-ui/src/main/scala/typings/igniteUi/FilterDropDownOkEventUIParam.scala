package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDropDownOkEventUIParam extends StObject {
  
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.undefined
  
  /**
    * A collection with the selected filter members. If all filter members are selected the collection will be empty.
    */
  var filterMembers: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}
object FilterDropDownOkEventUIParam {
  
  inline def apply(): FilterDropDownOkEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOkEventUIParam]
  }
  
  extension [Self <: FilterDropDownOkEventUIParam](x: Self) {
    
    inline def setDropDownElement(value: String): Self = StObject.set(x, "dropDownElement", value.asInstanceOf[js.Any])
    
    inline def setDropDownElementUndefined: Self = StObject.set(x, "dropDownElement", js.undefined)
    
    inline def setFilterMembers(value: js.Array[js.Any]): Self = StObject.set(x, "filterMembers", value.asInstanceOf[js.Any])
    
    inline def setFilterMembersUndefined: Self = StObject.set(x, "filterMembers", js.undefined)
    
    inline def setFilterMembersVarargs(value: js.Any*): Self = StObject.set(x, "filterMembers", js.Array(value :_*))
    
    inline def setHierarchy(value: js.Any): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
  }
}
