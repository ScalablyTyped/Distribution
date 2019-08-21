package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_GrantedGrantedWithMods
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP PKIStatus ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * PKIStatus ::= INTEGER {
  *    granted                (0),
  *    grantedWithMods        (1),
  *    rejection              (2),
  *    waiting                (3),
  *    revocationWarning      (4),
  *    revocationNotification (5) }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus")
@js.native
class PKIStatus () extends ASN1Object {
  def this(params: NameParam) = this()
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIStatus")
@js.native
object PKIStatus extends js.Object {
  val valueList: Anon_GrantedGrantedWithMods = js.native
}

