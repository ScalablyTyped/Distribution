package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMembersLoadedEventUIParam extends StObject {
  
  /**
    * A collection with the newly loaded filter members.
    */
  var filterMembers: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets the parent node or the igTree instance in the initial load.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A collection with the root filter members .
    */
  var rootFilterMembers: js.UndefOr[js.Array[Any]] = js.undefined
}
object FilterMembersLoadedEventUIParam {
  
  inline def apply(): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
  
  extension [Self <: FilterMembersLoadedEventUIParam](x: Self) {
    
    inline def setFilterMembers(value: js.Array[Any]): Self = StObject.set(x, "filterMembers", value.asInstanceOf[js.Any])
    
    inline def setFilterMembersUndefined: Self = StObject.set(x, "filterMembers", js.undefined)
    
    inline def setFilterMembersVarargs(value: Any*): Self = StObject.set(x, "filterMembers", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRootFilterMembers(value: js.Array[Any]): Self = StObject.set(x, "rootFilterMembers", value.asInstanceOf[js.Any])
    
    inline def setRootFilterMembersUndefined: Self = StObject.set(x, "rootFilterMembers", js.undefined)
    
    inline def setRootFilterMembersVarargs(value: Any*): Self = StObject.set(x, "rootFilterMembers", js.Array(value*))
  }
}
