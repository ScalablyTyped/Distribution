package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.CallbackFields
import typings.maximMazurokGapiClientClassroom.anon.CourseStates
import typings.maximMazurokGapiClientClassroom.anon.IdKey
import typings.maximMazurokGapiClientClassroom.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientClassroom.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientClassroom.anon.QuotaUserResource
import typings.maximMazurokGapiClientClassroom.anon.QuotaUserUpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoursesResource extends StObject {
  
  var aliases: AliasesResource = js.native
  
  var announcements: AnnouncementsResource = js.native
  
  var courseWork: CourseWorkResource = js.native
  
  var courseWorkMaterials: CourseWorkMaterialsResource = js.native
  
  /**
    * Creates a course. The user specified in `ownerId` is the owner of the created course and added as a teacher. This method returns the following error codes: * `PERMISSION_DENIED` if
    * the requesting user is not permitted to create courses or for access errors. * `NOT_FOUND` if the primary teacher is not a valid user. * `FAILED_PRECONDITION` if the course owner's
    * account is disabled or for the following request errors: * UserGroupsMembershipLimitReached * `ALREADY_EXISTS` if an alias was specified in the `id` and already exists.
    */
  def create(request: CallbackFields): Request[Course] = js.native
  def create(request: OauthtokenPrettyPrint, body: Course): Request[Course] = js.native
  
  /**
    * Deletes a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete the requested course or for access errors. *
    * `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: IdKey): Request[js.Object] = js.native
  
  /**
    * Returns a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. *
    * `NOT_FOUND` if no course exists with the requested ID.
    */
  def get(): Request[Course] = js.native
  def get(request: IdKey): Request[Course] = js.native
  
  /**
    * Returns a list of courses that the requesting user is permitted to view, restricted to those that match the request. Returned courses are ordered by creation time, with the most
    * recently created coming first. This method returns the following error codes: * `PERMISSION_DENIED` for access errors. * `INVALID_ARGUMENT` if the query argument is malformed. *
    * `NOT_FOUND` if any users specified in the query arguments do not exist.
    */
  def list(): Request[ListCoursesResponse] = js.native
  def list(request: CourseStates): Request[ListCoursesResponse] = js.native
  
  /**
    * Updates one or more fields in a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course
    * or for access errors. * `NOT_FOUND` if no course exists with the requested ID. * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or if no update mask is
    * supplied. * `FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
    */
  def patch(request: PrettyPrintQuotaUser): Request[Course] = js.native
  def patch(request: QuotaUserUpdateMask, body: Course): Request[Course] = js.native
  
  var students: StudentsResource = js.native
  
  var teachers: TeachersResource = js.native
  
  var topics: TopicsResource = js.native
  
  def update(request: IdKey, body: Course): Request[Course] = js.native
  /**
    * Updates a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors. *
    * `NOT_FOUND` if no course exists with the requested ID. * `FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
    */
  def update(request: QuotaUserResource): Request[Course] = js.native
}
