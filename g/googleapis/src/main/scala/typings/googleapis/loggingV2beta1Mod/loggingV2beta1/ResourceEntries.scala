package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2beta1", "logging_v2beta1.Resource$Entries")
@js.native
class ResourceEntries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.entries.list
    * @desc Lists log entries. Use this method to retrieve log entries that
    * originated from a project/folder/organization/billing account. For ways
    * to export log entries, see Exporting Logs.
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var entriesPage = response['entries'];
    *     if (!entriesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < entriesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `entriesPage`: console.log(JSON.stringify(entriesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.resource.pageToken = response.nextPageToken;
    *       logging.entries.list(request, handlePage);
    *     }
    *   };
    *
    *   logging.entries.list(request, handlePage);
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
    * @alias logging.entries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ListLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(params: ParamsResourceEntriesList): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(params: ParamsResourceEntriesList, callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: BodyResponseCallback[SchemaListLogEntriesResponse],
    callback: BodyResponseCallback[SchemaListLogEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEntriesList, options: MethodOptions): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogEntriesResponse]
  ): Unit = js.native
  /**
    * logging.entries.write
    * @desc Writes log entries to Logging. This API method is the only way to
    * send log entries to Logging. This method is used, directly or indirectly,
    * by the Logging agent (fluentd) and all logging libraries configured to
    * use Logging. A single request may contain log entries for a maximum of
    * 1000 different resources (projects, organizations, billing accounts or
    * folders)
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   logging.entries.write(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
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
    * @alias logging.entries.write
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().WriteLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def write(): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(params: ParamsResourceEntriesWrite): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(params: ParamsResourceEntriesWrite, callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: BodyResponseCallback[SchemaWriteLogEntriesResponse],
    callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]
  ): Unit = js.native
  def write(params: ParamsResourceEntriesWrite, options: MethodOptions): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]
  ): Unit = js.native
}

