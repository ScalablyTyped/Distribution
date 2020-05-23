package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

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
trait FixedTSAAdapter extends js.Object {
  def getTSTHex(msgHex: String, hashAlg: String): String
}

object FixedTSAAdapter {
  @scala.inline
  def apply(getTSTHex: (String, String) => String): FixedTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[FixedTSAAdapter]
  }
}

