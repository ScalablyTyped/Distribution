package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Callback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Key
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.PageSize
import typings.maximMazurokGapiClientCloudresourcemanager.anon.QuotaUser
import typings.maximMazurokGapiClientCloudresourcemanager.anon.UpdateMask
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Uploadprotocol
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  def create(request: Callback, body: Project): Request[Operation] = js.native
  /**
    * Request that a new project be created. The result is an `Operation` which can be used to track the creation process. This process usually takes a few seconds, but can sometimes take
    * much longer. The tracking `Operation` is automatically deleted after a few hours, so there is no need to call `DeleteOperation`.
    */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  
  /**
    * Marks the project identified by the specified `name` (for example, `projects/415104041262`) for deletion. This method will only affect the project if it has a lifecycle state of
    * ACTIVE. This method changes the Project's lifecycle state from ACTIVE to DELETE_REQUESTED. The deletion starts at an unspecified time, at which point the Project is no longer
    * accessible. Until the deletion completes, you can check the lifecycle state checked by retrieving the project with GetProject, and the project remains visible to ListProjects.
    * However, you cannot update the project. After the deletion completes, the project is not retrievable by the GetProject, ListProjects, and SearchProjects methods. This method behaves
    * idempotently, such that deleting a `DELETE_REQUESTED` project will not cause an error, but also won't do anything. The caller must have `resourcemanager.projects.delete` permissions
    * for this project.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /** Retrieves the project identified by the specified `name` (for example, `projects/415104041262`). The caller must have `resourcemanager.projects.get` permission for this project. */
  def get(): Request[Project] = js.native
  def get(request: Fields): Request[Project] = js.native
  
  /**
    * Returns the IAM access control policy for the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123. Permission is denied if the policy or the resource
    * do not exist.
    */
  def getIamPolicy(request: Key, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Lists projects that are direct children of the specified folder or organization resource. `list()` provides a strongly consistent view of the projects underneath the specified
    * parent resource. `list()` returns projects sorted based upon the (ascending) lexical ordering of their `display_name`. The caller must have `resourcemanager.projects.list`
    * permission on the identified parent.
    */
  def list(): Request[ListProjectsResponse] = js.native
  def list(request: Oauthtoken): Request[ListProjectsResponse] = js.native
  
  def move(request: Fields, body: MoveProjectRequest): Request[Operation] = js.native
  /**
    * Move a project to another place in your resource hierarchy, under a new resource parent. Returns an operation which can be used to track the process of the project move workflow.
    * Upon success, the `Operation.response` field will be populated with the moved project. The caller must have `resourcemanager.projects.move` permission on the project, on the
    * project's current and proposed new parent. If project has no current parent, or it currently does not have an associated organization resource, you will also need the
    * `resourcemanager.projects.setIamPolicy` permission in the project.
    */
  def move(request: Xgafv): Request[Operation] = js.native
  
  def patch(request: QuotaUser, body: Project): Request[Operation] = js.native
  /**
    * Updates the `display_name` and labels of the project identified by the specified `name` (for example, `projects/415104041262`). Deleting all labels requires an update mask for
    * labels field. The caller must have `resourcemanager.projects.update` permission for this project.
    */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  /**
    * Search for projects that the caller has both `resourcemanager.projects.get` permission on, and also satisfy the specified query. This method returns projects in an unspecified
    * order. This method is eventually consistent with project mutations; this means that a newly created project may not appear in the results or recent updates to an existing project
    * may not be reflected in the results. To retrieve the latest state of a project, use the GetProject method.
    */
  def search(): Request[SearchProjectsResponse] = js.native
  def search(request: PageSize): Request[SearchProjectsResponse] = js.native
  
  /**
    * Sets the IAM access control policy for the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123. CAUTION: This method will replace the existing policy,
    * and cannot be used to append additional IAM settings. Note: Removing service accounts from policies or changing their roles can render services completely inoperable. It is
    * important to understand how the service account is being used before removing or updating its roles. The following constraints apply when using `setIamPolicy()`: + Project does not
    * support `allUsers` and `allAuthenticatedUsers` as `members` in a `Binding` of a `Policy`. + The owner role can be granted to a `user`, `serviceAccount`, or a group that is part of
    * an organization. For example, group@myownpersonaldomain.com could be added as an owner to a project in the myownpersonaldomain.com organization, but not the examplepetstore.com
    * organization. + Service accounts can be made owners of a project directly without any restrictions. However, to be added as an owner, a user must be invited using the Cloud Platform
    * console and must accept the invitation. + A user cannot be granted the owner role using `setIamPolicy()`. The user must be granted the owner role using the Cloud Platform Console
    * and must explicitly accept the invitation. + Invitations to grant the owner role cannot be sent using `setIamPolicy()`; they must be sent only using the Cloud Platform Console. + If
    * the project is not part of an organization, there must be at least one owner who has accepted the Terms of Service (ToS) agreement in the policy. Calling `setIamPolicy()` to remove
    * the last ToS-accepted owner from the policy will fail. This restriction also applies to legacy projects that no longer have owners who have accepted the ToS. Edits to IAM policies
    * will be rejected until the lack of a ToS-accepting owner is rectified. If the project is part of an organization, you can remove all owners, potentially making the organization
    * inaccessible. + Calling this method requires enabling the App Engine Admin API.
    */
  def setIamPolicy(request: Key, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123.. */
  def testIamPermissions(request: Key, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /**
    * Restores the project identified by the specified `name` (for example, `projects/415104041262`). You can only use this method for a project that has a lifecycle state of
    * DELETE_REQUESTED. After deletion starts, the project cannot be restored. The caller must have `resourcemanager.projects.undelete` permission for this project.
    */
  def undelete(request: AccesstokenAlt): Request[Operation] = js.native
  def undelete(request: Fields, body: UndeleteProjectRequest): Request[Operation] = js.native
}
