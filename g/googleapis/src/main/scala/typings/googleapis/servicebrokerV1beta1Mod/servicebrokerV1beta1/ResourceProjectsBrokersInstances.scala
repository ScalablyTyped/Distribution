package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$Instances")
@js.native
class ResourceProjectsBrokersInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var bindings: ResourceProjectsBrokersInstancesBindings = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.instances.get
    * @desc Gets the given service instance from the system. The API call
    * accepts both OSB style API and standard google style API resource path.
    * i.e. both `projects/x/brokers/x/instances/x`  and
    * `projects/x/brokers/x/v2/service_instances/x` are acceptable paths.
    * @alias servicebroker.projects.brokers.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the instance to return. Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` + `v2/service_instances/[INSTANCE_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] = js.native
  def get(params: ParamsResourceProjectsBrokersInstancesGet): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersInstancesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.instances.getLast_operation
    * @desc Returns the state of the last operation for the service instance.
    * Only last (or current) operation can be polled.
    * @alias servicebroker.projects.brokers.instances.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/`+    `service_instances/[INSTANCE_ID]`.
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
  def getLast_operation(params: ParamsResourceProjectsBrokersInstancesGetlastOperation): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesGetlastOperation,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesGetlastOperation,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  def getLast_operation(params: ParamsResourceProjectsBrokersInstancesGetlastOperation, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Operation] = js.native
  def getLast_operation(
    params: ParamsResourceProjectsBrokersInstancesGetlastOperation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Operation]
  ): Unit = js.native
  
  /**
    * servicebroker.projects.brokers.instances.list
    * @desc Lists all the instances in the brokers This API is an extension and
    * not part of the OSB spec. Hence the path is a standard Google API URL.
    * @alias servicebroker.projects.brokers.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. Acceptable values are 0 to 200, inclusive. (Default: 100)
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListServiceInstancesResponse]
  ): Unit = js.native
}
