package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP PKIFreeText ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * PKIFreeText ::= SEQUENCE {
  *    SIZE (1..MAX) OF UTF8String }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.PKIFreeText")
@js.native
class PKIFreeText () extends ASN1Object {
  def this(params: ArrayParam[String]) = this()
}

