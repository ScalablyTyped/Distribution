package typings.mailgunJs.mod.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchData extends SendData {
  var `recipient-variables`: js.UndefOr[String | BatchSendRecipientVars] = js.native
}

object BatchData {
  @scala.inline
  def apply(to: String | js.Array[String]): BatchData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchData]
  }
  @scala.inline
  implicit class BatchDataOps[Self <: BatchData] (val x: Self) extends AnyVal {
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
    def `setRecipient-variables`(value: String | BatchSendRecipientVars): Self = this.set("recipient-variables", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRecipient-variables`: Self = this.set("recipient-variables", js.undefined)
  }
  
}

