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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Labels")
@js.native
open class ResourceUsersLabels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLabel] = js.native
  def create(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def create(params: ParamsResourceUsersLabelsCreate): GaxiosPromise[SchemaLabel] = js.native
  def create(params: ParamsResourceUsersLabelsCreate, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def create(
    params: ParamsResourceUsersLabelsCreate,
    options: BodyResponseCallback[Readable | SchemaLabel],
    callback: BodyResponseCallback[Readable | SchemaLabel]
  ): Unit = js.native
  def create(params: ParamsResourceUsersLabelsCreate, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def create(
    params: ParamsResourceUsersLabelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * Creates a new label.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.labels.create({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "color": {},
    *       //   "id": "my_id",
    *       //   "labelListVisibility": "my_labelListVisibility",
    *       //   "messageListVisibility": "my_messageListVisibility",
    *       //   "messagesTotal": 0,
    *       //   "messagesUnread": 0,
    *       //   "name": "my_name",
    *       //   "threadsTotal": 0,
    *       //   "threadsUnread": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "color": {},
    *   //   "id": "my_id",
    *   //   "labelListVisibility": "my_labelListVisibility",
    *   //   "messageListVisibility": "my_messageListVisibility",
    *   //   "messagesTotal": 0,
    *   //   "messagesUnread": 0,
    *   //   "name": "my_name",
    *   //   "threadsTotal": 0,
    *   //   "threadsUnread": 0,
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
  def create(params: ParamsResourceUsersLabelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersLabelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersLabelsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersLabelsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersLabelsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersLabelsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersLabelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.labels.delete({
    *     // The ID of the label to delete.
    *     id: 'placeholder-value',
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
  def delete(params: ParamsResourceUsersLabelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersLabelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLabel] = js.native
  def get(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def get(params: ParamsResourceUsersLabelsGet): GaxiosPromise[SchemaLabel] = js.native
  def get(params: ParamsResourceUsersLabelsGet, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def get(
    params: ParamsResourceUsersLabelsGet,
    options: BodyResponseCallback[Readable | SchemaLabel],
    callback: BodyResponseCallback[Readable | SchemaLabel]
  ): Unit = js.native
  def get(params: ParamsResourceUsersLabelsGet, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def get(
    params: ParamsResourceUsersLabelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * Gets the specified label.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
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
    *   const res = await gmail.users.labels.get({
    *     // The ID of the label to retrieve.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "color": {},
    *   //   "id": "my_id",
    *   //   "labelListVisibility": "my_labelListVisibility",
    *   //   "messageListVisibility": "my_messageListVisibility",
    *   //   "messagesTotal": 0,
    *   //   "messagesUnread": 0,
    *   //   "name": "my_name",
    *   //   "threadsTotal": 0,
    *   //   "threadsUnread": 0,
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
  def get(params: ParamsResourceUsersLabelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersLabelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLabelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(params: ParamsResourceUsersLabelsList): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(params: ParamsResourceUsersLabelsList, callback: BodyResponseCallback[SchemaListLabelsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersLabelsList,
    options: BodyResponseCallback[Readable | SchemaListLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersLabelsList, options: MethodOptions): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(
    params: ParamsResourceUsersLabelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLabelsResponse]
  ): Unit = js.native
  /**
    * Lists all labels in the user's mailbox.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
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
    *   const res = await gmail.users.labels.list({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labels": []
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
  def list(params: ParamsResourceUsersLabelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersLabelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLabel] = js.native
  def patch(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def patch(params: ParamsResourceUsersLabelsPatch): GaxiosPromise[SchemaLabel] = js.native
  def patch(params: ParamsResourceUsersLabelsPatch, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def patch(
    params: ParamsResourceUsersLabelsPatch,
    options: BodyResponseCallback[Readable | SchemaLabel],
    callback: BodyResponseCallback[Readable | SchemaLabel]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersLabelsPatch, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def patch(
    params: ParamsResourceUsersLabelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * Patch the specified label.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.labels.patch({
    *     // The ID of the label to update.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "color": {},
    *       //   "id": "my_id",
    *       //   "labelListVisibility": "my_labelListVisibility",
    *       //   "messageListVisibility": "my_messageListVisibility",
    *       //   "messagesTotal": 0,
    *       //   "messagesUnread": 0,
    *       //   "name": "my_name",
    *       //   "threadsTotal": 0,
    *       //   "threadsUnread": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "color": {},
    *   //   "id": "my_id",
    *   //   "labelListVisibility": "my_labelListVisibility",
    *   //   "messageListVisibility": "my_messageListVisibility",
    *   //   "messagesTotal": 0,
    *   //   "messagesUnread": 0,
    *   //   "name": "my_name",
    *   //   "threadsTotal": 0,
    *   //   "threadsUnread": 0,
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
  def patch(params: ParamsResourceUsersLabelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersLabelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLabel] = js.native
  def update(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def update(params: ParamsResourceUsersLabelsUpdate): GaxiosPromise[SchemaLabel] = js.native
  def update(params: ParamsResourceUsersLabelsUpdate, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def update(
    params: ParamsResourceUsersLabelsUpdate,
    options: BodyResponseCallback[Readable | SchemaLabel],
    callback: BodyResponseCallback[Readable | SchemaLabel]
  ): Unit = js.native
  def update(params: ParamsResourceUsersLabelsUpdate, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def update(
    params: ParamsResourceUsersLabelsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * Updates the specified label.
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
    *       'https://www.googleapis.com/auth/gmail.labels',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.labels.update({
    *     // The ID of the label to update.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "color": {},
    *       //   "id": "my_id",
    *       //   "labelListVisibility": "my_labelListVisibility",
    *       //   "messageListVisibility": "my_messageListVisibility",
    *       //   "messagesTotal": 0,
    *       //   "messagesUnread": 0,
    *       //   "name": "my_name",
    *       //   "threadsTotal": 0,
    *       //   "threadsUnread": 0,
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "color": {},
    *   //   "id": "my_id",
    *   //   "labelListVisibility": "my_labelListVisibility",
    *   //   "messageListVisibility": "my_messageListVisibility",
    *   //   "messagesTotal": 0,
    *   //   "messagesUnread": 0,
    *   //   "name": "my_name",
    *   //   "threadsTotal": 0,
    *   //   "threadsUnread": 0,
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
  def update(params: ParamsResourceUsersLabelsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersLabelsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
