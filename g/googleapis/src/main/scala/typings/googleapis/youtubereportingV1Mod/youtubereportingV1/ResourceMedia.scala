package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Media")
@js.native
open class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def download(): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaGdataMedia]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaGdataMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[Readable | SchemaGdataMedia],
    callback: BodyResponseCallback[Readable | SchemaGdataMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGdataMedia]
  ): Unit = js.native
  /**
    * Method for media download. Download is supported on the URI `/v1/media/{+name\}?alt=media`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubereporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubereporting = google.youtubereporting('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubereporting.media.download({
    *     // Name of the media that is being downloaded.
    *     resourceName: '.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "bigstoreObjectRef": "my_bigstoreObjectRef",
    *   //   "blobRef": "my_blobRef",
    *   //   "blobstore2Info": {},
    *   //   "compositeMedia": [],
    *   //   "contentType": "my_contentType",
    *   //   "contentTypeInfo": {},
    *   //   "cosmoBinaryReference": "my_cosmoBinaryReference",
    *   //   "crc32cHash": 0,
    *   //   "diffChecksumsResponse": {},
    *   //   "diffDownloadResponse": {},
    *   //   "diffUploadRequest": {},
    *   //   "diffUploadResponse": {},
    *   //   "diffVersionResponse": {},
    *   //   "downloadParameters": {},
    *   //   "filename": "my_filename",
    *   //   "hash": "my_hash",
    *   //   "hashVerified": false,
    *   //   "inline": "my_inline",
    *   //   "isPotentialRetry": false,
    *   //   "length": "my_length",
    *   //   "md5Hash": "my_md5Hash",
    *   //   "mediaId": "my_mediaId",
    *   //   "objectId": {},
    *   //   "path": "my_path",
    *   //   "referenceType": "my_referenceType",
    *   //   "sha1Hash": "my_sha1Hash",
    *   //   "sha256Hash": "my_sha256Hash",
    *   //   "timestamp": "my_timestamp",
    *   //   "token": "my_token"
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
  def download(params: ParamsResourceMediaDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
