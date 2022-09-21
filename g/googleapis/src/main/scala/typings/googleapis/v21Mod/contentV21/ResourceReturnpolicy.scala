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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Returnpolicy")
@js.native
open class ResourceReturnpolicy protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaReturnpolicyCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaReturnpolicyCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnpolicyCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceReturnpolicyCustombatch): GaxiosPromise[SchemaReturnpolicyCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceReturnpolicyCustombatch,
    callback: BodyResponseCallback[SchemaReturnpolicyCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceReturnpolicyCustombatch,
    options: BodyResponseCallback[Readable | SchemaReturnpolicyCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaReturnpolicyCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceReturnpolicyCustombatch, options: MethodOptions): GaxiosPromise[SchemaReturnpolicyCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceReturnpolicyCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnpolicyCustomBatchResponse]
  ): Unit = js.native
  /**
    * Batches multiple return policy related calls in a single request.
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
    *   const res = await content.returnpolicy.custombatch({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourceReturnpolicyCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceReturnpolicyCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnpolicyDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnpolicyDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceReturnpolicyDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceReturnpolicyDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceReturnpolicyDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a return policy for the given Merchant Center account.
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
    *   const res = await content.returnpolicy.delete({
    *     // The Merchant Center account from which to delete the given return policy.
    *     merchantId: 'placeholder-value',
    *     // Return policy ID generated by Google.
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
  def delete(params: ParamsResourceReturnpolicyDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceReturnpolicyDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReturnPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaReturnPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnPolicy] = js.native
  def get(params: ParamsResourceReturnpolicyGet): GaxiosPromise[SchemaReturnPolicy] = js.native
  def get(params: ParamsResourceReturnpolicyGet, callback: BodyResponseCallback[SchemaReturnPolicy]): Unit = js.native
  def get(
    params: ParamsResourceReturnpolicyGet,
    options: BodyResponseCallback[Readable | SchemaReturnPolicy],
    callback: BodyResponseCallback[Readable | SchemaReturnPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceReturnpolicyGet, options: MethodOptions): GaxiosPromise[SchemaReturnPolicy] = js.native
  def get(
    params: ParamsResourceReturnpolicyGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnPolicy]
  ): Unit = js.native
  /**
    * Gets a return policy of the Merchant Center account.
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
    *   const res = await content.returnpolicy.get({
    *     // The Merchant Center account to get a return policy for.
    *     merchantId: 'placeholder-value',
    *     // Return policy ID generated by Google.
    *     returnPolicyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "country": "my_country",
    *   //   "kind": "my_kind",
    *   //   "label": "my_label",
    *   //   "name": "my_name",
    *   //   "nonFreeReturnReasons": [],
    *   //   "policy": {},
    *   //   "returnPolicyId": "my_returnPolicyId",
    *   //   "returnShippingFee": {},
    *   //   "seasonalOverrides": []
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
  def get(params: ParamsResourceReturnpolicyGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceReturnpolicyGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaReturnPolicy] = js.native
  def insert(callback: BodyResponseCallback[SchemaReturnPolicy]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnPolicy] = js.native
  def insert(params: ParamsResourceReturnpolicyInsert): GaxiosPromise[SchemaReturnPolicy] = js.native
  def insert(params: ParamsResourceReturnpolicyInsert, callback: BodyResponseCallback[SchemaReturnPolicy]): Unit = js.native
  def insert(
    params: ParamsResourceReturnpolicyInsert,
    options: BodyResponseCallback[Readable | SchemaReturnPolicy],
    callback: BodyResponseCallback[Readable | SchemaReturnPolicy]
  ): Unit = js.native
  def insert(params: ParamsResourceReturnpolicyInsert, options: MethodOptions): GaxiosPromise[SchemaReturnPolicy] = js.native
  def insert(
    params: ParamsResourceReturnpolicyInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnPolicy]
  ): Unit = js.native
  /**
    * Inserts a return policy for the Merchant Center account.
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
    *   const res = await content.returnpolicy.insert({
    *     // The Merchant Center account to insert a return policy for.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "country": "my_country",
    *       //   "kind": "my_kind",
    *       //   "label": "my_label",
    *       //   "name": "my_name",
    *       //   "nonFreeReturnReasons": [],
    *       //   "policy": {},
    *       //   "returnPolicyId": "my_returnPolicyId",
    *       //   "returnShippingFee": {},
    *       //   "seasonalOverrides": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "country": "my_country",
    *   //   "kind": "my_kind",
    *   //   "label": "my_label",
    *   //   "name": "my_name",
    *   //   "nonFreeReturnReasons": [],
    *   //   "policy": {},
    *   //   "returnPolicyId": "my_returnPolicyId",
    *   //   "returnShippingFee": {},
    *   //   "seasonalOverrides": []
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
  def insert(params: ParamsResourceReturnpolicyInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceReturnpolicyInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaReturnpolicyListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaReturnpolicyListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnpolicyListResponse] = js.native
  def list(params: ParamsResourceReturnpolicyList): GaxiosPromise[SchemaReturnpolicyListResponse] = js.native
  def list(
    params: ParamsResourceReturnpolicyList,
    callback: BodyResponseCallback[SchemaReturnpolicyListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceReturnpolicyList,
    options: BodyResponseCallback[Readable | SchemaReturnpolicyListResponse],
    callback: BodyResponseCallback[Readable | SchemaReturnpolicyListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReturnpolicyList, options: MethodOptions): GaxiosPromise[SchemaReturnpolicyListResponse] = js.native
  def list(
    params: ParamsResourceReturnpolicyList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnpolicyListResponse]
  ): Unit = js.native
  /**
    * Lists the return policies of the Merchant Center account.
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
    *   const res = await content.returnpolicy.list({
    *     // The Merchant Center account to list return policies for.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "resources": []
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
  def list(params: ParamsResourceReturnpolicyList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReturnpolicyList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
