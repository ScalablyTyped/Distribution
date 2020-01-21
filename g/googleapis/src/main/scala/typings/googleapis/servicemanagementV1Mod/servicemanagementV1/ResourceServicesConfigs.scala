package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services$Configs")
@js.native
class ResourceServicesConfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicemanagement.services.configs.create
    * @desc Creates a new service configuration (version) for a managed
    * service. This method only stores the service configuration. To roll out
    * the service configuration to backend systems please call
    * CreateServiceRollout.  Only the 100 most recent service configurations
    * and ones referenced by existing rollouts are kept for each service. The
    * rest will be deleted eventually.
    * @alias servicemanagement.services.configs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaService] = js.native
  def create(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(params: ParamsResourceServicesConfigsCreate): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceServicesConfigsCreate, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(
    params: ParamsResourceServicesConfigsCreate,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def create(params: ParamsResourceServicesConfigsCreate, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(
    params: ParamsResourceServicesConfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.get
    * @desc Gets a service configuration (version) for a managed service.
    * @alias servicemanagement.services.configs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.configId The id of the service configuration resource.  This field must be specified for the server to return all fields, including `SourceInfo`.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {string=} params.view Specifies which parts of the Service Config should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: ParamsResourceServicesConfigsGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceServicesConfigsGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceServicesConfigsGet,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConfigsGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceServicesConfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.list
    * @desc Lists the history of the service configuration for a managed
    * service, from the newest to the oldest.
    * @alias servicemanagement.services.configs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    * @param {string=} params.pageToken The token of the page to retrieve.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceConfigsResponse]): Unit = js.native
  def list(params: ParamsResourceServicesConfigsList): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    callback: BodyResponseCallback[SchemaListServiceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    options: BodyResponseCallback[SchemaListServiceConfigsResponse],
    callback: BodyResponseCallback[SchemaListServiceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConfigsList, options: MethodOptions): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceConfigsResponse]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.submit
    * @desc Creates a new service configuration (version) for a managed service
    * based on user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as
    * the generated service configuration. To rollout the service configuration
    * to other services, please call CreateServiceRollout.  Only the 100 most
    * recent configuration sources and ones referenced by existing service
    * configurtions are kept for each service. The rest will be deleted
    * eventually.  Operation<response: SubmitConfigSourceResponse>
    * @alias servicemanagement.services.configs.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {().SubmitConfigSourceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[SchemaOperation] = js.native
  def submit(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit): GaxiosPromise[SchemaOperation] = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def submit(
    params: ParamsResourceServicesConfigsSubmit,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def submit(
    params: ParamsResourceServicesConfigsSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

