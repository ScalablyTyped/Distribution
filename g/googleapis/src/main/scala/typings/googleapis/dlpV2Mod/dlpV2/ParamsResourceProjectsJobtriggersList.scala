package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsJobtriggersList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `status` -
    * HEALTHY|PAUSED|CANCELLED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - 'last_run_time` - RFC 3339
    * formatted timestamp, surrounded by     quotation marks. Nanoseconds are
    * ignored.     - 'error_count' - Number of errors that have occurred while
    * running. * The operator must be `=` or `!=` for status and
    * inspected_storage.  Examples:  * inspected_storage = cloud_storage AND
    * status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage
    * = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR
    * state = HEALTHY) * last_run_time > \"2017-12-12T00:00:00+00:00\"  The
    * length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional comma separated list of triggeredJob fields to order by,
    * followed by `asc` or `desc` postfix. This list is case-insensitive,
    * default sorting order is ascending, redundant space characters are
    * insignificant.  Example: `name asc,update_time, create_time desc`
    * Supported fields are:  - `create_time`: corresponds to time the
    * JobTrigger was created. - `update_time`: corresponds to time the
    * JobTrigger was last updated. - `last_run_time`: corresponds to the last
    * time the JobTrigger ran. - `name`: corresponds to JobTrigger's name. -
    * `display_name`: corresponds to JobTrigger's display name. - `status`:
    * corresponds to JobTrigger's status.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Optional size of the page, can be limited by a server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional page token to continue retrieval. Comes from previous call to
    * ListJobTriggers. `order_by` field must not change for subsequent calls.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The parent resource name, for example `projects/my-project-id`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsJobtriggersList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsJobtriggersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobtriggersList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsJobtriggersListMutableBuilder[Self <: ParamsResourceProjectsJobtriggersList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
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
