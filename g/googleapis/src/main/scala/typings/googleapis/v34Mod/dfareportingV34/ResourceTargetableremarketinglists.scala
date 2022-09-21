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

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Targetableremarketinglists")
@js.native
open class ResourceTargetableremarketinglists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetableRemarketingList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(params: ParamsResourceTargetableremarketinglistsGet): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    callback: BodyResponseCallback[SchemaTargetableRemarketingList]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    options: BodyResponseCallback[Readable | SchemaTargetableRemarketingList],
    callback: BodyResponseCallback[Readable | SchemaTargetableRemarketingList]
  ): Unit = js.native
  def get(params: ParamsResourceTargetableremarketinglistsGet, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetableRemarketingList]
  ): Unit = js.native
  /**
    * Gets one remarketing list by ID.
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
    *   const res = await dfareporting.targetableRemarketingLists.get({
    *     // Remarketing list ID.
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
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lifeSpan": "my_lifeSpan",
    *   //   "listSize": "my_listSize",
    *   //   "listSource": "my_listSource",
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
  def get(params: ParamsResourceTargetableremarketinglistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(params: ParamsResourceTargetableremarketinglistsList): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    options: BodyResponseCallback[Readable | SchemaTargetableRemarketingListsListResponse],
    callback: BodyResponseCallback[Readable | SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTargetableremarketinglistsList, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.targetableRemarketingLists.list({
    *     // Select only active or only inactive targetable remarketing lists.
    *     active: 'placeholder-value',
    *     // Select only targetable remarketing lists targetable by these advertisers.
    *     advertiserId: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "remarketing list*2015" will return objects with names like "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list", "remarketing list 2015", or simply "remarketing list".
    *     name: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
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
    *   //   "targetableRemarketingLists": []
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
  def list(params: ParamsResourceTargetableremarketinglistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
