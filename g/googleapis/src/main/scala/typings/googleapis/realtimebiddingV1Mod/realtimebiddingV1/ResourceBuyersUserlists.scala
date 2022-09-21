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

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Buyers$Userlists")
@js.native
open class ResourceBuyersUserlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def close(): GaxiosPromise[SchemaUserList] = js.native
  def close(callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def close(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def close(params: ParamsResourceBuyersUserlistsClose): GaxiosPromise[SchemaUserList] = js.native
  def close(params: ParamsResourceBuyersUserlistsClose, callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def close(
    params: ParamsResourceBuyersUserlistsClose,
    options: BodyResponseCallback[Readable | SchemaUserList],
    callback: BodyResponseCallback[Readable | SchemaUserList]
  ): Unit = js.native
  def close(params: ParamsResourceBuyersUserlistsClose, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def close(
    params: ParamsResourceBuyersUserlistsClose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserList]
  ): Unit = js.native
  /**
    * Change the status of a user list to CLOSED. This prevents new users from being added to the user list.
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
    *   const res = await realtimebidding.buyers.userLists.close({
    *     // Required. The name of the user list to close. See UserList.name
    *     name: 'buyers/my-buyer/userLists/my-userList',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "urlRestriction": {}
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
  def close(params: ParamsResourceBuyersUserlistsClose, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def close(
    params: ParamsResourceBuyersUserlistsClose,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUserList] = js.native
  def create(callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def create(params: ParamsResourceBuyersUserlistsCreate): GaxiosPromise[SchemaUserList] = js.native
  def create(params: ParamsResourceBuyersUserlistsCreate, callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def create(
    params: ParamsResourceBuyersUserlistsCreate,
    options: BodyResponseCallback[Readable | SchemaUserList],
    callback: BodyResponseCallback[Readable | SchemaUserList]
  ): Unit = js.native
  def create(params: ParamsResourceBuyersUserlistsCreate, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def create(
    params: ParamsResourceBuyersUserlistsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserList]
  ): Unit = js.native
  /**
    * Create a new user list.
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
    *   const res = await realtimebidding.buyers.userLists.create({
    *     // Required. The name of the parent buyer of the user list to be retrieved that must follow the pattern `buyers/{buyerAccountId\}`, where `{buyerAccountId\}` represents the account ID of the buyer who owns user lists. For a bidder accessing user lists on behalf of a child seat buyer , `{buyerAccountId\}` should represent the account ID of the child seat buyer.
    *     parent: 'buyers/my-buyer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "membershipDurationDays": "my_membershipDurationDays",
    *       //   "name": "my_name",
    *       //   "status": "my_status",
    *       //   "urlRestriction": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "urlRestriction": {}
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
  def create(params: ParamsResourceBuyersUserlistsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBuyersUserlistsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserList] = js.native
  def get(callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def get(params: ParamsResourceBuyersUserlistsGet): GaxiosPromise[SchemaUserList] = js.native
  def get(params: ParamsResourceBuyersUserlistsGet, callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def get(
    params: ParamsResourceBuyersUserlistsGet,
    options: BodyResponseCallback[Readable | SchemaUserList],
    callback: BodyResponseCallback[Readable | SchemaUserList]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersUserlistsGet, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def get(
    params: ParamsResourceBuyersUserlistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserList]
  ): Unit = js.native
  /**
    * Gets a user list by its name.
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
    *   const res = await realtimebidding.buyers.userLists.get({
    *     // Required. The name of the user list to be retrieved. See UserList.name.
    *     name: 'buyers/my-buyer/userLists/my-userList',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "urlRestriction": {}
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
  def get(params: ParamsResourceBuyersUserlistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersUserlistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRemarketingTag(): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(callback: BodyResponseCallback[SchemaGetRemarketingTagResponse]): Unit = js.native
  def getRemarketingTag(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(params: ParamsResourceBuyersUserlistsGetremarketingtag): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersUserlistsGetremarketingtag,
    callback: BodyResponseCallback[SchemaGetRemarketingTagResponse]
  ): Unit = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersUserlistsGetremarketingtag,
    options: BodyResponseCallback[Readable | SchemaGetRemarketingTagResponse],
    callback: BodyResponseCallback[Readable | SchemaGetRemarketingTagResponse]
  ): Unit = js.native
  def getRemarketingTag(params: ParamsResourceBuyersUserlistsGetremarketingtag, options: MethodOptions): GaxiosPromise[SchemaGetRemarketingTagResponse] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersUserlistsGetremarketingtag,
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
    *   const res = await realtimebidding.buyers.userLists.getRemarketingTag({
    *     // Required. To fetch remarketing tag for an account, name must follow the pattern `buyers/{accountId\}` where `{accountId\}` represents ID of a buyer that owns the remarketing tag. For a bidder accessing remarketing tag on behalf of a child seat buyer, `{accountId\}` should represent the ID of the child seat buyer. To fetch remarketing tag for a specific user list, name must follow the pattern `buyers/{accountId\}/userLists/{userListId\}`. See UserList.name.
    *     name: 'buyers/my-buyer/userLists/my-userList',
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
  def getRemarketingTag(params: ParamsResourceBuyersUserlistsGetremarketingtag, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRemarketingTag(
    params: ParamsResourceBuyersUserlistsGetremarketingtag,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUserListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserListsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserListsResponse] = js.native
  def list(params: ParamsResourceBuyersUserlistsList): GaxiosPromise[SchemaListUserListsResponse] = js.native
  def list(
    params: ParamsResourceBuyersUserlistsList,
    callback: BodyResponseCallback[SchemaListUserListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersUserlistsList,
    options: BodyResponseCallback[Readable | SchemaListUserListsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUserListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersUserlistsList, options: MethodOptions): GaxiosPromise[SchemaListUserListsResponse] = js.native
  def list(
    params: ParamsResourceBuyersUserlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserListsResponse]
  ): Unit = js.native
  /**
    * Lists the user lists visible to the current user.
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
    *   const res = await realtimebidding.buyers.userLists.list({
    *     // The number of results to return per page.
    *     pageSize: 'placeholder-value',
    *     // Continuation page token (as received from a previous response).
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the parent buyer for the user lists to be returned that must follow the pattern `buyers/{buyerAccountId\}`, where `{buyerAccountId\}` represents the account ID of the buyer who owns user lists. For a bidder accessing user lists on behalf of a child seat buyer , `{buyerAccountId\}` should represent the account ID of the child seat buyer.
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userLists": []
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
  def list(params: ParamsResourceBuyersUserlistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersUserlistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def open(): GaxiosPromise[SchemaUserList] = js.native
  def open(callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def open(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def open(params: ParamsResourceBuyersUserlistsOpen): GaxiosPromise[SchemaUserList] = js.native
  def open(params: ParamsResourceBuyersUserlistsOpen, callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def open(
    params: ParamsResourceBuyersUserlistsOpen,
    options: BodyResponseCallback[Readable | SchemaUserList],
    callback: BodyResponseCallback[Readable | SchemaUserList]
  ): Unit = js.native
  def open(params: ParamsResourceBuyersUserlistsOpen, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def open(
    params: ParamsResourceBuyersUserlistsOpen,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserList]
  ): Unit = js.native
  /**
    * Change the status of a user list to OPEN. This allows new users to be added to the user list.
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
    *   const res = await realtimebidding.buyers.userLists.open({
    *     // Required. The name of the user list to open. See UserList.name
    *     name: 'buyers/my-buyer/userLists/my-userList',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "urlRestriction": {}
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
  def open(params: ParamsResourceBuyersUserlistsOpen, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def open(
    params: ParamsResourceBuyersUserlistsOpen,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUserList] = js.native
  def update(callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def update(params: ParamsResourceBuyersUserlistsUpdate): GaxiosPromise[SchemaUserList] = js.native
  def update(params: ParamsResourceBuyersUserlistsUpdate, callback: BodyResponseCallback[SchemaUserList]): Unit = js.native
  def update(
    params: ParamsResourceBuyersUserlistsUpdate,
    options: BodyResponseCallback[Readable | SchemaUserList],
    callback: BodyResponseCallback[Readable | SchemaUserList]
  ): Unit = js.native
  def update(params: ParamsResourceBuyersUserlistsUpdate, options: MethodOptions): GaxiosPromise[SchemaUserList] = js.native
  def update(
    params: ParamsResourceBuyersUserlistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserList]
  ): Unit = js.native
  /**
    * Update the given user list. Only user lists with URLRestrictions can be updated.
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
    *   const res = await realtimebidding.buyers.userLists.update({
    *     // Output only. Name of the user list that must follow the pattern `buyers/{buyer\}/userLists/{user_list\}`, where `{buyer\}` represents the account ID of the buyer who owns the user list. For a bidder accessing user lists on behalf of a child seat buyer, `{buyer\}` represents the account ID of the child seat buyer. `{user_list\}` is an int64 identifier assigned by Google to uniquely identify a user list.
    *     name: 'buyers/my-buyer/userLists/my-userList',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "membershipDurationDays": "my_membershipDurationDays",
    *       //   "name": "my_name",
    *       //   "status": "my_status",
    *       //   "urlRestriction": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "urlRestriction": {}
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
  def update(params: ParamsResourceBuyersUserlistsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBuyersUserlistsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
