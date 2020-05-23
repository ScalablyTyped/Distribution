package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * abstract class for TimeStampToken generator
  * @param params associative array of parameters
  * @description
  */
trait AbstractTSAAdapter extends js.Object {
  def getTSTHex(msgHex: String, hashAlg: String): Unit
}

object AbstractTSAAdapter {
  @scala.inline
  def apply(getTSTHex: (String, String) => Unit): AbstractTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[AbstractTSAAdapter]
  }
}

