package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesCollectiongroupsIndexesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The filter to apply to list results.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, returned from a previous call to
    * FirestoreAdmin.ListIndexes, that may be used to get the next page of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A parent name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesCollectiongroupsIndexesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesCollectiongroupsIndexesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsIndexesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesCollectiongroupsIndexesListMutableBuilder[Self <: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
