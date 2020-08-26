package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicRawRSAKeyHexResult extends js.Object {
  /** hexadecimal string of public exponent */
  var e: String = js.native
  /** hexadecimal string of public key */
  var n: String = js.native
}

object PublicRawRSAKeyHexResult {
  @scala.inline
  def apply(e: String, n: String): PublicRawRSAKeyHexResult = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicRawRSAKeyHexResult]
  }
  @scala.inline
  implicit class PublicRawRSAKeyHexResultOps[Self <: PublicRawRSAKeyHexResult] (val x: Self) extends AnyVal {
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
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
  }
  
}

