package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Service_instances")
@js.native
class ResourceProjectsBrokersServiceInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.service_instances.list
    * @desc Lists all the instances in the brokers This API is an extension and
    * not part of the OSB spec. Hence the path is a standard Google API URL.
    * @alias servicebroker.projects.brokers.service_instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsBrokersServiceInstancesList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersServiceInstancesList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersServiceInstancesList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersServiceInstancesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersServiceInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListServiceInstancesResponse]
  ): Unit = js.native
}

