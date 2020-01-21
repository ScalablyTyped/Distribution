package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers")
@js.native
class ResourceProjectsBrokers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var instances: ResourceProjectsBrokersInstances = js.native
  var v2: ResourceProjectsBrokersV2 = js.native
  /**
    * servicebroker.projects.brokers.create
    * @desc CreateBroker creates a Broker.
    * @alias servicebroker.projects.brokers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create broker.
    * @param {().GoogleCloudServicebrokerV1beta1__Broker} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Broker] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Broker]): Unit = js.native
  def create(params: ParamsResourceProjectsBrokersCreate): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Broker] = js.native
  def create(
    params: ParamsResourceProjectsBrokersCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Broker]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrokersCreate,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Broker],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Broker]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsBrokersCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1Broker] = js.native
  def create(
    params: ParamsResourceProjectsBrokersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1Broker]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.delete
    * @desc DeleteBroker deletes a Broker.
    * @alias servicebroker.projects.brokers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The broker to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsBrokersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrokersDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsBrokersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsBrokersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.list
    * @desc ListBrokers lists brokers.
    * @alias servicebroker.projects.brokers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. Acceptable values are 0 to 200, inclusive. (Default: 100)
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  ): Unit = js.native
}

