package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Conversions")
@js.native
class ResourceConversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.conversions.batchinsert
    * @desc Inserts conversions.
    * @alias dfareporting.conversions.batchinsert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ConversionsBatchInsertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchinsert(): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]): Unit = js.native
  def batchinsert(params: ParamsResourceConversionsBatchinsert): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    options: BodyResponseCallback[SchemaConversionsBatchInsertResponse],
    callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(params: ParamsResourceConversionsBatchinsert, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceConversionsBatchinsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionsBatchInsertResponse]
  ): Unit = js.native
  /**
    * dfareporting.conversions.batchupdate
    * @desc Updates existing conversions.
    * @alias dfareporting.conversions.batchupdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ConversionsBatchUpdateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchupdate(): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]): Unit = js.native
  def batchupdate(params: ParamsResourceConversionsBatchupdate): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    options: BodyResponseCallback[SchemaConversionsBatchUpdateResponse],
    callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(params: ParamsResourceConversionsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsResourceConversionsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionsBatchUpdateResponse]
  ): Unit = js.native
}

