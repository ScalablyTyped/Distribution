package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMembersLoadedEventUIParam extends StObject {
  
  /**
    * A collection with the newly loaded filter members.
    */
  var filterMembers: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets the parent node or the igTree instance in the initial load.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A collection with the root filter members .
    */
  var rootFilterMembers: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object FilterMembersLoadedEventUIParam {
  
  @scala.inline
  def apply(): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
  
  @scala.inline
  implicit class FilterMembersLoadedEventUIParamMutableBuilder[Self <: FilterMembersLoadedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterMembers(value: js.Array[js.Any]): Self = StObject.set(x, "filterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMembersUndefined: Self = StObject.set(x, "filterMembers", js.undefined)
    
    @scala.inline
    def setFilterMembersVarargs(value: js.Any*): Self = StObject.set(x, "filterMembers", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRootFilterMembers(value: js.Array[js.Any]): Self = StObject.set(x, "rootFilterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFilterMembersUndefined: Self = StObject.set(x, "rootFilterMembers", js.undefined)
    
    @scala.inline
    def setRootFilterMembersVarargs(value: js.Any*): Self = StObject.set(x, "rootFilterMembers", js.Array(value :_*))
  }
}
