package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMd5 extends js.Object {
  var md5: Double
  var ripemd160: Double
  var sha1: Double
  var sha224: Double
  var sha256: Double
  var sha384: Double
  var sha512: Double
}

object AnonMd5 {
  @scala.inline
  def apply(
    md5: Double,
    ripemd160: Double,
    sha1: Double,
    sha224: Double,
    sha256: Double,
    sha384: Double,
    sha512: Double
  ): AnonMd5 = {
    val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any], ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha224 = sha224.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMd5]
  }
}

