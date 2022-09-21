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

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Floodlightactivities")
@js.native
open class ResourceFloodlightactivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceFloodlightactivitiesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceFloodlightactivitiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing floodlight activity.
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
    *   const res = await dfareporting.floodlightActivities.delete({
    *     // Floodlight activity ID.
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
  def delete(params: ParamsResourceFloodlightactivitiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFloodlightactivitiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generatetag(): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]): Unit = js.native
  def generatetag(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(params: ParamsResourceFloodlightactivitiesGeneratetag): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivitiesGenerateTagResponse],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(params: ParamsResourceFloodlightactivitiesGeneratetag, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  /**
    * Generates a tag for a floodlight activity.
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
    *   const res = await dfareporting.floodlightActivities.generatetag({
    *     // Floodlight activity ID for which we want to generate a tag.
    *     floodlightActivityId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "floodlightActivityTag": "my_floodlightActivityTag",
    *   //   "globalSiteTagGlobalSnippet": "my_globalSiteTagGlobalSnippet",
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
  def generatetag(params: ParamsResourceFloodlightactivitiesGeneratetag, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(params: ParamsResourceFloodlightactivitiesGet): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivity],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivity]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightactivitiesGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * Gets one floodlight activity by ID.
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
    *   const res = await dfareporting.floodlightActivities.get({
    *     // Floodlight activity ID.
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
    *   //   "attributionEnabled": false,
    *   //   "cacheBustingType": "my_cacheBustingType",
    *   //   "countingMethod": "my_countingMethod",
    *   //   "defaultTags": [],
    *   //   "expectedUrl": "my_expectedUrl",
    *   //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *   //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *   //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *   //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "floodlightTagType": "my_floodlightTagType",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "publisherTags": [],
    *   //   "secure": false,
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormat": "my_tagFormat",
    *   //   "tagString": "my_tagString",
    *   //   "userDefinedVariableTypes": []
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
  def get(params: ParamsResourceFloodlightactivitiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(params: ParamsResourceFloodlightactivitiesInsert): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivity],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivity]
  ): Unit = js.native
  def insert(params: ParamsResourceFloodlightactivitiesInsert, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * Inserts a new floodlight activity.
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
    *   const res = await dfareporting.floodlightActivities.insert({
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
    *       //   "attributionEnabled": false,
    *       //   "cacheBustingType": "my_cacheBustingType",
    *       //   "countingMethod": "my_countingMethod",
    *       //   "defaultTags": [],
    *       //   "expectedUrl": "my_expectedUrl",
    *       //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *       //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *       //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *       //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "floodlightTagType": "my_floodlightTagType",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "publisherTags": [],
    *       //   "secure": false,
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormat": "my_tagFormat",
    *       //   "tagString": "my_tagString",
    *       //   "userDefinedVariableTypes": []
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
    *   //   "attributionEnabled": false,
    *   //   "cacheBustingType": "my_cacheBustingType",
    *   //   "countingMethod": "my_countingMethod",
    *   //   "defaultTags": [],
    *   //   "expectedUrl": "my_expectedUrl",
    *   //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *   //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *   //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *   //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "floodlightTagType": "my_floodlightTagType",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "publisherTags": [],
    *   //   "secure": false,
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormat": "my_tagFormat",
    *   //   "tagString": "my_tagString",
    *   //   "userDefinedVariableTypes": []
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
  def insert(params: ParamsResourceFloodlightactivitiesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(params: ParamsResourceFloodlightactivitiesList): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivitiesListResponse],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightactivitiesList, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.floodlightActivities.list({
    *     // Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    *     advertiserId: 'placeholder-value',
    *     // Select only floodlight activities with the specified floodlight activity group IDs.
    *     floodlightActivityGroupIds: 'placeholder-value',
    *     // Select only floodlight activities with the specified floodlight activity group name.
    *     floodlightActivityGroupName: 'placeholder-value',
    *     // Select only floodlight activities with the specified floodlight activity group tag string.
    *     floodlightActivityGroupTagString: 'placeholder-value',
    *     // Select only floodlight activities with the specified floodlight activity group type.
    *     floodlightActivityGroupType: 'placeholder-value',
    *     // Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    *     floodlightConfigurationId: 'placeholder-value',
    *     // Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivity*2015" will return objects with names like "floodlightactivity June 2015", "floodlightactivity April 2015", or simply "floodlightactivity 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivity" will match objects with name "my floodlightactivity activity", "floodlightactivity 2015", or simply "floodlightactivity".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only floodlight activities with the specified tag string.
    *     tagString: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "floodlightActivities": [],
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
  def list(params: ParamsResourceFloodlightactivitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(params: ParamsResourceFloodlightactivitiesPatch): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivity],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivity]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightactivitiesPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * Updates an existing floodlight activity. This method supports patch semantics.
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
    *   const res = await dfareporting.floodlightActivities.patch({
    *     // FloodlightActivity ID.
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
    *       //   "attributionEnabled": false,
    *       //   "cacheBustingType": "my_cacheBustingType",
    *       //   "countingMethod": "my_countingMethod",
    *       //   "defaultTags": [],
    *       //   "expectedUrl": "my_expectedUrl",
    *       //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *       //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *       //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *       //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "floodlightTagType": "my_floodlightTagType",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "publisherTags": [],
    *       //   "secure": false,
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormat": "my_tagFormat",
    *       //   "tagString": "my_tagString",
    *       //   "userDefinedVariableTypes": []
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
    *   //   "attributionEnabled": false,
    *   //   "cacheBustingType": "my_cacheBustingType",
    *   //   "countingMethod": "my_countingMethod",
    *   //   "defaultTags": [],
    *   //   "expectedUrl": "my_expectedUrl",
    *   //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *   //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *   //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *   //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "floodlightTagType": "my_floodlightTagType",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "publisherTags": [],
    *   //   "secure": false,
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormat": "my_tagFormat",
    *   //   "tagString": "my_tagString",
    *   //   "userDefinedVariableTypes": []
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
  def patch(params: ParamsResourceFloodlightactivitiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(params: ParamsResourceFloodlightactivitiesUpdate): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    options: BodyResponseCallback[Readable | SchemaFloodlightActivity],
    callback: BodyResponseCallback[Readable | SchemaFloodlightActivity]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightactivitiesUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * Updates an existing floodlight activity.
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
    *   const res = await dfareporting.floodlightActivities.update({
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
    *       //   "attributionEnabled": false,
    *       //   "cacheBustingType": "my_cacheBustingType",
    *       //   "countingMethod": "my_countingMethod",
    *       //   "defaultTags": [],
    *       //   "expectedUrl": "my_expectedUrl",
    *       //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *       //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *       //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *       //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "floodlightTagType": "my_floodlightTagType",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "notes": "my_notes",
    *       //   "publisherTags": [],
    *       //   "secure": false,
    *       //   "sslCompliant": false,
    *       //   "sslRequired": false,
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagFormat": "my_tagFormat",
    *       //   "tagString": "my_tagString",
    *       //   "userDefinedVariableTypes": []
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
    *   //   "attributionEnabled": false,
    *   //   "cacheBustingType": "my_cacheBustingType",
    *   //   "countingMethod": "my_countingMethod",
    *   //   "defaultTags": [],
    *   //   "expectedUrl": "my_expectedUrl",
    *   //   "floodlightActivityGroupId": "my_floodlightActivityGroupId",
    *   //   "floodlightActivityGroupName": "my_floodlightActivityGroupName",
    *   //   "floodlightActivityGroupTagString": "my_floodlightActivityGroupTagString",
    *   //   "floodlightActivityGroupType": "my_floodlightActivityGroupType",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "floodlightTagType": "my_floodlightTagType",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "publisherTags": [],
    *   //   "secure": false,
    *   //   "sslCompliant": false,
    *   //   "sslRequired": false,
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagFormat": "my_tagFormat",
    *   //   "tagString": "my_tagString",
    *   //   "userDefinedVariableTypes": []
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
  def update(params: ParamsResourceFloodlightactivitiesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
