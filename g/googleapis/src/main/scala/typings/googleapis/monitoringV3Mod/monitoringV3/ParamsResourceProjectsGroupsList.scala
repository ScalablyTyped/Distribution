package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGroupsList
  extends StObject
     with StandardParameters {
  
  /**
    * A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns groups that are ancestors of the specified group. The groups are returned in order, starting with the immediate parent and ending with the most distant ancestor. If the specified group has no immediate parent, the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.undefined
  
  /**
    * A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns groups whose parent_name field contains the group name. If no groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.undefined
  
  /**
    * A group name. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] Returns the descendants of the specified group. This is a superset of the results returned by the children_of_group filter, and includes children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) whose groups are to be listed. The format is: projects/[PROJECT_ID_OR_NUMBER]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If this field is not empty then it must contain the next_page_token value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGroupsList {
  
  inline def apply(): ParamsResourceProjectsGroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsList]
  }
  
  extension [Self <: ParamsResourceProjectsGroupsList](x: Self) {
    
    inline def setAncestorsOfGroup(value: String): Self = StObject.set(x, "ancestorsOfGroup", value.asInstanceOf[js.Any])
    
    inline def setAncestorsOfGroupUndefined: Self = StObject.set(x, "ancestorsOfGroup", js.undefined)
    
    inline def setChildrenOfGroup(value: String): Self = StObject.set(x, "childrenOfGroup", value.asInstanceOf[js.Any])
    
    inline def setChildrenOfGroupUndefined: Self = StObject.set(x, "childrenOfGroup", js.undefined)
    
    inline def setDescendantsOfGroup(value: String): Self = StObject.set(x, "descendantsOfGroup", value.asInstanceOf[js.Any])
    
    inline def setDescendantsOfGroupUndefined: Self = StObject.set(x, "descendantsOfGroup", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
