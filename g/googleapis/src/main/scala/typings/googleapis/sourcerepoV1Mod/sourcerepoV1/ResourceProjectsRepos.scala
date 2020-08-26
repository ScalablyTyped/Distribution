package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Resource$Projects$Repos")
@js.native
class ResourceProjectsRepos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sourcerepo.projects.repos.create
    * @desc Creates a repo in the given project with the given name.  If the
    * named repository already exists, `CreateRepo` returns `ALREADY_EXISTS`.
    * @alias sourcerepo.projects.repos.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create the repo. Values are of the form `projects/<project>`.
    * @param {().Repo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaRepo] = js.native
  def create(callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def create(params: ParamsResourceProjectsReposCreate): GaxiosPromise[SchemaRepo] = js.native
  def create(params: ParamsResourceProjectsReposCreate, callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def create(
    params: ParamsResourceProjectsReposCreate,
    options: BodyResponseCallback[SchemaRepo],
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsReposCreate, options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def create(
    params: ParamsResourceProjectsReposCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.delete
    * @desc Deletes a repo.
    * @alias sourcerepo.projects.repos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the repo to delete. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReposDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReposDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsReposDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsReposDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsReposDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.get
    * @desc Returns information about a repo.
    * @alias sourcerepo.projects.repos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested repository. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRepo] = js.native
  def get(callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def get(params: ParamsResourceProjectsReposGet): GaxiosPromise[SchemaRepo] = js.native
  def get(params: ParamsResourceProjectsReposGet, callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def get(
    params: ParamsResourceProjectsReposGet,
    options: BodyResponseCallback[SchemaRepo],
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsReposGet, options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def get(
    params: ParamsResourceProjectsReposGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias sourcerepo.projects.repos.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsReposGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsReposGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsReposGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsReposGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsReposGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.list
    * @desc Returns all repos belonging to a project. The sizes of the repos
    * are not set by ListRepos.  To get the size of a repo, use GetRepo.
    * @alias sourcerepo.projects.repos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project ID whose repos should be listed. Values are of the form `projects/<project>`.
    * @param {integer=} params.pageSize Maximum number of repositories to return; between 1 and 500. If not set or zero, defaults to 100 at the server.
    * @param {string=} params.pageToken Resume listing repositories where a prior ListReposResponse left off. This is an opaque token that must be obtained from a recent, prior ListReposResponse's next_page_token field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListReposResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReposResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListReposResponse] = js.native
  def list(params: ParamsResourceProjectsReposList): GaxiosPromise[SchemaListReposResponse] = js.native
  def list(params: ParamsResourceProjectsReposList, callback: BodyResponseCallback[SchemaListReposResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsReposList,
    options: BodyResponseCallback[SchemaListReposResponse],
    callback: BodyResponseCallback[SchemaListReposResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsReposList, options: MethodOptions): GaxiosPromise[SchemaListReposResponse] = js.native
  def list(
    params: ParamsResourceProjectsReposList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReposResponse]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.patch
    * @desc Updates information about a repo.
    * @alias sourcerepo.projects.repos.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested repository. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {().UpdateRepoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRepo] = js.native
  def patch(callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def patch(params: ParamsResourceProjectsReposPatch): GaxiosPromise[SchemaRepo] = js.native
  def patch(params: ParamsResourceProjectsReposPatch, callback: BodyResponseCallback[SchemaRepo]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsReposPatch,
    options: BodyResponseCallback[SchemaRepo],
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsReposPatch, options: MethodOptions): GaxiosPromise[SchemaRepo] = js.native
  def patch(
    params: ParamsResourceProjectsReposPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias sourcerepo.projects.repos.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsReposSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsReposSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsReposSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsReposSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsReposSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    * @alias sourcerepo.projects.repos.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsReposTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsReposTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsReposTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsReposTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsReposTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}

