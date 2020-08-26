package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ldapdn extends GeneralNameParam {
  var ldapdn: String = js.native
}

object Ldapdn {
  @scala.inline
  def apply(ldapdn: String): Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ldapdn]
  }
  @scala.inline
  implicit class LdapdnOps[Self <: Ldapdn] (val x: Self) extends AnyVal {
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
    def setLdapdn(value: String): Self = this.set("ldapdn", value.asInstanceOf[js.Any])
  }
  
}

