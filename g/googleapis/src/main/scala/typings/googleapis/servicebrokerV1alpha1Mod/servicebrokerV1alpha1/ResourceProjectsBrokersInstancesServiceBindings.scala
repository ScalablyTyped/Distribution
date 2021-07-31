package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Instances$Service_bindings")
@js.native
class ResourceProjectsBrokersInstancesServiceBindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.instances.service_bindings.list
    * @desc Lists all the bindings in the instance
    * @alias servicebroker.projects.brokers.instances.service_bindings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse] = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesServiceBindingsList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesServiceBindingsList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesServiceBindingsList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersInstancesServiceBindingsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersInstancesServiceBindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]
  ): Unit = js.native
}
