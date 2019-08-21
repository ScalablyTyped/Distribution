package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_CertreqMi
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
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
@JSGlobal("jsrsasign.KJUR.asn1.tsp.TimeStampReq")
@js.native
class TimeStampReq () extends ASN1Object {
  def this(params: Anon_CertreqMi) = this()
  def setMessageImprint(params: MessageImprint): Unit = js.native
}

