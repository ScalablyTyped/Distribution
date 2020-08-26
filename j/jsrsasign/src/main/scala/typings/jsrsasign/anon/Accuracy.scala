package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accuracy extends js.Object {
  var accuracy: js.UndefOr[Micros] = js.native
  var genTime: js.UndefOr[StringParam | HexParam | DateParam | String] = js.native
  var messageImprint: HashMsgHex = js.native
  var nonce: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.native
  var ordering: js.UndefOr[Boolean] = js.native
  var policy: String = js.native
  var serialNumber: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.native
  var tsa: js.UndefOr[StringParam] = js.native
}

object Accuracy {
  @scala.inline
  def apply(messageImprint: HashMsgHex, policy: String): Accuracy = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  @scala.inline
  implicit class AccuracyOps[Self <: Accuracy] (val x: Self) extends AnyVal {
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
    def setMessageImprint(value: HashMsgHex): Self = this.set("messageImprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccuracy(value: Micros): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setGenTime(value: StringParam | HexParam | DateParam | String): Self = this.set("genTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenTime: Self = this.set("genTime", js.undefined)
    @scala.inline
    def setNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOrdering(value: Boolean): Self = this.set("ordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdering: Self = this.set("ordering", js.undefined)
    @scala.inline
    def setSerialNumber(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    @scala.inline
    def setTsa(value: StringParam): Self = this.set("tsa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsa: Self = this.set("tsa", js.undefined)
  }
  
}

