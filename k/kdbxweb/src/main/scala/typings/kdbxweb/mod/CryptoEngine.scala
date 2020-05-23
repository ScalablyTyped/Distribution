package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Crypto
import typings.std.SubtleCrypto
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "CryptoEngine")
@js.native
object CryptoEngine extends js.Object {
  val NodeCrypto: Crypto | Null = js.native
  val subtle: SubtleCrypto | Null = js.native
  val webCrypto: Crypto | Null = js.native
  def argon2(
    password: ArrayBuffer,
    salt: ArrayBuffer,
    memory: Double,
    iterations: Double,
    length: Double,
    parallelism: Double,
    `type`: Double,
    version: Double
  ): js.Promise[ArrayBuffer] = js.native
  def chacha20(data: ArrayBuffer, key: ArrayBuffer, iv: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def configure(): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  def configure(newSubtle: SubtleCrypto): Unit = js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto): Unit = js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  def createAesCbc(): js.Any = js.native
  def hmacSha256(key: ArrayBuffer, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def random(len: Double): Uint8Array = js.native
  def sha256(data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def sha512(data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
}

