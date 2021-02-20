package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.CourseWorkId
import typings.maximMazurokGapiClientClassroom.anon.Late
import typings.maximMazurokGapiClientClassroom.anon.PrettyPrint
import typings.maximMazurokGapiClientClassroom.anon.QuotaUser
import typings.maximMazurokGapiClientClassroom.anon.Resource
import typings.maximMazurokGapiClientClassroom.anon.UpdateMask
import typings.maximMazurokGapiClientClassroom.anon.UploadType
import typings.maximMazurokGapiClientClassroom.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StudentSubmissionsResource extends StObject {
  
  /**
    * Returns a student submission. * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, course work, or student submission or for access errors.
    * * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    */
  def get(): Request[StudentSubmission] = js.native
  def get(request: CourseWorkId): Request[StudentSubmission] = js.native
  
  /**
    * Returns a list of student submissions that the requester is permitted to view, factoring in the OAuth scopes of the request. `-` may be specified as the `course_work_id` to include
    * student submissions for multiple course work items. Course students may only view their own work. Course teachers and domain administrators may view all student submissions. This
    * method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request[ListStudentSubmissionsResponse] = js.native
  def list(request: Late): Request[ListStudentSubmissionsResponse] = js.native
  
  def modifyAttachments(request: CourseWorkId, body: ModifyAttachmentsRequest): Request[StudentSubmission] = js.native
  /**
    * Modifies attachments of student submission. Attachments may only be added to student submissions belonging to course work objects with a `workType` of `ASSIGNMENT`. This request
    * must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This
    * method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, if the user is not permitted
    * to modify attachments on the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course
    * work, or student submission does not exist.
    */
  def modifyAttachments(request: PrettyPrint): Request[StudentSubmission] = js.native
  
  /**
    * Updates one or more fields of a student submission. See google.classroom.v1.StudentSubmission for details of which fields may be updated and who may change them. This request must
    * be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method
    * returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the
    * requested modification to the student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or
    * student submission does not exist.
    */
  def patch(request: QuotaUser): Request[StudentSubmission] = js.native
  def patch(request: UpdateMask, body: StudentSubmission): Request[StudentSubmission] = js.native
  
  def reclaim(request: CourseWorkId, body: ReclaimStudentSubmissionRequest): Request[js.Object] = js.native
  /**
    * Reclaims a student submission on behalf of the student that owns it. Reclaiming a student submission transfers ownership of attached Drive files to the student and updates the
    * submission state. Only the student that owns the requested student submission may call this method, and only for a student submission that has been turned in. This request must be
    * made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method
    * returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, unsubmit the requested student
    * submission, or for access errors. * `FAILED_PRECONDITION` if the student submission has not been turned in. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course, course work, or student submission does not exist.
    */
  def reclaim(request: Resource): Request[js.Object] = js.native
  
  def `return`(request: CourseWorkId, body: ReturnStudentSubmissionRequest): Request[js.Object] = js.native
  /**
    * Returns a student submission. Returning a student submission transfers ownership of attached Drive files to the student and may also update the submission state. Unlike the
    * Classroom application, returning a student submission does not set assignedGrade to the draftGrade value. Only a teacher of the course that contains the requested student submission
    * may call this method. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course
    * work, return the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course, course work, or student
    * submission does not exist.
    */
  def `return`(request: UploadType): Request[js.Object] = js.native
  
  def turnIn(request: CourseWorkId, body: TurnInStudentSubmissionRequest): Request[js.Object] = js.native
  /**
    * Turns in a student submission. Turning in a student submission transfers ownership of attached Drive files to the teacher and may also update the submission state. This may only be
    * called by the student that owns the specified student submission. This request must be made by the Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the
    * requesting user is not permitted to access the requested course or course work, turn in the requested student submission, or for access errors. * `INVALID_ARGUMENT` if the request
    * is malformed. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    */
  def turnIn(request: Uploadprotocol): Request[js.Object] = js.native
}
