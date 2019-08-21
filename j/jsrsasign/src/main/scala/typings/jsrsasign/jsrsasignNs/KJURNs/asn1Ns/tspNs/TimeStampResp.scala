package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_Status
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP TimeStampResp ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * TimeStampResp ::= SEQUENCE  {
  *    status                  PKIStatusInfo,
  *    timeStampToken          TimeStampToken     OPTIONAL  }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.TimeStampResp")
@js.native
class TimeStampResp () extends ASN1Object {
  def this(params: Anon_Status) = this()
}

