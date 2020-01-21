package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsInvitationsList extends StandardParameters {
  /**
    * Numerical account ID of the client's sponsor buyer. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Numerical account ID of the client buyer to list invitations for.
    * (required) You must either specify a string representation of a numerical
    * account identifier or the `-` character to list all the invitations for
    * all the clients of a given sponsor buyer.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Requested page size. Server may return fewer clients than requested. If
    * unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListClientUserInvitationsResponse.nextPageToken returned from the
    * previous call to the clients.invitations.list method.
    */
  var pageToken: js.UndefOr[String] = js.native
}

