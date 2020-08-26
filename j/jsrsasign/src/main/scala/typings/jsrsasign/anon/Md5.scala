package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Md5 extends js.Object {
  var md5: Double = js.native
  var ripemd160: Double = js.native
  var sha1: Double = js.native
  var sha224: Double = js.native
  var sha256: Double = js.native
  var sha384: Double = js.native
  var sha512: Double = js.native
}

object Md5 {
  @scala.inline
  def apply(
    md5: Double,
    ripemd160: Double,
    sha1: Double,
    sha224: Double,
    sha256: Double,
    sha384: Double,
    sha512: Double
  ): Md5 = {
    val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any], ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha224 = sha224.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md5]
  }
  @scala.inline
  implicit class Md5Ops[Self <: Md5] (val x: Self) extends AnyVal {
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
    def setMd5(value: Double): Self = this.set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def setRipemd160(value: Double): Self = this.set("ripemd160", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha1(value: Double): Self = this.set("sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha224(value: Double): Self = this.set("sha224", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha256(value: Double): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha384(value: Double): Self = this.set("sha384", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha512(value: Double): Self = this.set("sha512", value.asInstanceOf[js.Any])
  }
  
}

