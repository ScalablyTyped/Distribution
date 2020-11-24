package typings.maximMazurokGapiClientBigquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllUsers extends js.Object {
  
  /** Whether to display jobs owned by all users in the project. Default false */
  var allUsers: js.UndefOr[Boolean] = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned */
  var maxCreationTime: js.UndefOr[String] = js.native
  
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned */
  var minCreationTime: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Page token, returned by a previous call, to request the next page of results */
  var pageToken: js.UndefOr[String] = js.native
  
  /** If set, retrieves only jobs whose parent is this job. Otherwise, retrieves only jobs which have no parent */
  var parentJobId: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Project ID of the jobs to list */
  var projectId: String = js.native
  
  /** Restrict information returned to a set of selected fields */
  var projection: js.UndefOr[String] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Filter for job state */
  var stateFilter: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object AllUsers {
  
  @scala.inline
  def apply(projectId: String): AllUsers = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllUsers]
  }
  
  @scala.inline
  implicit class AllUsersOps[Self <: AllUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUsers(value: Boolean): Self = this.set("allUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllUsers: Self = this.set("allUsers", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxCreationTime(value: String): Self = this.set("maxCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCreationTime: Self = this.set("maxCreationTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMinCreationTime(value: String): Self = this.set("minCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCreationTime: Self = this.set("minCreationTime", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParentJobId(value: String): Self = this.set("parentJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentJobId: Self = this.set("parentJobId", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setStateFilterVarargs(value: String*): Self = this.set("stateFilter", js.Array(value :_*))
    
    @scala.inline
    def setStateFilter(value: String | js.Array[String]): Self = this.set("stateFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateFilter: Self = this.set("stateFilter", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
}
