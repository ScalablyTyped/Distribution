package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Conversions")
@js.native
open class ResourceConversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchinsert(): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]): Unit = js.native
  def batchinsert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(params: ParamsResourceConversionsBatchinsert): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    options: BodyResponseCallback[Readable | SchemaConversionsBatchInsertResponse],
    callback: BodyResponseCallback[Readable | SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(params: ParamsResourceConversionsBatchinsert, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  /**
    * Inserts conversions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ddmconversions'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.conversions.batchinsert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conversions": [],
    *       //   "encryptionInfo": {},
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasFailures": false,
    *   //   "kind": "my_kind",
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
  def batchinsert(params: ParamsResourceConversionsBatchinsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchupdate(): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]): Unit = js.native
  def batchupdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(params: ParamsResourceConversionsBatchupdate): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaConversionsBatchUpdateResponse],
    callback: BodyResponseCallback[Readable | SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(params: ParamsResourceConversionsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
  /**
    * Updates existing conversions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ddmconversions'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.conversions.batchupdate({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conversions": [],
    *       //   "encryptionInfo": {},
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasFailures": false,
    *   //   "kind": "my_kind",
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
  def batchupdate(params: ParamsResourceConversionsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
