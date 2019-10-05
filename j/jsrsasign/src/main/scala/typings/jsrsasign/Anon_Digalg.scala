package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Digalg extends js.Object {
  var digalg: String
  var obj: SignerInfo
  var sattrs: String
  var si: String
  var sigalg: String
  var sigval: String
  var version: String
}

object Anon_Digalg {
  @scala.inline
  def apply(
    digalg: String,
    obj: SignerInfo,
    sattrs: String,
    si: String,
    sigalg: String,
    sigval: String,
    version: String
  ): Anon_Digalg = {
    val __obj = js.Dynamic.literal(digalg = digalg, obj = obj, sattrs = sattrs, si = si, sigalg = sigalg, sigval = sigval, version = version)
  
    __obj.asInstanceOf[Anon_Digalg]
  }
}

