package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an X509 certificate.
  */
@js.native
trait SchemaCertificateInfo extends js.Object {
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
  var sha256Fingerprint: js.UndefOr[String] = js.native
}

object SchemaCertificateInfo {
  @scala.inline
  def apply(sha256Fingerprint: String = null): SchemaCertificateInfo = {
    val __obj = js.Dynamic.literal()
    if (sha256Fingerprint != null) __obj.updateDynamic("sha256Fingerprint")(sha256Fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCertificateInfo]
  }
}

