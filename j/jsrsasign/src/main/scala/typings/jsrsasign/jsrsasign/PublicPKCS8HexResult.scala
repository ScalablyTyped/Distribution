package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicPKCS8HexResult extends js.Object {
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  /** hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null */
  var algparam: String = js.native
  /** hexadecimal string of public key */
  var key: String = js.native
}

object PublicPKCS8HexResult {
  @scala.inline
  def apply(algoid: String, algparam: String, key: String): PublicPKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicPKCS8HexResult]
  }
  @scala.inline
  implicit class PublicPKCS8HexResultOps[Self <: PublicPKCS8HexResult] (val x: Self) extends AnyVal {
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
    def setAlgoid(value: String): Self = this.set("algoid", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgparam(value: String): Self = this.set("algparam", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

