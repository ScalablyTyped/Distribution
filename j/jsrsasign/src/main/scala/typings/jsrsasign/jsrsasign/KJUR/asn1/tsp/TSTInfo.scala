package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP TSTInfo ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * TSTInfo ::= SEQUENCE  {
  *    version         INTEGER  { v1(1) },
  *    policy          TSAPolicyId,
  *    messageImprint  MessageImprint,
  *    serialNumber    INTEGER, -- up to 160bit
  *    genTime         GeneralizedTime,
  *    accuracy        Accuracy                 OPTIONAL,
  *    ordering        BOOLEAN                  DEFAULT FALSE,
  *    nonce           INTEGER                  OPTIONAL,
  *    tsa             [0] GeneralName          OPTIONAL,
  *    extensions      [1] IMPLICIT Extensions  OPTIONAL   }
  * ```
  * @example
  * o = new KJUR.asn1.tsp.TSTInfo({
  *     policy:    '1.2.3.4.5',
  *     messageImprint: {hashAlg: 'sha256', hashMsgHex: '1abc...'},
  *     genTime:   {withMillis: true},     // OPTION
  *     accuracy:  {micros: 500},          // OPTION
  *     ordering:  true,                   // OPTION
  *     nonce:     {hex: '52fab1...'},     // OPTION
  *     tsa:       {str: '/C=US/O=TSA1'}   // OPTION
  * });
  */
trait TSTInfo extends ASN1Object

object TSTInfo {
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
    isModified: String
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfo]
  }
}

