package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_Accuracy
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
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
@JSGlobal("jsrsasign.KJUR.asn1.tsp.TSTInfo")
@js.native
class TSTInfo protected () extends ASN1Object {
  def this(params: Anon_Accuracy) = this()
}

