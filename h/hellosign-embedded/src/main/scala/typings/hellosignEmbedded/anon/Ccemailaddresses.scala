package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ccemailaddresses extends js.Object {
  var cc_email_addresses: js.Array[String] = js.native
  var message: String = js.native
  var signatures: js.Array[Haspin] = js.native
  var title: String = js.native
}

object Ccemailaddresses {
  @scala.inline
  def apply(cc_email_addresses: js.Array[String], message: String, signatures: js.Array[Haspin], title: String): Ccemailaddresses = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccemailaddresses]
  }
  @scala.inline
  implicit class CcemailaddressesOps[Self <: Ccemailaddresses] (val x: Self) extends AnyVal {
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
    def setCc_email_addressesVarargs(value: String*): Self = this.set("cc_email_addresses", js.Array(value :_*))
    @scala.inline
    def setCc_email_addresses(value: js.Array[String]): Self = this.set("cc_email_addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: Haspin*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[Haspin]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

