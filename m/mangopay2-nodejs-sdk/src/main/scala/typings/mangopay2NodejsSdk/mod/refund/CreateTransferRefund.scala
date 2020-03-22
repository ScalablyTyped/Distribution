package typings.mangopay2NodejsSdk.mod.refund

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransferRefund extends js.Object {
  var AuthorId: String
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateTransferRefund {
  @scala.inline
  def apply(AuthorId: String, Tag: String = null): CreateTransferRefund = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransferRefund]
  }
}

