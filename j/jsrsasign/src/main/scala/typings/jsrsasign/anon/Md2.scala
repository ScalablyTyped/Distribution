package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md2 extends js.Object {
  var md2: String
  var md5: String
  var ripemd160: String
  var sha1: String
  var sha224: String
  var sha256: String
  var sha384: String
  var sha512: String
}

object Md2 {
  @scala.inline
  def apply(
    md2: String,
    md5: String,
    ripemd160: String,
    sha1: String,
    sha224: String,
    sha256: String,
    sha384: String,
    sha512: String
  ): Md2 = {
    val __obj = js.Dynamic.literal(md2 = md2.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha224 = sha224.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md2]
  }
}

