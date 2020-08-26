package typings.googleapis.scriptV1Mod.scriptV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Versions")
@js.native
class ResourceProjectsVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.projects.versions.create
    * @desc Creates a new immutable version using the current code, with a
    * unique version number.
    * @alias script.projects.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaVersion] = js.native
  def create(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceProjectsVersionsCreate): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceProjectsVersionsCreate, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(
    params: ParamsResourceProjectsVersionsCreate,
    options: BodyResponseCallback[SchemaVersion],
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(
    params: ParamsResourceProjectsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * script.projects.versions.get
    * @desc Gets a version of a script project.
    * @alias script.projects.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {integer} params.versionNumber The version number.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceProjectsVersionsGet): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceProjectsVersionsGet, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(
    params: ParamsResourceProjectsVersionsGet,
    options: BodyResponseCallback[SchemaVersion],
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceProjectsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * script.projects.versions.list
    * @desc List the versions of a script project.
    * @alias script.projects.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of versions on each returned page. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    options: BodyResponseCallback[SchemaListVersionsResponse],
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
}

