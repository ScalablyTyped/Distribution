package typings.hashDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaSet extends js.Object {
  @JSName("sha1")
  var sha1_Original: Sha1Constructor = js.native
  @JSName("sha224")
  var sha224_Original: Sha224Constructor = js.native
  @JSName("sha256")
  var sha256_Original: Sha256Constructor = js.native
  @JSName("sha384")
  var sha384_Original: Sha384Constructor = js.native
  @JSName("sha512")
  var sha512_Original: Sha512Constructor = js.native
  def sha1(): Sha1 = js.native
  def sha224(): Sha224 = js.native
  def sha256(): Sha256 = js.native
  def sha384(): Sha384 = js.native
  def sha512(): Sha512 = js.native
}

