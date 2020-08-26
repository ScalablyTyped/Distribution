package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Accounts Response.
  */
@js.native
trait SchemaListAccountsResponse extends js.Object {
  /**
    * List of GTM Accounts that a user has access to.
    */
  var account: js.UndefOr[js.Array[SchemaAccount]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccountsResponse {
  @scala.inline
  def apply(): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
  @scala.inline
  implicit class SchemaListAccountsResponseOps[Self <: SchemaListAccountsResponse] (val x: Self) extends AnyVal {
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
    def setAccountVarargs(value: SchemaAccount*): Self = this.set("account", js.Array(value :_*))
    @scala.inline
    def setAccount(value: js.Array[SchemaAccount]): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

