package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsList extends StandardParameters {
  /**
    * A comma-separated list of file extensions for open with filtering. All
    * apps within the given app query scope which can open any of the given
    * file extensions will be included in the response. If appFilterMimeTypes
    * are provided as well, the result is a union of the two resulting app
    * lists.
    */
  var appFilterExtensions: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of MIME types for open with filtering. All apps
    * within the given app query scope which can open any of the given MIME
    * types will be included in the response. If appFilterExtensions are
    * provided as well, the result is a union of the two resulting app lists.
    */
  var appFilterMimeTypes: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A language or locale code, as defined by BCP 47, with some extensions
    * from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.native
}

object ParamsResourceAppsList {
  @scala.inline
  def apply(
    alt: String = null,
    appFilterExtensions: String = null,
    appFilterMimeTypes: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    languageCode: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceAppsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (appFilterExtensions != null) __obj.updateDynamic("appFilterExtensions")(appFilterExtensions.asInstanceOf[js.Any])
    if (appFilterMimeTypes != null) __obj.updateDynamic("appFilterMimeTypes")(appFilterMimeTypes.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceAppsList]
  }
}

