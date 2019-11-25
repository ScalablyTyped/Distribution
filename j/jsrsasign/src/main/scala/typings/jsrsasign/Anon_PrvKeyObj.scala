package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrvKeyObj extends js.Object {
  var prvKeyObj: RSAKey
  var pubKeyObj: RSAKey
}

object Anon_PrvKeyObj {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): Anon_PrvKeyObj = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrvKeyObj]
  }
}

trait Anon_Prvkeyobj extends js.Object {
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.undefined
  var tbscertobj: js.UndefOr[TBSCertificate] = js.undefined
}

object Anon_Prvkeyobj {
  @scala.inline
  def apply(prvkeyobj: RSAKey | ECDSA | DSA = null, tbscertobj: TBSCertificate = null): Anon_Prvkeyobj = {
    val __obj = js.Dynamic.literal()
    if (prvkeyobj != null) __obj.updateDynamic("prvkeyobj")(prvkeyobj.asInstanceOf[js.Any])
    if (tbscertobj != null) __obj.updateDynamic("tbscertobj")(tbscertobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Prvkeyobj]
  }
}

