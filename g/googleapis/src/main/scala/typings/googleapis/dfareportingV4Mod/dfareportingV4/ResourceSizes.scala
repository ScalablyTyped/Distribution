package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Sizes")
@js.native
open class ResourceSizes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSize] = js.native
  def get(callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def get(
    params: ParamsResourceSizesGet,
    options: BodyResponseCallback[Readable | SchemaSize],
    callback: BodyResponseCallback[Readable | SchemaSize]
  ): Unit = js.native
  def get(params: ParamsResourceSizesGet, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  /**
    * Gets one size by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.sizes.get({
    *     // Size ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "height": 0,
    *   //   "iab": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "width": 0
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
  def get(params: ParamsResourceSizesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSizesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSize] = js.native
  def insert(callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def insert(params: ParamsResourceSizesInsert): GaxiosPromise[SchemaSize] = js.native
  def insert(params: ParamsResourceSizesInsert, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def insert(
    params: ParamsResourceSizesInsert,
    options: BodyResponseCallback[Readable | SchemaSize],
    callback: BodyResponseCallback[Readable | SchemaSize]
  ): Unit = js.native
  def insert(params: ParamsResourceSizesInsert, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def insert(
    params: ParamsResourceSizesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSize]
  ): Unit = js.native
  /**
    * Inserts a new size.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.sizes.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "height": 0,
    *       //   "iab": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "width": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "height": 0,
    *   //   "iab": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "width": 0
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
  def insert(params: ParamsResourceSizesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSizesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSizesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(params: ParamsResourceSizesList): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(params: ParamsResourceSizesList, callback: BodyResponseCallback[SchemaSizesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSizesList,
    options: BodyResponseCallback[Readable | SchemaSizesListResponse],
    callback: BodyResponseCallback[Readable | SchemaSizesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSizesList, options: MethodOptions): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(
    params: ParamsResourceSizesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSizesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of sizes, possibly filtered. Retrieved sizes are globally unique and may include values not currently in use by your account. Due to this, the list of sizes returned by this method may differ from the list seen in the Trafficking UI.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.sizes.list({
    *     // Select only sizes with this height.
    *     height: 'placeholder-value',
    *     // Select only IAB standard sizes.
    *     iabStandard: 'placeholder-value',
    *     // Select only sizes with these IDs.
    *     ids: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Select only sizes with this width.
    *     width: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "sizes": []
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
  def list(params: ParamsResourceSizesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSizesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
