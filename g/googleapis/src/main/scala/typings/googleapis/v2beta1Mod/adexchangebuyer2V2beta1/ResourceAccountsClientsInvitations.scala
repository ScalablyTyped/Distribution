package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients$Invitations")
@js.native
class ResourceAccountsClientsInvitations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.invitations.create
    * @desc Creates and sends out an email invitation to access an Ad Exchange
    * client buyer account.
    * @alias adexchangebuyer2.accounts.clients.invitations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer that the user should be associated with. (required)
    * @param {().ClientUserInvitation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(callback: BodyResponseCallback[SchemaClientUserInvitation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(params: ParamsResourceAccountsClientsInvitationsCreate): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    options: BodyResponseCallback[SchemaClientUserInvitation],
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsClientsInvitationsCreate, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.invitations.get
    * @desc Retrieves an existing client user invitation.
    * @alias adexchangebuyer2.accounts.clients.invitations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer that the user invitation to be retrieved is associated with. (required)
    * @param {string} params.invitationId Numerical identifier of the user invitation to retrieve. (required)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(callback: BodyResponseCallback[SchemaClientUserInvitation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(params: ParamsResourceAccountsClientsInvitationsGet): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    options: BodyResponseCallback[SchemaClientUserInvitation],
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsClientsInvitationsGet, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.invitations.list
    * @desc Lists all the client users invitations for a client with a given
    * account ID.
    * @alias adexchangebuyer2.accounts.clients.invitations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer to list invitations for. (required) You must either specify a string representation of a numerical account identifier or the `-` character to list all the invitations for all the clients of a given sponsor buyer.
    * @param {integer=} params.pageSize Requested page size. Server may return fewer clients than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListClientUserInvitationsResponse.nextPageToken returned from the previous call to the clients.invitations.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(params: ParamsResourceAccountsClientsInvitationsList): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    options: BodyResponseCallback[SchemaListClientUserInvitationsResponse],
    callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsClientsInvitationsList, options: MethodOptions): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
}
