package typings.googleapis.plusV1Mod.plusV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$People")
@js.native
open class ResourcePeople protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPerson] = js.native
  def get(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: BodyResponseCallback[Readable | SchemaPerson],
    callback: BodyResponseCallback[Readable | SchemaPerson]
  ): Unit = js.native
  def get(params: ParamsResourcePeopleGet, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * plus.people.get
    * @desc Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *       'https://www.googleapis.com/auth/userinfo.profile',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.people.get({
    *     // The ID of the person to get the profile for. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "aboutMe": "my_aboutMe",
    *   //   "ageRange": {},
    *   //   "birthday": "my_birthday",
    *   //   "braggingRights": "my_braggingRights",
    *   //   "circledByCount": 0,
    *   //   "cover": {},
    *   //   "currentLocation": "my_currentLocation",
    *   //   "displayName": "my_displayName",
    *   //   "domain": "my_domain",
    *   //   "emails": [],
    *   //   "etag": "my_etag",
    *   //   "gender": "my_gender",
    *   //   "id": "my_id",
    *   //   "image": {},
    *   //   "isPlusUser": false,
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "name": {},
    *   //   "nickname": "my_nickname",
    *   //   "objectType": "my_objectType",
    *   //   "occupation": "my_occupation",
    *   //   "organizations": [],
    *   //   "placesLived": [],
    *   //   "plusOneCount": 0,
    *   //   "relationshipStatus": "my_relationshipStatus",
    *   //   "skills": "my_skills",
    *   //   "tagline": "my_tagline",
    *   //   "url": "my_url",
    *   //   "urls": [],
    *   //   "verified": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.people.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The ID of the person to get the profile for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourcePeopleGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(params: ParamsResourcePeopleList): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(params: ParamsResourcePeopleList, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def list(
    params: ParamsResourcePeopleList,
    options: BodyResponseCallback[Readable | SchemaPeopleFeed],
    callback: BodyResponseCallback[Readable | SchemaPeopleFeed]
  ): Unit = js.native
  def list(params: ParamsResourcePeopleList, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(
    params: ParamsResourcePeopleList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  /**
    * plus.people.list
    * @desc List all of the people in the specified collection.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.people.list({
    *     // The collection of people to list.
    *     collection: 'placeholder-value',
    *     // The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The order to return people in.
    *     orderBy: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *     // Get the collection of people for the person identified. Use "me" to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "totalItems": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.people.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of people to list.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.orderBy The order to return people in.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId Get the collection of people for the person identified. Use "me" to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourcePeopleList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePeopleList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listByActivity(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def listByActivity(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def listByActivity(
    params: ParamsResourcePeopleListbyactivity,
    options: BodyResponseCallback[Readable | SchemaPeopleFeed],
    callback: BodyResponseCallback[Readable | SchemaPeopleFeed]
  ): Unit = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(
    params: ParamsResourcePeopleListbyactivity,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  /**
    * plus.people.listByActivity
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for more details.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.people.listByActivity({
    *     // The ID of the activity to get the list of people for.
    *     activityId: 'placeholder-value',
    *     // The collection of people to list.
    *     collection: 'placeholder-value',
    *     // The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "totalItems": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.people.listByActivity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get the list of people for.
    * @param {string} params.collection The collection of people to list.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByActivity(params: ParamsResourcePeopleListbyactivity, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listByActivity(
    params: ParamsResourcePeopleListbyactivity,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(params: ParamsResourcePeopleSearch): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(params: ParamsResourcePeopleSearch, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def search(
    params: ParamsResourcePeopleSearch,
    options: BodyResponseCallback[Readable | SchemaPeopleFeed],
    callback: BodyResponseCallback[Readable | SchemaPeopleFeed]
  ): Unit = js.native
  def search(params: ParamsResourcePeopleSearch, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(
    params: ParamsResourcePeopleSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  /**
    * plus.people.search
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for more details.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.people.search({
    *     // Specify the preferred language to search with. See search language codes for available values.
    *     language: 'placeholder-value',
    *     // The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    *     pageToken: 'placeholder-value',
    *     // Specify a query string for full text search of public text in all profiles.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "totalItems": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.people.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language Specify the preferred language to search with. See search language codes for available values.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    * @param {string} params.query Specify a query string for full text search of public text in all profiles.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(params: ParamsResourcePeopleSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourcePeopleSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
