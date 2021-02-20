package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Crypto
import typings.std.SubtleCrypto
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CryptoEngine {
  
  @JSImport("kdbxweb", "CryptoEngine.NodeCrypto")
  @js.native
  val NodeCrypto: Crypto | Null = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.argon2")
  @js.native
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
  
  @JSImport("kdbxweb", "CryptoEngine.chacha20")
  @js.native
  def chacha20(data: ArrayBuffer, key: ArrayBuffer, iv: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.createAesCbc")
  @js.native
  def createAesCbc(): js.Any = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.hmacSha256")
  @js.native
  def hmacSha256(key: ArrayBuffer, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.random")
  @js.native
  def random(len: Double): Uint8Array = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.sha256")
  @js.native
  def sha256(data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.sha512")
  @js.native
  def sha512(data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.subtle")
  @js.native
  val subtle: SubtleCrypto | Null = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.webCrypto")
  @js.native
  val webCrypto: Crypto | Null = js.native
}
