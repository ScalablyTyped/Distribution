package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlistupdates")
@js.native
class ResourceThreatlistupdates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * safebrowsing.threatListUpdates.fetch
    * @desc Fetches the most recent threat list updates. A client can request
    * updates for multiple lists at once.
    * @alias safebrowsing.threatListUpdates.fetch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FetchThreatListUpdatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def fetch(): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def fetch(callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]): Unit = js.native
  def fetch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def fetch(params: ParamsResourceThreatlistupdatesFetch): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    options: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(params: ParamsResourceThreatlistupdatesFetch, options: MethodOptions): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
}
