package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP TimeStampReq ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * TimeStampReq ::= SEQUENCE  {
  *    version          INTEGER  { v1(1) },
  *    messageImprint   MessageImprint,
  *    reqPolicy        TSAPolicyId               OPTIONAL,
  *    nonce            INTEGER                   OPTIONAL,
  *    certReq          BOOLEAN                   DEFAULT FALSE,
  *    extensions       [0] IMPLICIT Extensions   OPTIONAL  }
  * ```
  */
trait TimeStampReq extends ASN1Object {
  def setMessageImprint(params: MessageImprint): Unit
}

object TimeStampReq {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setMessageImprint: MessageImprint => Unit
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setMessageImprint = js.Any.fromFunction1(setMessageImprint))
    __obj.asInstanceOf[TimeStampReq]
  }
}

