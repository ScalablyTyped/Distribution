package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account list response.
  */
@js.native
trait SchemaListServiceAccountsResponse extends js.Object {
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  /**
    * To retrieve the next page of results, set
    * ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListServiceAccountsResponse {
  @scala.inline
  def apply(): SchemaListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountsResponse]
  }
  @scala.inline
  implicit class SchemaListServiceAccountsResponseOps[Self <: SchemaListServiceAccountsResponse] (val x: Self) extends AnyVal {
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
    def setAccountsVarargs(value: SchemaServiceAccount*): Self = this.set("accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: js.Array[SchemaServiceAccount]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

