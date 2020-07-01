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
  def apply(
    adultContent: js.UndefOr[Boolean] = js.undefined,
    adwordsLinks: js.Array[SchemaAccountAdwordsLink] = null,
    businessInformation: SchemaAccountBusinessInformation = null,
    googleMyBusinessLink: SchemaAccountGoogleMyBusinessLink = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    reviewsUrl: String = null,
    sellerId: String = null,
    users: js.Array[SchemaAccountUser] = null,
    websiteUrl: String = null,
    youtubeChannelLinks: js.Array[SchemaAccountYouTubeChannelLink] = null
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adultContent)) __obj.updateDynamic("adultContent")(adultContent.get.asInstanceOf[js.Any])
    if (adwordsLinks != null) __obj.updateDynamic("adwordsLinks")(adwordsLinks.asInstanceOf[js.Any])
    if (businessInformation != null) __obj.updateDynamic("businessInformation")(businessInformation.asInstanceOf[js.Any])
    if (googleMyBusinessLink != null) __obj.updateDynamic("googleMyBusinessLink")(googleMyBusinessLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reviewsUrl != null) __obj.updateDynamic("reviewsUrl")(reviewsUrl.asInstanceOf[js.Any])
    if (sellerId != null) __obj.updateDynamic("sellerId")(sellerId.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    if (youtubeChannelLinks != null) __obj.updateDynamic("youtubeChannelLinks")(youtubeChannelLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

