package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Pubsubnotificationsettings")
@js.native
open class ResourcePubsubnotificationsettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaPubsubNotificationSettings]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def get(params: ParamsResourcePubsubnotificationsettingsGet): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def get(
    params: ParamsResourcePubsubnotificationsettingsGet,
    callback: BodyResponseCallback[SchemaPubsubNotificationSettings]
  ): Unit = js.native
  def get(
    params: ParamsResourcePubsubnotificationsettingsGet,
    options: BodyResponseCallback[Readable | SchemaPubsubNotificationSettings],
    callback: BodyResponseCallback[Readable | SchemaPubsubNotificationSettings]
  ): Unit = js.native
  def get(params: ParamsResourcePubsubnotificationsettingsGet, options: MethodOptions): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def get(
    params: ParamsResourcePubsubnotificationsettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPubsubNotificationSettings]
  ): Unit = js.native
  /**
    * Retrieves a Merchant Center account's pubsub notification settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pubsubnotificationsettings.get({
    *     // The ID of the account for which to get pubsub notification settings.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudTopicName": "my_cloudTopicName",
    *   //   "kind": "my_kind",
    *   //   "registeredEvents": []
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
  def get(params: ParamsResourcePubsubnotificationsettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePubsubnotificationsettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def update(callback: BodyResponseCallback[SchemaPubsubNotificationSettings]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def update(params: ParamsResourcePubsubnotificationsettingsUpdate): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def update(
    params: ParamsResourcePubsubnotificationsettingsUpdate,
    callback: BodyResponseCallback[SchemaPubsubNotificationSettings]
  ): Unit = js.native
  def update(
    params: ParamsResourcePubsubnotificationsettingsUpdate,
    options: BodyResponseCallback[Readable | SchemaPubsubNotificationSettings],
    callback: BodyResponseCallback[Readable | SchemaPubsubNotificationSettings]
  ): Unit = js.native
  def update(params: ParamsResourcePubsubnotificationsettingsUpdate, options: MethodOptions): GaxiosPromise[SchemaPubsubNotificationSettings] = js.native
  def update(
    params: ParamsResourcePubsubnotificationsettingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPubsubNotificationSettings]
  ): Unit = js.native
  /**
    * Register a Merchant Center account for pubsub notifications. Note that cloud topic name shouldn't be provided as part of the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pubsubnotificationsettings.update({
    *     // The ID of the account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudTopicName": "my_cloudTopicName",
    *       //   "kind": "my_kind",
    *       //   "registeredEvents": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudTopicName": "my_cloudTopicName",
    *   //   "kind": "my_kind",
    *   //   "registeredEvents": []
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
  def update(params: ParamsResourcePubsubnotificationsettingsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePubsubnotificationsettingsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
