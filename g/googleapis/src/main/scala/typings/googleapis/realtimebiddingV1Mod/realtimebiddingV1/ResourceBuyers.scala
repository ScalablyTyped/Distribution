package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Buyers")
@js.native
open class ResourceBuyers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var creatives: ResourceBuyersCreatives = js.native
  
  def get(): GaxiosPromise[SchemaBuyer] = js.native
  def get(callback: BodyResponseCallback[SchemaBuyer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuyer] = js.native
  def get(params: ParamsResourceBuyersGet): GaxiosPromise[SchemaBuyer] = js.native
  def get(params: ParamsResourceBuyersGet, callback: BodyResponseCallback[SchemaBuyer]): Unit = js.native
  def get(
    params: ParamsResourceBuyersGet,
    options: BodyResponseCallback[Readable | SchemaBuyer],
    callback: BodyResponseCallback[Readable | SchemaBuyer]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersGet, options: MethodOptions): GaxiosPromise[SchemaBuyer] = js.native
  def get(
    params: ParamsResourceBuyersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuyer]
  ): Unit = js.native
  /**
    * Gets a buyer account by its name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.get({
    *     // Required. Name of the buyer to get. Format: `buyers/{buyerId\}`
    *     name: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeCreativeCount": "my_activeCreativeCount",
    *   //   "bidder": "my_bidder",
    *   //   "billingIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "maximumActiveCreativeCount": "my_maximumActiveCreativeCount",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceBuyersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRemarketingTag(): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(callback: BodyResponseCallback[SchemaGetRemarketingTagResponse]): Unit = js.native
  def getRemarketingTag(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(params: ParamsResourceBuyersGetremarketingtag): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersGetremarketingtag,
    callback: BodyResponseCallback[SchemaGetRemarketingTagResponse]
  ): Unit = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersGetremarketingtag,
    options: BodyResponseCallback[Readable | SchemaGetRemarketingTagResponse],
    callback: BodyResponseCallback[Readable | SchemaGetRemarketingTagResponse]
  ): Unit = js.native
  def getRemarketingTag(params: ParamsResourceBuyersGetremarketingtag, options: MethodOptions): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersGetremarketingtag,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetRemarketingTagResponse]
  ): Unit = js.native
  /**
    * Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google adds the user to a user list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.getRemarketingTag({
    *     // Required. To fetch remarketing tag for an account, name must follow the pattern `buyers/{accountId\}` where `{accountId\}` represents ID of a buyer that owns the remarketing tag. For a bidder accessing remarketing tag on behalf of a child seat buyer, `{accountId\}` should represent the ID of the child seat buyer. To fetch remarketing tag for a specific user list, name must follow the pattern `buyers/{accountId\}/userLists/{userListId\}`. See UserList.name.
    *     name: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "snippet": "my_snippet"
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
  def getRemarketingTag(params: ParamsResourceBuyersGetremarketingtag, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersGetremarketingtag,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBuyersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBuyersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBuyersResponse] = js.native
  def list(params: ParamsResourceBuyersList): GaxiosPromise[SchemaListBuyersResponse] = js.native
  def list(params: ParamsResourceBuyersList, callback: BodyResponseCallback[SchemaListBuyersResponse]): Unit = js.native
  def list(
    params: ParamsResourceBuyersList,
    options: BodyResponseCallback[Readable | SchemaListBuyersResponse],
    callback: BodyResponseCallback[Readable | SchemaListBuyersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersList, options: MethodOptions): GaxiosPromise[SchemaListBuyersResponse] = js.native
  def list(
    params: ParamsResourceBuyersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBuyersResponse]
  ): Unit = js.native
  /**
    * Lists all buyer account information the calling buyer user or service account is permissioned to manage.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.buyers.list({
    *     // The maximum number of buyers to return. If unspecified, at most 100 buyers will be returned. The maximum value is 500; values above 500 will be coerced to 500.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. This value is received from a previous `ListBuyers` call in ListBuyersResponse.nextPageToken.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buyers": [],
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
  def list(params: ParamsResourceBuyersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var userLists: ResourceBuyersUserlists = js.native
}
