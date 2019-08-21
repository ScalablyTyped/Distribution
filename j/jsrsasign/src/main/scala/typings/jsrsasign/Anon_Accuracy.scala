package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.BigIntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.DateParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: js.UndefOr[Anon_Micros] = js.undefined
  var genTime: js.UndefOr[StringParam | HexParam | DateParam | String] = js.undefined
  var messageImprint: Anon_HashAlgHashMsgHex
  var nonce: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  var ordering: js.UndefOr[Boolean] = js.undefined
  var policy: String
  var serialNumber: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  var tsa: js.UndefOr[StringParam] = js.undefined
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    messageImprint: Anon_HashAlgHashMsgHex,
    policy: String,
    accuracy: Anon_Micros = null,
    genTime: StringParam | HexParam | DateParam | String = null,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double = null,
    ordering: js.UndefOr[Boolean] = js.undefined,
    serialNumber: IntegerParam | BigIntegerParam | HexParam | Double = null,
    tsa: StringParam = null
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint, policy = policy)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (genTime != null) __obj.updateDynamic("genTime")(genTime.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (tsa != null) __obj.updateDynamic("tsa")(tsa)
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

