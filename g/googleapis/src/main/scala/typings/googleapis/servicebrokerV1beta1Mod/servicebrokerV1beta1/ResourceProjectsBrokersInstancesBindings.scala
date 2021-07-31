package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$Instances$Bindings")
@js.native
class ResourceProjectsBrokersInstancesBindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.instances.bindings.getLast_operation
    * @desc Returns the state of the last operation for the binding. Only last
    * (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.instances.bindings.getLast_operation
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
  def getLast_operation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersInstancesBindingsGetlastOperation): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesBindingsGetlastOperation,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesBindingsGetlastOperation,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersInstancesBindingsGetlastOperation, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesBindingsGetlastOperation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.instances.bindings.list
    * @desc Lists all the bindings in the instance.
    * @alias servicebroker.projects.brokers.instances.bindings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. Acceptable values are 0 to 200, inclusive. (Default: 100)
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` + `v2/service_instances/[INSTANCE_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse] = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesBindingsList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesBindingsList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesBindingsList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesBindingsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesBindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBindingsResponse]
  ): Unit = js.native
}
