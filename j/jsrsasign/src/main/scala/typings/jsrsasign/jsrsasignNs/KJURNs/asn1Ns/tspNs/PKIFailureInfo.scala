package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_AddInfoNotAvailableBadAlg
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP PKIFailureInfo ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * PKIFailureInfo ::= BIT STRING {
  *    badAlg                 (0),
  *    badRequest             (2),
  *    badDataFormat          (5),
  *    timeNotAvailable       (14),
  *    unacceptedPolicy       (15),
  *    unacceptedExtension    (16),
  *    addInfoNotAvailable    (17),
  *    systemFailure          (25) }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo")
@js.native
class PKIFailureInfo () extends ASN1Object {
  def this(params: IntegerParam) = this()
  def this(params: NameParam) = this()
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFailureInfo")
@js.native
object PKIFailureInfo extends js.Object {
  val valueList: Anon_AddInfoNotAvailableBadAlg = js.native
}

