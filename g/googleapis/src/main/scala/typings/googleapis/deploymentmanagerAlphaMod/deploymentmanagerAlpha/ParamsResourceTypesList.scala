package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTypesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A filter expression that filters resources listed in the response. The
    * expression must specify the field name, a comparison operator, and the
    * value that you want to use for filtering. The value must be a string, a
    * number, or a boolean. The comparison operator must be either =, !=, >, or
    * <.  For example, if you are filtering Compute Engine instances, you can
    * exclude instances named example-instance by specifying name !=
    * example-instance.  You can also filter nested fields. For example, you
    * could specify scheduling.automaticRestart = false to include instances
    * only if they are not scheduled for automatic restarts. You can use
    * filtering on nested fields to filter based on resource labels.  To filter
    * on multiple expressions, provide each separate expression within
    * parentheses. For example, (scheduling.automaticRestart = true)
    * (cpuPlatform = "Intel Skylake"). By default, each expression is an AND
    * expression. However, you can include AND and OR expressions explicitly.
    * For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel
    * Broadwell") AND (scheduling.automaticRestart = true).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results per page that should be returned. If the
    * number of available results is larger than maxResults, Compute Engine
    * returns a nextPageToken that can be used to get the next page of results
    * in subsequent list requests. Acceptable values are 0 to 500, inclusive.
    * (Default: 500)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Sorts list results by a certain order. By default, results are returned
    * in alphanumerical order based on the resource name.  You can also sort
    * results in descending order based on the creation timestamp using
    * orderBy="creationTimestamp desc". This sorts results based on the
    * creationTimestamp field in reverse chronological order (newest result
    * first). Use this to sort resources like operations so that the newest
    * operation is returned first.  Currently, only sorting by name or
    * creationTimestamp desc is supported.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a page token to use. Set pageToken to the nextPageToken
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceTypesList {
  
  inline def apply(): ParamsResourceTypesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTypesList]
  }
  
  extension [Self <: ParamsResourceTypesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
