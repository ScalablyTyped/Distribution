package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Provisioning")
@js.native
class ResourceProvisioning protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.provisioning.createAccountTicket
    * @desc Creates an account ticket.
    * @alias analytics.provisioning.createAccountTicket
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountTicket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAccountTicket(): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(callback: BodyResponseCallback[SchemaAccountTicket]): Unit = js.native
  def createAccountTicket(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(params: ParamsResourceProvisioningCreateaccountticket): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    callback: BodyResponseCallback[SchemaAccountTicket]
  ): Unit = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    options: BodyResponseCallback[SchemaAccountTicket],
    callback: BodyResponseCallback[SchemaAccountTicket]
  ): Unit = js.native
  def createAccountTicket(params: ParamsResourceProvisioningCreateaccountticket, options: MethodOptions): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTicket]
  ): Unit = js.native
  /**
    * analytics.provisioning.createAccountTree
    * @desc Provision account.
    * @alias analytics.provisioning.createAccountTree
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountTreeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAccountTree(): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(callback: BodyResponseCallback[SchemaAccountTreeResponse]): Unit = js.native
  def createAccountTree(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(params: ParamsResourceProvisioningCreateaccounttree): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    callback: BodyResponseCallback[SchemaAccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    options: BodyResponseCallback[SchemaAccountTreeResponse],
    callback: BodyResponseCallback[SchemaAccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(params: ParamsResourceProvisioningCreateaccounttree, options: MethodOptions): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTreeResponse]
  ): Unit = js.native
}

