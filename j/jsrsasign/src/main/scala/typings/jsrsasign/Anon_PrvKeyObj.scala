package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns.TBSCertificate
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.DSA
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.ECDSA
import typings.jsrsasign.jsrsasignNs.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrvKeyObj extends js.Object {
  var prvKeyObj: RSAKey
  var pubKeyObj: RSAKey
}

trait Anon_Prvkeyobj extends js.Object {
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.undefined
  var tbscertobj: js.UndefOr[TBSCertificate] = js.undefined
}

object Anon_PrvKeyObj {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): Anon_PrvKeyObj = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj, pubKeyObj = pubKeyObj)
  
    __obj.asInstanceOf[Anon_PrvKeyObj]
  }
}

object Anon_Prvkeyobj {
  @scala.inline
  def apply(prvkeyobj: RSAKey | ECDSA | DSA = null, tbscertobj: TBSCertificate = null): Anon_Prvkeyobj = {
    val __obj = js.Dynamic.literal()
    if (prvkeyobj != null) __obj.updateDynamic("prvkeyobj")(prvkeyobj.asInstanceOf[js.Any])
    if (tbscertobj != null) __obj.updateDynamic("tbscertobj")(tbscertobj)
    __obj.asInstanceOf[Anon_Prvkeyobj]
  }
}

