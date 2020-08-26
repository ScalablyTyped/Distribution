package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMarketplacenotesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Query string to retrieve specific notes. To search the text contents of
    * notes, please use syntax like "WHERE note.note = "foo" or "WHERE
    * note.note LIKE "%bar%"
    */
  var pqlQuery: js.UndefOr[String] = js.native
  /**
    * The proposalId to get notes for. To search across all proposals specify
    * order_id = '-' as part of the URL.
    */
  var proposalId: js.UndefOr[String] = js.native
}

object ParamsResourceMarketplacenotesList {
  @scala.inline
  def apply(): ParamsResourceMarketplacenotesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesList]
  }
  @scala.inline
  implicit class ParamsResourceMarketplacenotesListOps[Self <: ParamsResourceMarketplacenotesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setPqlQuery(value: String): Self = this.set("pqlQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePqlQuery: Self = this.set("pqlQuery", js.undefined)
    @scala.inline
    def setProposalId(value: String): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
  }
  
}

