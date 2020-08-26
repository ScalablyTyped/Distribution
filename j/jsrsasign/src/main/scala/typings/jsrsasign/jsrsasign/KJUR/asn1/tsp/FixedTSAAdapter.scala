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
@js.native
trait FixedTSAAdapter extends js.Object {
  def getTSTHex(msgHex: String, hashAlg: String): String = js.native
}

object FixedTSAAdapter {
  @scala.inline
  def apply(getTSTHex: (String, String) => String): FixedTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[FixedTSAAdapter]
  }
  @scala.inline
  implicit class FixedTSAAdapterOps[Self <: FixedTSAAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTSTHex(value: (String, String) => String): Self = this.set("getTSTHex", js.Any.fromFunction2(value))
  }
  
}

