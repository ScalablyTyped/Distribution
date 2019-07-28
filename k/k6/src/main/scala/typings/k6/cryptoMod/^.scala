package typings.k6.cryptoMod

import typings.k6.k6Mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createHMAC(algorithm: Algorithm, secret: String): Hasher = js.native
  def createHash(algorithm: Algorithm): Hasher = js.native
  def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, data: String, outputEncoding: OE): Output[OE] = js.native
  def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def randomBytes(size: Double): bytes = js.native
  def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512_224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  def sha512_256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
}

