package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$V2$Service_instances")
@js.native
class ResourceProjectsBrokersV2ServiceInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var service_bindings: ResourceProjectsBrokersV2ServiceInstancesServiceBindings = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.create
    * @desc Provisions a service instance. If `request.accepts_incomplete` is
    * false and Broker cannot execute request synchronously HTTP 422 error will
    * be returned along with FAILED_PRECONDITION status. If
    * `request.accepts_incomplete` is true and the Broker decides to execute
    * resource asynchronously then HTTP 202 response code will be returned and
    * a valid polling operation in the response will be included. If Broker
    * executes the request synchronously and it succeeds HTTP 201 response will
    * be furnished. If identical instance exists, then HTTP 200 response will
    * be returned. If an instance with identical ID but mismatching parameters
    * exists, then HTTP 409 status code will be returned.
    * @alias servicebroker.projects.brokers.v2.service_instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete Value indicating that API client supports asynchronous operations. If Broker cannot execute the request synchronously HTTP 422 code will be returned to HTTP clients along with FAILED_PRECONDITION error. If true and broker will execute request asynchronously 202 HTTP code will be returned. This broker always requires this to be true as all mutator operations are asynchronous.
    * @param {string} params.instance_id The id of the service instance. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {().GoogleCloudServicebrokerV1alpha1__ServiceInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse] = js.native
  def create(
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse] = js.native
  def create(params: ParamsResourceProjectsBrokersV2ServiceInstancesCreate): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesCreate,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsBrokersV2ServiceInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1CreateServiceInstanceResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.delete
    * @desc Deprovisions a service instance. For synchronous/asynchronous
    * request details see CreateServiceInstance method. If service instance
    * does not exist HTTP 410 status will be returned.
    * @alias servicebroker.projects.brokers.v2.service_instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.instanceId The instance id to deprovision.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {string=} params.planId The plan id of the service instance.
    * @param {string=} params.serviceId The service id of the service instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse] = js.native
  def delete(
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse] = js.native
  def delete(params: ParamsResourceProjectsBrokersV2ServiceInstancesDelete): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesDelete,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesDelete,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsBrokersV2ServiceInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1DeleteServiceInstanceResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.get
    * @desc Gets the given service instance from the system. This API is an
    * extension and not part of the OSB spec. Hence the path is a standard
    * Google API URL.
    * @alias servicebroker.projects.brokers.v2.service_instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the instance to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesGet): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGet,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.getLast_operation
    * @desc Returns the state of the last operation for the service instance.
    * Only last (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceId The instance id for which to return the last operation status.
    * @param {string=} params.operation If `operation` was returned during mutation operation, this field must be populated with the provided value.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLast_operation(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]): Unit = js.native
  def getLast_operation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersV2ServiceInstancesGetlastOperation): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGetlastOperation,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGetlastOperation,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersV2ServiceInstancesGetlastOperation, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesGetlastOperation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.patch
    * @desc Updates an existing service instance. See CreateServiceInstance for
    * possible response codes.
    * @alias servicebroker.projects.brokers.v2.service_instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.instance_id The id of the service instance. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {().GoogleCloudServicebrokerV1alpha1__ServiceInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse] = js.native
  def patch(
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse] = js.native
  def patch(params: ParamsResourceProjectsBrokersV2ServiceInstancesPatch): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse] = js.native
  def patch(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesPatch,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsBrokersV2ServiceInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse] = js.native
  def patch(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse]
  ): Unit = js.native
}

