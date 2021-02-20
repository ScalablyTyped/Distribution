package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Dataset")
@js.native
class ResourceUsersDataset protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * fitness.users.dataset.aggregate
    * @desc Aggregates data of a certain type or stream into buckets divided by
    * a given type of boundary. Multiple data sets of multiple types and from
    * multiple sources can be aggreated into exactly one bucket type per
    * request.
    * @alias fitness.users.dataset.aggregate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId Aggregate data for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {().AggregateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregate(): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(callback: BodyResponseCallback[SchemaAggregateResponse]): Unit = js.native
  def aggregate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(params: ParamsResourceUsersDatasetAggregate): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    callback: BodyResponseCallback[SchemaAggregateResponse]
  ): Unit = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    options: BodyResponseCallback[SchemaAggregateResponse],
    callback: BodyResponseCallback[SchemaAggregateResponse]
  ): Unit = js.native
  def aggregate(params: ParamsResourceUsersDatasetAggregate, options: MethodOptions): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAggregateResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
