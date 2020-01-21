package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetSslProxiesSetSslCertificatesRequest extends js.Object {
  /**
    * New set of URLs to SslCertificate resources to associate with this
    * TargetSslProxy. Currently exactly one ssl certificate must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetSslProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[String] = null): SchemaTargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetSslProxiesSetSslCertificatesRequest]
  }
}

