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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Eventtags")
@js.native
open class ResourceEventtags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventtagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventtagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEventtagsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEventtagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEventtagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing event tag.
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
    *   const res = await dfareporting.eventTags.delete({
    *     // Event tag ID.
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
  def delete(params: ParamsResourceEventtagsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEventtagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEventTag] = js.native
  def get(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def get(params: ParamsResourceEventtagsGet): GaxiosPromise[SchemaEventTag] = js.native
  def get(params: ParamsResourceEventtagsGet, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def get(
    params: ParamsResourceEventtagsGet,
    options: BodyResponseCallback[Readable | SchemaEventTag],
    callback: BodyResponseCallback[Readable | SchemaEventTag]
  ): Unit = js.native
  def get(params: ParamsResourceEventtagsGet, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def get(
    params: ParamsResourceEventtagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * Gets one event tag by ID.
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
    *   const res = await dfareporting.eventTags.get({
    *     // Event tag ID.
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
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "enabledByDefault": false,
    *   //   "excludeFromAdxRequests": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteFilterType": "my_siteFilterType",
    *   //   "siteIds": [],
    *   //   "sslCompliant": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "type": "my_type",
    *   //   "url": "my_url",
    *   //   "urlEscapeLevels": 0
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
  def get(params: ParamsResourceEventtagsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEventtagsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaEventTag] = js.native
  def insert(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def insert(params: ParamsResourceEventtagsInsert): GaxiosPromise[SchemaEventTag] = js.native
  def insert(params: ParamsResourceEventtagsInsert, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def insert(
    params: ParamsResourceEventtagsInsert,
    options: BodyResponseCallback[Readable | SchemaEventTag],
    callback: BodyResponseCallback[Readable | SchemaEventTag]
  ): Unit = js.native
  def insert(params: ParamsResourceEventtagsInsert, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def insert(
    params: ParamsResourceEventtagsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * Inserts a new event tag.
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
    *   const res = await dfareporting.eventTags.insert({
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
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "enabledByDefault": false,
    *       //   "excludeFromAdxRequests": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteFilterType": "my_siteFilterType",
    *       //   "siteIds": [],
    *       //   "sslCompliant": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "type": "my_type",
    *       //   "url": "my_url",
    *       //   "urlEscapeLevels": 0
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
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "enabledByDefault": false,
    *   //   "excludeFromAdxRequests": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteFilterType": "my_siteFilterType",
    *   //   "siteIds": [],
    *   //   "sslCompliant": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "type": "my_type",
    *   //   "url": "my_url",
    *   //   "urlEscapeLevels": 0
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
  def insert(params: ParamsResourceEventtagsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceEventtagsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEventTagsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(params: ParamsResourceEventtagsList): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(params: ParamsResourceEventtagsList, callback: BodyResponseCallback[SchemaEventTagsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEventtagsList,
    options: BodyResponseCallback[Readable | SchemaEventTagsListResponse],
    callback: BodyResponseCallback[Readable | SchemaEventTagsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEventtagsList, options: MethodOptions): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(
    params: ParamsResourceEventtagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTagsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of event tags, possibly filtered.
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
    *   const res = await dfareporting.eventTags.list({
    *     // Select only event tags that belong to this ad.
    *     adId: 'placeholder-value',
    *     // Select only event tags that belong to this advertiser.
    *     advertiserId: 'placeholder-value',
    *     // Select only event tags that belong to this campaign.
    *     campaignId: 'placeholder-value',
    *     // Examine only the specified campaign or advertiser's event tags for matching selector criteria. When set to false, the parent advertiser and parent campaign of the specified ad or campaign is examined as well. In addition, when set to false, the status field is examined as well, along with the enabledByDefault field. This parameter can not be set to true when adId is specified as ads do not define their own even tags.
    *     definitionsOnly: 'placeholder-value',
    *     // Select only enabled event tags. What is considered enabled or disabled depends on the definitionsOnly parameter. When definitionsOnly is set to true, only the specified advertiser or campaign's event tags' enabledByDefault field is examined. When definitionsOnly is set to false, the specified ad or specified campaign's parent advertiser's or parent campaign's event tags' enabledByDefault and status fields are examined as well.
    *     enabled: 'placeholder-value',
    *     // Select only event tags with the specified event tag types. Event tag types can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either impression or click tracking.
    *     eventTagTypes: 'placeholder-value',
    *     // Select only event tags with these IDs.
    *     ids: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "eventtag*2015" will return objects with names like "eventtag June 2015", "eventtag April 2015", or simply "eventtag 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "eventtag" will match objects with name "my eventtag", "eventtag 2015", or simply "eventtag".
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
    *   //   "eventTags": [],
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
  def list(params: ParamsResourceEventtagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEventtagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEventTag] = js.native
  def patch(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def patch(params: ParamsResourceEventtagsPatch): GaxiosPromise[SchemaEventTag] = js.native
  def patch(params: ParamsResourceEventtagsPatch, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def patch(
    params: ParamsResourceEventtagsPatch,
    options: BodyResponseCallback[Readable | SchemaEventTag],
    callback: BodyResponseCallback[Readable | SchemaEventTag]
  ): Unit = js.native
  def patch(params: ParamsResourceEventtagsPatch, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def patch(
    params: ParamsResourceEventtagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * Updates an existing event tag. This method supports patch semantics.
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
    *   const res = await dfareporting.eventTags.patch({
    *     // EventTag ID.
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
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "enabledByDefault": false,
    *       //   "excludeFromAdxRequests": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteFilterType": "my_siteFilterType",
    *       //   "siteIds": [],
    *       //   "sslCompliant": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "type": "my_type",
    *       //   "url": "my_url",
    *       //   "urlEscapeLevels": 0
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
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "enabledByDefault": false,
    *   //   "excludeFromAdxRequests": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteFilterType": "my_siteFilterType",
    *   //   "siteIds": [],
    *   //   "sslCompliant": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "type": "my_type",
    *   //   "url": "my_url",
    *   //   "urlEscapeLevels": 0
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
  def patch(params: ParamsResourceEventtagsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEventtagsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEventTag] = js.native
  def update(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def update(params: ParamsResourceEventtagsUpdate): GaxiosPromise[SchemaEventTag] = js.native
  def update(params: ParamsResourceEventtagsUpdate, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def update(
    params: ParamsResourceEventtagsUpdate,
    options: BodyResponseCallback[Readable | SchemaEventTag],
    callback: BodyResponseCallback[Readable | SchemaEventTag]
  ): Unit = js.native
  def update(params: ParamsResourceEventtagsUpdate, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def update(
    params: ParamsResourceEventtagsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * Updates an existing event tag.
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
    *   const res = await dfareporting.eventTags.update({
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
    *       //   "campaignId": "my_campaignId",
    *       //   "campaignIdDimensionValue": {},
    *       //   "enabledByDefault": false,
    *       //   "excludeFromAdxRequests": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteFilterType": "my_siteFilterType",
    *       //   "siteIds": [],
    *       //   "sslCompliant": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "type": "my_type",
    *       //   "url": "my_url",
    *       //   "urlEscapeLevels": 0
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
    *   //   "campaignId": "my_campaignId",
    *   //   "campaignIdDimensionValue": {},
    *   //   "enabledByDefault": false,
    *   //   "excludeFromAdxRequests": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteFilterType": "my_siteFilterType",
    *   //   "siteIds": [],
    *   //   "sslCompliant": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "type": "my_type",
    *   //   "url": "my_url",
    *   //   "urlEscapeLevels": 0
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
  def update(params: ParamsResourceEventtagsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEventtagsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
