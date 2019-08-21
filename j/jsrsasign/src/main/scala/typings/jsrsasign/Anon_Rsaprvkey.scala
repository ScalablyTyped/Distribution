package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns.TBSCertList
import typings.jsrsasign.jsrsasignNs.RSAKey
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
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey, tbsobj = tbsobj)
  
    __obj.asInstanceOf[Anon_Rsaprvkey]
  }
}

