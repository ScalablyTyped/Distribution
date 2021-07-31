package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Budget")
@js.native
class ResourceBudget protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.budget.get
    * @desc Returns the budget information for the adgroup specified by the
    * accountId and billingId.
    * @alias adexchangebuyer.budget.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the budget information for.
    * @param {string} params.billingId The billing id to get the budget information for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBudget] = js.native
  def get(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def get(params: ParamsResourceBudgetGet): GaxiosPromise[SchemaBudget] = js.native
  def get(params: ParamsResourceBudgetGet, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def get(
    params: ParamsResourceBudgetGet,
    options: BodyResponseCallback[SchemaBudget],
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  def get(params: ParamsResourceBudgetGet, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def get(
    params: ParamsResourceBudgetGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.budget.patch
    * @desc Updates the budget amount for the budget of the adgroup specified
    * by the accountId and billingId, with the budget amount in the request.
    * This method supports patch semantics.
    * @alias adexchangebuyer.budget.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id associated with the budget being updated.
    * @param {string} params.billingId The billing id associated with the budget being updated.
    * @param {().Budget} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBudget] = js.native
  def patch(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def patch(params: ParamsResourceBudgetPatch): GaxiosPromise[SchemaBudget] = js.native
  def patch(params: ParamsResourceBudgetPatch, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def patch(
    params: ParamsResourceBudgetPatch,
    options: BodyResponseCallback[SchemaBudget],
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  def patch(params: ParamsResourceBudgetPatch, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def patch(
    params: ParamsResourceBudgetPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.budget.update
    * @desc Updates the budget amount for the budget of the adgroup specified
    * by the accountId and billingId, with the budget amount in the request.
    * @alias adexchangebuyer.budget.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id associated with the budget being updated.
    * @param {string} params.billingId The billing id associated with the budget being updated.
    * @param {().Budget} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaBudget] = js.native
  def update(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def update(params: ParamsResourceBudgetUpdate): GaxiosPromise[SchemaBudget] = js.native
  def update(params: ParamsResourceBudgetUpdate, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def update(
    params: ParamsResourceBudgetUpdate,
    options: BodyResponseCallback[SchemaBudget],
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  def update(params: ParamsResourceBudgetUpdate, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def update(
    params: ParamsResourceBudgetUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
}
