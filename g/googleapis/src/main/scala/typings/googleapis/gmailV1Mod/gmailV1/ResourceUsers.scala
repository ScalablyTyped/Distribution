package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var drafts: ResourceUsersDrafts = js.native
  
  def getProfile(): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def getProfile(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(params: ParamsResourceUsersGetprofile): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(params: ParamsResourceUsersGetprofile, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def getProfile(
    params: ParamsResourceUsersGetprofile,
    options: BodyResponseCallback[Readable | SchemaProfile],
    callback: BodyResponseCallback[Readable | SchemaProfile]
  ): Unit = js.native
  def getProfile(params: ParamsResourceUsersGetprofile, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(
    params: ParamsResourceUsersGetprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * Gets the current user's Gmail profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.metadata',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.getProfile({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "emailAddress": "my_emailAddress",
    *   //   "historyId": "my_historyId",
    *   //   "messagesTotal": 0,
    *   //   "threadsTotal": 0
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
  def getProfile(params: ParamsResourceUsersGetprofile, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getProfile(
    params: ParamsResourceUsersGetprofile,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var history: ResourceUsersHistory = js.native
  
  var labels: ResourceUsersLabels = js.native
  
  var messages: ResourceUsersMessages = js.native
  
  var settings: ResourceUsersSettings = js.native
  
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceUsersStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceUsersStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsResourceUsersStop,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def stop(params: ParamsResourceUsersStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceUsersStop, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Stop receiving push notifications for the given user mailbox.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.metadata',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.stop({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def stop(params: ParamsResourceUsersStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceUsersStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var threads: ResourceUsersThreads = js.native
  
  def watch(): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(callback: BodyResponseCallback[SchemaWatchResponse]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(params: ParamsResourceUsersWatch): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(params: ParamsResourceUsersWatch, callback: BodyResponseCallback[SchemaWatchResponse]): Unit = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: BodyResponseCallback[Readable | SchemaWatchResponse],
    callback: BodyResponseCallback[Readable | SchemaWatchResponse]
  ): Unit = js.native
  def watch(params: ParamsResourceUsersWatch, options: MethodOptions): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWatchResponse]
  ): Unit = js.native
  /**
    * Set up or update a push notification watch on the given user mailbox.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.metadata',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.watch({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labelFilterAction": "my_labelFilterAction",
    *       //   "labelIds": [],
    *       //   "topicName": "my_topicName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiration": "my_expiration",
    *   //   "historyId": "my_historyId"
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
  def watch(params: ParamsResourceUsersWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
