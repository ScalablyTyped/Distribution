package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSendAs method.
  */
@js.native
trait SchemaListSendAsResponse extends js.Object {
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[SchemaSendAs]] = js.native
}

object SchemaListSendAsResponse {
  @scala.inline
  def apply(): SchemaListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSendAsResponse]
  }
  @scala.inline
  implicit class SchemaListSendAsResponseOps[Self <: SchemaListSendAsResponse] (val x: Self) extends AnyVal {
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
    def setSendAsVarargs(value: SchemaSendAs*): Self = this.set("sendAs", js.Array(value :_*))
    @scala.inline
    def setSendAs(value: js.Array[SchemaSendAs]): Self = this.set("sendAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendAs: Self = this.set("sendAs", js.undefined)
  }
  
}

