package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Templates")
@js.native
class ResourceProjectsLocationsTemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dataflow.projects.locations.templates.create
    * @desc Creates a Cloud Dataflow job from a template.
    * @alias dataflow.projects.locations.templates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {().CreateJobFromTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTemplatesCreate,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  
  /**
    * dataflow.projects.locations.templates.get
    * @desc Get the template associated with a template.
    * @alias dataflow.projects.locations.templates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.gcsPath Required. A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.view The view to retrieve. Defaults to METADATA_ONLY.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGetTemplateResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(params: ParamsResourceProjectsLocationsTemplatesGet): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    callback: BodyResponseCallback[SchemaGetTemplateResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    options: BodyResponseCallback[SchemaGetTemplateResponse],
    callback: BodyResponseCallback[SchemaGetTemplateResponse]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTemplatesGet, options: MethodOptions): GaxiosPromise[SchemaGetTemplateResponse] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetTemplateResponse]
  ): Unit = js.native
  
  /**
    * dataflow.projects.locations.templates.launch
    * @desc Launch a template.
    * @alias dataflow.projects.locations.templates.launch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dynamicTemplate.gcsPath Path to dynamic template spec file on GCS. The file must be a Json serialized DynamicTemplateFieSpec object.
    * @param {string=} params.dynamicTemplate.stagingLocation Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`.
    * @param {string=} params.gcsPath A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {boolean=} params.validateOnly If true, the request is validated but not actually executed. Defaults to false.
    * @param {().LaunchTemplateParameters} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def launch(): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(callback: BodyResponseCallback[SchemaLaunchTemplateResponse]): Unit = js.native
  def launch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(params: ParamsResourceProjectsLocationsTemplatesLaunch): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    callback: BodyResponseCallback[SchemaLaunchTemplateResponse]
  ): Unit = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    options: BodyResponseCallback[SchemaLaunchTemplateResponse],
    callback: BodyResponseCallback[SchemaLaunchTemplateResponse]
  ): Unit = js.native
  def launch(params: ParamsResourceProjectsLocationsTemplatesLaunch, options: MethodOptions): GaxiosPromise[SchemaLaunchTemplateResponse] = js.native
  def launch(
    params: ParamsResourceProjectsLocationsTemplatesLaunch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLaunchTemplateResponse]
  ): Unit = js.native
}
