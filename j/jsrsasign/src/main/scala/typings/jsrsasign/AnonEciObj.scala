package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.EncapsulatedContentInfo
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEciObj extends js.Object {
  var eciObj: EncapsulatedContentInfo
  var hashAlg: String
  var sdobj: SignedData
}

object AnonEciObj {
  @scala.inline
  def apply(eciObj: EncapsulatedContentInfo, hashAlg: String, sdobj: SignedData): AnonEciObj = {
    val __obj = js.Dynamic.literal(eciObj = eciObj.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sdobj = sdobj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEciObj]
  }
}

