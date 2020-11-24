package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.FromDatemonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsResource extends js.Object {
  
  /**
    * Gets indexed item statistics aggreggated across all data sources. This API only returns statistics for previous dates; it doesn't return statistics for the current day. **Note:**
    * This API requires a standard end user account to execute.
    */
  def getIndex(): Request[GetCustomerIndexStatsResponse] = js.native
  def getIndex(request: FromDatemonth): Request[GetCustomerIndexStatsResponse] = js.native
  
  /** Get the query statistics for customer. **Note:** This API requires a standard end user account to execute. */
  def getQuery(): Request[GetCustomerQueryStatsResponse] = js.native
  def getQuery(request: FromDatemonth): Request[GetCustomerQueryStatsResponse] = js.native
  
  /** Get the # of search sessions, % of successful sessions with a click query statistics for customer. **Note:** This API requires a standard end user account to execute. */
  def getSession(): Request[GetCustomerSessionStatsResponse] = js.native
  def getSession(request: FromDatemonth): Request[GetCustomerSessionStatsResponse] = js.native
  
  /** Get the users statistics for customer. **Note:** This API requires a standard end user account to execute. */
  def getUser(): Request[GetCustomerUserStatsResponse] = js.native
  def getUser(request: FromDatemonth): Request[GetCustomerUserStatsResponse] = js.native
  
  var index: IndexResource = js.native
  
  var query: QueryResource = js.native
  
  var session: SessionResource = js.native
  
  var user: UserResource = js.native
}
