package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Query")
@js.native
class ResourceQuery protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.query.sql
    * @desc Executes an SQL SELECT/INSERT/UPDATE/DELETE/SHOW/DESCRIBE/CREATE
    * statement.
    * @alias fusiontables.query.sql
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.hdrs Should column names be included (in the first row)?. Default is true.
    * @param {string} params.sql An SQL SELECT/SHOW/DESCRIBE/INSERT/UPDATE/DELETE/CREATE statement.
    * @param {boolean=} params.typed Should typed values be returned in the (JSON) response -- numbers for numeric values and parsed geometries for KML values? Default is true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sql(): GaxiosPromise[SchemaSqlresponse] = js.native
  def sql(callback: BodyResponseCallback[SchemaSqlresponse]): Unit = js.native
  def sql(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSqlresponse] = js.native
  def sql(params: ParamsResourceQuerySql): GaxiosPromise[SchemaSqlresponse] = js.native
  def sql(params: ParamsResourceQuerySql, callback: BodyResponseCallback[SchemaSqlresponse]): Unit = js.native
  def sql(
    params: ParamsResourceQuerySql,
    options: BodyResponseCallback[SchemaSqlresponse],
    callback: BodyResponseCallback[SchemaSqlresponse]
  ): Unit = js.native
  def sql(params: ParamsResourceQuerySql, options: MethodOptions): GaxiosPromise[SchemaSqlresponse] = js.native
  def sql(
    params: ParamsResourceQuerySql,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSqlresponse]
  ): Unit = js.native
  /**
    * fusiontables.query.sqlGet
    * @desc Executes an SQL SELECT/SHOW/DESCRIBE statement.
    * @alias fusiontables.query.sqlGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.hdrs Should column names be included (in the first row)?. Default is true.
    * @param {string} params.sql An SQL SELECT/SHOW/DESCRIBE statement.
    * @param {boolean=} params.typed Should typed values be returned in the (JSON) response -- numbers for numeric values and parsed geometries for KML values? Default is true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sqlGet(): GaxiosPromise[SchemaSqlresponse] = js.native
  def sqlGet(callback: BodyResponseCallback[SchemaSqlresponse]): Unit = js.native
  def sqlGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSqlresponse] = js.native
  def sqlGet(params: ParamsResourceQuerySqlget): GaxiosPromise[SchemaSqlresponse] = js.native
  def sqlGet(params: ParamsResourceQuerySqlget, callback: BodyResponseCallback[SchemaSqlresponse]): Unit = js.native
  def sqlGet(
    params: ParamsResourceQuerySqlget,
    options: BodyResponseCallback[SchemaSqlresponse],
    callback: BodyResponseCallback[SchemaSqlresponse]
  ): Unit = js.native
  def sqlGet(params: ParamsResourceQuerySqlget, options: MethodOptions): GaxiosPromise[SchemaSqlresponse] = js.native
  def sqlGet(
    params: ParamsResourceQuerySqlget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSqlresponse]
  ): Unit = js.native
}

