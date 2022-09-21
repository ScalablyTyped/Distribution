package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Alt
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Callback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Name
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PageSize
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudresourcemanager.anon.QuotaUser
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldersResource extends StObject {
  
  /**
    * Creates a folder in the resource hierarchy. Returns an `Operation` which can be used to track the progress of the folder creation workflow. Upon success, the `Operation.response`
    * field will be populated with the created Folder. In order to succeed, the addition of this new folder must not violate the folder naming, height, or fanout constraints. + The
    * folder's `display_name` must be distinct from all other folders that share its parent. + The addition of the folder must not cause the active folder hierarchy to exceed a height of
    * 10. Note, the full active + deleted folder hierarchy is allowed to reach a height of 20; this provides additional headroom when moving folders that contain deleted folders. + The
    * addition of the folder must not cause the total number of folders under its parent to exceed 300. If the operation fails due to a folder constraint violation, some errors may be
    * returned by the `CreateFolder` request, with status code `FAILED_PRECONDITION` and an error description. Other folder constraint violations will be communicated in the `Operation`,
    * with the specific `PreconditionFailure` returned in the details list in the `Operation.error` field. The caller must have `resourcemanager.folders.create` permission on the
    * identified parent.
    */
  def create(request: Alt): Request[Operation] = js.native
  def create(request: Callback, body: Folder): Request[Operation] = js.native
  
  /**
    * Requests deletion of a folder. The folder is moved into the DELETE_REQUESTED state immediately, and is deleted approximately 30 days later. This method may only be called on an
    * empty folder, where a folder is empty if it doesn't contain any folders or projects in the ACTIVE state. If called on a folder in DELETE_REQUESTED state the operation will result in
    * a no-op success. The caller must have `resourcemanager.folders.delete` permission on the identified folder.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /**
    * Retrieves a folder identified by the supplied resource name. Valid folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have
    * `resourcemanager.folders.get` permission on the identified folder.
    */
  def get(): Request[Folder] = js.native
  def get(request: Fields): Request[Folder] = js.native
  
  /**
    * Gets the access control policy for a folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the folder's resource name, for
    * example: "folders/1234". The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
    */
  def getIamPolicy(request: Key, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Lists the folders that are direct descendants of supplied parent resource. `list()` provides a strongly consistent view of the folders underneath the specified parent resource.
    * `list()` returns folders sorted based upon the (ascending) lexical ordering of their display_name. The caller must have `resourcemanager.folders.list` permission on the identified
    * parent.
    */
  def list(): Request[ListFoldersResponse] = js.native
  def list(request: Oauthtoken): Request[ListFoldersResponse] = js.native
  
  def move(request: Fields, body: MoveFolderRequest): Request[Operation] = js.native
  /**
    * Moves a folder under a new resource parent. Returns an `Operation` which can be used to track the progress of the folder move workflow. Upon success, the `Operation.response` field
    * will be populated with the moved folder. Upon failure, a `FolderOperationError` categorizing the failure cause will be returned - if the failure occurs synchronously then the
    * `FolderOperationError` will be returned in the `Status.details` field. If it occurs asynchronously, then the FolderOperation will be returned in the `Operation.error` field. In
    * addition, the `Operation.metadata` field will be populated with a `FolderOperation` message as an aid to stateless clients. Folder moves will be rejected if they violate either the
    * naming, height, or fanout constraints described in the CreateFolder documentation. The caller must have `resourcemanager.folders.move` permission on the folder's current and
    * proposed new parent.
    */
  def move(request: Name): Request[Operation] = js.native
  
  /**
    * Updates a folder, changing its `display_name`. Changes to the folder `display_name` will be rejected if they violate either the `display_name` formatting rules or the naming
    * constraints described in the CreateFolder documentation. The folder's `display_name` must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and
    * underscores and can be between 3 and 30 characters. This is captured by the regular expression: `\p{L}\p{N}{1,28}[\p{L}\p{N}]`. The caller must have `resourcemanager.folders.update`
    * permission on the identified folder. If the update fails due to the unique name constraint then a `PreconditionFailure` explaining this violation will be returned in the
    * Status.details field.
    */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: Folder): Request[Operation] = js.native
  
  /**
    * Search for folders that match specific filter criteria. `search()` provides an eventually consistent view of the folders a user has access to which meet the specified filter
    * criteria. This will only return folders on which the caller has the permission `resourcemanager.folders.get`.
    */
  def search(): Request[SearchFoldersResponse] = js.native
  def search(request: PageSize): Request[SearchFoldersResponse] = js.native
  
  /**
    * Sets the access control policy on a folder, replacing any existing policy. The `resource` field should be the folder's resource name, for example: "folders/1234". The caller must
    * have `resourcemanager.folders.setIamPolicy` permission on the identified folder.
    */
  def setIamPolicy(request: Key, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified folder. The `resource` field should be the folder's resource name, for example: "folders/1234". There are no permissions
    * required for making this API call.
    */
  def testIamPermissions(request: Key, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def undelete(request: Fields, body: UndeleteFolderRequest): Request[Operation] = js.native
  /**
    * Cancels the deletion request for a folder. This method may be called on a folder in any state. If the folder is in the ACTIVE state the result will be a no-op success. In order to
    * succeed, the folder's parent must be in the ACTIVE state. In addition, reintroducing the folder into the tree must not violate folder naming, height, and fanout constraints
    * described in the CreateFolder documentation. The caller must have `resourcemanager.folders.undelete` permission on the identified folder.
    */
  def undelete(request: Resource): Request[Operation] = js.native
}
