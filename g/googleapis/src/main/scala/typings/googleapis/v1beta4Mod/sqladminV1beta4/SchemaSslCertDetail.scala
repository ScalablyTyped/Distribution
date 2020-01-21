package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCertDetail.
  */
@js.native
trait SchemaSslCertDetail extends js.Object {
  /**
    * The public information about the cert.
    */
  var certInfo: js.UndefOr[SchemaSslCert] = js.native
  /**
    * The private key for the client cert, in pem format. Keep private in order
    * to protect your security.
    */
  var certPrivateKey: js.UndefOr[String] = js.native
}

object SchemaSslCertDetail {
  @scala.inline
  def apply(certInfo: SchemaSslCert = null, certPrivateKey: String = null): SchemaSslCertDetail = {
    val __obj = js.Dynamic.literal()
    if (certInfo != null) __obj.updateDynamic("certInfo")(certInfo.asInstanceOf[js.Any])
    if (certPrivateKey != null) __obj.updateDynamic("certPrivateKey")(certPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertDetail]
  }
}

