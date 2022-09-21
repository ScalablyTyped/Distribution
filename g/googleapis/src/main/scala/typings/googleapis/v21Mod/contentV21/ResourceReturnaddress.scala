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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Returnaddress")
@js.native
open class ResourceReturnaddress protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaReturnaddressCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaReturnaddressCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnaddressCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceReturnaddressCustombatch): GaxiosPromise[SchemaReturnaddressCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceReturnaddressCustombatch,
    callback: BodyResponseCallback[SchemaReturnaddressCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceReturnaddressCustombatch,
    options: BodyResponseCallback[Readable | SchemaReturnaddressCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaReturnaddressCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceReturnaddressCustombatch, options: MethodOptions): GaxiosPromise[SchemaReturnaddressCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceReturnaddressCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnaddressCustomBatchResponse]
  ): Unit = js.native
  /**
    * Batches multiple return address related calls in a single request.
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
    *   const res = await content.returnaddress.custombatch({
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
  def custombatch(params: ParamsResourceReturnaddressCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceReturnaddressCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnaddressDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceReturnaddressDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceReturnaddressDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceReturnaddressDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceReturnaddressDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a return address for the given Merchant Center account.
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
    *   const res = await content.returnaddress.delete({
    *     // The Merchant Center account from which to delete the given return address.
    *     merchantId: 'placeholder-value',
    *     // Return address ID generated by Google.
    *     returnAddressId: 'placeholder-value',
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
  def delete(params: ParamsResourceReturnaddressDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceReturnaddressDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReturnAddress] = js.native
  def get(callback: BodyResponseCallback[SchemaReturnAddress]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnAddress] = js.native
  def get(params: ParamsResourceReturnaddressGet): GaxiosPromise[SchemaReturnAddress] = js.native
  def get(params: ParamsResourceReturnaddressGet, callback: BodyResponseCallback[SchemaReturnAddress]): Unit = js.native
  def get(
    params: ParamsResourceReturnaddressGet,
    options: BodyResponseCallback[Readable | SchemaReturnAddress],
    callback: BodyResponseCallback[Readable | SchemaReturnAddress]
  ): Unit = js.native
  def get(params: ParamsResourceReturnaddressGet, options: MethodOptions): GaxiosPromise[SchemaReturnAddress] = js.native
  def get(
    params: ParamsResourceReturnaddressGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnAddress]
  ): Unit = js.native
  /**
    * Gets a return address of the Merchant Center account.
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
    *   const res = await content.returnaddress.get({
    *     // The Merchant Center account to get a return address for.
    *     merchantId: 'placeholder-value',
    *     // Return address ID generated by Google.
    *     returnAddressId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "country": "my_country",
    *   //   "kind": "my_kind",
    *   //   "label": "my_label",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "returnAddressId": "my_returnAddressId"
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
  def get(params: ParamsResourceReturnaddressGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceReturnaddressGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaReturnAddress] = js.native
  def insert(callback: BodyResponseCallback[SchemaReturnAddress]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnAddress] = js.native
  def insert(params: ParamsResourceReturnaddressInsert): GaxiosPromise[SchemaReturnAddress] = js.native
  def insert(params: ParamsResourceReturnaddressInsert, callback: BodyResponseCallback[SchemaReturnAddress]): Unit = js.native
  def insert(
    params: ParamsResourceReturnaddressInsert,
    options: BodyResponseCallback[Readable | SchemaReturnAddress],
    callback: BodyResponseCallback[Readable | SchemaReturnAddress]
  ): Unit = js.native
  def insert(params: ParamsResourceReturnaddressInsert, options: MethodOptions): GaxiosPromise[SchemaReturnAddress] = js.native
  def insert(
    params: ParamsResourceReturnaddressInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnAddress]
  ): Unit = js.native
  /**
    * Inserts a return address for the Merchant Center account.
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
    *   const res = await content.returnaddress.insert({
    *     // The Merchant Center account to insert a return address for.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": {},
    *       //   "country": "my_country",
    *       //   "kind": "my_kind",
    *       //   "label": "my_label",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "returnAddressId": "my_returnAddressId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": {},
    *   //   "country": "my_country",
    *   //   "kind": "my_kind",
    *   //   "label": "my_label",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "returnAddressId": "my_returnAddressId"
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
  def insert(params: ParamsResourceReturnaddressInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceReturnaddressInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaReturnaddressListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaReturnaddressListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReturnaddressListResponse] = js.native
  def list(params: ParamsResourceReturnaddressList): GaxiosPromise[SchemaReturnaddressListResponse] = js.native
  def list(
    params: ParamsResourceReturnaddressList,
    callback: BodyResponseCallback[SchemaReturnaddressListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceReturnaddressList,
    options: BodyResponseCallback[Readable | SchemaReturnaddressListResponse],
    callback: BodyResponseCallback[Readable | SchemaReturnaddressListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReturnaddressList, options: MethodOptions): GaxiosPromise[SchemaReturnaddressListResponse] = js.native
  def list(
    params: ParamsResourceReturnaddressList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReturnaddressListResponse]
  ): Unit = js.native
  /**
    * Lists the return addresses of the Merchant Center account.
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
    *   const res = await content.returnaddress.list({
    *     // List only return addresses applicable to the given country of sale. When omitted, all return addresses are listed.
    *     country: 'placeholder-value',
    *     // The maximum number of addresses in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The Merchant Center account to list return addresses for.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceReturnaddressList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReturnaddressList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
