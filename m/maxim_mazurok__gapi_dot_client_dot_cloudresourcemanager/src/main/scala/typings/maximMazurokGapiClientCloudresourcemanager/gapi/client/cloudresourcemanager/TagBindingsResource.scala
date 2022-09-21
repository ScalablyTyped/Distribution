package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.AltCallback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.ValidateOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagBindingsResource extends StObject {
  
  def create(request: AltCallback, body: TagBinding): Request[Operation] = js.native
  /** Creates a TagBinding between a TagValue and a cloud resource (currently project, folder, or organization). */
  def create(request: ValidateOnly): Request[Operation] = js.native
  
  /** Deletes a TagBinding. */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /**
    * Lists the TagBindings for the given cloud resource, as specified with `parent`. NOTE: The `parent` field is expected to be a full resource name:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  def list(): Request[ListTagBindingsResponse] = js.native
  def list(request: Accesstoken): Request[ListTagBindingsResponse] = js.native
}
