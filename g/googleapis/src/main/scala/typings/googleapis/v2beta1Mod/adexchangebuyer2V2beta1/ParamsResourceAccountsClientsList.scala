package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsList extends StandardParameters {
  /**
    * Unique numerical account ID of the sponsor buyer to list the clients for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. The server may return fewer clients than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListClientsResponse.nextPageToken
    * returned from the previous call to the accounts.clients.list method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Optional unique identifier (from the standpoint of an Ad Exchange sponsor
    * buyer partner) of the client to return. If specified, at most one client
    * will be returned in the response.
    */
  var partnerClientId: js.UndefOr[String] = js.native
}

