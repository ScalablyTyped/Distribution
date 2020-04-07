package typings.googleapis.slidesV1Mod.slidesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePresentationsPagesGetthumbnail extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The optional mime type of the thumbnail image.  If you don't specify the
    * mime type, the default mime type will be PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.native
  /**
    * The optional thumbnail image size.  If you don't specify the size, the
    * server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.native
}

object ParamsResourcePresentationsPagesGetthumbnail {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageObjectId: String = null,
    presentationId: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    thumbnailPropertiesDotmimeType: String = null,
    thumbnailPropertiesDotthumbnailSize: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourcePresentationsPagesGetthumbnail = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId.asInstanceOf[js.Any])
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (thumbnailPropertiesDotmimeType != null) __obj.updateDynamic("thumbnailProperties.mimeType")(thumbnailPropertiesDotmimeType.asInstanceOf[js.Any])
    if (thumbnailPropertiesDotthumbnailSize != null) __obj.updateDynamic("thumbnailProperties.thumbnailSize")(thumbnailPropertiesDotthumbnailSize.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGetthumbnail]
  }
}

