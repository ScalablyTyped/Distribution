package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.Alt
import typings.maximMazurokGapiClientClassroom.anon.CallbackCourseId
import typings.maximMazurokGapiClientClassroom.anon.CourseIdFields
import typings.maximMazurokGapiClientClassroom.anon.CourseWorkMaterialStates
import typings.maximMazurokGapiClientClassroom.anon.Fields
import typings.maximMazurokGapiClientClassroom.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseWorkMaterialsResource extends js.Object {
  
  def create(request: Alt, body: CourseWorkMaterial): Request[CourseWorkMaterial] = js.native
  /**
    * Creates a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create
    * course work material in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed or if more than 20 * materials are
    * provided. * `NOT_FOUND` if the requested course does not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
    */
  def create(request: CallbackCourseId): Request[CourseWorkMaterial] = js.native
  
  /**
    * Deletes a course work material. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create
    * the corresponding course work material item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the
    * corresponding course work material, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested course work
    * material has already been deleted. * `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /**
    * Returns a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course
    * work material, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work material does not exist.
    */
  def get(): Request[CourseWorkMaterial] = js.native
  def get(request: Fields): Request[CourseWorkMaterial] = js.native
  
  /**
    * Returns a list of course work material that the requester is permitted to view. Course students may only view `PUBLISHED` course work material. Course teachers and domain
    * administrators may view all course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request[ListCourseWorkMaterialResponse] = js.native
  def list(request: CourseWorkMaterialStates): Request[ListCourseWorkMaterialResponse] = js.native
  
  /**
    * Updates one or more fields of a course work material. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested course work material has already been deleted. * `NOT_FOUND` if the requested course or
    * course work material does not exist
    */
  def patch(request: CourseIdFields): Request[CourseWorkMaterial] = js.native
  def patch(request: Oauthtoken, body: CourseWorkMaterial): Request[CourseWorkMaterial] = js.native
}
