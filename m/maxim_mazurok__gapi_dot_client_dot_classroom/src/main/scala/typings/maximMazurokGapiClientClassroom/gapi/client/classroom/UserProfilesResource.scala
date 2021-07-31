package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.QuotaUserUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfilesResource extends StObject {
  
  /**
    * Returns a user profile. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access this user profile, if no profile
    * exists with the requested ID, or for access errors.
    */
  def get(): Request[UserProfile] = js.native
  def get(request: QuotaUserUploadType): Request[UserProfile] = js.native
  
  var guardianInvitations: GuardianInvitationsResource = js.native
  
  var guardians: GuardiansResource = js.native
}
