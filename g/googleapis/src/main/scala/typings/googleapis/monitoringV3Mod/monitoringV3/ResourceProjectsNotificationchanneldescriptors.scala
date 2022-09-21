package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Notificationchanneldescriptors")
@js.native
open class ResourceProjectsNotificationchanneldescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(params: ParamsResourceProjectsNotificationchanneldescriptorsGet): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    options: BodyResponseCallback[Readable | SchemaNotificationChannelDescriptor],
    callback: BodyResponseCallback[Readable | SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotificationchanneldescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  /**
    * Gets a single channel descriptor. The descriptor indicates which fields are expected / permitted for a notification channel of the given type.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannelDescriptors.get({
    *     // Required. The channel type for which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[CHANNEL_TYPE]
    *     name: 'projects/my-project/notificationChannelDescriptors/my-notificationChannelDescriptor',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "labels": [],
    *   //   "launchStage": "my_launchStage",
    *   //   "name": "my_name",
    *   //   "supportedTiers": [],
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceProjectsNotificationchanneldescriptorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsNotificationchanneldescriptorsList): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    options: BodyResponseCallback[Readable | SchemaListNotificationChannelDescriptorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotificationchanneldescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  /**
    * Lists the descriptors for supported channel types. The use of descriptors makes it possible for new channel types to be dynamically added.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannelDescriptors.list({
    *     // Required. The REST resource name of the parent from which to retrieve the notification channel descriptors. The expected syntax is: projects/[PROJECT_ID_OR_NUMBER] Note that this names (https://cloud.google.com/monitoring/api/v3#project_name) the parent container in which to look for the descriptors; to retrieve a single descriptor by name, use the GetNotificationChannelDescriptor operation, instead.
    *     name: 'projects/my-project',
    *     // The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service.
    *     pageSize: 'placeholder-value',
    *     // If non-empty, page_token must contain a value returned as the next_page_token in a previous response to request the next set of results.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channelDescriptors": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsNotificationchanneldescriptorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
