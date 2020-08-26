package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aud extends js.Object {
  var alg: js.Array[String] = js.native
  var aud: js.Array[String] = js.native
  var iss: js.Array[String] = js.native
  var jti: js.UndefOr[String] = js.native
  var sub: js.Array[String] = js.native
  var verifyAt: js.UndefOr[String | Double] = js.native
}

object Aud {
  @scala.inline
  def apply(alg: js.Array[String], aud: js.Array[String], iss: js.Array[String], sub: js.Array[String]): Aud = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aud]
  }
  @scala.inline
  implicit class AudOps[Self <: Aud] (val x: Self) extends AnyVal {
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
    def setAlgVarargs(value: String*): Self = this.set("alg", js.Array(value :_*))
    @scala.inline
    def setAlg(value: js.Array[String]): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudVarargs(value: String*): Self = this.set("aud", js.Array(value :_*))
    @scala.inline
    def setAud(value: js.Array[String]): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssVarargs(value: String*): Self = this.set("iss", js.Array(value :_*))
    @scala.inline
    def setIss(value: js.Array[String]): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubVarargs(value: String*): Self = this.set("sub", js.Array(value :_*))
    @scala.inline
    def setSub(value: js.Array[String]): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
    @scala.inline
    def setVerifyAt(value: String | Double): Self = this.set("verifyAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyAt: Self = this.set("verifyAt", js.undefined)
  }
  
}

