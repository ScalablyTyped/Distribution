package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderinvoices")
@js.native
class ResourceOrderinvoices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.orderinvoices.createchargeinvoice
    * @desc Creates a charge invoice for a shipment group, and triggers a
    * charge capture for non-facilitated payment orders.
    * @alias content.orderinvoices.createchargeinvoice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrderinvoicesCreateChargeInvoiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createchargeinvoice(): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]): Unit = js.native
  def createchargeinvoice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(params: ParamsResourceOrderinvoicesCreatechargeinvoice): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    options: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse],
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(params: ParamsResourceOrderinvoicesCreatechargeinvoice, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsResourceOrderinvoicesCreatechargeinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  
  /**
    * content.orderinvoices.createrefundinvoice
    * @desc Creates a refund invoice for one or more shipment groups, and
    * triggers a refund for non-facilitated payment orders. This can only be
    * used for line items that have previously been charged using
    * createChargeInvoice. All amounts (except for the summary) are incremental
    * with respect to the previous invoice.
    * @alias content.orderinvoices.createrefundinvoice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrderinvoicesCreateRefundInvoiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createrefundinvoice(): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]): Unit = js.native
  def createrefundinvoice(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(params: ParamsResourceOrderinvoicesCreaterefundinvoice): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    options: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse],
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(params: ParamsResourceOrderinvoicesCreaterefundinvoice, options: MethodOptions): GaxiosPromise[SchemaOrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsResourceOrderinvoicesCreaterefundinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
}
