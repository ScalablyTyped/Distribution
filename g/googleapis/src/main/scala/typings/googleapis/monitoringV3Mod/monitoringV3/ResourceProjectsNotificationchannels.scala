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

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Notificationchannels")
@js.native
open class ResourceProjectsNotificationchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(params: ParamsResourceProjectsNotificationchannelsCreate): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    options: BodyResponseCallback[Readable | SchemaNotificationChannel],
    callback: BodyResponseCallback[Readable | SchemaNotificationChannel]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsNotificationchannelsCreate, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * Creates a new notification channel, representing a single notification endpoint such as an email address, SMS number, or PagerDuty service.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannels.create({
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER] This names the container into which the channel will be written, this does not name the newly created channel. The resulting channel's name will have a normalized version of this field as a prefix, but will add /notificationChannels/[CHANNEL_ID] to identify the channel.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationRecord": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "labels": {},
    *       //   "mutationRecords": [],
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "userLabels": {},
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationRecord": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "labels": {},
    *   //   "mutationRecords": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "userLabels": {},
    *   //   "verificationStatus": "my_verificationStatus"
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
  def create(params: ParamsResourceProjectsNotificationchannelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsNotificationchannelsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsNotificationchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a notification channel.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannels.delete({
    *     // If true, the notification channel will be deleted regardless of its use in alert policies (the policies will be updated to remove the channel). If false, channels that are still referenced by an existing alerting policy will fail to be deleted in a delete operation.
    *     force: 'placeholder-value',
    *     // Required. The channel for which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
    *     name: 'projects/my-project/notificationChannels/my-notificationChannel',
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
  def delete(params: ParamsResourceProjectsNotificationchannelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(params: ParamsResourceProjectsNotificationchannelsGet): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    options: BodyResponseCallback[Readable | SchemaNotificationChannel],
    callback: BodyResponseCallback[Readable | SchemaNotificationChannel]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotificationchannelsGet, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
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
    *   const res = await monitoring.projects.notificationChannels.get({
    *     // Required. The channel for which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
    *     name: 'projects/my-project/notificationChannels/my-notificationChannel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationRecord": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "labels": {},
    *   //   "mutationRecords": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "userLabels": {},
    *   //   "verificationStatus": "my_verificationStatus"
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
  def get(params: ParamsResourceProjectsNotificationchannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVerificationCode(): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]): Unit = js.native
  def getVerificationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(params: ParamsResourceProjectsNotificationchannelsGetverificationcode): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: BodyResponseCallback[Readable | SchemaGetNotificationChannelVerificationCodeResponse],
    callback: BodyResponseCallback[Readable | SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  def getVerificationCode(params: ParamsResourceProjectsNotificationchannelsGetverificationcode, options: MethodOptions): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  /**
    * Requests a verification code for an already verified channel that can then be used in a call to VerifyNotificationChannel() on a different channel with an equivalent identity in the same or in a different project. This makes it possible to copy a channel between projects without requiring manual reverification of the channel. If the channel is not in the verified state, this method will fail (in other words, this may only be used if the SendNotificationChannelVerificationCode and VerifyNotificationChannel paths have already been used to put the given channel into the verified state).There is no guarantee that the verification codes returned by this method will be of a similar structure or form as the ones that are delivered to the channel via SendNotificationChannelVerificationCode; while VerifyNotificationChannel() will recognize both the codes delivered via SendNotificationChannelVerificationCode() and returned from GetNotificationChannelVerificationCode(), it is typically the case that the verification codes delivered via SendNotificationChannelVerificationCode() will be shorter and also have a shorter expiration (e.g. codes such as "G-123456") whereas GetVerificationCode() will typically return a much longer, websafe base 64 encoded string that has a longer expiration time.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await monitoring.projects.notificationChannels.getVerificationCode({
    *       // Required. The notification channel for which a verification code is to be generated and retrieved. This must name a channel that is already verified; if the specified channel is not verified, the request will fail.
    *       name: 'projects/my-project/notificationChannels/my-notificationChannel',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "expireTime": "my_expireTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "expireTime": "my_expireTime"
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
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(params: ParamsResourceProjectsNotificationchannelsList): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    options: BodyResponseCallback[Readable | SchemaListNotificationChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotificationchannelsList, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  /**
    * Lists the notification channels that have been created for the project.
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
    *   const res = await monitoring.projects.notificationChannels.list({
    *     // If provided, this field specifies the criteria that must be met by notification channels to be included in the response.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
    *     filter: 'placeholder-value',
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER] This names the container in which to look for the notification channels; it does not name a specific channel. To query a specific channel by REST resource name, use the GetNotificationChannel operation.
    *     name: 'projects/my-project',
    *     // A comma-separated list of fields by which to sort the result. Supports the same set of fields as in filter. Entries can be prefixed with a minus sign to sort in descending rather than ascending order.For more details, see sorting and filtering (https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service.
    *     pageSize: 'placeholder-value',
    *     // If non-empty, page_token must contain a value returned as the next_page_token in a previous response to request the next set of results.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "notificationChannels": [],
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceProjectsNotificationchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(params: ParamsResourceProjectsNotificationchannelsPatch): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    options: BodyResponseCallback[Readable | SchemaNotificationChannel],
    callback: BodyResponseCallback[Readable | SchemaNotificationChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsNotificationchannelsPatch, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * Updates a notification channel. Fields not specified in the field mask remain unchanged.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannels.patch({
    *     // The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
    *     name: 'projects/my-project/notificationChannels/my-notificationChannel',
    *     // The fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationRecord": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "labels": {},
    *       //   "mutationRecords": [],
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "userLabels": {},
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationRecord": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "labels": {},
    *   //   "mutationRecords": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "userLabels": {},
    *   //   "verificationStatus": "my_verificationStatus"
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
  def patch(params: ParamsResourceProjectsNotificationchannelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendVerificationCode(): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def sendVerificationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(params: ParamsResourceProjectsNotificationchannelsSendverificationcode): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def sendVerificationCode(params: ParamsResourceProjectsNotificationchannelsSendverificationcode, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Causes a verification code to be delivered to the channel. The code can then be supplied in VerifyNotificationChannel to verify the channel.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await monitoring.projects.notificationChannels.sendVerificationCode({
    *       // Required. The notification channel to which to send a verification code.
    *       name: 'projects/my-project/notificationChannels/my-notificationChannel',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
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
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verify(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(params: ParamsResourceProjectsNotificationchannelsVerify): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    options: BodyResponseCallback[Readable | SchemaNotificationChannel],
    callback: BodyResponseCallback[Readable | SchemaNotificationChannel]
  ): Unit = js.native
  def verify(params: ParamsResourceProjectsNotificationchannelsVerify, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * Verifies a NotificationChannel by proving receipt of the code delivered to the channel as a result of calling SendNotificationChannelVerificationCode.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.notificationChannels.verify({
    *     // Required. The notification channel to verify.
    *     name: 'projects/my-project/notificationChannels/my-notificationChannel',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationRecord": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "labels": {},
    *   //   "mutationRecords": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "userLabels": {},
    *   //   "verificationStatus": "my_verificationStatus"
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
  def verify(params: ParamsResourceProjectsNotificationchannelsVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
