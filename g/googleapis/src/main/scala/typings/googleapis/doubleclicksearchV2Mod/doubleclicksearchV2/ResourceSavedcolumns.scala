package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Savedcolumns")
@js.native
class ResourceSavedcolumns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * doubleclicksearch.savedColumns.list
    * @desc Retrieve the list of saved columns for a specified advertiser.
    * @alias doubleclicksearch.savedColumns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId DS ID of the advertiser.
    * @param {string} params.agencyId DS ID of the agency.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(params: ParamsResourceSavedcolumnsList): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(params: ParamsResourceSavedcolumnsList, callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: BodyResponseCallback[SchemaSavedColumnList],
    callback: BodyResponseCallback[SchemaSavedColumnList]
  ): Unit = js.native
  def list(params: ParamsResourceSavedcolumnsList, options: MethodOptions): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedColumnList]
  ): Unit = js.native
}
