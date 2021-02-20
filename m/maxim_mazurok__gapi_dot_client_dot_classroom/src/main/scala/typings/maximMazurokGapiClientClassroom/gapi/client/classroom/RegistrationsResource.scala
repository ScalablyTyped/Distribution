package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClassroom.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientClassroom.anon.RegistrationId
import typings.maximMazurokGapiClientClassroom.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationsResource extends StObject {
  
  def create(request: OauthtokenPrettyPrint, body: Registration): Request[Registration] = js.native
  /**
    * Creates a `Registration`, causing Classroom to start sending notifications from the provided `feed` to the destination provided in `cloudPubSubTopic`. Returns the created
    * `Registration`. Currently, this will be the same as the argument, but with server-assigned fields such as `expiry_time` and `id` filled in. Note that any value specified for the
    * `expiry_time` or `id` fields will be ignored. While Classroom may validate the `cloudPubSubTopic` and return errors on a best effort basis, it is the caller's responsibility to
    * ensure that it exists and that Classroom has permission to publish to it. This method may return the following error codes: * `PERMISSION_DENIED` if: * the authenticated user does
    * not have permission to receive notifications from the requested field; or * the current user has not granted access to the current Cloud project with the appropriate scope for the
    * requested feed. Note that domain-wide delegation of authority is not currently supported for this purpose. If the request has the appropriate scope, but no grant exists, a Request
    * Errors is returned. * another access error is encountered. * `INVALID_ARGUMENT` if: * no `cloudPubsubTopic` is specified, or the specified `cloudPubsubTopic` is not valid; or * no
    * `feed` is specified, or the specified `feed` is not valid. * `NOT_FOUND` if: * the specified `feed` cannot be located, or the requesting user does not have permission to determine
    * whether or not it exists; or * the specified `cloudPubsubTopic` cannot be located, or Classroom has not been granted permission to publish to it.
    */
  def create(request: UploadTypeUploadprotocol): Request[Registration] = js.native
  
  /** Deletes a `Registration`, causing Classroom to stop sending notifications for that `Registration`. */
  def delete(): Request[js.Object] = js.native
  def delete(request: RegistrationId): Request[js.Object] = js.native
}
