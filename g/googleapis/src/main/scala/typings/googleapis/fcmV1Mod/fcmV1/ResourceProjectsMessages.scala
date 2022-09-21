package typings.googleapis.fcmV1Mod.fcmV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fcm/v1", "fcm_v1.Resource$Projects$Messages")
@js.native
open class ResourceProjectsMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def send(): GaxiosPromise[SchemaMessage] = js.native
  def send(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceProjectsMessagesSend): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceProjectsMessagesSend, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(
    params: ParamsResourceProjectsMessagesSend,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def send(params: ParamsResourceProjectsMessagesSend, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(
    params: ParamsResourceProjectsMessagesSend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Send a message to specified target (a registration token, topic or condition).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fcm.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fcm = google.fcm('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase.messaging',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fcm.projects.messages.send({
    *     // Required. It contains the Firebase project id (i.e. the unique identifier for your Firebase project), in the format of `projects/{project_id\}`. For legacy support, the numeric project number with no padding is also supported in the format of `projects/{project_number\}`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "message": {},
    *       //   "validateOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "android": {},
    *   //   "apns": {},
    *   //   "condition": "my_condition",
    *   //   "data": {},
    *   //   "fcmOptions": {},
    *   //   "name": "my_name",
    *   //   "notification": {},
    *   //   "token": "my_token",
    *   //   "topic": "my_topic",
    *   //   "webpush": {}
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
  def send(params: ParamsResourceProjectsMessagesSend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def send(
    params: ParamsResourceProjectsMessagesSend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
