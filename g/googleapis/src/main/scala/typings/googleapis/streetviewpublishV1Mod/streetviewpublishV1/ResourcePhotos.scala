package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Resource$Photos")
@js.native
open class ResourcePhotos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaBatchDeletePhotosResponse] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaBatchDeletePhotosResponse]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchDeletePhotosResponse] = js.native
  def batchDelete(params: ParamsResourcePhotosBatchdelete): GaxiosPromise[SchemaBatchDeletePhotosResponse] = js.native
  def batchDelete(
    params: ParamsResourcePhotosBatchdelete,
    callback: BodyResponseCallback[SchemaBatchDeletePhotosResponse]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourcePhotosBatchdelete,
    options: BodyResponseCallback[Readable | SchemaBatchDeletePhotosResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchDeletePhotosResponse]
  ): Unit = js.native
  def batchDelete(params: ParamsResourcePhotosBatchdelete, options: MethodOptions): GaxiosPromise[SchemaBatchDeletePhotosResponse] = js.native
  def batchDelete(
    params: ParamsResourcePhotosBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchDeletePhotosResponse]
  ): Unit = js.native
  /**
    * Deletes a list of Photos and their metadata. Note that if BatchDeletePhotos fails, either critical fields are missing or there is an authentication error. Even if BatchDeletePhotos succeeds, individual photos in the batch may have failures. These failures are specified in each PhotoResponse.status in BatchDeletePhotosResponse.results. See DeletePhoto for specific failures that can occur per photo.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/streetviewpublish.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const streetviewpublish = google.streetviewpublish('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/streetviewpublish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await streetviewpublish.photos.batchDelete({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "photoIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "status": []
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
  def batchDelete(params: ParamsResourcePhotosBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourcePhotosBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchGet(): GaxiosPromise[SchemaBatchGetPhotosResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetPhotosResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetPhotosResponse] = js.native
  def batchGet(params: ParamsResourcePhotosBatchget): GaxiosPromise[SchemaBatchGetPhotosResponse] = js.native
  def batchGet(params: ParamsResourcePhotosBatchget, callback: BodyResponseCallback[SchemaBatchGetPhotosResponse]): Unit = js.native
  def batchGet(
    params: ParamsResourcePhotosBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetPhotosResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetPhotosResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourcePhotosBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetPhotosResponse] = js.native
  def batchGet(
    params: ParamsResourcePhotosBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetPhotosResponse]
  ): Unit = js.native
  /**
    * Gets the metadata of the specified Photo batch. Note that if BatchGetPhotos fails, either critical fields are missing or there is an authentication error. Even if BatchGetPhotos succeeds, individual photos in the batch may have failures. These failures are specified in each PhotoResponse.status in BatchGetPhotosResponse.results. See GetPhoto for specific failures that can occur per photo.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/streetviewpublish.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const streetviewpublish = google.streetviewpublish('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/streetviewpublish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await streetviewpublish.photos.batchGet({
    *     // Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    *     languageCode: 'placeholder-value',
    *     // Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be `photoIds=&photoIds=&...`.
    *     photoIds: 'placeholder-value',
    *     // Required. Specifies if a download URL for the photo bytes should be returned in the Photo response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def batchGet(params: ParamsResourcePhotosBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourcePhotosBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdatePhotosResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdatePhotosResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePhotosResponse] = js.native
  def batchUpdate(params: ParamsResourcePhotosBatchupdate): GaxiosPromise[SchemaBatchUpdatePhotosResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePhotosBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdatePhotosResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourcePhotosBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdatePhotosResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdatePhotosResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourcePhotosBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePhotosResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePhotosBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdatePhotosResponse]
  ): Unit = js.native
  /**
    * Updates the metadata of Photos, such as pose, place association, connections, etc. Changing the pixels of photos is not supported. Note that if BatchUpdatePhotos fails, either critical fields are missing or there is an authentication error. Even if BatchUpdatePhotos succeeds, individual photos in the batch may have failures. These failures are specified in each PhotoResponse.status in BatchUpdatePhotosResponse.results. See UpdatePhoto for specific failures that can occur per photo. Only the fields specified in updateMask field are used. If `updateMask` is not present, the update applies to all fields. The number of UpdatePhotoRequest messages in a BatchUpdatePhotosRequest must not exceed 20. \> Note: To update Pose.altitude, Pose.latLngPair has to be filled as well. Otherwise, the request will fail.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/streetviewpublish.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const streetviewpublish = google.streetviewpublish('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/streetviewpublish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await streetviewpublish.photos.batchUpdate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "updatePhotoRequests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def batchUpdate(params: ParamsResourcePhotosBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourcePhotosBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPhotosResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPhotosResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPhotosResponse] = js.native
  def list(params: ParamsResourcePhotosList): GaxiosPromise[SchemaListPhotosResponse] = js.native
  def list(params: ParamsResourcePhotosList, callback: BodyResponseCallback[SchemaListPhotosResponse]): Unit = js.native
  def list(
    params: ParamsResourcePhotosList,
    options: BodyResponseCallback[Readable | SchemaListPhotosResponse],
    callback: BodyResponseCallback[Readable | SchemaListPhotosResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePhotosList, options: MethodOptions): GaxiosPromise[SchemaListPhotosResponse] = js.native
  def list(
    params: ParamsResourcePhotosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPhotosResponse]
  ): Unit = js.native
  /**
    * Lists all the Photos that belong to the user. \> Note: Recently created photos that are still being indexed are not returned in the response.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/streetviewpublish.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const streetviewpublish = google.streetviewpublish('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/streetviewpublish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await streetviewpublish.photos.list({
    *     // Optional. The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`. The filters supported are: `placeId`, `min_latitude`, `max_latitude`, `min_longitude`, and `max_longitude`. See https://google.aip.dev/160 for more information.
    *     filter: 'placeholder-value',
    *     // Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    *     languageCode: 'placeholder-value',
    *     // Optional. The maximum number of photos to return. `pageSize` must be non-negative. If `pageSize` is zero or is not provided, the default page size of 100 is used. The number of photos returned in the response may be less than `pageSize` if the number of photos that belong to the user is less than `pageSize`.
    *     pageSize: 'placeholder-value',
    *     // Optional. The nextPageToken value returned from a previous ListPhotos request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. Specifies if a download URL for the photos bytes should be returned in the Photos response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "photos": []
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
  def list(params: ParamsResourcePhotosList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePhotosList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
