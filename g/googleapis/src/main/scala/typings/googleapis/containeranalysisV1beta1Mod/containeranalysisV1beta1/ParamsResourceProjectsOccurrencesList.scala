package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOccurrencesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Number of occurrences to return in the list. Must be positive. Max
    * allowed page size is 1000. If not specified, page size defaults to 20.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project to list occurrences for in the form of
    * `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOccurrencesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsOccurrencesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOccurrencesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsOccurrencesListMutableBuilder[Self <: ParamsResourceProjectsOccurrencesList] (val x: Self) extends AnyVal {
    
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
