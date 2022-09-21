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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Reports$Compatiblefields")
@js.native
open class ResourceReportsCompatiblefields protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(callback: BodyResponseCallback[SchemaCompatibleFields]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(params: ParamsResourceReportsCompatiblefieldsQuery): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    callback: BodyResponseCallback[SchemaCompatibleFields]
  ): Unit = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    options: BodyResponseCallback[Readable | SchemaCompatibleFields],
    callback: BodyResponseCallback[Readable | SchemaCompatibleFields]
  ): Unit = js.native
  def query(params: ParamsResourceReportsCompatiblefieldsQuery, options: MethodOptions): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompatibleFields]
  ): Unit = js.native
  /**
    * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
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
    *   const res = await dfareporting.reports.compatibleFields.query({
    *     // The Campaign Manager 360 user profile ID.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "criteria": {},
    *       //   "crossDimensionReachCriteria": {},
    *       //   "delivery": {},
    *       //   "etag": "my_etag",
    *       //   "fileName": "my_fileName",
    *       //   "floodlightCriteria": {},
    *       //   "format": "my_format",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "name": "my_name",
    *       //   "ownerProfileId": "my_ownerProfileId",
    *       //   "pathAttributionCriteria": {},
    *       //   "pathCriteria": {},
    *       //   "pathToConversionCriteria": {},
    *       //   "reachCriteria": {},
    *       //   "schedule": {},
    *       //   "subAccountId": "my_subAccountId",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "crossDimensionReachReportCompatibleFields": {},
    *   //   "floodlightReportCompatibleFields": {},
    *   //   "kind": "my_kind",
    *   //   "pathAttributionReportCompatibleFields": {},
    *   //   "pathReportCompatibleFields": {},
    *   //   "pathToConversionReportCompatibleFields": {},
    *   //   "reachReportCompatibleFields": {},
    *   //   "reportCompatibleFields": {}
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
  def query(params: ParamsResourceReportsCompatiblefieldsQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
