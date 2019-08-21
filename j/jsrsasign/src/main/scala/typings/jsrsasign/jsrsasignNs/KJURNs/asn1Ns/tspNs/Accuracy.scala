package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_Micros
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP Accuracy ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * Accuracy ::= SEQUENCE {
  *       seconds        INTEGER              OPTIONAL,
  *       millis     [0] INTEGER  (1..999)    OPTIONAL,
  *       micros     [1] INTEGER  (1..999)    OPTIONAL  }
  * ```
  * @example
  * o = new KJUR.asn1.tsp.Accuracy({seconds: 1,
  *                                 millis: 500,
  *                                 micros: 500});
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.Accuracy")
@js.native
class Accuracy () extends ASN1Object {
  def this(params: Anon_Micros) = this()
}

