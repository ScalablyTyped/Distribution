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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Creatives")
@js.native
open class ResourceCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Gets one creative by ID.
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
    *   const res = await dfareporting.creatives.get({
    *     // Creative ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "adParameters": "my_adParameters",
    *   //   "adTagKeys": [],
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "allowScriptAccess": false,
    *   //   "archived": false,
    *   //   "artworkType": "my_artworkType",
    *   //   "authoringSource": "my_authoringSource",
    *   //   "authoringTool": "my_authoringTool",
    *   //   "autoAdvanceImages": false,
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "backupImageClickThroughUrl": {},
    *   //   "backupImageFeatures": [],
    *   //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *   //   "backupImageTargetWindow": {},
    *   //   "clickTags": [],
    *   //   "commercialId": "my_commercialId",
    *   //   "companionCreatives": [],
    *   //   "compatibility": [],
    *   //   "convertFlashToHtml5": false,
    *   //   "counterCustomEvents": [],
    *   //   "creativeAssetSelection": {},
    *   //   "creativeAssets": [],
    *   //   "creativeFieldAssignments": [],
    *   //   "customKeyValues": [],
    *   //   "dynamicAssetSelection": false,
    *   //   "exitCustomEvents": [],
    *   //   "fsCommand": {},
    *   //   "htmlCode": "my_htmlCode",
    *   //   "htmlCodeLocked": false,
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *   //   "mediaDescription": "my_mediaDescription",
    *   //   "mediaDuration": {},
    *   //   "name": "my_name",
    *   //   "obaIcon": {},
    *   //   "overrideCss": "my_overrideCss",
    *   //   "progressOffset": {},
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "renderingId": "my_renderingId",
    *   //   "renderingIdDimensionValue": {},
    *   //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *   //   "requiredFlashVersion": 0,
    *   //   "size": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "sslCompliant": false,
    *   //   "sslOverride": false,
    *   //   "studioAdvertiserId": "my_studioAdvertiserId",
    *   //   "studioCreativeId": "my_studioCreativeId",
    *   //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *   //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *   //   "thirdPartyUrls": [],
    *   //   "timerCustomEvents": [],
    *   //   "totalFileSize": "my_totalFileSize",
    *   //   "type": "my_type",
    *   //   "universalAdId": {},
    *   //   "version": 0
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
  def get(params: ParamsResourceCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreative] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativesInsert, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Inserts a new creative.
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
    *   const res = await dfareporting.creatives.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "adParameters": "my_adParameters",
    *       //   "adTagKeys": [],
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "allowScriptAccess": false,
    *       //   "archived": false,
    *       //   "artworkType": "my_artworkType",
    *       //   "authoringSource": "my_authoringSource",
    *       //   "authoringTool": "my_authoringTool",
    *       //   "autoAdvanceImages": false,
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "backupImageClickThroughUrl": {},
    *       //   "backupImageFeatures": [],
    *       //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *       //   "backupImageTargetWindow": {},
    *       //   "clickTags": [],
    *       //   "commercialId": "my_commercialId",
    *       //   "companionCreatives": [],
    *       //   "compatibility": [],
    *       //   "convertFlashToHtml5": false,
    *       //   "counterCustomEvents": [],
    *       //   "creativeAssetSelection": {},
    *       //   "creativeAssets": [],
    *       //   "creativeFieldAssignments": [],
    *       //   "customKeyValues": [],
    *       //   "dynamicAssetSelection": false,
    *       //   "exitCustomEvents": [],
    *       //   "fsCommand": {},
    *       //   "htmlCode": "my_htmlCode",
    *       //   "htmlCodeLocked": false,
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *       //   "mediaDescription": "my_mediaDescription",
    *       //   "mediaDuration": {},
    *       //   "name": "my_name",
    *       //   "obaIcon": {},
    *       //   "overrideCss": "my_overrideCss",
    *       //   "progressOffset": {},
    *       //   "redirectUrl": "my_redirectUrl",
    *       //   "renderingId": "my_renderingId",
    *       //   "renderingIdDimensionValue": {},
    *       //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *       //   "requiredFlashVersion": 0,
    *       //   "size": {},
    *       //   "skipOffset": {},
    *       //   "skippable": false,
    *       //   "sslCompliant": false,
    *       //   "sslOverride": false,
    *       //   "studioAdvertiserId": "my_studioAdvertiserId",
    *       //   "studioCreativeId": "my_studioCreativeId",
    *       //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *       //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *       //   "thirdPartyUrls": [],
    *       //   "timerCustomEvents": [],
    *       //   "totalFileSize": "my_totalFileSize",
    *       //   "type": "my_type",
    *       //   "universalAdId": {},
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "adParameters": "my_adParameters",
    *   //   "adTagKeys": [],
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "allowScriptAccess": false,
    *   //   "archived": false,
    *   //   "artworkType": "my_artworkType",
    *   //   "authoringSource": "my_authoringSource",
    *   //   "authoringTool": "my_authoringTool",
    *   //   "autoAdvanceImages": false,
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "backupImageClickThroughUrl": {},
    *   //   "backupImageFeatures": [],
    *   //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *   //   "backupImageTargetWindow": {},
    *   //   "clickTags": [],
    *   //   "commercialId": "my_commercialId",
    *   //   "companionCreatives": [],
    *   //   "compatibility": [],
    *   //   "convertFlashToHtml5": false,
    *   //   "counterCustomEvents": [],
    *   //   "creativeAssetSelection": {},
    *   //   "creativeAssets": [],
    *   //   "creativeFieldAssignments": [],
    *   //   "customKeyValues": [],
    *   //   "dynamicAssetSelection": false,
    *   //   "exitCustomEvents": [],
    *   //   "fsCommand": {},
    *   //   "htmlCode": "my_htmlCode",
    *   //   "htmlCodeLocked": false,
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *   //   "mediaDescription": "my_mediaDescription",
    *   //   "mediaDuration": {},
    *   //   "name": "my_name",
    *   //   "obaIcon": {},
    *   //   "overrideCss": "my_overrideCss",
    *   //   "progressOffset": {},
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "renderingId": "my_renderingId",
    *   //   "renderingIdDimensionValue": {},
    *   //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *   //   "requiredFlashVersion": 0,
    *   //   "size": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "sslCompliant": false,
    *   //   "sslOverride": false,
    *   //   "studioAdvertiserId": "my_studioAdvertiserId",
    *   //   "studioCreativeId": "my_studioCreativeId",
    *   //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *   //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *   //   "thirdPartyUrls": [],
    *   //   "timerCustomEvents": [],
    *   //   "totalFileSize": "my_totalFileSize",
    *   //   "type": "my_type",
    *   //   "universalAdId": {},
    *   //   "version": 0
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
  def insert(params: ParamsResourceCreativesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(params: ParamsResourceCreativesList): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(params: ParamsResourceCreativesList, callback: BodyResponseCallback[SchemaCreativesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: BodyResponseCallback[Readable | SchemaCreativesListResponse],
    callback: BodyResponseCallback[Readable | SchemaCreativesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativesList, options: MethodOptions): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of creatives, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.creatives.list({
    *     // Select only active creatives. Leave blank to select active and inactive creatives.
    *     active: 'placeholder-value',
    *     // Select only creatives with this advertiser ID.
    *     advertiserId: 'placeholder-value',
    *     // Select only archived creatives. Leave blank to select archived and unarchived creatives.
    *     archived: 'placeholder-value',
    *     // Select only creatives with this campaign ID.
    *     campaignId: 'placeholder-value',
    *     // Select only in-stream video creatives with these companion IDs.
    *     companionCreativeIds: 'placeholder-value',
    *     // Select only creatives with these creative field IDs.
    *     creativeFieldIds: 'placeholder-value',
    *     // Select only creatives with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Select only creatives with these rendering IDs.
    *     renderingIds: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "creative*2015" will return objects with names like "creative June 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    *     searchString: 'placeholder-value',
    *     // Select only creatives with these size IDs.
    *     sizeIds: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only creatives corresponding to this Studio creative ID.
    *     studioCreativeId: 'placeholder-value',
    *     // Select only creatives with these creative types.
    *     types: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creatives": [],
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
  def list(params: ParamsResourceCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCreative] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceCreativesPatch): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceCreativesPatch, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(
    params: ParamsResourceCreativesPatch,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativesPatch, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(
    params: ParamsResourceCreativesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Updates an existing creative. This method supports patch semantics.
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
    *   const res = await dfareporting.creatives.patch({
    *     // Creative ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "adParameters": "my_adParameters",
    *       //   "adTagKeys": [],
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "allowScriptAccess": false,
    *       //   "archived": false,
    *       //   "artworkType": "my_artworkType",
    *       //   "authoringSource": "my_authoringSource",
    *       //   "authoringTool": "my_authoringTool",
    *       //   "autoAdvanceImages": false,
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "backupImageClickThroughUrl": {},
    *       //   "backupImageFeatures": [],
    *       //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *       //   "backupImageTargetWindow": {},
    *       //   "clickTags": [],
    *       //   "commercialId": "my_commercialId",
    *       //   "companionCreatives": [],
    *       //   "compatibility": [],
    *       //   "convertFlashToHtml5": false,
    *       //   "counterCustomEvents": [],
    *       //   "creativeAssetSelection": {},
    *       //   "creativeAssets": [],
    *       //   "creativeFieldAssignments": [],
    *       //   "customKeyValues": [],
    *       //   "dynamicAssetSelection": false,
    *       //   "exitCustomEvents": [],
    *       //   "fsCommand": {},
    *       //   "htmlCode": "my_htmlCode",
    *       //   "htmlCodeLocked": false,
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *       //   "mediaDescription": "my_mediaDescription",
    *       //   "mediaDuration": {},
    *       //   "name": "my_name",
    *       //   "obaIcon": {},
    *       //   "overrideCss": "my_overrideCss",
    *       //   "progressOffset": {},
    *       //   "redirectUrl": "my_redirectUrl",
    *       //   "renderingId": "my_renderingId",
    *       //   "renderingIdDimensionValue": {},
    *       //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *       //   "requiredFlashVersion": 0,
    *       //   "size": {},
    *       //   "skipOffset": {},
    *       //   "skippable": false,
    *       //   "sslCompliant": false,
    *       //   "sslOverride": false,
    *       //   "studioAdvertiserId": "my_studioAdvertiserId",
    *       //   "studioCreativeId": "my_studioCreativeId",
    *       //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *       //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *       //   "thirdPartyUrls": [],
    *       //   "timerCustomEvents": [],
    *       //   "totalFileSize": "my_totalFileSize",
    *       //   "type": "my_type",
    *       //   "universalAdId": {},
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "adParameters": "my_adParameters",
    *   //   "adTagKeys": [],
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "allowScriptAccess": false,
    *   //   "archived": false,
    *   //   "artworkType": "my_artworkType",
    *   //   "authoringSource": "my_authoringSource",
    *   //   "authoringTool": "my_authoringTool",
    *   //   "autoAdvanceImages": false,
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "backupImageClickThroughUrl": {},
    *   //   "backupImageFeatures": [],
    *   //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *   //   "backupImageTargetWindow": {},
    *   //   "clickTags": [],
    *   //   "commercialId": "my_commercialId",
    *   //   "companionCreatives": [],
    *   //   "compatibility": [],
    *   //   "convertFlashToHtml5": false,
    *   //   "counterCustomEvents": [],
    *   //   "creativeAssetSelection": {},
    *   //   "creativeAssets": [],
    *   //   "creativeFieldAssignments": [],
    *   //   "customKeyValues": [],
    *   //   "dynamicAssetSelection": false,
    *   //   "exitCustomEvents": [],
    *   //   "fsCommand": {},
    *   //   "htmlCode": "my_htmlCode",
    *   //   "htmlCodeLocked": false,
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *   //   "mediaDescription": "my_mediaDescription",
    *   //   "mediaDuration": {},
    *   //   "name": "my_name",
    *   //   "obaIcon": {},
    *   //   "overrideCss": "my_overrideCss",
    *   //   "progressOffset": {},
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "renderingId": "my_renderingId",
    *   //   "renderingIdDimensionValue": {},
    *   //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *   //   "requiredFlashVersion": 0,
    *   //   "size": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "sslCompliant": false,
    *   //   "sslOverride": false,
    *   //   "studioAdvertiserId": "my_studioAdvertiserId",
    *   //   "studioCreativeId": "my_studioCreativeId",
    *   //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *   //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *   //   "thirdPartyUrls": [],
    *   //   "timerCustomEvents": [],
    *   //   "totalFileSize": "my_totalFileSize",
    *   //   "type": "my_type",
    *   //   "universalAdId": {},
    *   //   "version": 0
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
  def patch(params: ParamsResourceCreativesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCreativesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCreative] = js.native
  def update(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceCreativesUpdate): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceCreativesUpdate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(
    params: ParamsResourceCreativesUpdate,
    options: BodyResponseCallback[Readable | SchemaCreative],
    callback: BodyResponseCallback[Readable | SchemaCreative]
  ): Unit = js.native
  def update(params: ParamsResourceCreativesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(
    params: ParamsResourceCreativesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  /**
    * Updates an existing creative.
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
    *   const res = await dfareporting.creatives.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "adParameters": "my_adParameters",
    *       //   "adTagKeys": [],
    *       //   "additionalSizes": [],
    *       //   "advertiserId": "my_advertiserId",
    *       //   "allowScriptAccess": false,
    *       //   "archived": false,
    *       //   "artworkType": "my_artworkType",
    *       //   "authoringSource": "my_authoringSource",
    *       //   "authoringTool": "my_authoringTool",
    *       //   "autoAdvanceImages": false,
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "backupImageClickThroughUrl": {},
    *       //   "backupImageFeatures": [],
    *       //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *       //   "backupImageTargetWindow": {},
    *       //   "clickTags": [],
    *       //   "commercialId": "my_commercialId",
    *       //   "companionCreatives": [],
    *       //   "compatibility": [],
    *       //   "convertFlashToHtml5": false,
    *       //   "counterCustomEvents": [],
    *       //   "creativeAssetSelection": {},
    *       //   "creativeAssets": [],
    *       //   "creativeFieldAssignments": [],
    *       //   "customKeyValues": [],
    *       //   "dynamicAssetSelection": false,
    *       //   "exitCustomEvents": [],
    *       //   "fsCommand": {},
    *       //   "htmlCode": "my_htmlCode",
    *       //   "htmlCodeLocked": false,
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *       //   "mediaDescription": "my_mediaDescription",
    *       //   "mediaDuration": {},
    *       //   "name": "my_name",
    *       //   "obaIcon": {},
    *       //   "overrideCss": "my_overrideCss",
    *       //   "progressOffset": {},
    *       //   "redirectUrl": "my_redirectUrl",
    *       //   "renderingId": "my_renderingId",
    *       //   "renderingIdDimensionValue": {},
    *       //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *       //   "requiredFlashVersion": 0,
    *       //   "size": {},
    *       //   "skipOffset": {},
    *       //   "skippable": false,
    *       //   "sslCompliant": false,
    *       //   "sslOverride": false,
    *       //   "studioAdvertiserId": "my_studioAdvertiserId",
    *       //   "studioCreativeId": "my_studioCreativeId",
    *       //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *       //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *       //   "thirdPartyUrls": [],
    *       //   "timerCustomEvents": [],
    *       //   "totalFileSize": "my_totalFileSize",
    *       //   "type": "my_type",
    *       //   "universalAdId": {},
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "adParameters": "my_adParameters",
    *   //   "adTagKeys": [],
    *   //   "additionalSizes": [],
    *   //   "advertiserId": "my_advertiserId",
    *   //   "allowScriptAccess": false,
    *   //   "archived": false,
    *   //   "artworkType": "my_artworkType",
    *   //   "authoringSource": "my_authoringSource",
    *   //   "authoringTool": "my_authoringTool",
    *   //   "autoAdvanceImages": false,
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "backupImageClickThroughUrl": {},
    *   //   "backupImageFeatures": [],
    *   //   "backupImageReportingLabel": "my_backupImageReportingLabel",
    *   //   "backupImageTargetWindow": {},
    *   //   "clickTags": [],
    *   //   "commercialId": "my_commercialId",
    *   //   "companionCreatives": [],
    *   //   "compatibility": [],
    *   //   "convertFlashToHtml5": false,
    *   //   "counterCustomEvents": [],
    *   //   "creativeAssetSelection": {},
    *   //   "creativeAssets": [],
    *   //   "creativeFieldAssignments": [],
    *   //   "customKeyValues": [],
    *   //   "dynamicAssetSelection": false,
    *   //   "exitCustomEvents": [],
    *   //   "fsCommand": {},
    *   //   "htmlCode": "my_htmlCode",
    *   //   "htmlCodeLocked": false,
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "latestTraffickedCreativeId": "my_latestTraffickedCreativeId",
    *   //   "mediaDescription": "my_mediaDescription",
    *   //   "mediaDuration": {},
    *   //   "name": "my_name",
    *   //   "obaIcon": {},
    *   //   "overrideCss": "my_overrideCss",
    *   //   "progressOffset": {},
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "renderingId": "my_renderingId",
    *   //   "renderingIdDimensionValue": {},
    *   //   "requiredFlashPluginVersion": "my_requiredFlashPluginVersion",
    *   //   "requiredFlashVersion": 0,
    *   //   "size": {},
    *   //   "skipOffset": {},
    *   //   "skippable": false,
    *   //   "sslCompliant": false,
    *   //   "sslOverride": false,
    *   //   "studioAdvertiserId": "my_studioAdvertiserId",
    *   //   "studioCreativeId": "my_studioCreativeId",
    *   //   "studioTraffickedCreativeId": "my_studioTraffickedCreativeId",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "thirdPartyBackupImageImpressionsUrl": "my_thirdPartyBackupImageImpressionsUrl",
    *   //   "thirdPartyRichMediaImpressionsUrl": "my_thirdPartyRichMediaImpressionsUrl",
    *   //   "thirdPartyUrls": [],
    *   //   "timerCustomEvents": [],
    *   //   "totalFileSize": "my_totalFileSize",
    *   //   "type": "my_type",
    *   //   "universalAdId": {},
    *   //   "version": 0
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
  def update(params: ParamsResourceCreativesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCreativesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
