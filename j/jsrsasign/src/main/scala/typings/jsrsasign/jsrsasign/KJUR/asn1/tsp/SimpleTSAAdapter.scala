package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for simple TimeStampToken generator
  * @param params associative array of parameters
  * @description
  */
trait SimpleTSAAdapter extends js.Object {
  def getTSTHex(msgHex: String, hashAlg: String): String
}

object SimpleTSAAdapter {
  @scala.inline
  def apply(getTSTHex: (String, String) => String): SimpleTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[SimpleTSAAdapter]
  }
}

