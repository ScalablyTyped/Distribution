package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Service_instances$Service_bindings")
@js.native
class ResourceProjectsBrokersV2ServiceInstancesServiceBindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @desc CreateBinding generates a service binding to an existing service
    * instance. See ProviServiceInstance for async operation details.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.binding_id The id of the binding. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.parent The GCP container. Must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]`.
    * @param {().GoogleCloudServicebrokerV1beta1__Binding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse] = js.native
  def create(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse] = js.native
  def create(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @desc Unbinds from a service instance. For synchronous/asynchronous
    * request details see CreateServiceInstance method. If binding does not
    * exist HTTP 410 status will be returned.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` `v2/service_instances/[INSTANCE_ID]/service_bindings/[BINDING_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` `/instances/[INSTANCE_ID]/bindings/[BINDING_ID]`.
    * @param {string=} params.planId The plan id of the service instance.
    * @param {string=} params.serviceId Additional query parameter hints. The service id of the service instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse] = js.native
  def delete(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1DeleteBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @desc GetBinding returns the binding information.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]/service_bindings`.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse] = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse] = js.native
  def get(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1GetBindingResponse]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @desc Returns the state of the last operation for the binding. Only last
    * (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]/service_binding/[BINDING_ID]`.
    * @param {string=} params.operation If `operation` was returned during mutation operation, this field must be populated with the provided value.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLast_operation(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]): Unit = js.native
  def getLast_operation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsGetlastOperation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
}
