package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accuracy extends js.Object {
  var accuracy: js.UndefOr[Micros] = js.undefined
  var genTime: js.UndefOr[StringParam | HexParam | DateParam | String] = js.undefined
  var messageImprint: HashMsgHex
  var nonce: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  var ordering: js.UndefOr[Boolean] = js.undefined
  var policy: String
  var serialNumber: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  var tsa: js.UndefOr[StringParam] = js.undefined
}

object Accuracy {
  @scala.inline
  def apply(
    messageImprint: HashMsgHex,
    policy: String,
    accuracy: Micros = null,
    genTime: StringParam | HexParam | DateParam | String = null,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double = null,
    ordering: js.UndefOr[Boolean] = js.undefined,
    serialNumber: IntegerParam | BigIntegerParam | HexParam | Double = null,
    tsa: StringParam = null
  ): Accuracy = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (genTime != null) __obj.updateDynamic("genTime")(genTime.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering.get.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (tsa != null) __obj.updateDynamic("tsa")(tsa.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
}

