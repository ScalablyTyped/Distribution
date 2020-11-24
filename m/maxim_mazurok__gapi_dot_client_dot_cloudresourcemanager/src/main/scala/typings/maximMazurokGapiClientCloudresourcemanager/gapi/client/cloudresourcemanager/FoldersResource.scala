package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Alt
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Callback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Name
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudresourcemanager.anon.QuotaUser
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Resource
import typings.maximMazurokGapiClientCloudresourcemanager.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldersResource extends js.Object {
  
  /**
    * Creates a Folder in the resource hierarchy. Returns an Operation which can be used to track the progress of the folder creation workflow. Upon success the Operation.response field
    * will be populated with the created Folder. In order to succeed, the addition of this new Folder must not violate the Folder naming, height or fanout constraints. + The Folder's
    * display_name must be distinct from all other Folders that share its parent. + The addition of the Folder must not cause the active Folder hierarchy to exceed a height of 10. Note,
    * the full active + deleted Folder hierarchy is allowed to reach a height of 20; this provides additional headroom when moving folders that contain deleted folders. + The addition of
    * the Folder must not cause the total number of Folders under its parent to exceed 300. If the operation fails due to a folder constraint violation, some errors may be returned by the
    * CreateFolder request, with status code FAILED_PRECONDITION and an error description. Other folder constraint violations will be communicated in the Operation, with the specific
    * PreconditionFailure returned via the details list in the Operation.error field. The caller must have `resourcemanager.folders.create` permission on the identified parent.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Folder): Request[Operation] = js.native
  
  /**
    * Requests deletion of a Folder. The Folder is moved into the DELETE_REQUESTED state immediately, and is deleted approximately 30 days later. This method may only be called on an
    * empty Folder in the ACTIVE state, where a Folder is empty if it doesn't contain any Folders or Projects in the ACTIVE state. The caller must have `resourcemanager.folders.delete`
    * permission on the identified folder.
    */
  def delete(): Request[Folder] = js.native
  def delete(request: Callback): Request[Folder] = js.native
  
  /**
    * Retrieves a Folder identified by the supplied resource name. Valid Folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have
    * `resourcemanager.folders.get` permission on the identified folder.
    */
  def get(): Request[Folder] = js.native
  def get(request: Callback): Request[Folder] = js.native
  
  /**
    * Gets the access control policy for a Folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the Folder's resource name, e.g.
    * "folders/1234". The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
    */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Lists the Folders that are direct descendants of supplied parent resource. List provides a strongly consistent view of the Folders underneath the specified parent resource. List
    * returns Folders sorted based upon the (ascending) lexical ordering of their display_name. The caller must have `resourcemanager.folders.list` permission on the identified parent.
    */
  def list(): Request[ListFoldersResponse] = js.native
  def list(request: Key): Request[ListFoldersResponse] = js.native
  
  def move(request: Callback, body: MoveFolderRequest): Request[Operation] = js.native
  /**
    * Moves a Folder under a new resource parent. Returns an Operation which can be used to track the progress of the folder move workflow. Upon success the Operation.response field will
    * be populated with the moved Folder. Upon failure, a FolderOperationError categorizing the failure cause will be returned - if the failure occurs synchronously then the
    * FolderOperationError will be returned via the Status.details field and if it occurs asynchronously then the FolderOperation will be returned via the Operation.error field. In
    * addition, the Operation.metadata field will be populated with a FolderOperation message as an aid to stateless clients. Folder moves will be rejected if they violate either the
    * naming, height or fanout constraints described in the CreateFolder documentation. The caller must have `resourcemanager.folders.move` permission on the folder's current and proposed
    * new parent.
    */
  def move(request: Name): Request[Operation] = js.native
  
  /**
    * Updates a Folder, changing its display_name. Changes to the folder display_name will be rejected if they violate either the display_name formatting rules or naming constraints
    * described in the CreateFolder documentation. The Folder's display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and
    * can be between 3 and 30 characters. This is captured by the regular expression: `\p{L}\p{N}{1,28}[\p{L}\p{N}]`. The caller must have `resourcemanager.folders.update` permission on
    * the identified folder. If the update fails due to the unique name constraint then a PreconditionFailure explaining this violation will be returned in the Status.details field.
    */
  def patch(request: Oauthtoken): Request[Folder] = js.native
  def patch(request: PrettyPrint, body: Folder): Request[Folder] = js.native
  
  /**
    * Search for folders that match specific filter criteria. Search provides an eventually consistent view of the folders a user has access to which meet the specified filter criteria.
    * This will only return folders on which the caller has the permission `resourcemanager.folders.get`.
    */
  def search(request: QuotaUser): Request[SearchFoldersResponse] = js.native
  def search(request: UploadType, body: SearchFoldersRequest): Request[SearchFoldersResponse] = js.native
  
  /**
    * Sets the access control policy on a Folder, replacing any existing policy. The `resource` field should be the Folder's resource name, e.g. "folders/1234". The caller must have
    * `resourcemanager.folders.setIamPolicy` permission on the identified folder.
    */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified Folder. The `resource` field should be the Folder's resource name, e.g. "folders/1234". There are no permissions required for
    * making this API call.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def undelete(request: Callback, body: UndeleteFolderRequest): Request[Folder] = js.native
  /**
    * Cancels the deletion request for a Folder. This method may only be called on a Folder in the DELETE_REQUESTED state. In order to succeed, the Folder's parent must be in the ACTIVE
    * state. In addition, reintroducing the folder into the tree must not violate folder naming, height and fanout constraints described in the CreateFolder documentation. The caller must
    * have `resourcemanager.folders.undelete` permission on the identified folder.
    */
  def undelete(request: Resource): Request[Folder] = js.native
}
