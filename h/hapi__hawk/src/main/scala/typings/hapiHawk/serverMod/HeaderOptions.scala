package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderOptions extends js.Object {
  /** Payload content-type (ignored if hash provided) */
  var contentType: js.UndefOr[String] = js.native
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.native
  /** Pre-calculated payload hash */
  var hash: js.UndefOr[String] = js.native
  /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
  var payload: js.UndefOr[String] = js.native
}

object HeaderOptions {
  @scala.inline
  def apply(): HeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderOptions]
  }
  @scala.inline
  implicit class HeaderOptionsOps[Self <: HeaderOptions] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

