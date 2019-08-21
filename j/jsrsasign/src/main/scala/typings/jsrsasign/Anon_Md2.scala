package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Md2 extends js.Object {
  var md2: String
  var md5: String
  var ripemd160: String
  var sha1: String
  var sha224: String
  var sha256: String
  var sha384: String
  var sha512: String
}

object Anon_Md2 {
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
  ): Anon_Md2 = {
    val __obj = js.Dynamic.literal(md2 = md2, md5 = md5, ripemd160 = ripemd160, sha1 = sha1, sha224 = sha224, sha256 = sha256, sha384 = sha384, sha512 = sha512)
  
    __obj.asInstanceOf[Anon_Md2]
  }
}

