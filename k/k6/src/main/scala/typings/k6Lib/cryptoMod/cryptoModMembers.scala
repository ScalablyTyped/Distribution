package typings
package k6Lib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", JSImport.Namespace)
@js.native
object cryptoModMembers extends js.Object {
  def createHMAC(algorithm: java.lang.String, secret: java.lang.String): Hasher = js.native
  def createHash(algorithm: java.lang.String): Hasher = js.native
  def hmac(
    algorithm: java.lang.String,
    secret: java.lang.String,
    data: java.lang.String,
    outputEncoding: OutputEncoding
  ): java.lang.String = js.native
  def md4(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def md5(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def ripemd160(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha1(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha256(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha384(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha512(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha512_224(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
  def sha512_256(input: java.lang.String, outputEncoding: OutputEncoding): java.lang.String = js.native
}

