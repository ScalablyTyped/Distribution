package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.EncapsulatedContentInfo
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EciObj extends js.Object {
  var eciObj: EncapsulatedContentInfo = js.native
  var hashAlg: String = js.native
  var sdobj: SignedData = js.native
}

object EciObj {
  @scala.inline
  def apply(eciObj: EncapsulatedContentInfo, hashAlg: String, sdobj: SignedData): EciObj = {
    val __obj = js.Dynamic.literal(eciObj = eciObj.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sdobj = sdobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[EciObj]
  }
  @scala.inline
  implicit class EciObjOps[Self <: EciObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEciObj(value: EncapsulatedContentInfo): Self = this.set("eciObj", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdobj(value: SignedData): Self = this.set("sdobj", value.asInstanceOf[js.Any])
  }
  
}

