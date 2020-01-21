package typings.googleapis.scriptV1Mod.scriptV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var deployments: ResourceProjectsDeployments = js.native
  var versions: ResourceProjectsVersions = js.native
  /**
    * script.projects.create
    * @desc Creates a new, empty script project with no script files and a base
    * manifest file.
    * @alias script.projects.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaProject] = js.native
  def create(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def create(params: ParamsResourceProjectsCreate): GaxiosPromise[SchemaProject] = js.native
  def create(params: ParamsResourceProjectsCreate, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def create(
    params: ParamsResourceProjectsCreate,
    options: BodyResponseCallback[SchemaProject],
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsCreate, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def create(
    params: ParamsResourceProjectsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  /**
    * script.projects.get
    * @desc Gets a script project's metadata.
    * @alias script.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProject] = js.native
  def get(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(params: ParamsResourceProjectsGet): GaxiosPromise[SchemaProject] = js.native
  def get(params: ParamsResourceProjectsGet, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: BodyResponseCallback[SchemaProject],
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGet, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  /**
    * script.projects.getContent
    * @desc Gets the content of the script project, including the code source
    * and metadata for each script file.
    * @alias script.projects.getContent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {integer=} params.versionNumber The version number of the project to retrieve. If not provided, the project's HEAD version is returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getContent(): GaxiosPromise[SchemaContent] = js.native
  def getContent(callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def getContent(params: ParamsResourceProjectsGetcontent): GaxiosPromise[SchemaContent] = js.native
  def getContent(params: ParamsResourceProjectsGetcontent, callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def getContent(
    params: ParamsResourceProjectsGetcontent,
    options: BodyResponseCallback[SchemaContent],
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
  def getContent(params: ParamsResourceProjectsGetcontent, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def getContent(
    params: ParamsResourceProjectsGetcontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
  /**
    * script.projects.getMetrics
    * @desc Get metrics data for scripts, such as number of executions and
    * active users.
    * @alias script.projects.getMetrics
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.metricsFilter.deploymentId Optional field indicating a specific deployment to retrieve metrics from.
    * @param {string=} params.metricsGranularity Required field indicating what granularity of metrics are returned.
    * @param {string} params.scriptId Required field indicating the script to get metrics for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetrics(): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(callback: BodyResponseCallback[SchemaMetrics]): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics, callback: BodyResponseCallback[SchemaMetrics]): Unit = js.native
  def getMetrics(
    params: ParamsResourceProjectsGetmetrics,
    options: BodyResponseCallback[SchemaMetrics],
    callback: BodyResponseCallback[SchemaMetrics]
  ): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics, options: MethodOptions): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetrics]
  ): Unit = js.native
  /**
    * script.projects.updateContent
    * @desc Updates the content of the specified script project. This content
    * is stored as the HEAD version, and is used when the script is executed as
    * a trigger, in the script editor, in add-on preview mode, or as a web app
    * or Apps Script API in development mode. This clears all the existing
    * files in the project.
    * @alias script.projects.updateContent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().Content} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateContent(): GaxiosPromise[SchemaContent] = js.native
  def updateContent(callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent): GaxiosPromise[SchemaContent] = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent, callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def updateContent(
    params: ParamsResourceProjectsUpdatecontent,
    options: BodyResponseCallback[SchemaContent],
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def updateContent(
    params: ParamsResourceProjectsUpdatecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
}

