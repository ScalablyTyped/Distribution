package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional. Specifies the subset of jobs to retrieve. You can filter on the
    * value of one or more attributes of the job object. For example, retrieve
    * jobs with a job identifier that starts with 'census': <p><code>gcloud
    * ml-engine jobs list --filter='jobId:census*'</code> <p>List all failed
    * jobs with names that start with 'rnn': <p><code>gcloud ml-engine jobs
    * list --filter='jobId:rnn* AND state:FAILED'</code> <p>For more examples,
    * see the guide to <a
    * href="/ml-engine/docs/tensorflow/monitor-training">monitoring jobs</a>.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The number of jobs to retrieve per "page" of results. If there
    * are more remaining results than this number, the response message will
    * contain a valid value in the `next_page_token` field.  The default value
    * is 20, and the maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A page token to request the next page of results.  You get the
    * token from the `next_page_token` field of the response from the previous
    * call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project for which to list jobs.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsList {
  
  inline def apply(): ParamsResourceProjectsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsList]
  }
  
  extension [Self <: ParamsResourceProjectsJobsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
