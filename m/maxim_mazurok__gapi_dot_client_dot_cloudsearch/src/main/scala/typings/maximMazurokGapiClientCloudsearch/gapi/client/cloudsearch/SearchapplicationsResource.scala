package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.AltCallback
import typings.maximMazurokGapiClientCloudsearch.anon.DebugOptionsenableDebugging
import typings.maximMazurokGapiClientCloudsearch.anon.FromDateday
import typings.maximMazurokGapiClientCloudsearch.anon.Key
import typings.maximMazurokGapiClientCloudsearch.anon.KeyName
import typings.maximMazurokGapiClientCloudsearch.anon.NameOauthtoken
import typings.maximMazurokGapiClientCloudsearch.anon.PageSize
import typings.maximMazurokGapiClientCloudsearch.anon.PrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchapplicationsResource extends StObject {
  
  def create(request: AltCallback, body: SearchApplication): Request[Operation] = js.native
  /** Creates a search application. **Note:** This API requires an admin account to execute. */
  def create(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  
  /** Deletes a search application. **Note:** This API requires an admin account to execute. */
  def delete(): Request[Operation] = js.native
  def delete(request: DebugOptionsenableDebugging): Request[Operation] = js.native
  
  /** Gets the specified search application. **Note:** This API requires an admin account to execute. */
  /** Get the query statistics for search application. **Note:** This API requires a standard end user account to execute. */
  /** Get the # of search sessions, % of successful sessions with a click query statistics for search application. **Note:** This API requires a standard end user account to execute. */
  /** Get the users statistics for search application. **Note:** This API requires a standard end user account to execute. */
  def get(): Request[SearchApplication] = js.native
  def get(request: DebugOptionsenableDebugging): Request[SearchApplication] = js.native
  def get(request: FromDateday): Request[GetSearchApplicationQueryStatsResponse] = js.native
  
  /** Lists all search applications. **Note:** This API requires an admin account to execute. */
  def list(): Request[ListSearchApplicationsResponse] = js.native
  def list(request: PageSize): Request[ListSearchApplicationsResponse] = js.native
  
  /** Resets a search application to default settings. This will return an empty response. **Note:** This API requires an admin account to execute. */
  def reset(request: KeyName): Request[Operation] = js.native
  def reset(request: Key, body: ResetSearchApplicationRequest): Request[Operation] = js.native
  
  def update(request: Key, body: SearchApplication): Request[Operation] = js.native
  /** Updates a search application. **Note:** This API requires an admin account to execute. */
  def update(request: NameOauthtoken): Request[Operation] = js.native
}
