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

@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Resource$Photosequences")
@js.native
open class ResourcePhotosequences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPhotoSequencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPhotoSequencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPhotoSequencesResponse] = js.native
  def list(params: ParamsResourcePhotosequencesList): GaxiosPromise[SchemaListPhotoSequencesResponse] = js.native
  def list(
    params: ParamsResourcePhotosequencesList,
    callback: BodyResponseCallback[SchemaListPhotoSequencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePhotosequencesList,
    options: BodyResponseCallback[Readable | SchemaListPhotoSequencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPhotoSequencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePhotosequencesList, options: MethodOptions): GaxiosPromise[SchemaListPhotoSequencesResponse] = js.native
  def list(
    params: ParamsResourcePhotosequencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPhotoSequencesResponse]
  ): Unit = js.native
  /**
    * Lists all the PhotoSequences that belong to the user, in descending CreatePhotoSequence timestamp order.
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
    *   const res = await streetviewpublish.photoSequences.list({
    *     // Optional. The filter expression. For example: `imagery_type=SPHERICAL`. The filters supported are: `imagery_type`, `processing_state`, `min_latitude`, `max_latitude`, `min_longitude`, `max_longitude`, and `filename_query`. See https://google.aip.dev/160 for more information. Filename queries should sent as a Phrase in order to support multple words and special characters by adding escaped quotes. Ex: filename_query="example of a phrase.mp4"
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of photo sequences to return. `pageSize` must be non-negative. If `pageSize` is zero or is not provided, the default page size of 100 is used. The number of photo sequences returned in the response may be less than `pageSize` if the number of matches is less than `pageSize`. This is currently unimplemented but is in process.
    *     pageSize: 'placeholder-value',
    *     // Optional. The nextPageToken value returned from a previous ListPhotoSequences request, if any.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "photoSequences": []
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
  def list(params: ParamsResourcePhotosequencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePhotosequencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
