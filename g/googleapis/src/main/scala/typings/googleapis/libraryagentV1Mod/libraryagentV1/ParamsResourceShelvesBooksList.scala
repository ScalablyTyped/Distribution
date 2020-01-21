package typings.googleapis.libraryagentV1Mod.libraryagentV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceShelvesBooksList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. Server may return fewer books than requested. If
    * unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListBooksResponse.next_page_token.
    * returned from the previous call to `ListBooks` method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the shelf whose books we'd like to list.
    */
  var parent: js.UndefOr[String] = js.native
}

