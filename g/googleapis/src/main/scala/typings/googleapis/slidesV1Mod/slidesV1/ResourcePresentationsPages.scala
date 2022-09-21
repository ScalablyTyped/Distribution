package typings.googleapis.slidesV1Mod.slidesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Resource$Presentations$Pages")
@js.native
open class ResourcePresentationsPages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPage] = js.native
  def get(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePresentationsPagesGet): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePresentationsPagesGet, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(
    params: ParamsResourcePresentationsPagesGet,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def get(params: ParamsResourcePresentationsPagesGet, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(
    params: ParamsResourcePresentationsPagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Gets the latest version of the specified page in the presentation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/slides.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const slides = google.slides('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/presentations',
    *       'https://www.googleapis.com/auth/presentations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await slides.presentations.pages.get({
    *     // The object ID of the page to retrieve.
    *     pageObjectId: 'placeholder-value',
    *     // The ID of the presentation to retrieve.
    *     presentationId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "layoutProperties": {},
    *   //   "masterProperties": {},
    *   //   "notesProperties": {},
    *   //   "objectId": "my_objectId",
    *   //   "pageElements": [],
    *   //   "pageProperties": {},
    *   //   "pageType": "my_pageType",
    *   //   "revisionId": "my_revisionId",
    *   //   "slideProperties": {}
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
  def get(params: ParamsResourcePresentationsPagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePresentationsPagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getThumbnail(): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(callback: BodyResponseCallback[SchemaThumbnail]): Unit = js.native
  def getThumbnail(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(params: ParamsResourcePresentationsPagesGetthumbnail): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    callback: BodyResponseCallback[SchemaThumbnail]
  ): Unit = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    options: BodyResponseCallback[Readable | SchemaThumbnail],
    callback: BodyResponseCallback[Readable | SchemaThumbnail]
  ): Unit = js.native
  def getThumbnail(params: ParamsResourcePresentationsPagesGetthumbnail, options: MethodOptions): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThumbnail]
  ): Unit = js.native
  /**
    * Generates a thumbnail of the latest version of the specified page in the presentation and returns a URL to the thumbnail image. This request counts as an [expensive read request](/slides/limits) for quota purposes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/slides.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const slides = google.slides('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/presentations',
    *       'https://www.googleapis.com/auth/presentations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await slides.presentations.pages.getThumbnail({
    *     // The object ID of the page whose thumbnail to retrieve.
    *     pageObjectId: 'placeholder-value',
    *     // The ID of the presentation to retrieve.
    *     presentationId: 'placeholder-value',
    *     // The optional mime type of the thumbnail image. If you don't specify the mime type, the mime type defaults to PNG.
    *     'thumbnailProperties.mimeType': 'placeholder-value',
    *     // The optional thumbnail image size. If you don't specify the size, the server chooses a default size of the image.
    *     'thumbnailProperties.thumbnailSize': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentUrl": "my_contentUrl",
    *   //   "height": 0,
    *   //   "width": 0
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
  def getThumbnail(params: ParamsResourcePresentationsPagesGetthumbnail, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
