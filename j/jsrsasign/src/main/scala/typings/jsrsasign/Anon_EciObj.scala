package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.EncapsulatedContentInfo
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EciObj extends js.Object {
  var eciObj: EncapsulatedContentInfo
  var hashAlg: String
  var sdobj: SignedData
}

object Anon_EciObj {
  @scala.inline
  def apply(eciObj: EncapsulatedContentInfo, hashAlg: String, sdobj: SignedData): Anon_EciObj = {
    val __obj = js.Dynamic.literal(eciObj = eciObj, hashAlg = hashAlg, sdobj = sdobj)
  
    __obj.asInstanceOf[Anon_EciObj]
  }
}

