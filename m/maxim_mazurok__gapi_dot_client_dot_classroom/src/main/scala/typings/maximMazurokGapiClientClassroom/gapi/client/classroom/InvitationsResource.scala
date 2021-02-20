package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.IdKey
import typings.maximMazurokGapiClientClassroom.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientClassroom.anon.PageSize
import typings.maximMazurokGapiClientClassroom.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationsResource extends StObject {
  
  /**
    * Accepts an invitation, removing it and adding the invited user to the teachers or students (as appropriate) of the specified course. Only the invited user may accept an invitation.
    * This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to accept the requested invitation or for access errors. *
    * `FAILED_PRECONDITION` for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached * `NOT_FOUND`
    * if no invitation exists with the requested ID.
    */
  def accept(): Request[js.Object] = js.native
  def accept(request: IdKey): Request[js.Object] = js.native
  
  def create(request: OauthtokenPrettyPrint, body: Invitation): Request[Invitation] = js.native
  /**
    * Creates an invitation. Only one invitation for a user and course may exist at a time. Delete and re-create an invitation to make changes. This method returns the following error
    * codes: * `PERMISSION_DENIED` if the requesting user is not permitted to create invitations for this course or for access errors. * `NOT_FOUND` if the course or the user does not
    * exist. * `FAILED_PRECONDITION` if the requested user's account is disabled or if the user already has this role or a role with greater permissions. * `ALREADY_EXISTS` if an
    * invitation for the specified user and course already exists.
    */
  def create(request: ResourceUploadType): Request[Invitation] = js.native
  
  /**
    * Deletes an invitation. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete the requested invitation or for access
    * errors. * `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: IdKey): Request[js.Object] = js.native
  
  /**
    * Returns an invitation. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view the requested invitation or for access
    * errors. * `NOT_FOUND` if no invitation exists with the requested ID.
    */
  def get(): Request[Invitation] = js.native
  def get(request: IdKey): Request[Invitation] = js.native
  
  /**
    * Returns a list of invitations that the requesting user is permitted to view, restricted to those that match the list request. *Note:* At least one of `user_id` or `course_id` must
    * be supplied. Both fields can be supplied. This method returns the following error codes: * `PERMISSION_DENIED` for access errors.
    */
  def list(): Request[ListInvitationsResponse] = js.native
  def list(request: PageSize): Request[ListInvitationsResponse] = js.native
}
