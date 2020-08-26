package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account data. After the creation of a new account it may take a few minutes
  * before it is fully operational. The methods delete, insert, patch, and
  * update require the admin role.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * Indicates whether the merchant sells adult content.
    */
  var adultContent: js.UndefOr[Boolean] = js.native
  /**
    * List of linked AdWords accounts that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected either in
    * the AdWords interface or through the  AdWords API. To delete an active
    * link, or to cancel a link request, remove it from the list.
    */
  var adwordsLinks: js.UndefOr[js.Array[SchemaAccountAdwordsLink]] = js.native
  /**
    * The business information of the account.
    */
  var businessInformation: js.UndefOr[SchemaAccountBusinessInformation] = js.native
  /**
    * The GMB account which is linked or in the process of being linked with
    * the Merchant Center account.
    */
  var googleMyBusinessLink: js.UndefOr[SchemaAccountGoogleMyBusinessLink] = js.native
  /**
    * Merchant Center account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#account&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Display name for the account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] This field is never returned and will be ignored if
    * provided.
    */
  var reviewsUrl: js.UndefOr[String] = js.native
  /**
    * Client-specific, locally-unique, internal ID for the child account.
    */
  var sellerId: js.UndefOr[String] = js.native
  /**
    * Users with access to the account. Every account (except for subaccounts)
    * must have at least one admin user.
    */
  var users: js.UndefOr[js.Array[SchemaAccountUser]] = js.native
  /**
    * The merchant&#39;s website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
  /**
    * List of linked YouTube channels that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected in the YT
    * Creator Studio interface. To delete an active link, or to cancel a link
    * request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[SchemaAccountYouTubeChannelLink]] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
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
    def setAdultContent(value: Boolean): Self = this.set("adultContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdultContent: Self = this.set("adultContent", js.undefined)
    @scala.inline
    def setAdwordsLinksVarargs(value: SchemaAccountAdwordsLink*): Self = this.set("adwordsLinks", js.Array(value :_*))
    @scala.inline
    def setAdwordsLinks(value: js.Array[SchemaAccountAdwordsLink]): Self = this.set("adwordsLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsLinks: Self = this.set("adwordsLinks", js.undefined)
    @scala.inline
    def setBusinessInformation(value: SchemaAccountBusinessInformation): Self = this.set("businessInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessInformation: Self = this.set("businessInformation", js.undefined)
    @scala.inline
    def setGoogleMyBusinessLink(value: SchemaAccountGoogleMyBusinessLink): Self = this.set("googleMyBusinessLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleMyBusinessLink: Self = this.set("googleMyBusinessLink", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReviewsUrl(value: String): Self = this.set("reviewsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewsUrl: Self = this.set("reviewsUrl", js.undefined)
    @scala.inline
    def setSellerId(value: String): Self = this.set("sellerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerId: Self = this.set("sellerId", js.undefined)
    @scala.inline
    def setUsersVarargs(value: SchemaAccountUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[SchemaAccountUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: SchemaAccountYouTubeChannelLink*): Self = this.set("youtubeChannelLinks", js.Array(value :_*))
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[SchemaAccountYouTubeChannelLink]): Self = this.set("youtubeChannelLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoutubeChannelLinks: Self = this.set("youtubeChannelLinks", js.undefined)
  }
  
}

