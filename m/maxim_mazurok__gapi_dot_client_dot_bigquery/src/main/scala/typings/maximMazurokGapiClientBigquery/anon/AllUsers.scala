package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllUsers extends StObject {
  
  /** Whether to display jobs owned by all users in the project. Default false */
  var allUsers: js.UndefOr[Boolean] = js.undefined
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned */
  var maxCreationTime: js.UndefOr[String] = js.undefined
  
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned */
  var minCreationTime: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Page token, returned by a previous call, to request the next page of results */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** If set, retrieves only jobs whose parent is this job. Otherwise, retrieves only jobs which have no parent */
  var parentJobId: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Project ID of the jobs to list */
  var projectId: String
  
  /** Restrict information returned to a set of selected fields */
  var projection: js.UndefOr[String] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Filter for job state */
  var stateFilter: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object AllUsers {
  
  inline def apply(projectId: String): AllUsers = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllUsers]
  }
  
  extension [Self <: AllUsers](x: Self) {
    
    inline def setAllUsers(value: Boolean): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
    
    inline def setAllUsersUndefined: Self = StObject.set(x, "allUsers", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxCreationTime(value: String): Self = StObject.set(x, "maxCreationTime", value.asInstanceOf[js.Any])
    
    inline def setMaxCreationTimeUndefined: Self = StObject.set(x, "maxCreationTime", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinCreationTime(value: String): Self = StObject.set(x, "minCreationTime", value.asInstanceOf[js.Any])
    
    inline def setMinCreationTimeUndefined: Self = StObject.set(x, "minCreationTime", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
    
    inline def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setStateFilter(value: String | js.Array[String]): Self = StObject.set(x, "stateFilter", value.asInstanceOf[js.Any])
    
    inline def setStateFilterUndefined: Self = StObject.set(x, "stateFilter", js.undefined)
    
    inline def setStateFilterVarargs(value: String*): Self = StObject.set(x, "stateFilter", js.Array(value*))
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
