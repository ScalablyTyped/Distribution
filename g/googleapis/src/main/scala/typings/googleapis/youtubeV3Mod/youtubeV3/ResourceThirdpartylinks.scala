package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Thirdpartylinks")
@js.native
open class ResourceThirdpartylinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceThirdpartylinksDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceThirdpartylinksDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceThirdpartylinksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceThirdpartylinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceThirdpartylinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.thirdPartyLinks.delete({
    *     // Channel ID to which changes should be applied, for delegation.
    *     externalChannelId: 'placeholder-value',
    *     // Delete the partner links with the given linking token.
    *     linkingToken: 'placeholder-value',
    *     // Do not use. Required for compatibility.
    *     part: 'placeholder-value',
    *     // Type of the link to be deleted.
    *     type: 'placeholder-value',
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
  def delete(params: ParamsResourceThirdpartylinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceThirdpartylinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaThirdPartyLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def insert(params: ParamsResourceThirdpartylinksInsert): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def insert(params: ParamsResourceThirdpartylinksInsert, callback: BodyResponseCallback[SchemaThirdPartyLink]): Unit = js.native
  def insert(
    params: ParamsResourceThirdpartylinksInsert,
    options: BodyResponseCallback[Readable | SchemaThirdPartyLink],
    callback: BodyResponseCallback[Readable | SchemaThirdPartyLink]
  ): Unit = js.native
  def insert(params: ParamsResourceThirdpartylinksInsert, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def insert(
    params: ParamsResourceThirdpartylinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThirdPartyLink]
  ): Unit = js.native
  /**
    * Inserts a new resource into this collection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.thirdPartyLinks.insert({
    *     // Channel ID to which changes should be applied, for delegation.
    *     externalChannelId: 'placeholder-value',
    *     // The *part* parameter specifies the thirdPartyLink resource parts that the API request and response will include. Supported values are linkingToken, status, and snippet.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "linkingToken": "my_linkingToken",
    *       //   "snippet": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "linkingToken": "my_linkingToken",
    *   //   "snippet": {},
    *   //   "status": {}
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
  def insert(params: ParamsResourceThirdpartylinksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceThirdpartylinksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaThirdPartyLinkListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaThirdPartyLinkListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLinkListResponse] = js.native
  def list(params: ParamsResourceThirdpartylinksList): GaxiosPromise[SchemaThirdPartyLinkListResponse] = js.native
  def list(
    params: ParamsResourceThirdpartylinksList,
    callback: BodyResponseCallback[SchemaThirdPartyLinkListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceThirdpartylinksList,
    options: BodyResponseCallback[Readable | SchemaThirdPartyLinkListResponse],
    callback: BodyResponseCallback[Readable | SchemaThirdPartyLinkListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceThirdpartylinksList, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLinkListResponse] = js.native
  def list(
    params: ParamsResourceThirdpartylinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThirdPartyLinkListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of resources, possibly filtered.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.thirdPartyLinks.list({
    *     // Channel ID to which changes should be applied, for delegation.
    *     externalChannelId: 'placeholder-value',
    *     // Get a third party link with the given linking token.
    *     linkingToken: 'placeholder-value',
    *     // The *part* parameter specifies the thirdPartyLink resource parts that the API response will include. Supported values are linkingToken, status, and snippet.
    *     part: 'placeholder-value',
    *     // Get a third party link of the given type.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
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
  def list(params: ParamsResourceThirdpartylinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceThirdpartylinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def update(callback: BodyResponseCallback[SchemaThirdPartyLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def update(params: ParamsResourceThirdpartylinksUpdate): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def update(params: ParamsResourceThirdpartylinksUpdate, callback: BodyResponseCallback[SchemaThirdPartyLink]): Unit = js.native
  def update(
    params: ParamsResourceThirdpartylinksUpdate,
    options: BodyResponseCallback[Readable | SchemaThirdPartyLink],
    callback: BodyResponseCallback[Readable | SchemaThirdPartyLink]
  ): Unit = js.native
  def update(params: ParamsResourceThirdpartylinksUpdate, options: MethodOptions): GaxiosPromise[SchemaThirdPartyLink] = js.native
  def update(
    params: ParamsResourceThirdpartylinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThirdPartyLink]
  ): Unit = js.native
  /**
    * Updates an existing resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.thirdPartyLinks.update({
    *     // Channel ID to which changes should be applied, for delegation.
    *     externalChannelId: 'placeholder-value',
    *     // The *part* parameter specifies the thirdPartyLink resource parts that the API request and response will include. Supported values are linkingToken, status, and snippet.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "linkingToken": "my_linkingToken",
    *       //   "snippet": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "linkingToken": "my_linkingToken",
    *   //   "snippet": {},
    *   //   "status": {}
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
  def update(params: ParamsResourceThirdpartylinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceThirdpartylinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
