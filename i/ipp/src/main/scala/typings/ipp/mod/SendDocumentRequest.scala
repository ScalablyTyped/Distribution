package typings.ipp.mod

import typings.ipp.anon.Documentnaturallanguage
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDocumentRequest extends js.Object {
  var data: js.UndefOr[Buffer] = js.native
  var `operation-attributes-tag`: Documentnaturallanguage = js.native
}

object SendDocumentRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documentnaturallanguage): SendDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentRequest]
  }
  @scala.inline
  implicit class SendDocumentRequestOps[Self <: SendDocumentRequest] (val x: Self) extends AnyVal {
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
    def `setOperation-attributes-tag`(value: Documentnaturallanguage): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

