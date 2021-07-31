package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients")
@js.native
class ResourceAccountsClients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.create
    * @desc Creates a new client buyer.
    * @alias adexchangebuyer2.accounts.clients.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to create a client for. (required)
    * @param {().Client} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaClient] = js.native
  def create(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceAccountsClientsCreate): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceAccountsClientsCreate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(
    params: ParamsResourceAccountsClientsCreate,
    options: BodyResponseCallback[SchemaClient],
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsClientsCreate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(
    params: ParamsResourceAccountsClientsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.get
    * @desc Gets a client buyer with a given client account ID.
    * @alias adexchangebuyer2.accounts.clients.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer to retrieve. (required)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaClient] = js.native
  def get(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceAccountsClientsGet): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceAccountsClientsGet, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(
    params: ParamsResourceAccountsClientsGet,
    options: BodyResponseCallback[SchemaClient],
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsClientsGet, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(
    params: ParamsResourceAccountsClientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  
  var invitations: ResourceAccountsClientsInvitations = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.list
    * @desc Lists all the clients for the current sponsor buyer.
    * @alias adexchangebuyer2.accounts.clients.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID of the sponsor buyer to list the clients for.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListClientsResponse.nextPageToken returned from the previous call to the accounts.clients.list method.
    * @param {string=} params.partnerClientId Optional unique identifier (from the standpoint of an Ad Exchange sponsor buyer partner) of the client to return. If specified, at most one client will be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(params: ParamsResourceAccountsClientsList): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    options: BodyResponseCallback[SchemaListClientsResponse],
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsClientsList, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  
  /**
    * adexchangebuyer2.accounts.clients.update
    * @desc Updates an existing client buyer.
    * @alias adexchangebuyer2.accounts.clients.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to update a client for. (required)
    * @param {string} params.clientAccountId Unique numerical account ID of the client to update. (required)
    * @param {().Client} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaClient] = js.native
  def update(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(params: ParamsResourceAccountsClientsUpdate): GaxiosPromise[SchemaClient] = js.native
  def update(params: ParamsResourceAccountsClientsUpdate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def update(
    params: ParamsResourceAccountsClientsUpdate,
    options: BodyResponseCallback[SchemaClient],
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsClientsUpdate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(
    params: ParamsResourceAccountsClientsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  
  var users: ResourceAccountsClientsUsers = js.native
}
