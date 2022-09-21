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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts$Labels")
@js.native
open class ResourceAccountsLabels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAccountLabel] = js.native
  def create(callback: BodyResponseCallback[SchemaAccountLabel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountLabel] = js.native
  def create(params: ParamsResourceAccountsLabelsCreate): GaxiosPromise[SchemaAccountLabel] = js.native
  def create(params: ParamsResourceAccountsLabelsCreate, callback: BodyResponseCallback[SchemaAccountLabel]): Unit = js.native
  def create(
    params: ParamsResourceAccountsLabelsCreate,
    options: BodyResponseCallback[Readable | SchemaAccountLabel],
    callback: BodyResponseCallback[Readable | SchemaAccountLabel]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsLabelsCreate, options: MethodOptions): GaxiosPromise[SchemaAccountLabel] = js.native
  def create(
    params: ParamsResourceAccountsLabelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountLabel]
  ): Unit = js.native
  /**
    * Creates a new label, not assigned to any account.
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
    *   const res = await content.accounts.labels.create({
    *     // Required. The id of the account this label belongs to.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "description": "my_description",
    *       //   "labelId": "my_labelId",
    *       //   "labelType": "my_labelType",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "description": "my_description",
    *   //   "labelId": "my_labelId",
    *   //   "labelType": "my_labelType",
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceAccountsLabelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsLabelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsLabelsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsLabelsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsLabelsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsLabelsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsLabelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a label and removes it from all accounts to which it was assigned.
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
    *   const res = await content.accounts.labels.delete({
    *     // Required. The id of the account that owns the label.
    *     accountId: 'placeholder-value',
    *     // Required. The id of the label to delete.
    *     labelId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsLabelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsLabelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAccountLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountLabelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAccountLabelsResponse] = js.native
  def list(params: ParamsResourceAccountsLabelsList): GaxiosPromise[SchemaListAccountLabelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsLabelsList,
    callback: BodyResponseCallback[SchemaListAccountLabelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsLabelsList,
    options: BodyResponseCallback[Readable | SchemaListAccountLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAccountLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsLabelsList, options: MethodOptions): GaxiosPromise[SchemaListAccountLabelsResponse] = js.native
  def list(
    params: ParamsResourceAccountsLabelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountLabelsResponse]
  ): Unit = js.native
  /**
    * Lists the labels assigned to an account.
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
    *   const res = await content.accounts.labels.list({
    *     // Required. The account id for whose labels are to be listed.
    *     accountId: 'placeholder-value',
    *     // The maximum number of labels to return. The service may return fewer than this value. If unspecified, at most 50 labels will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAccountLabels` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAccountLabels` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountLabels": [],
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
  def list(params: ParamsResourceAccountsLabelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsLabelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAccountLabel] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccountLabel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountLabel] = js.native
  def patch(params: ParamsResourceAccountsLabelsPatch): GaxiosPromise[SchemaAccountLabel] = js.native
  def patch(params: ParamsResourceAccountsLabelsPatch, callback: BodyResponseCallback[SchemaAccountLabel]): Unit = js.native
  def patch(
    params: ParamsResourceAccountsLabelsPatch,
    options: BodyResponseCallback[Readable | SchemaAccountLabel],
    callback: BodyResponseCallback[Readable | SchemaAccountLabel]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsLabelsPatch, options: MethodOptions): GaxiosPromise[SchemaAccountLabel] = js.native
  def patch(
    params: ParamsResourceAccountsLabelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountLabel]
  ): Unit = js.native
  /**
    * Updates a label.
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
    *   const res = await content.accounts.labels.patch({
    *     // Required. The id of the account this label belongs to.
    *     accountId: 'placeholder-value',
    *     // Required. The id of the label to update.
    *     labelId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "description": "my_description",
    *       //   "labelId": "my_labelId",
    *       //   "labelType": "my_labelType",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "description": "my_description",
    *   //   "labelId": "my_labelId",
    *   //   "labelType": "my_labelType",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceAccountsLabelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsLabelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
