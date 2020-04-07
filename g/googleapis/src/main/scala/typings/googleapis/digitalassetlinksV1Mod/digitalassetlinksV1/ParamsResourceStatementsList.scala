package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceStatementsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Use only associations that match the specified relation.  See the
    * [`Statement`](#Statement) message for a detailed definition of relation
    * strings.  For a query to match a statement, one of the following must be
    * true:  *    both the query's and the statement's relation strings match
    * exactly,      or *    the query's relation string is empty or missing.
    * Example: A query with relation
    * `delegate_permission/common.handle_all_urls` matches an asset link with
    * relation `delegate_permission/common.handle_all_urls`.
    */
  var relation: js.UndefOr[String] = js.native
  /**
    * The uppercase SHA-265 fingerprint of the certificate.  From the PEM
    * certificate, it can be acquired like this:      $ keytool -printcert
    * -file $CERTFILE | grep SHA256:     SHA256:
    * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \
    * 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509
    * -in $CERTFILE -noout -fingerprint -sha256     SHA256
    * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \
    * 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the
    * contents of this field would be `14:6D:E9:83:C5:73:
    * 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:
    * 44:E5`.  If these tools are not available to you, you can convert the PEM
    * certificate into the DER format, compute the SHA-256 hash of that string
    * and represent the result as a hexstring (that is, uppercase hexadecimal
    * representations of each octet, separated by colons).
    */
  @JSName("source.androidApp.certificate.sha256Fingerprint")
  var sourceDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.native
  /**
    * Android App assets are naturally identified by their Java package name.
    * For example, the Google Maps app uses the package name
    * `com.google.android.apps.maps`. REQUIRED
    */
  @JSName("source.androidApp.packageName")
  var sourceDotandroidAppDotpackageName: js.UndefOr[String] = js.native
  /**
    * Web assets are identified by a URL that contains only the scheme,
    * hostname and port parts.  The format is http[s]://<hostname>[:<port>]
    * Hostnames must be fully qualified: they must end in a single period
    * ("`.`").  Only the schemes "http" and "https" are currently allowed. Port
    * numbers are given as a decimal number, and they must be omitted if the
    * standard port numbers are used: 80 for http and 443 for https.  We call
    * this limited URL the "site".  All URLs that share the same scheme,
    * hostname and port are considered to be a part of the site and thus belong
    * to the web asset.  Example: the asset with the site
    * `https://www.google.com` contains all these URLs:    *
    * `https://www.google.com/`   *   `https://www.google.com:443/`   *
    * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
    * `https://www.google.com/foo#bar`   *
    * `https://user@password:www.google.com/`  But it does not contain these
    * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
    * `https://google.com/`          (hostname does not match)   *
    * `https://www.google.com:444/`  (port does not match) REQUIRED
    */
  @JSName("source.web.site")
  var sourceDotwebDotsite: js.UndefOr[String] = js.native
}

object ParamsResourceStatementsList {
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
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    relation: String = null,
    sourceDotandroidAppDotcertificateDotsha256Fingerprint: String = null,
    sourceDotandroidAppDotpackageName: String = null,
    sourceDotwebDotsite: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceStatementsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (relation != null) __obj.updateDynamic("relation")(relation.asInstanceOf[js.Any])
    if (sourceDotandroidAppDotcertificateDotsha256Fingerprint != null) __obj.updateDynamic("source.androidApp.certificate.sha256Fingerprint")(sourceDotandroidAppDotcertificateDotsha256Fingerprint.asInstanceOf[js.Any])
    if (sourceDotandroidAppDotpackageName != null) __obj.updateDynamic("source.androidApp.packageName")(sourceDotandroidAppDotpackageName.asInstanceOf[js.Any])
    if (sourceDotwebDotsite != null) __obj.updateDynamic("source.web.site")(sourceDotwebDotsite.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceStatementsList]
  }
}

