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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Returnpolicyonline")
@js.native
open class ResourceReturnpolicyonline protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def create(callback: BodyResponseCallback[SchemaReturnPolicyOnline]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def create(params: ParamsResourceReturnpolicyonlineCreate): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def create(
    params: ParamsResourceReturnpolicyonlineCreate,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  def create(
    params: ParamsResourceReturnpolicyonlineCreate,
    options: BodyResponseCallback[Readable | SchemaReturnPolicyOnline],
    callback: BodyResponseCallback[Readable | SchemaReturnPolicyOnline]
  ): Unit = js.native
  def create(params: ParamsResourceReturnpolicyonlineCreate, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def create(
    params: ParamsResourceReturnpolicyonlineCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  /**
    * Creates a new return policy.
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
    *   const res = await content.returnpolicyonline.create({
    *     // Required. The id of the merchant for which to retrieve the return policy online object.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "countries": [],
    *       //   "itemConditions": [],
    *       //   "label": "my_label",
    *       //   "name": "my_name",
    *       //   "policy": {},
    *       //   "restockingFee": {},
    *       //   "returnMethods": [],
    *       //   "returnPolicyId": "my_returnPolicyId",
    *       //   "returnPolicyUri": "my_returnPolicyUri",
    *       //   "returnReasonCategoryInfo": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countries": [],
    *   //   "itemConditions": [],
    *   //   "label": "my_label",
    *   //   "name": "my_name",
    *   //   "policy": {},
    *   //   "restockingFee": {},
    *   //   "returnMethods": [],
    *   //   "returnPolicyId": "my_returnPolicyId",
    *   //   "returnPolicyUri": "my_returnPolicyUri",
    *   //   "returnReasonCategoryInfo": []
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
  def create(params: ParamsResourceReturnpolicyonlineCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceReturnpolicyonlineCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnpolicyonlineDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnpolicyonlineDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceReturnpolicyonlineDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceReturnpolicyonlineDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceReturnpolicyonlineDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing return policy.
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
    *   const res = await content.returnpolicyonline.delete({
    *     // Required. The id of the merchant for which to retrieve the return policy online object.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the return policy to delete.
    *     returnPolicyId: 'placeholder-value',
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
  def delete(params: ParamsResourceReturnpolicyonlineDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceReturnpolicyonlineDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def get(callback: BodyResponseCallback[SchemaReturnPolicyOnline]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def get(params: ParamsResourceReturnpolicyonlineGet): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def get(
    params: ParamsResourceReturnpolicyonlineGet,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  def get(
    params: ParamsResourceReturnpolicyonlineGet,
    options: BodyResponseCallback[Readable | SchemaReturnPolicyOnline],
    callback: BodyResponseCallback[Readable | SchemaReturnPolicyOnline]
  ): Unit = js.native
  def get(params: ParamsResourceReturnpolicyonlineGet, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def get(
    params: ParamsResourceReturnpolicyonlineGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  /**
    * Gets an existing return policy.
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
    *   const res = await content.returnpolicyonline.get({
    *     // Required. The id of the merchant for which to retrieve the return policy online object.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the return policy to retrieve.
    *     returnPolicyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countries": [],
    *   //   "itemConditions": [],
    *   //   "label": "my_label",
    *   //   "name": "my_name",
    *   //   "policy": {},
    *   //   "restockingFee": {},
    *   //   "returnMethods": [],
    *   //   "returnPolicyId": "my_returnPolicyId",
    *   //   "returnPolicyUri": "my_returnPolicyUri",
    *   //   "returnReasonCategoryInfo": []
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
  def get(params: ParamsResourceReturnpolicyonlineGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceReturnpolicyonlineGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReturnPolicyOnlineResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReturnPolicyOnlineResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReturnPolicyOnlineResponse] = js.native
  def list(params: ParamsResourceReturnpolicyonlineList): GaxiosPromise[SchemaListReturnPolicyOnlineResponse] = js.native
  def list(
    params: ParamsResourceReturnpolicyonlineList,
    callback: BodyResponseCallback[SchemaListReturnPolicyOnlineResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceReturnpolicyonlineList,
    options: BodyResponseCallback[Readable | SchemaListReturnPolicyOnlineResponse],
    callback: BodyResponseCallback[Readable | SchemaListReturnPolicyOnlineResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReturnpolicyonlineList, options: MethodOptions): GaxiosPromise[SchemaListReturnPolicyOnlineResponse] = js.native
  def list(
    params: ParamsResourceReturnpolicyonlineList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReturnPolicyOnlineResponse]
  ): Unit = js.native
  /**
    * Lists all existing return policies.
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
    *   const res = await content.returnpolicyonline.list({
    *     // Required. The id of the merchant for which to retrieve the return policy online object.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "returnPolicies": []
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
  def list(params: ParamsResourceReturnpolicyonlineList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReturnpolicyonlineList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def patch(callback: BodyResponseCallback[SchemaReturnPolicyOnline]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def patch(params: ParamsResourceReturnpolicyonlinePatch): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def patch(
    params: ParamsResourceReturnpolicyonlinePatch,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  def patch(
    params: ParamsResourceReturnpolicyonlinePatch,
    options: BodyResponseCallback[Readable | SchemaReturnPolicyOnline],
    callback: BodyResponseCallback[Readable | SchemaReturnPolicyOnline]
  ): Unit = js.native
  def patch(params: ParamsResourceReturnpolicyonlinePatch, options: MethodOptions): GaxiosPromise[SchemaReturnPolicyOnline] = js.native
  def patch(
    params: ParamsResourceReturnpolicyonlinePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnPolicyOnline]
  ): Unit = js.native
  /**
    * Updates an existing return policy.
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
    *   const res = await content.returnpolicyonline.patch({
    *     // Required. The id of the merchant for which to retrieve the return policy online object.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the return policy to update.
    *     returnPolicyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "countries": [],
    *       //   "itemConditions": [],
    *       //   "label": "my_label",
    *       //   "name": "my_name",
    *       //   "policy": {},
    *       //   "restockingFee": {},
    *       //   "returnMethods": [],
    *       //   "returnPolicyId": "my_returnPolicyId",
    *       //   "returnPolicyUri": "my_returnPolicyUri",
    *       //   "returnReasonCategoryInfo": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countries": [],
    *   //   "itemConditions": [],
    *   //   "label": "my_label",
    *   //   "name": "my_name",
    *   //   "policy": {},
    *   //   "restockingFee": {},
    *   //   "returnMethods": [],
    *   //   "returnPolicyId": "my_returnPolicyId",
    *   //   "returnPolicyUri": "my_returnPolicyUri",
    *   //   "returnReasonCategoryInfo": []
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
  def patch(params: ParamsResourceReturnpolicyonlinePatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceReturnpolicyonlinePatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
