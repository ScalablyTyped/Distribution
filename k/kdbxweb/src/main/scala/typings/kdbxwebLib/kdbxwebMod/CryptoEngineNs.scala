package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "CryptoEngine")
@js.native
object CryptoEngineNs extends js.Object {
  val NodeCrypto: stdLib.Crypto | scala.Null = js.native
  val subtle: stdLib.SubtleCrypto | scala.Null = js.native
  val webCrypto: stdLib.Crypto | scala.Null = js.native
  def argon2(
    password: stdLib.ArrayBuffer,
    salt: stdLib.ArrayBuffer,
    memory: scala.Double,
    iterations: scala.Double,
    length: scala.Double,
    parallelism: scala.Double,
    `type`: scala.Double,
    version: scala.Double
  ): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def chacha20(data: stdLib.ArrayBuffer, key: stdLib.ArrayBuffer, iv: stdLib.ArrayBuffer): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def configure(): scala.Unit = js.native
  def configure(newSubtle: scala.Null, newWebCrypto: scala.Null, newNodeCrypto: stdLib.Crypto): scala.Unit = js.native
  def configure(newSubtle: scala.Null, newWebCrypto: stdLib.Crypto): scala.Unit = js.native
  def configure(newSubtle: scala.Null, newWebCrypto: stdLib.Crypto, newNodeCrypto: stdLib.Crypto): scala.Unit = js.native
  def configure(newSubtle: stdLib.SubtleCrypto): scala.Unit = js.native
  def configure(newSubtle: stdLib.SubtleCrypto, newWebCrypto: scala.Null, newNodeCrypto: stdLib.Crypto): scala.Unit = js.native
  def configure(newSubtle: stdLib.SubtleCrypto, newWebCrypto: stdLib.Crypto): scala.Unit = js.native
  def configure(newSubtle: stdLib.SubtleCrypto, newWebCrypto: stdLib.Crypto, newNodeCrypto: stdLib.Crypto): scala.Unit = js.native
  def createAesCbc(): js.Any = js.native
  def hmacSha256(key: stdLib.ArrayBuffer, data: stdLib.ArrayBuffer): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def random(len: scala.Double): stdLib.Uint8Array = js.native
  def sha256(data: stdLib.ArrayBuffer): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def sha512(data: stdLib.ArrayBuffer): stdLib.Promise[stdLib.ArrayBuffer] = js.native
}

