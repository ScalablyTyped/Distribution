package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Creativefieldvalues")
@js.native
open class ResourceCreativefieldvalues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCreativefieldvaluesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCreativefieldvaluesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing creative field value.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.delete({
    *     // Creative field ID for this creative field value.
    *     creativeFieldId: 'placeholder-value',
    *     // Creative Field Value ID
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
  def delete(params: ParamsResourceCreativefieldvaluesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCreativefieldvaluesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(params: ParamsResourceCreativefieldvaluesGet): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldValue],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldValue]
  ): Unit = js.native
  def get(params: ParamsResourceCreativefieldvaluesGet, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * Gets one creative field value by ID.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.get({
    *     // Creative field ID for this creative field value.
    *     creativeFieldId: 'placeholder-value',
    *     // Creative Field Value ID
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "value": "my_value"
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
  def get(params: ParamsResourceCreativefieldvaluesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(params: ParamsResourceCreativefieldvaluesInsert): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldValue],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldValue]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativefieldvaluesInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * Inserts a new creative field value.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.insert({
    *     // Creative field ID for this creative field value.
    *     creativeFieldId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "value": "my_value"
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
  def insert(params: ParamsResourceCreativefieldvaluesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(params: ParamsResourceCreativefieldvaluesList): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldValuesListResponse],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativefieldvaluesList, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of creative field values, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.list({
    *     // Creative field ID for this creative field value.
    *     creativeFieldId: 'placeholder-value',
    *     // Select only creative field values with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for creative field values by their values. Wildcards (e.g. *) are not allowed.
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
    *   //   "creativeFieldValues": [],
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
  def list(params: ParamsResourceCreativefieldvaluesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(params: ParamsResourceCreativefieldvaluesPatch): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldValue],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldValue]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativefieldvaluesPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * Updates an existing creative field value. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.patch({
    *     // CreativeField ID.
    *     creativeFieldId: 'placeholder-value',
    *     // CreativeFieldValue ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "value": "my_value"
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
  def patch(params: ParamsResourceCreativefieldvaluesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(params: ParamsResourceCreativefieldvaluesUpdate): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    options: BodyResponseCallback[Readable | SchemaCreativeFieldValue],
    callback: BodyResponseCallback[Readable | SchemaCreativeFieldValue]
  ): Unit = js.native
  def update(params: ParamsResourceCreativefieldvaluesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * Updates an existing creative field value.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.creativeFieldValues.update({
    *     // Creative field ID for this creative field value.
    *     creativeFieldId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "value": "my_value"
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
  def update(params: ParamsResourceCreativefieldvaluesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
