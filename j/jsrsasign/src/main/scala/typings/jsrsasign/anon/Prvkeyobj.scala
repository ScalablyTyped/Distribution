package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prvkeyobj extends js.Object {
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.undefined
  var tbscertobj: js.UndefOr[TBSCertificate] = js.undefined
}

object Prvkeyobj {
  @scala.inline
  def apply(prvkeyobj: RSAKey | ECDSA | DSA = null, tbscertobj: TBSCertificate = null): Prvkeyobj = {
    val __obj = js.Dynamic.literal()
    if (prvkeyobj != null) __obj.updateDynamic("prvkeyobj")(prvkeyobj.asInstanceOf[js.Any])
    if (tbscertobj != null) __obj.updateDynamic("tbscertobj")(tbscertobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prvkeyobj]
  }
}

