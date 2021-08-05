package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOperationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A string for filtering Operations. In v2alpha1, the following filter
    * fields are supported&#58;  * createTime&#58; The time this job was
    * created * events&#58; The set of event (names) that have occurred while
    * running   the pipeline.  The &#58; operator can be used to determine if a
    * particular event has occurred. * error&#58; If the pipeline is running,
    * this value is NULL.  Once the   pipeline finishes, the value is the
    * standard Google error code. * labels.key or labels."key with space" where
    * key is a label key. * done&#58; If the pipeline is running, this value is
    * false. Once the   pipeline finishes, the value is true.  In v1 and
    * v1alpha2, the following filter fields are supported&#58;  *
    * projectId&#58; Required. Corresponds to   OperationMetadata.projectId. *
    * createTime&#58; The time this job was created, in seconds from the
    * [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=`
    * operators. * status&#58; Can be `RUNNING`, `SUCCESS`, `FAILURE`, or
    * `CANCELED`. Only   one status may be specified. * labels.key where key is
    * a label key.  Examples&#58;  * `projectId = my-project AND createTime >=
    * 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND
    * createTime <= 1432150000 AND status = RUNNING` * `projectId = my-project
    * AND labels.color = *` * `projectId = my-project AND labels.color = red`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the operation's parent resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return. The maximum value is 256.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOperationsList {
  
  inline def apply(): ParamsResourceProjectsOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOperationsList]
  }
  
  extension [Self <: ParamsResourceProjectsOperationsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
