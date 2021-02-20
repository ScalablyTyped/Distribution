package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Shippingsettings")
@js.native
class ResourceShippingsettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.shippingsettings.custombatch
    * @desc Retrieves and updates the shipping settings of multiple accounts in
    * a single request.
    * @alias content.shippingsettings.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ShippingsettingsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceShippingsettingsCustombatch): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    options: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse],
    callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceShippingsettingsCustombatch, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceShippingsettingsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  
  /**
    * content.shippingsettings.get
    * @desc Retrieves the shipping settings of the account.
    * @alias content.shippingsettings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update shipping settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(params: ParamsResourceShippingsettingsGet): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(params: ParamsResourceShippingsettingsGet, callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def get(
    params: ParamsResourceShippingsettingsGet,
    options: BodyResponseCallback[SchemaShippingSettings],
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  def get(params: ParamsResourceShippingsettingsGet, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def get(
    params: ParamsResourceShippingsettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  
  /**
    * content.shippingsettings.getsupportedcarriers
    * @desc Retrieves supported carriers and carrier services for an account.
    * @alias content.shippingsettings.getsupportedcarriers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account for which to retrieve the supported carriers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getsupportedcarriers(): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]): Unit = js.native
  def getsupportedcarriers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(params: ParamsResourceShippingsettingsGetsupportedcarriers): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    options: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse],
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(params: ParamsResourceShippingsettingsGetsupportedcarriers, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsResourceShippingsettingsGetsupportedcarriers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  
  /**
    * content.shippingsettings.getsupportedholidays
    * @desc Retrieves supported holidays for an account.
    * @alias content.shippingsettings.getsupportedholidays
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account for which to retrieve the supported holidays.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getsupportedholidays(): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]): Unit = js.native
  def getsupportedholidays(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(params: ParamsResourceShippingsettingsGetsupportedholidays): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    options: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse],
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(params: ParamsResourceShippingsettingsGetsupportedholidays, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsResourceShippingsettingsGetsupportedholidays,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  
  /**
    * content.shippingsettings.list
    * @desc Lists the shipping settings of the sub-accounts in your Merchant
    * Center account.
    * @alias content.shippingsettings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of shipping settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaShippingsettingsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(params: ParamsResourceShippingsettingsList): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    callback: BodyResponseCallback[SchemaShippingsettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    options: BodyResponseCallback[SchemaShippingsettingsListResponse],
    callback: BodyResponseCallback[SchemaShippingsettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceShippingsettingsList, options: MethodOptions): GaxiosPromise[SchemaShippingsettingsListResponse] = js.native
  def list(
    params: ParamsResourceShippingsettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingsettingsListResponse]
  ): Unit = js.native
  
  /**
    * content.shippingsettings.update
    * @desc Updates the shipping settings of the account.
    * @alias content.shippingsettings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update shipping settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().ShippingSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(callback: BodyResponseCallback[SchemaShippingSettings]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(params: ParamsResourceShippingsettingsUpdate): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    options: BodyResponseCallback[SchemaShippingSettings],
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
  def update(params: ParamsResourceShippingsettingsUpdate, options: MethodOptions): GaxiosPromise[SchemaShippingSettings] = js.native
  def update(
    params: ParamsResourceShippingsettingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShippingSettings]
  ): Unit = js.native
}
