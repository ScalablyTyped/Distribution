package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_CertsHashAlg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for simple TimeStampToken generator
  * @param params associative array of parameters
  * @description
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.SimpleTSAAdapter")
@js.native
class SimpleTSAAdapter () extends js.Object {
  def this(initParams: Anon_CertsHashAlg) = this()
  def getTSTHex(msgHex: String, hashAlg: String): String = js.native
}

