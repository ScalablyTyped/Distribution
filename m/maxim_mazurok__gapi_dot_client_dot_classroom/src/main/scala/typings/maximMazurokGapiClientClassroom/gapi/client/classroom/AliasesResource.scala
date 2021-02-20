package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.Accesstoken
import typings.maximMazurokGapiClientClassroom.anon.Alias
import typings.maximMazurokGapiClientClassroom.anon.Alt
import typings.maximMazurokGapiClientClassroom.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasesResource extends StObject {
  
  /**
    * Creates an alias for a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to create the alias or for access errors.
    * * `NOT_FOUND` if the course does not exist. * `ALREADY_EXISTS` if the alias already exists. * `FAILED_PRECONDITION` if the alias requested does not make sense for the requesting
    * user or course (for example, if a user not in a domain attempts to access a domain-scoped alias).
    */
  def create(request: Accesstoken): Request[CourseAlias] = js.native
  def create(request: Alt, body: CourseAlias): Request[CourseAlias] = js.native
  
  /**
    * Deletes an alias of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to remove the alias or for access errors.
    * * `NOT_FOUND` if the alias does not exist. * `FAILED_PRECONDITION` if the alias requested does not make sense for the requesting user or course (for example, if a user not in a
    * domain attempts to delete a domain-scoped alias).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alias): Request[js.Object] = js.native
  
  /**
    * Returns a list of aliases for a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the course or for
    * access errors. * `NOT_FOUND` if the course does not exist.
    */
  def list(): Request[ListCourseAliasesResponse] = js.native
  def list(request: Callback): Request[ListCourseAliasesResponse] = js.native
}
