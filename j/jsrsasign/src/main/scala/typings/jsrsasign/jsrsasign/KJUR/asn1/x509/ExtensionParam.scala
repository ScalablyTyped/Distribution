package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionParam extends js.Object {
  var accessLocation: UriParam = js.native
  var accessMethod: ObjectIdentifierParam = js.native
}

object ExtensionParam {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: ObjectIdentifierParam): ExtensionParam = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionParam]
  }
  @scala.inline
  implicit class ExtensionParamOps[Self <: ExtensionParam] (val x: Self) extends AnyVal {
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
    def setAccessLocation(value: UriParam): Self = this.set("accessLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessMethod(value: ObjectIdentifierParam): Self = this.set("accessMethod", value.asInstanceOf[js.Any])
  }
  
}

