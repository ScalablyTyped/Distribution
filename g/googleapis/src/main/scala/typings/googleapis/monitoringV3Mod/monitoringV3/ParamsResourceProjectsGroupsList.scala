package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsGroupsList extends StandardParameters {
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups that are ancestors of the specified group. The groups are
    * returned in order, starting with the immediate parent and ending with the
    * most distant ancestor. If the specified group has no immediate parent,
    * the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups whose parentName field contains the group name. If no
    * groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.native
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns the descendants of the specified group. This is a superset of the
    * results returned by the childrenOfGroup filter, and includes
    * children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.native
  
  /**
    * The project whose groups are to be listed. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsGroupsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsGroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsGroupsListMutableBuilder[Self <: ParamsResourceProjectsGroupsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorsOfGroup(value: String): Self = StObject.set(x, "ancestorsOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorsOfGroupUndefined: Self = StObject.set(x, "ancestorsOfGroup", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setChildrenOfGroup(value: String): Self = StObject.set(x, "childrenOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenOfGroupUndefined: Self = StObject.set(x, "childrenOfGroup", js.undefined)
    
    @scala.inline
    def setDescendantsOfGroup(value: String): Self = StObject.set(x, "descendantsOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendantsOfGroupUndefined: Self = StObject.set(x, "descendantsOfGroup", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
