package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Sinks")
@js.native
open class ResourceSinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLogSink] = js.native
  def create(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def create(params: ParamsResourceSinksCreate): GaxiosPromise[SchemaLogSink] = js.native
  def create(params: ParamsResourceSinksCreate, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def create(
    params: ParamsResourceSinksCreate,
    options: BodyResponseCallback[Readable | SchemaLogSink],
    callback: BodyResponseCallback[Readable | SchemaLogSink]
  ): Unit = js.native
  def create(params: ParamsResourceSinksCreate, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def create(
    params: ParamsResourceSinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.sinks.create({
    *     // Required. The resource in which to create the sink: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" For examples:"projects/my-project" "organizations/123456789"
    *     parent: '[^/]+/[^/]+',
    *     // Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Cloud Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a unique service account used only for exports from the new sink. For more information, see writer_identity in LogSink.
    *     uniqueWriterIdentity: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryOptions": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "destination": "my_destination",
    *       //   "disabled": false,
    *       //   "exclusions": [],
    *       //   "filter": "my_filter",
    *       //   "includeChildren": false,
    *       //   "name": "my_name",
    *       //   "outputVersionFormat": "my_outputVersionFormat",
    *       //   "updateTime": "my_updateTime",
    *       //   "writerIdentity": "my_writerIdentity"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "destination": "my_destination",
    *   //   "disabled": false,
    *   //   "exclusions": [],
    *   //   "filter": "my_filter",
    *   //   "includeChildren": false,
    *   //   "name": "my_name",
    *   //   "outputVersionFormat": "my_outputVersionFormat",
    *   //   "updateTime": "my_updateTime",
    *   //   "writerIdentity": "my_writerIdentity"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceSinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSinksDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSinksDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSinksDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSinksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.sinks.delete({
    *     // Required. The full resource name of the sink to delete, including the parent resource and the sink identifier: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" For example:"projects/my-project/sinks/my-sink"
    *     sinkName: '[^/]+/[^/]+/sinks/my-sink',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceSinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLogSink] = js.native
  def get(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def get(params: ParamsResourceSinksGet): GaxiosPromise[SchemaLogSink] = js.native
  def get(params: ParamsResourceSinksGet, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def get(
    params: ParamsResourceSinksGet,
    options: BodyResponseCallback[Readable | SchemaLogSink],
    callback: BodyResponseCallback[Readable | SchemaLogSink]
  ): Unit = js.native
  def get(params: ParamsResourceSinksGet, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def get(
    params: ParamsResourceSinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  /**
    * Gets a sink.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.sinks.get({
    *     // Required. The resource name of the sink: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" For example:"projects/my-project/sinks/my-sink"
    *     sinkName: '[^/]+/[^/]+/sinks/my-sink',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "destination": "my_destination",
    *   //   "disabled": false,
    *   //   "exclusions": [],
    *   //   "filter": "my_filter",
    *   //   "includeChildren": false,
    *   //   "name": "my_name",
    *   //   "outputVersionFormat": "my_outputVersionFormat",
    *   //   "updateTime": "my_updateTime",
    *   //   "writerIdentity": "my_writerIdentity"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceSinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(params: ParamsResourceSinksList): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(params: ParamsResourceSinksList, callback: BodyResponseCallback[SchemaListSinksResponse]): Unit = js.native
  def list(
    params: ParamsResourceSinksList,
    options: BodyResponseCallback[Readable | SchemaListSinksResponse],
    callback: BodyResponseCallback[Readable | SchemaListSinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSinksList, options: MethodOptions): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(
    params: ParamsResourceSinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSinksResponse]
  ): Unit = js.native
  /**
    * Lists sinks.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.sinks.list({
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource whose sinks are to be listed: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sinks": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceSinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLogSink] = js.native
  def update(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def update(params: ParamsResourceSinksUpdate): GaxiosPromise[SchemaLogSink] = js.native
  def update(params: ParamsResourceSinksUpdate, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def update(
    params: ParamsResourceSinksUpdate,
    options: BodyResponseCallback[Readable | SchemaLogSink],
    callback: BodyResponseCallback[Readable | SchemaLogSink]
  ): Unit = js.native
  def update(params: ParamsResourceSinksUpdate, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def update(
    params: ParamsResourceSinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter.The updated sink might also have a new writer_identity; see the unique_writer_identity field.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.sinks.update({
    *     // Required. The full resource name of the sink to update, including the parent resource and the sink identifier: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" For example:"projects/my-project/sinks/my-sink"
    *     sinkName: '[^/]+/[^/]+/sinks/my-sink',
    *     // Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a unique service account. It is an error if the old value is true and the new value is set to false or defaulted to false.
    *     uniqueWriterIdentity: 'placeholder-value',
    *     // Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:destination,filter,includeChildrenAt some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryOptions": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "destination": "my_destination",
    *       //   "disabled": false,
    *       //   "exclusions": [],
    *       //   "filter": "my_filter",
    *       //   "includeChildren": false,
    *       //   "name": "my_name",
    *       //   "outputVersionFormat": "my_outputVersionFormat",
    *       //   "updateTime": "my_updateTime",
    *       //   "writerIdentity": "my_writerIdentity"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "destination": "my_destination",
    *   //   "disabled": false,
    *   //   "exclusions": [],
    *   //   "filter": "my_filter",
    *   //   "includeChildren": false,
    *   //   "name": "my_name",
    *   //   "outputVersionFormat": "my_outputVersionFormat",
    *   //   "updateTime": "my_updateTime",
    *   //   "writerIdentity": "my_writerIdentity"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceSinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
