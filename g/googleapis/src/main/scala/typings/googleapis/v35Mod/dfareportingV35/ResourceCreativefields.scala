package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Creativefields")
@js.native
open class ResourceCreativefields protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCreativefieldsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCreativefieldsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCreativefieldsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing creative field.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.delete({
    *     // Creative Field ID
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
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
  def delete(params: ParamsResourceCreativefieldsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCreativefieldsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCreativeField] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def get(params: ParamsResourceCreativefieldsGet): GaxiosPromise[SchemaCreativeField] = js.native
  def get(params: ParamsResourceCreativefieldsGet, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def get(
    params: ParamsResourceCreativefieldsGet,
    options: BodyResponseCallback[Readable | SchemaCreativeField],
    callback: BodyResponseCallback[Readable | SchemaCreativeField]
  ): Unit = js.native
  def get(params: ParamsResourceCreativefieldsGet, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def get(
    params: ParamsResourceCreativefieldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  /**
    * Gets one creative field by ID.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.get({
    *     // Creative Field ID
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def get(params: ParamsResourceCreativefieldsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCreativefieldsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(params: ParamsResourceCreativefieldsInsert): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(params: ParamsResourceCreativefieldsInsert, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def insert(
    params: ParamsResourceCreativefieldsInsert,
    options: BodyResponseCallback[Readable | SchemaCreativeField],
    callback: BodyResponseCallback[Readable | SchemaCreativeField]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativefieldsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(
    params: ParamsResourceCreativefieldsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  /**
    * Inserts a new creative field.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def insert(params: ParamsResourceCreativefieldsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativefieldsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(params: ParamsResourceCreativefieldsList): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldsListResponse],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativefieldsList, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of creative fields, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.list({
    *     // Select only creative fields that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only creative fields with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for creative fields by name or ID. Wildcards (*) are allowed. For example, "creativefield*2015" will return creative fields with names like "creativefield June 2015", "creativefield April 2015", or simply "creativefield 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativefield" will match creative fields with the name "my creativefield", "creativefield 2015", or simply "creativefield".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creativeFields": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceCreativefieldsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(params: ParamsResourceCreativefieldsPatch): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(params: ParamsResourceCreativefieldsPatch, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def patch(
    params: ParamsResourceCreativefieldsPatch,
    options: BodyResponseCallback[Readable | SchemaCreativeField],
    callback: BodyResponseCallback[Readable | SchemaCreativeField]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativefieldsPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(
    params: ParamsResourceCreativefieldsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  /**
    * Updates an existing creative field. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.patch({
    *     // CreativeField ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def patch(params: ParamsResourceCreativefieldsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCreativefieldsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCreativeField] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def update(params: ParamsResourceCreativefieldsUpdate): GaxiosPromise[SchemaCreativeField] = js.native
  def update(params: ParamsResourceCreativefieldsUpdate, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def update(
    params: ParamsResourceCreativefieldsUpdate,
    options: BodyResponseCallback[Readable | SchemaCreativeField],
    callback: BodyResponseCallback[Readable | SchemaCreativeField]
  ): Unit = js.native
  def update(params: ParamsResourceCreativefieldsUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def update(
    params: ParamsResourceCreativefieldsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  /**
    * Updates an existing creative field.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.creativeFields.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId"
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
  def update(params: ParamsResourceCreativefieldsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCreativefieldsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
