package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asn1params extends js.Object {
  var asn1params: js.UndefOr[ASN1Object] = js.native
  var name: String = js.native
  var paramempty: js.UndefOr[Boolean] = js.native
}

object Asn1params {
  @scala.inline
  def apply(name: String): Asn1params = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1params]
  }
  @scala.inline
  implicit class Asn1paramsOps[Self <: Asn1params] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsn1params(value: ASN1Object): Self = this.set("asn1params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn1params: Self = this.set("asn1params", js.undefined)
    @scala.inline
    def setParamempty(value: Boolean): Self = this.set("paramempty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamempty: Self = this.set("paramempty", js.undefined)
  }
  
}

