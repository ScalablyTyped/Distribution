package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects$Releases")
@js.native
class ResourceProjectsReleases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * firebaserules.projects.releases.create
    * @desc Create a `Release`.  Release names should reflect the developer's
    * deployment practices. For example, the release name may include the
    * environment name, application name, application version, or any other
    * name meaningful to the developer. Once a `Release` refers to a `Ruleset`,
    * the rules can be enforced by Firebase Rules-enabled services.  More than
    * one `Release` may be 'live' concurrently. Consider the following three
    * `Release` names for `projects/foo` and the `Ruleset` to which they refer.
    * Release Name                    | Ruleset Name
    * --------------------------------|------------- projects/foo/releases/prod
    * | projects/foo/rulesets/uuid123 projects/foo/releases/prod/beta |
    * projects/foo/rulesets/uuid123 projects/foo/releases/prod/v23  |
    * projects/foo/rulesets/uuid456  The table reflects the `Ruleset` rollout
    * in progress. The `prod` and `prod/beta` releases refer to the same
    * `Ruleset`. However, `prod/v23` refers to a new `Ruleset`. The `Ruleset`
    * reference for a `Release` may be updated using the UpdateRelease method.
    * @alias firebaserules.projects.releases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the project which owns this `Release`.  Format: `projects/{project_id}`
    * @param {().Release} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaRelease] = js.native
  def create(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(params: ParamsResourceProjectsReleasesCreate): GaxiosPromise[SchemaRelease] = js.native
  def create(params: ParamsResourceProjectsReleasesCreate, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def create(
    params: ParamsResourceProjectsReleasesCreate,
    options: BodyResponseCallback[SchemaRelease],
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsReleasesCreate, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(
    params: ParamsResourceProjectsReleasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  
  /**
    * firebaserules.projects.releases.delete
    * @desc Delete a `Release` by resource name.
    * @alias firebaserules.projects.releases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the `Release` to delete.  Format: `projects/{project_id}/releases/{release_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsReleasesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsReleasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * firebaserules.projects.releases.get
    * @desc Get a `Release` by name.
    * @alias firebaserules.projects.releases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the `Release`.  Format: `projects/{project_id}/releases/{release_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRelease] = js.native
  def get(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(params: ParamsResourceProjectsReleasesGet): GaxiosPromise[SchemaRelease] = js.native
  def get(params: ParamsResourceProjectsReleasesGet, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def get(
    params: ParamsResourceProjectsReleasesGet,
    options: BodyResponseCallback[SchemaRelease],
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsReleasesGet, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(
    params: ParamsResourceProjectsReleasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  
  /**
    * firebaserules.projects.releases.getExecutable
    * @desc Get the `Release` executable to use when enforcing rules.
    * @alias firebaserules.projects.releases.getExecutable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.executableVersion The requested runtime executable version. Defaults to FIREBASE_RULES_EXECUTABLE_V1.
    * @param {string} params.name Resource name of the `Release`.  Format: `projects/{project_id}/releases/{release_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getExecutable(): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]): Unit = js.native
  def getExecutable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(params: ParamsResourceProjectsReleasesGetexecutable): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    options: BodyResponseCallback[SchemaGetReleaseExecutableResponse],
    callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  def getExecutable(params: ParamsResourceProjectsReleasesGetexecutable, options: MethodOptions): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  
  /**
    * firebaserules.projects.releases.list
    * @desc List the `Release` values for a project. This list may optionally
    * be filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any
    * combination thereof.
    * @alias firebaserules.projects.releases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter `Release` filter. The list method supports filters with restrictions on the `Release.name`, `Release.ruleset_name`, and `Release.test_suite_name`.  Example 1: A filter of 'name=prod*' might return `Release`s with names within 'projects/foo' prefixed with 'prod':  Name                          | Ruleset Name ------------------------------|------------- projects/foo/releases/prod    | projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v1 | projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v2 | projects/foo/rulesets/uuid8888  Example 2: A filter of `name=prod* ruleset_name=uuid1234` would return only `Release` instances for 'projects/foo' with names prefixed with 'prod' referring to the same `Ruleset` name of 'uuid1234':  Name                          | Ruleset Name ------------------------------|------------- projects/foo/releases/prod    | projects/foo/rulesets/1234 projects/foo/releases/prod/v1 | projects/foo/rulesets/1234  In the examples, the filter parameters refer to the search filters are relative to the project. Fully qualified prefixed may also be used. e.g. `test_suite_name=projects/foo/testsuites/uuid1`
    * @param {string} params.name Resource name for the project.  Format: `projects/{project_id}`
    * @param {integer=} params.pageSize Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load fewer than `page_size` results due to the size of the output. To traverse all of the releases, the caller should iterate until the `page_token` on the response is empty.
    * @param {string=} params.pageToken Next page token for the next batch of `Release` instances.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReleasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(params: ParamsResourceProjectsReleasesList): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    options: BodyResponseCallback[SchemaListReleasesResponse],
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsReleasesList, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  
  /**
    * firebaserules.projects.releases.patch
    * @desc Update a `Release` via PATCH.  Only updates to the `ruleset_name`
    * and `test_suite_name` fields will be honored. `Release` rename is not
    * supported. To create a `Release` use the CreateRelease method.
    * @alias firebaserules.projects.releases.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the project which owns this `Release`.  Format: `projects/{project_id}`
    * @param {().UpdateReleaseRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRelease] = js.native
  def patch(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch): GaxiosPromise[SchemaRelease] = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsReleasesPatch,
    options: BodyResponseCallback[SchemaRelease],
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def patch(
    params: ParamsResourceProjectsReleasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
}
