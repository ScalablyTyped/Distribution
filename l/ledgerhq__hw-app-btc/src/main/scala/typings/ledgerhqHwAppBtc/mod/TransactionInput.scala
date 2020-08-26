package typings.ledgerhqHwAppBtc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionInput extends js.Object {
  var prevout: Buffer = js.native
  var script: Buffer = js.native
  var sequence: Buffer = js.native
  var tree: js.UndefOr[Buffer] = js.native
}

object TransactionInput {
  @scala.inline
  def apply(prevout: Buffer, script: Buffer, sequence: Buffer): TransactionInput = {
    val __obj = js.Dynamic.literal(prevout = prevout.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInput]
  }
  @scala.inline
  implicit class TransactionInputOps[Self <: TransactionInput] (val x: Self) extends AnyVal {
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
    def setPrevout(value: Buffer): Self = this.set("prevout", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Buffer): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Buffer): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: Buffer): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTree: Self = this.set("tree", js.undefined)
  }
  
}

