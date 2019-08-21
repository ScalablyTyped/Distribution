package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs

import typings.jsrsasign.Anon_CertsHashAlg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for fixed TimeStampToken generator
  * @param params associative array of parameters
  * @description
  * This class generates fixed TimeStampToken except messageImprint
  * for testing purpose.
  * General TSA generates TimeStampToken which varies following
  * fields:
  *
  * - genTime
  * - serialNumber
  * - nonce
  *
  * Those values are provided by initial parameters.
  */
@JSGlobal("jsrsasign.KJUR.asn1.tsp.FixedTSAAdapter")
@js.native
class FixedTSAAdapter () extends js.Object {
  def this(initParams: Anon_CertsHashAlg) = this()
  def getTSTHex(msgHex: String, hashAlg: String): String = js.native
}

