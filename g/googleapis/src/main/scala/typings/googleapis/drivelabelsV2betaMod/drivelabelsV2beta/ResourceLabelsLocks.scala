package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drivelabels/v2beta", "drivelabels_v2beta.Resource$Labels$Locks")
@js.native
open class ResourceLabelsLocks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse] = js.native
  def list(params: ParamsResourceLabelsLocksList): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse] = js.native
  def list(
    params: ParamsResourceLabelsLocksList,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLabelsLocksList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLabelsLocksList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse] = js.native
  def list(
    params: ParamsResourceLabelsLocksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse]
  ): Unit = js.native
  /**
    * Lists the Locks on a Label.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
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
    *   const res = await drivelabels.labels.locks.list({
    *     // Maximum number of Locks to return per page. Default: 100. Max: 200.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to return.
    *     pageToken: 'placeholder-value',
    *     // Required. Label on which Locks are applied. Format: labels/{label\}
    *     parent: 'labels/my-label',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labelLocks": [],
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
  def list(params: ParamsResourceLabelsLocksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLabelsLocksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
