package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.Alt
import typings.maximMazurokGapiClientClassroom.anon.Callback
import typings.maximMazurokGapiClientClassroom.anon.FieldsKey
import typings.maximMazurokGapiClientClassroom.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeachersResource extends StObject {
  
  def create(request: Alt, body: Teacher): Request[Teacher] = js.native
  /**
    * Creates a teacher of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to create teachers in this course or for
    * access errors. * `NOT_FOUND` if the requested course ID does not exist. * `FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: *
    * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached * `ALREADY_EXISTS` if the user is already a teacher or student in the
    * course.
    */
  def create(request: FieldsKey): Request[Teacher] = js.native
  
  /**
    * Deletes a teacher of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete teachers of this course or for
    * access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist. * `FAILED_PRECONDITION` if the requested ID belongs to the primary
    * teacher of this course.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: UserId): Request[js.Object] = js.native
  
  /**
    * Returns a teacher of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view teachers of this course or for
    * access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist.
    */
  def get(): Request[Teacher] = js.native
  def get(request: UserId): Request[Teacher] = js.native
  
  /**
    * Returns a list of teachers of this course that the requester is permitted to view. This method returns the following error codes: * `NOT_FOUND` if the course does not exist. *
    * `PERMISSION_DENIED` for access errors.
    */
  def list(): Request[ListTeachersResponse] = js.native
  def list(request: Callback): Request[ListTeachersResponse] = js.native
}
