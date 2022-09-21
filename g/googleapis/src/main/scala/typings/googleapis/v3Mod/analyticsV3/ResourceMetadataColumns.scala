package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Metadata$Columns")
@js.native
open class ResourceMetadataColumns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaColumns] = js.native
  def list(callback: BodyResponseCallback[SchemaColumns]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaColumns] = js.native
  def list(params: ParamsResourceMetadataColumnsList): GaxiosPromise[SchemaColumns] = js.native
  def list(params: ParamsResourceMetadataColumnsList, callback: BodyResponseCallback[SchemaColumns]): Unit = js.native
  def list(
    params: ParamsResourceMetadataColumnsList,
    options: BodyResponseCallback[Readable | SchemaColumns],
    callback: BodyResponseCallback[Readable | SchemaColumns]
  ): Unit = js.native
  def list(params: ParamsResourceMetadataColumnsList, options: MethodOptions): GaxiosPromise[SchemaColumns] = js.native
  def list(
    params: ParamsResourceMetadataColumnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumns]
  ): Unit = js.native
  /**
    * Lists all columns for a report type
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.metadata.columns.list({
    *     // Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core Reporting API
    *     reportType: 'ga',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeNames": [],
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "totalResults": 0
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
  def list(params: ParamsResourceMetadataColumnsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMetadataColumnsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
