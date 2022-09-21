package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.AltCallback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.CallbackFields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Etag
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.FieldsKey
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.KeyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagKeysResource extends StObject {
  
  def create(request: AltCallback, body: TagKey): Request[Operation] = js.native
  /**
    * Creates a new TagKey. If another request with the same parameters is sent while the original request is in process, the second request will receive an error. A maximum of 1000
    * TagKeys can exist under a parent at any given time.
    */
  def create(request: CallbackFields): Request[Operation] = js.native
  
  /** Deletes a TagKey. The TagKey cannot be deleted if it has any child TagValues. */
  def delete(): Request[Operation] = js.native
  def delete(request: Etag): Request[Operation] = js.native
  
  /** Retrieves a TagKey. This method will return `PERMISSION_DENIED` if the key does not exist or the user does not have permission to view it. */
  def get(): Request[TagKey] = js.native
  def get(request: Fields): Request[TagKey] = js.native
  
  /**
    * Gets the access control policy for a TagKey. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagKey's resource name. For
    * example, "tagKeys/1234". The caller must have `cloudresourcemanager.googleapis.com/tagKeys.getIamPolicy` permission on the specified TagKey.
    */
  def getIamPolicy(request: Key, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all TagKeys for a parent resource. */
  def list(): Request[ListTagKeysResponse] = js.native
  def list(request: Accesstoken): Request[ListTagKeysResponse] = js.native
  
  /** Updates the attributes of the TagKey resource. */
  def patch(request: FieldsKey): Request[Operation] = js.native
  def patch(request: KeyName, body: TagKey): Request[Operation] = js.native
  
  /**
    * Sets the access control policy on a TagKey, replacing any existing policy. The `resource` field should be the TagKey's resource name. For example, "tagKeys/1234". The caller must
    * have `resourcemanager.tagKeys.setIamPolicy` permission on the identified tagValue.
    */
  def setIamPolicy(request: Key, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified TagKey. The `resource` field should be the TagKey's resource name. For example, "tagKeys/1234". There are no permissions
    * required for making this API call.
    */
  def testIamPermissions(request: Key, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
