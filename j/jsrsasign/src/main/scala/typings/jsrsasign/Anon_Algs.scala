package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignedData
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algs extends js.Object {
  var algs: String
  var certs: String
  var obj: SignedData
  var revs: String
  var si: js.Array[SignerInfo]
  var version: String
}

object Anon_Algs {
  @scala.inline
  def apply(
    algs: String,
    certs: String,
    obj: SignedData,
    revs: String,
    si: js.Array[SignerInfo],
    version: String
  ): Anon_Algs = {
    val __obj = js.Dynamic.literal(algs = algs, certs = certs, obj = obj, revs = revs, si = si, version = version)
  
    __obj.asInstanceOf[Anon_Algs]
  }
}

