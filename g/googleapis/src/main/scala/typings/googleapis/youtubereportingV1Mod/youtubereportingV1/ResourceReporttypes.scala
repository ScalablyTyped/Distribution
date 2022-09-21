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

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Reporttypes")
@js.native
open class ResourceReporttypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReportTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(params: ParamsResourceReporttypesList): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(
    params: ParamsResourceReporttypesList,
    callback: BodyResponseCallback[SchemaListReportTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceReporttypesList,
    options: BodyResponseCallback[Readable | SchemaListReportTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReportTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReporttypesList, options: MethodOptions): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(
    params: ParamsResourceReporttypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportTypesResponse]
  ): Unit = js.native
  /**
    * Lists report types.
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
    *   const res = await youtubereporting.reportTypes.list({
    *     // If set to true, also system-managed report types will be returned; otherwise only the report types that can be used to create new reporting jobs will be returned.
    *     includeSystemManaged: 'placeholder-value',
    *     // The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListReportTypesResponse.next_page_token returned in response to the previous call to the `ListReportTypes` method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reportTypes": []
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
  def list(params: ParamsResourceReporttypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReporttypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
