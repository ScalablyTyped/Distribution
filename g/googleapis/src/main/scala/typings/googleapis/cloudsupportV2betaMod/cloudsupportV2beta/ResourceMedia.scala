package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Media")
@js.native
open class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def download(): GaxiosPromise[SchemaMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[Readable | SchemaMedia],
    callback: BodyResponseCallback[Readable | SchemaMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
  /**
    * Download a file attachment on a case. Note: HTTP requests must append "?alt=media" to the URL.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsupport.media.download({
    *     // The resource name of the attachment to be downloaded.
    *     name: '[^/]+/[^/]+/cases/my-case/attachments/my-attachment',
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
  
  def upload(): GaxiosPromise[SchemaAttachment] = js.native
  def upload(callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def upload(params: ParamsResourceMediaUpload): GaxiosPromise[SchemaAttachment] = js.native
  def upload(params: ParamsResourceMediaUpload, callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: BodyResponseCallback[Readable | SchemaAttachment],
    callback: BodyResponseCallback[Readable | SchemaAttachment]
  ): Unit = js.native
  def upload(params: ParamsResourceMediaUpload, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  /**
    * Create a file attachment on a case or Cloud resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsupport.media.upload({
    *     // Required. The resource name of the case to which attachment should be attached.
    *     parent: '[^/]+/[^/]+/cases/my-case',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attachment": {}
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
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "filename": "my_filename",
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "sizeBytes": "my_sizeBytes"
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
  def upload(params: ParamsResourceMediaUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
