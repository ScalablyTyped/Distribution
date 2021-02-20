package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.PrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfilesResource extends StObject {
  
  /** Gets one user profile by ID. */
  def get(): Request[UserProfile] = js.native
  def get(request: Callback): Request[UserProfile] = js.native
  
  /** Retrieves list of user profiles for a user. */
  def list(): Request[UserProfileList] = js.native
  def list(request: PrettyPrintQuotaUser): Request[UserProfileList] = js.native
}
