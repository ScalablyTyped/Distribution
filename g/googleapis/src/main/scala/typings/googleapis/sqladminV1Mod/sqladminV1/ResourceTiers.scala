package typings.googleapis.sqladminV1Mod.sqladminV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1", "sqladmin_v1.Resource$Tiers")
@js.native
open class ResourceTiers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTiersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(params: ParamsResourceTiersList): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(params: ParamsResourceTiersList, callback: BodyResponseCallback[SchemaTiersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceTiersList,
    options: BodyResponseCallback[Readable | SchemaTiersListResponse],
    callback: BodyResponseCallback[Readable | SchemaTiersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTiersList, options: MethodOptions): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(
    params: ParamsResourceTiersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTiersListResponse]
  ): Unit = js.native
  /**
    * Lists all available machine types (tiers) for Cloud SQL, for example, `db-custom-1-3840`. For more information, see https://cloud.google.com/sql/pricing.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.tiers.list({
    *     // Project ID of the project for which to list tiers.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceTiersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTiersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
