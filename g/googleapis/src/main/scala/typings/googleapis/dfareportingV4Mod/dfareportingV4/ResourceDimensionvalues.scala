package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Dimensionvalues")
@js.native
open class ResourceDimensionvalues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(callback: BodyResponseCallback[SchemaDimensionValueList]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(params: ParamsResourceDimensionvaluesQuery): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    callback: BodyResponseCallback[SchemaDimensionValueList]
  ): Unit = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    options: BodyResponseCallback[Readable | SchemaDimensionValueList],
    callback: BodyResponseCallback[Readable | SchemaDimensionValueList]
  ): Unit = js.native
  def query(params: ParamsResourceDimensionvaluesQuery, options: MethodOptions): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDimensionValueList]
  ): Unit = js.native
  /**
    * Retrieves list of report dimension values for a list of filters.
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
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfareporting'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.dimensionValues.query({
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dimensionName": "my_dimensionName",
    *       //   "endDate": "my_endDate",
    *       //   "filters": [],
    *       //   "kind": "my_kind",
    *       //   "startDate": "my_startDate"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def query(params: ParamsResourceDimensionvaluesQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
