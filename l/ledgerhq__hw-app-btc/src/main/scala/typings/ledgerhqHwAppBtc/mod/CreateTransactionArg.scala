package typings.ledgerhqHwAppBtc.mod

import typings.ledgerhqHwAppBtc.anon.Index
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransactionArg extends js.Object {
  var additionals: js.UndefOr[js.Array[String]] = js.native
  var associatedKeysets: js.Array[String] = js.native
  var changePath: js.UndefOr[String] = js.native
  var expiryHeight: js.UndefOr[Buffer] = js.native
  var initialTimestamp: js.UndefOr[Double] = js.native
  var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]] = js.native
  var lockTime: js.UndefOr[Double] = js.native
  var onDeviceSignatureGranted: js.UndefOr[js.Function0[Unit]] = js.native
  var onDeviceSignatureRequested: js.UndefOr[js.Function0[Unit]] = js.native
  var onDeviceStreaming: js.UndefOr[js.Function1[/* hasProgressTotalIndex */ Index, Unit]] = js.native
  var outputScriptHex: String = js.native
  var segwit: js.UndefOr[Boolean] = js.native
  var sigHashType: js.UndefOr[Double] = js.native
  var useTrustedInputForSegwit: js.UndefOr[Boolean] = js.native
}

object CreateTransactionArg {
  @scala.inline
  def apply(
    associatedKeysets: js.Array[String],
    inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
    outputScriptHex: String
  ): CreateTransactionArg = {
    val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransactionArg]
  }
  @scala.inline
  implicit class CreateTransactionArgOps[Self <: CreateTransactionArg] (val x: Self) extends AnyVal {
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
    def setAdditionalsVarargs(value: String*): Self = this.set("additionals", js.Array(value :_*))
    @scala.inline
    def setAdditionals(value: js.Array[String]): Self = this.set("additionals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionals: Self = this.set("additionals", js.undefined)
    @scala.inline
    def setChangePath(value: String): Self = this.set("changePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangePath: Self = this.set("changePath", js.undefined)
    @scala.inline
    def setExpiryHeight(value: Buffer): Self = this.set("expiryHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryHeight: Self = this.set("expiryHeight", js.undefined)
    @scala.inline
    def setInitialTimestamp(value: Double): Self = this.set("initialTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTimestamp: Self = this.set("initialTimestamp", js.undefined)
    @scala.inline
    def setLockTime(value: Double): Self = this.set("lockTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockTime: Self = this.set("lockTime", js.undefined)
    @scala.inline
    def setOnDeviceSignatureGranted(value: () => Unit): Self = this.set("onDeviceSignatureGranted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDeviceSignatureGranted: Self = this.set("onDeviceSignatureGranted", js.undefined)
    @scala.inline
    def setOnDeviceSignatureRequested(value: () => Unit): Self = this.set("onDeviceSignatureRequested", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDeviceSignatureRequested: Self = this.set("onDeviceSignatureRequested", js.undefined)
    @scala.inline
    def setOnDeviceStreaming(value: /* hasProgressTotalIndex */ Index => Unit): Self = this.set("onDeviceStreaming", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceStreaming: Self = this.set("onDeviceStreaming", js.undefined)
    @scala.inline
    def setSegwit(value: Boolean): Self = this.set("segwit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegwit: Self = this.set("segwit", js.undefined)
    @scala.inline
    def setSigHashType(value: Double): Self = this.set("sigHashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigHashType: Self = this.set("sigHashType", js.undefined)
    @scala.inline
    def setUseTrustedInputForSegwit(value: Boolean): Self = this.set("useTrustedInputForSegwit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTrustedInputForSegwit: Self = this.set("useTrustedInputForSegwit", js.undefined)
  }
  
}

