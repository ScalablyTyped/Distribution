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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Captions")
@js.native
open class ResourceCaptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCaptionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCaptionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCaptionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCaptionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCaptionsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.captions.delete({
    *     id: 'placeholder-value',
    *     // ID of the Google+ Page for the channel that the request is be on behalf of
    *     onBehalfOf: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
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
  def delete(params: ParamsResourceCaptionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCaptionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def download(): GaxiosPromise[Any] = js.native
  def download(callback: BodyResponseCallback[Any]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceCaptionsDownload): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceCaptionsDownload, callback: BodyResponseCallback[Any]): Unit = js.native
  def download(
    params: ParamsResourceCaptionsDownload,
    options: BodyResponseCallback[Any | Readable],
    callback: BodyResponseCallback[Any | Readable]
  ): Unit = js.native
  def download(params: ParamsResourceCaptionsDownload, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(
    params: ParamsResourceCaptionsDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Any]
  ): Unit = js.native
  /**
    * Downloads a caption track.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.captions.download({
    *     // The ID of the caption track to download, required for One Platform.
    *     id: 'placeholder-value',
    *     // ID of the Google+ Page for the channel that the request is be on behalf of
    *     onBehalfOf: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // Convert the captions into this format. Supported options are sbv, srt, and vtt.
    *     tfmt: 'placeholder-value',
    *     // tlang is the language code; machine translate the captions into this language.
    *     tlang: 'placeholder-value',
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
  def download(params: ParamsResourceCaptionsDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceCaptionsDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCaption] = js.native
  def insert(callback: BodyResponseCallback[SchemaCaption]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCaption] = js.native
  def insert(params: ParamsResourceCaptionsInsert): GaxiosPromise[SchemaCaption] = js.native
  def insert(params: ParamsResourceCaptionsInsert, callback: BodyResponseCallback[SchemaCaption]): Unit = js.native
  def insert(
    params: ParamsResourceCaptionsInsert,
    options: BodyResponseCallback[Readable | SchemaCaption],
    callback: BodyResponseCallback[Readable | SchemaCaption]
  ): Unit = js.native
  def insert(params: ParamsResourceCaptionsInsert, options: MethodOptions): GaxiosPromise[SchemaCaption] = js.native
  def insert(
    params: ParamsResourceCaptionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCaption]
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.captions.insert({
    *     // ID of the Google+ Page for the channel that the request is be on behalf of
    *     onBehalfOf: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter specifies the caption resource parts that the API response will include. Set the parameter value to snippet.
    *     part: 'placeholder-value',
    *     // Extra parameter to allow automatically syncing the uploaded caption/transcript with the audio.
    *     sync: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "snippet": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "snippet": {}
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
  def insert(params: ParamsResourceCaptionsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCaptionsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCaptionListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCaptionListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCaptionListResponse] = js.native
  def list(params: ParamsResourceCaptionsList): GaxiosPromise[SchemaCaptionListResponse] = js.native
  def list(params: ParamsResourceCaptionsList, callback: BodyResponseCallback[SchemaCaptionListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCaptionsList,
    options: BodyResponseCallback[Readable | SchemaCaptionListResponse],
    callback: BodyResponseCallback[Readable | SchemaCaptionListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCaptionsList, options: MethodOptions): GaxiosPromise[SchemaCaptionListResponse] = js.native
  def list(
    params: ParamsResourceCaptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCaptionListResponse]
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.captions.list({
    *     // Returns the captions with the given IDs for Stubby or Apiary.
    *     id: 'placeholder-value',
    *     // ID of the Google+ Page for the channel that the request is on behalf of.
    *     onBehalfOf: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more caption resource parts that the API response will include. The part names that you can include in the parameter value are id and snippet.
    *     part: 'placeholder-value',
    *     // Returns the captions for the specified video.
    *     videoId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "eventId": "my_eventId",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "visitorId": "my_visitorId"
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
  def list(params: ParamsResourceCaptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCaptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCaption] = js.native
  def update(callback: BodyResponseCallback[SchemaCaption]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCaption] = js.native
  def update(params: ParamsResourceCaptionsUpdate): GaxiosPromise[SchemaCaption] = js.native
  def update(params: ParamsResourceCaptionsUpdate, callback: BodyResponseCallback[SchemaCaption]): Unit = js.native
  def update(
    params: ParamsResourceCaptionsUpdate,
    options: BodyResponseCallback[Readable | SchemaCaption],
    callback: BodyResponseCallback[Readable | SchemaCaption]
  ): Unit = js.native
  def update(params: ParamsResourceCaptionsUpdate, options: MethodOptions): GaxiosPromise[SchemaCaption] = js.native
  def update(
    params: ParamsResourceCaptionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCaption]
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.captions.update({
    *     // ID of the Google+ Page for the channel that the request is on behalf of.
    *     onBehalfOf: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more caption resource parts that the API response will include. The part names that you can include in the parameter value are id and snippet.
    *     part: 'placeholder-value',
    *     // Extra parameter to allow automatically syncing the uploaded caption/transcript with the audio.
    *     sync: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "snippet": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "snippet": {}
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
  def update(params: ParamsResourceCaptionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCaptionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
