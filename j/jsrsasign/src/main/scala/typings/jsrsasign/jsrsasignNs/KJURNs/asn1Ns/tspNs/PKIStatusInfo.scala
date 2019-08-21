package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_Failinfo
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP PKIStatusInfo ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * PKIStatusInfo ::= SEQUENCE {
  *    status                  PKIStatus,
  *    statusString            PKIFreeText     OPTIONAL,
  *    failInfo                PKIFailureInfo  OPTIONAL  }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatusInfo")
@js.native
class PKIStatusInfo () extends ASN1Object {
  def this(params: Anon_Failinfo) = this()
}

