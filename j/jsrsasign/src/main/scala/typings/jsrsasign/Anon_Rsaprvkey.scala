package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rsaprvkey extends js.Object {
  var rsaprvkey: RSAKey
  var tbsobj: TBSCertList
}

object Anon_Rsaprvkey {
  @scala.inline
  def apply(rsaprvkey: RSAKey, tbsobj: TBSCertList): Anon_Rsaprvkey = {
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rsaprvkey]
  }
}

