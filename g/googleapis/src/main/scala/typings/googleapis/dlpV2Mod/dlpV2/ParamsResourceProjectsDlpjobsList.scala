package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDlpjobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `state` -
    * PENDING|RUNNING|CANCELED|FINISHED|FAILED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - `trigger_name` - The resource name
    * of the trigger that created job. * Supported fields for risk analysis
    * jobs:     - `state` - RUNNING|CANCELED|FINISHED|FAILED * The operator
    * must be `=` or `!=`.  Examples:  * inspected_storage = cloud_storage AND
    * state = done * inspected_storage = cloud_storage OR inspected_storage =
    * bigquery * inspected_storage = cloud_storage AND (state = done OR state =
    * canceled)  The length of this field should be no more than 500
    * characters.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional comma separated list of fields to order by, followed by `asc` or
    * `desc` postfix. This list is case-insensitive, default sorting order is
    * ascending, redundant space characters are insignificant.  Example: `name
    * asc, end_time asc, create_time desc`  Supported fields are:  -
    * `create_time`: corresponds to time the job was created. - `end_time`:
    * corresponds to time the job ended. - `name`: corresponds to job's name. -
    * `state`: corresponds to `state`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name, for example projects/my-project-id.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The type of job. Defaults to `DlpJobType.INSPECT`
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDlpjobsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDlpjobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDlpjobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDlpjobsListMutableBuilder[Self <: ParamsResourceProjectsDlpjobsList] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
