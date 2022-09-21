package typings.googleapis.formsV1Mod.formsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/forms/v1", "forms_v1.Resource$Forms$Watches")
@js.native
open class ResourceFormsWatches protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWatch] = js.native
  def create(callback: BodyResponseCallback[SchemaWatch]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWatch] = js.native
  def create(params: ParamsResourceFormsWatchesCreate): GaxiosPromise[SchemaWatch] = js.native
  def create(params: ParamsResourceFormsWatchesCreate, callback: BodyResponseCallback[SchemaWatch]): Unit = js.native
  def create(
    params: ParamsResourceFormsWatchesCreate,
    options: BodyResponseCallback[Readable | SchemaWatch],
    callback: BodyResponseCallback[Readable | SchemaWatch]
  ): Unit = js.native
  def create(params: ParamsResourceFormsWatchesCreate, options: MethodOptions): GaxiosPromise[SchemaWatch] = js.native
  def create(
    params: ParamsResourceFormsWatchesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWatch]
  ): Unit = js.native
  /**
    * Create a new watch. If a watch ID is provided, it must be unused. For each invoking project, the per form limit is one watch per Watch.EventType. A watch expires seven days after it is created (see Watch.expire_time).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/forms.body',
    *       'https://www.googleapis.com/auth/forms.body.readonly',
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.watches.create({
    *     // Required. ID of the Form to watch.
    *     formId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "watch": {},
    *       //   "watchId": "my_watchId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "errorType": "my_errorType",
    *   //   "eventType": "my_eventType",
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "state": "my_state",
    *   //   "target": {}
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
  def create(params: ParamsResourceFormsWatchesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFormsWatchesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFormsWatchesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFormsWatchesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceFormsWatchesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceFormsWatchesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceFormsWatchesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a watch.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/forms.body',
    *       'https://www.googleapis.com/auth/forms.body.readonly',
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.watches.delete({
    *     // Required. The ID of the Form.
    *     formId: 'placeholder-value',
    *     // Required. The ID of the Watch to delete.
    *     watchId: 'placeholder-value',
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
  def delete(params: ParamsResourceFormsWatchesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFormsWatchesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWatchesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWatchesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWatchesResponse] = js.native
  def list(params: ParamsResourceFormsWatchesList): GaxiosPromise[SchemaListWatchesResponse] = js.native
  def list(params: ParamsResourceFormsWatchesList, callback: BodyResponseCallback[SchemaListWatchesResponse]): Unit = js.native
  def list(
    params: ParamsResourceFormsWatchesList,
    options: BodyResponseCallback[Readable | SchemaListWatchesResponse],
    callback: BodyResponseCallback[Readable | SchemaListWatchesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFormsWatchesList, options: MethodOptions): GaxiosPromise[SchemaListWatchesResponse] = js.native
  def list(
    params: ParamsResourceFormsWatchesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWatchesResponse]
  ): Unit = js.native
  /**
    * Return a list of the watches owned by the invoking project. The maximum number of watches is two: For each invoker, the limit is one for each event type per form.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/forms.body',
    *       'https://www.googleapis.com/auth/forms.body.readonly',
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.watches.list({
    *     // Required. ID of the Form whose watches to list.
    *     formId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "watches": []
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
  def list(params: ParamsResourceFormsWatchesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFormsWatchesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def renew(): GaxiosPromise[SchemaWatch] = js.native
  def renew(callback: BodyResponseCallback[SchemaWatch]): Unit = js.native
  def renew(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWatch] = js.native
  def renew(params: ParamsResourceFormsWatchesRenew): GaxiosPromise[SchemaWatch] = js.native
  def renew(params: ParamsResourceFormsWatchesRenew, callback: BodyResponseCallback[SchemaWatch]): Unit = js.native
  def renew(
    params: ParamsResourceFormsWatchesRenew,
    options: BodyResponseCallback[Readable | SchemaWatch],
    callback: BodyResponseCallback[Readable | SchemaWatch]
  ): Unit = js.native
  def renew(params: ParamsResourceFormsWatchesRenew, options: MethodOptions): GaxiosPromise[SchemaWatch] = js.native
  def renew(
    params: ParamsResourceFormsWatchesRenew,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWatch]
  ): Unit = js.native
  /**
    * Renew an existing watch for seven days. The state of the watch after renewal is `ACTIVE`, and the `expire_time` is seven days from the renewal. Renewing a watch in an error state (e.g. `SUSPENDED`) succeeds if the error is no longer present, but fail otherwise. After a watch has expired, RenewWatch returns `NOT_FOUND`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/forms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const forms = google.forms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/forms.body',
    *       'https://www.googleapis.com/auth/forms.body.readonly',
    *       'https://www.googleapis.com/auth/forms.responses.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await forms.forms.watches.renew({
    *     // Required. The ID of the Form.
    *     formId: 'placeholder-value',
    *     // Required. The ID of the Watch to renew.
    *     watchId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "errorType": "my_errorType",
    *   //   "eventType": "my_eventType",
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "state": "my_state",
    *   //   "target": {}
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
  def renew(params: ParamsResourceFormsWatchesRenew, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def renew(
    params: ParamsResourceFormsWatchesRenew,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
