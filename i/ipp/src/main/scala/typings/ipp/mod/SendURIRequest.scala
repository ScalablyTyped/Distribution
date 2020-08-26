package typings.ipp.mod

import typings.ipp.anon.Documenturi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendURIRequest extends js.Object {
  var `operation-attributes-tag`: Documenturi = js.native
}

object SendURIRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documenturi): SendURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendURIRequest]
  }
  @scala.inline
  implicit class SendURIRequestOps[Self <: SendURIRequest] (val x: Self) extends AnyVal {
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
    def `setOperation-attributes-tag`(value: Documenturi): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
  }
  
}

