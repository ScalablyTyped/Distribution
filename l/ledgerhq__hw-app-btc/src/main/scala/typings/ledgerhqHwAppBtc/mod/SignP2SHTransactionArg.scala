package typings.ledgerhqHwAppBtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignP2SHTransactionArg extends js.Object {
  var associatedKeysets: js.Array[String] = js.native
  // [transaction, output_index, redeem script, optional sequence]
  var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]] = js.native
  var lockTime: js.UndefOr[Double] = js.native
  var outputScriptHex: String = js.native
  var segwit: js.UndefOr[Boolean] = js.native
  var sigHashType: js.UndefOr[Double] = js.native
  var transactionVersion: js.UndefOr[Double] = js.native
}

object SignP2SHTransactionArg {
  @scala.inline
  def apply(
    associatedKeysets: js.Array[String],
    inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
    outputScriptHex: String
  ): SignP2SHTransactionArg = {
    val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignP2SHTransactionArg]
  }
  @scala.inline
  implicit class SignP2SHTransactionArgOps[Self <: SignP2SHTransactionArg] (val x: Self) extends AnyVal {
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
    def setAssociatedKeysetsVarargs(value: String*): Self = this.set("associatedKeysets", js.Array(value :_*))
    @scala.inline
    def setAssociatedKeysets(value: js.Array[String]): Self = this.set("associatedKeysets", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: (js.Tuple4[Transaction, Double, String | Null, Double | Null])*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputScriptHex(value: String): Self = this.set("outputScriptHex", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockTime(value: Double): Self = this.set("lockTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockTime: Self = this.set("lockTime", js.undefined)
    @scala.inline
    def setSegwit(value: Boolean): Self = this.set("segwit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegwit: Self = this.set("segwit", js.undefined)
    @scala.inline
    def setSigHashType(value: Double): Self = this.set("sigHashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigHashType: Self = this.set("sigHashType", js.undefined)
    @scala.inline
    def setTransactionVersion(value: Double): Self = this.set("transactionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionVersion: Self = this.set("transactionVersion", js.undefined)
  }
  
}

