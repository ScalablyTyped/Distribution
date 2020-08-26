package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAssetlinksCheck extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Query string for the relation.  We identify relations with strings of the
    * format `<kind>/<detail>`, where `<kind>` must be one of a set of
    * pre-defined purpose categories, and `<detail>` is a free-form lowercase
    * alphanumeric string that describes the specific use case of the
    * statement.  Refer to [our API
    * documentation](/digital-asset-links/v1/relation-strings) for the current
    * list of supported relations.  For a query to match an asset link, both
    * the query's and the asset link's relation strings must match exactly.
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
  @JSName("target.androidApp.certificate.sha256Fingerprint")
  var targetDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.native
  /**
    * Android App assets are naturally identified by their Java package name.
    * For example, the Google Maps app uses the package name
    * `com.google.android.apps.maps`. REQUIRED
    */
  @JSName("target.androidApp.packageName")
  var targetDotandroidAppDotpackageName: js.UndefOr[String] = js.native
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
  @JSName("target.web.site")
  var targetDotwebDotsite: js.UndefOr[String] = js.native
}

object ParamsResourceAssetlinksCheck {
  @scala.inline
  def apply(): ParamsResourceAssetlinksCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetlinksCheck]
  }
  @scala.inline
  implicit class ParamsResourceAssetlinksCheckOps[Self <: ParamsResourceAssetlinksCheck] (val x: Self) extends AnyVal {
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
    def setRelation(value: String): Self = this.set("relation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelation: Self = this.set("relation", js.undefined)
    @scala.inline
    def setSourceDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = this.set("source.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDotandroidAppDotcertificateDotsha256Fingerprint: Self = this.set("source.androidApp.certificate.sha256Fingerprint", js.undefined)
    @scala.inline
    def setSourceDotandroidAppDotpackageName(value: String): Self = this.set("source.androidApp.packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDotandroidAppDotpackageName: Self = this.set("source.androidApp.packageName", js.undefined)
    @scala.inline
    def setSourceDotwebDotsite(value: String): Self = this.set("source.web.site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDotwebDotsite: Self = this.set("source.web.site", js.undefined)
    @scala.inline
    def setTargetDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = this.set("target.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetDotandroidAppDotcertificateDotsha256Fingerprint: Self = this.set("target.androidApp.certificate.sha256Fingerprint", js.undefined)
    @scala.inline
    def setTargetDotandroidAppDotpackageName(value: String): Self = this.set("target.androidApp.packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetDotandroidAppDotpackageName: Self = this.set("target.androidApp.packageName", js.undefined)
    @scala.inline
    def setTargetDotwebDotsite(value: String): Self = this.set("target.web.site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetDotwebDotsite: Self = this.set("target.web.site", js.undefined)
  }
  
}

