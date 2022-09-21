package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Savedcolumns")
@js.native
open class ResourceSavedcolumns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(params: ParamsResourceSavedcolumnsList): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(params: ParamsResourceSavedcolumnsList, callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: BodyResponseCallback[Readable | SchemaSavedColumnList],
    callback: BodyResponseCallback[Readable | SchemaSavedColumnList]
  ): Unit = js.native
  def list(params: ParamsResourceSavedcolumnsList, options: MethodOptions): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedColumnList]
  ): Unit = js.native
  /**
    * Retrieve the list of saved columns for a specified advertiser.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclicksearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclicksearch'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclicksearch.savedColumns.list({
    *     // DS ID of the advertiser.
    *     advertiserId: 'placeholder-value',
    *     // DS ID of the agency.
    *     agencyId: 'placeholder-value',
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
  def list(params: ParamsResourceSavedcolumnsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
