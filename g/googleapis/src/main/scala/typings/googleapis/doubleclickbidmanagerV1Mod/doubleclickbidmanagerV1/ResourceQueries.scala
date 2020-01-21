package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Queries")
@js.native
class ResourceQueries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.queries.createquery
    * @desc Creates a query.
    * @alias doubleclickbidmanager.queries.createquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Query} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createquery(): GaxiosPromise[SchemaQuery] = js.native
  def createquery(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def createquery(params: ParamsResourceQueriesCreatequery): GaxiosPromise[SchemaQuery] = js.native
  def createquery(params: ParamsResourceQueriesCreatequery, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def createquery(
    params: ParamsResourceQueriesCreatequery,
    options: BodyResponseCallback[SchemaQuery],
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  def createquery(params: ParamsResourceQueriesCreatequery, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def createquery(
    params: ParamsResourceQueriesCreatequery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.deletequery
    * @desc Deletes a stored query as well as the associated stored reports.
    * @alias doubleclickbidmanager.queries.deletequery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deletequery(): GaxiosPromise[Unit] = js.native
  def deletequery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery): GaxiosPromise[Unit] = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(
    params: ParamsResourceQueriesDeletequery,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deletequery(
    params: ParamsResourceQueriesDeletequery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.getquery
    * @desc Retrieves a stored query.
    * @alias doubleclickbidmanager.queries.getquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getquery(): GaxiosPromise[SchemaQuery] = js.native
  def getquery(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def getquery(params: ParamsResourceQueriesGetquery): GaxiosPromise[SchemaQuery] = js.native
  def getquery(params: ParamsResourceQueriesGetquery, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def getquery(
    params: ParamsResourceQueriesGetquery,
    options: BodyResponseCallback[SchemaQuery],
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  def getquery(params: ParamsResourceQueriesGetquery, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def getquery(
    params: ParamsResourceQueriesGetquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.listqueries
    * @desc Retrieves stored queries.
    * @alias doubleclickbidmanager.queries.listqueries
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listqueries(): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(callback: BodyResponseCallback[SchemaListQueriesResponse]): Unit = js.native
  def listqueries(params: ParamsResourceQueriesListqueries): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    options: BodyResponseCallback[SchemaListQueriesResponse],
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  def listqueries(params: ParamsResourceQueriesListqueries, options: MethodOptions): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.runquery
    * @desc Runs a stored query to generate a report.
    * @alias doubleclickbidmanager.queries.runquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to run.
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runquery(): GaxiosPromise[Unit] = js.native
  def runquery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(params: ParamsResourceQueriesRunquery): GaxiosPromise[Unit] = js.native
  def runquery(params: ParamsResourceQueriesRunquery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(
    params: ParamsResourceQueriesRunquery,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def runquery(params: ParamsResourceQueriesRunquery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def runquery(
    params: ParamsResourceQueriesRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

