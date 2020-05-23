package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rsaprvkey extends js.Object {
  var rsaprvkey: RSAKey
  var tbsobj: TBSCertList
}

object Rsaprvkey {
  @scala.inline
  def apply(rsaprvkey: RSAKey, tbsobj: TBSCertList): Rsaprvkey = {
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rsaprvkey]
  }
}

