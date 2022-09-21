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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Targetingtemplates")
@js.native
open class ResourceTargetingtemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(params: ParamsResourceTargetingtemplatesGet): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    options: BodyResponseCallback[Readable | SchemaTargetingTemplate],
    callback: BodyResponseCallback[Readable | SchemaTargetingTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceTargetingtemplatesGet, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  /**
    * Gets one targeting template by ID.
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
    *   const res = await dfareporting.targetingTemplates.get({
    *     // Targeting template ID.
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
    *   //   "dayPartTargeting": {},
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "listTargetingExpression": {},
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "technologyTargeting": {}
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
  def get(params: ParamsResourceTargetingtemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(params: ParamsResourceTargetingtemplatesInsert): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    options: BodyResponseCallback[Readable | SchemaTargetingTemplate],
    callback: BodyResponseCallback[Readable | SchemaTargetingTemplate]
  ): Unit = js.native
  def insert(params: ParamsResourceTargetingtemplatesInsert, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  /**
    * Inserts a new targeting template.
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
    *   const res = await dfareporting.targetingTemplates.insert({
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
    *       //   "dayPartTargeting": {},
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "listTargetingExpression": {},
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "technologyTargeting": {}
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
    *   //   "dayPartTargeting": {},
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "listTargetingExpression": {},
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "technologyTargeting": {}
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
  def insert(params: ParamsResourceTargetingtemplatesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(params: ParamsResourceTargetingtemplatesList): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    options: BodyResponseCallback[Readable | SchemaTargetingTemplatesListResponse],
    callback: BodyResponseCallback[Readable | SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTargetingtemplatesList, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of targeting templates, optionally filtered. This method supports paging.
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
    *   const res = await dfareporting.targetingTemplates.list({
    *     // Select only targeting templates with this advertiser ID.
    *     advertiserId: 'placeholder-value',
    *     // Select only targeting templates with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "template*2015" will return objects with names like "template June 2015", "template April 2015", or simply "template 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "template" will match objects with name "my template", "template 2015", or simply "template".
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
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "targetingTemplates": []
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
  def list(params: ParamsResourceTargetingtemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(params: ParamsResourceTargetingtemplatesPatch): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    options: BodyResponseCallback[Readable | SchemaTargetingTemplate],
    callback: BodyResponseCallback[Readable | SchemaTargetingTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceTargetingtemplatesPatch, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  /**
    * Updates an existing targeting template. This method supports patch semantics.
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
    *   const res = await dfareporting.targetingTemplates.patch({
    *     // TargetingTemplate ID.
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
    *       //   "dayPartTargeting": {},
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "listTargetingExpression": {},
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "technologyTargeting": {}
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
    *   //   "dayPartTargeting": {},
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "listTargetingExpression": {},
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "technologyTargeting": {}
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
  def patch(params: ParamsResourceTargetingtemplatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(params: ParamsResourceTargetingtemplatesUpdate): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    options: BodyResponseCallback[Readable | SchemaTargetingTemplate],
    callback: BodyResponseCallback[Readable | SchemaTargetingTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceTargetingtemplatesUpdate, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  /**
    * Updates an existing targeting template.
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
    *   const res = await dfareporting.targetingTemplates.update({
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
    *       //   "dayPartTargeting": {},
    *       //   "geoTargeting": {},
    *       //   "id": "my_id",
    *       //   "keyValueTargetingExpression": {},
    *       //   "kind": "my_kind",
    *       //   "languageTargeting": {},
    *       //   "listTargetingExpression": {},
    *       //   "name": "my_name",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "technologyTargeting": {}
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
    *   //   "dayPartTargeting": {},
    *   //   "geoTargeting": {},
    *   //   "id": "my_id",
    *   //   "keyValueTargetingExpression": {},
    *   //   "kind": "my_kind",
    *   //   "languageTargeting": {},
    *   //   "listTargetingExpression": {},
    *   //   "name": "my_name",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "technologyTargeting": {}
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
  def update(params: ParamsResourceTargetingtemplatesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
