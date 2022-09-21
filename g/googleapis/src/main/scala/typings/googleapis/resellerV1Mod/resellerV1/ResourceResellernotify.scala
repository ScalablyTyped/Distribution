package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Resellernotify")
@js.native
open class ResourceResellernotify protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getwatchdetails(): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]): Unit = js.native
  def getwatchdetails(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(params: ParamsResourceResellernotifyGetwatchdetails): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    options: BodyResponseCallback[Readable | SchemaResellernotifyGetwatchdetailsResponse],
    callback: BodyResponseCallback[Readable | SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(params: ParamsResourceResellernotifyGetwatchdetails, options: MethodOptions): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  /**
    * Returns all the details of the watch corresponding to the reseller.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/apps.order',
    *       'https://www.googleapis.com/auth/apps.order.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.resellernotify.getwatchdetails({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "serviceAccountEmailAddresses": [],
    *   //   "topicName": "my_topicName"
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
  def getwatchdetails(params: ParamsResourceResellernotifyGetwatchdetails, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def register(): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(callback: BodyResponseCallback[SchemaResellernotifyResource]): Unit = js.native
  def register(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(params: ParamsResourceResellernotifyRegister): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    options: BodyResponseCallback[Readable | SchemaResellernotifyResource],
    callback: BodyResponseCallback[Readable | SchemaResellernotifyResource]
  ): Unit = js.native
  def register(params: ParamsResourceResellernotifyRegister, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  /**
    * Registers a Reseller for receiving notifications.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.resellernotify.register({
    *     // The service account which will own the created Cloud-PubSub topic.
    *     serviceAccountEmailAddress: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "topicName": "my_topicName"
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
  def register(params: ParamsResourceResellernotifyRegister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unregister(): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(callback: BodyResponseCallback[SchemaResellernotifyResource]): Unit = js.native
  def unregister(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(params: ParamsResourceResellernotifyUnregister): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    options: BodyResponseCallback[Readable | SchemaResellernotifyResource],
    callback: BodyResponseCallback[Readable | SchemaResellernotifyResource]
  ): Unit = js.native
  def unregister(params: ParamsResourceResellernotifyUnregister, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  /**
    * Unregisters a Reseller for receiving notifications.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.resellernotify.unregister({
    *     // The service account which owns the Cloud-PubSub topic.
    *     serviceAccountEmailAddress: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "topicName": "my_topicName"
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
  def unregister(params: ParamsResourceResellernotifyUnregister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
