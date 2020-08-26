package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifierParam extends js.Object {
  var oid: String = js.native
}

object ObjectIdentifierParam {
  @scala.inline
  def apply(oid: String): ObjectIdentifierParam = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifierParam]
  }
  @scala.inline
  implicit class ObjectIdentifierParamOps[Self <: ObjectIdentifierParam] (val x: Self) extends AnyVal {
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
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
  }
  
}

