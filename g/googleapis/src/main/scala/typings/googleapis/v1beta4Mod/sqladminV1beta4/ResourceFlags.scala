package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Flags")
@js.native
class ResourceFlags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.flags.list
    * @desc List all available database flags for Cloud SQL instances.
    * @alias sql.flags.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.databaseVersion Database type and version you want to retrieve flags for. By default, this method returns flags for all database types and versions.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFlagsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFlagsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFlagsListResponse] = js.native
  def list(params: ParamsResourceFlagsList): GaxiosPromise[SchemaFlagsListResponse] = js.native
  def list(params: ParamsResourceFlagsList, callback: BodyResponseCallback[SchemaFlagsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceFlagsList,
    options: BodyResponseCallback[SchemaFlagsListResponse],
    callback: BodyResponseCallback[SchemaFlagsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFlagsList, options: MethodOptions): GaxiosPromise[SchemaFlagsListResponse] = js.native
  def list(
    params: ParamsResourceFlagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFlagsListResponse]
  ): Unit = js.native
}

