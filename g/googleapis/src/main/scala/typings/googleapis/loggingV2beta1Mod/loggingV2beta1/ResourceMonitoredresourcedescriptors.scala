package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2beta1", "logging_v2beta1.Resource$Monitoredresourcedescriptors")
@js.native
class ResourceMonitoredresourcedescriptors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.monitoredResourceDescriptors.list
    * @desc Lists the descriptors for monitored resource types used by Logging.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var resourceDescriptorsPage = response['resourceDescriptors'];
    *     if (!resourceDescriptorsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < resourceDescriptorsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `resourceDescriptorsPage`:
    *       console.log(JSON.stringify(resourceDescriptorsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       logging.monitoredResourceDescriptors.list(request, handlePage);
    *     }
    *   };
    *
    *   logging.monitoredResourceDescriptors.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias logging.monitoredResourceDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(params: ParamsResourceMonitoredresourcedescriptorsList): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    options: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse],
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMonitoredresourcedescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
}

