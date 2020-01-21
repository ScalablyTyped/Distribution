package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrvkeyobj extends js.Object {
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.undefined
  var tbscertobj: js.UndefOr[TBSCertificate] = js.undefined
}

object AnonPrvkeyobj {
  @scala.inline
  def apply(prvkeyobj: RSAKey | ECDSA | DSA = null, tbscertobj: TBSCertificate = null): AnonPrvkeyobj = {
    val __obj = js.Dynamic.literal()
    if (prvkeyobj != null) __obj.updateDynamic("prvkeyobj")(prvkeyobj.asInstanceOf[js.Any])
    if (tbscertobj != null) __obj.updateDynamic("tbscertobj")(tbscertobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrvkeyobj]
  }
}

