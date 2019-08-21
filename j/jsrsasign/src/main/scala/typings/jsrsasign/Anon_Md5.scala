package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Md5 extends js.Object {
  var md5: Double
  var ripemd160: Double
  var sha1: Double
  var sha224: Double
  var sha256: Double
  var sha384: Double
  var sha512: Double
}

object Anon_Md5 {
  @scala.inline
  def apply(
    md5: Double,
    ripemd160: Double,
    sha1: Double,
    sha224: Double,
    sha256: Double,
    sha384: Double,
    sha512: Double
  ): Anon_Md5 = {
    val __obj = js.Dynamic.literal(md5 = md5, ripemd160 = ripemd160, sha1 = sha1, sha224 = sha224, sha256 = sha256, sha384 = sha384, sha512 = sha512)
  
    __obj.asInstanceOf[Anon_Md5]
  }
}

