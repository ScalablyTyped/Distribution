package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import typings.maximMazurokGapiClientArtifactregistry.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientArtifactregistry.anon.PageToken
import typings.maximMazurokGapiClientArtifactregistry.anon.Parent
import typings.maximMazurokGapiClientArtifactregistry.anon.QuotaUser
import typings.maximMazurokGapiClientArtifactregistry.anon.Resource
import typings.maximMazurokGapiClientArtifactregistry.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoriesResource extends js.Object {
  
  /** Creates a repository. The returned Operation will finish once the repository has been created. Its response will be the created Repository. */
  def create(request: Parent): Request[Operation] = js.native
  def create(request: QuotaUser, body: Repository): Request[Operation] = js.native
  
  /**
    * Deletes a repository and all of its contents. The returned Operation will finish once the repository has been deleted. It will not have any Operation metadata and will return a
    * google.protobuf.Empty response.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  var files: FilesResource = js.native
  
  /** Gets a repository. */
  def get(): Request[Repository] = js.native
  def get(request: Accesstoken): Request[Repository] = js.native
  
  /** Gets the IAM policy for a given resource. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists repositories. */
  def list(): Request[ListRepositoriesResponse] = js.native
  def list(request: PageToken): Request[ListRepositoriesResponse] = js.native
  
  var packages: PackagesResource = js.native
  
  def patch(request: Oauthtoken, body: Repository): Request[Repository] = js.native
  /** Updates a repository. */
  def patch(request: Resource): Request[Repository] = js.native
  
  /** Updates the IAM policy for a given resource. */
  def setIamPolicy(request: UploadType, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Tests if the caller has a list of permissions on a resource. */
  def testIamPermissions(request: UploadType, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
