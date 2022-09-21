package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.AltCallback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Etag
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.KeyName
import typings.maximMazurokGapiClientCloudresourcemanager.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagValuesResource extends StObject {
  
  def create(request: AltCallback, body: TagValue): Request[Operation] = js.native
  /**
    * Creates a TagValue as a child of the specified TagKey. If a another request with the same parameters is sent while the original request is in process the second request will receive
    * an error. A maximum of 1000 TagValues can exist under a TagKey at any given time.
    */
  def create(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  
  /** Deletes a TagValue. The TagValue cannot have any bindings when it is deleted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Etag): Request[Operation] = js.native
  
  /** Retrieves a TagValue. This method will return `PERMISSION_DENIED` if the value does not exist or the user does not have permission to view it. */
  def get(): Request[TagValue] = js.native
  def get(request: Fields): Request[TagValue] = js.native
  
  /**
    * Gets the access control policy for a TagValue. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagValue's resource name.
    * For example: `tagValues/1234`. The caller must have the `cloudresourcemanager.googleapis.com/tagValues.getIamPolicy` permission on the identified TagValue to get the access control
    * policy.
    */
  def getIamPolicy(request: Key, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all TagValues for a specific TagKey. */
  def list(): Request[ListTagValuesResponse] = js.native
  def list(request: Accesstoken): Request[ListTagValuesResponse] = js.native
  
  def patch(request: KeyName, body: TagValue): Request[Operation] = js.native
  /** Updates the attributes of the TagValue resource. */
  def patch(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  
  /**
    * Sets the access control policy on a TagValue, replacing any existing policy. The `resource` field should be the TagValue's resource name. For example: `tagValues/1234`. The caller
    * must have `resourcemanager.tagValues.setIamPolicy` permission on the identified tagValue.
    */
  def setIamPolicy(request: Key, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var tagHolds: TagHoldsResource = js.native
  
  /**
    * Returns permissions that a caller has on the specified TagValue. The `resource` field should be the TagValue's resource name. For example: `tagValues/1234`. There are no permissions
    * required for making this API call.
    */
  def testIamPermissions(request: Key, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
