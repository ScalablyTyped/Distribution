package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.Alt
import typings.maximMazurokGapiClientClassroom.anon.AnnouncementStates
import typings.maximMazurokGapiClientClassroom.anon.CourseId
import typings.maximMazurokGapiClientClassroom.anon.Fields
import typings.maximMazurokGapiClientClassroom.anon.Id
import typings.maximMazurokGapiClientClassroom.anon.Key
import typings.maximMazurokGapiClientClassroom.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnouncementsResource extends js.Object {
  
  def create(request: Alt, body: Announcement): Request[Announcement] = js.native
  /**
    * Creates an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create
    * announcements in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does
    * not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
    */
  def create(request: CourseId): Request[Announcement] = js.native
  
  /**
    * Deletes an announcement. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding announcement item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding
    * announcement, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted. * `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /**
    * Returns an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or announcement,
    * or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or announcement does not exist.
    */
  def get(): Request[Announcement] = js.native
  def get(request: Fields): Request[Announcement] = js.native
  
  /**
    * Returns a list of announcements that the requester is permitted to view. Course students may only view `PUBLISHED` announcements. Course teachers and domain administrators may view
    * all announcements. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
    * * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request[ListAnnouncementsResponse] = js.native
  def list(request: AnnouncementStates): Request[ListAnnouncementsResponse] = js.native
  
  def modifyAssignees(request: Fields, body: ModifyAnnouncementAssigneesRequest): Request[Announcement] = js.native
  /**
    * Modifies assignee mode and options of an announcement. Only a teacher of the course that contains the announcement may call this method. This method returns the following error
    * codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors. * `INVALID_ARGUMENT` if the request is
    * malformed. * `NOT_FOUND` if the requested course or course work does not exist.
    */
  def modifyAssignees(request: Id): Request[Announcement] = js.native
  
  /**
    * Updates one or more fields of an announcement. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the
    * corresponding announcement or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested announcement has already been deleted. *
    * `NOT_FOUND` if the requested course or announcement does not exist
    */
  def patch(request: Key): Request[Announcement] = js.native
  def patch(request: Oauthtoken, body: Announcement): Request[Announcement] = js.native
}
