package typings.ledgerhqHwAppBtc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var extraData: js.UndefOr[Buffer] = js.native
  var inputs: js.Array[TransactionInput] = js.native
  var locktime: js.UndefOr[Buffer] = js.native
  var nExpiryHeight: js.UndefOr[Buffer] = js.native
  var nVersionGroupId: js.UndefOr[Buffer] = js.native
  var outputs: js.UndefOr[js.Array[TransactionOutput]] = js.native
  var timestamp: js.UndefOr[Buffer] = js.native
  var version: Buffer = js.native
  var witness: js.UndefOr[Buffer] = js.native
}

object Transaction {
  @scala.inline
  def apply(inputs: js.Array[TransactionInput], version: Buffer): Transaction = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def setInputsVarargs(value: TransactionInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[TransactionInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Buffer): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraData(value: Buffer): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setLocktime(value: Buffer): Self = this.set("locktime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocktime: Self = this.set("locktime", js.undefined)
    @scala.inline
    def setNExpiryHeight(value: Buffer): Self = this.set("nExpiryHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNExpiryHeight: Self = this.set("nExpiryHeight", js.undefined)
    @scala.inline
    def setNVersionGroupId(value: Buffer): Self = this.set("nVersionGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNVersionGroupId: Self = this.set("nVersionGroupId", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: TransactionOutput*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[TransactionOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setTimestamp(value: Buffer): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setWitness(value: Buffer): Self = this.set("witness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWitness: Self = this.set("witness", js.undefined)
  }
  
}

