package typings.mangopay2NodejsSdk.mod.refund

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransferRefund extends js.Object {
  var AuthorId: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateTransferRefund {
  @scala.inline
  def apply(AuthorId: String): CreateTransferRefund = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransferRefund]
  }
  @scala.inline
  implicit class CreateTransferRefundOps[Self <: CreateTransferRefund] (val x: Self) extends AnyVal {
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
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

