package typings.ledgerhqHwAppBtc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionOutput extends js.Object {
  var amount: Buffer = js.native
  var script: Buffer = js.native
}

object TransactionOutput {
  @scala.inline
  def apply(amount: Buffer, script: Buffer): TransactionOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOutput]
  }
  @scala.inline
  implicit class TransactionOutputOps[Self <: TransactionOutput] (val x: Self) extends AnyVal {
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
    def setAmount(value: Buffer): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Buffer): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

