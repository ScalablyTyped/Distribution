package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProductstatusesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Flag to include full product data in the results of the list request. The
    * default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Flag to include the invalid inserted items in the result of the list
    * request. By default the invalid items are not shown (the default value is
    * false).
    */
  var includeInvalidInsertedItems: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of product statuses to return in the response, used
    * for paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The ID of the account that contains the products. This account cannot be
    * a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProductstatusesList {
  @scala.inline
  def apply(): ParamsResourceProductstatusesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductstatusesList]
  }
  @scala.inline
  implicit class ParamsResourceProductstatusesListOps[Self <: ParamsResourceProductstatusesList] (val x: Self) extends AnyVal {
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
    def setDestinationsVarargs(value: String*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = this.set("includeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAttributes: Self = this.set("includeAttributes", js.undefined)
    @scala.inline
    def setIncludeInvalidInsertedItems(value: Boolean): Self = this.set("includeInvalidInsertedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInvalidInsertedItems: Self = this.set("includeInvalidInsertedItems", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

