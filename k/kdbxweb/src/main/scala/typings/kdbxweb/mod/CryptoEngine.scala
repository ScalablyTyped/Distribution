package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Crypto
import typings.std.SubtleCrypto
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CryptoEngine {
  
  @JSImport("kdbxweb", "CryptoEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.NodeCrypto")
  @js.native
  val NodeCrypto: Crypto | Null = js.native
  
  @scala.inline
  def argon2(
    password: ArrayBuffer,
    salt: ArrayBuffer,
    memory: Double,
    iterations: Double,
    length: Double,
    parallelism: Double,
    `type`: Double,
    version: Double
  ): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("argon2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], memory.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], length.asInstanceOf[js.Any], parallelism.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @scala.inline
  def chacha20(data: ArrayBuffer, key: ArrayBuffer, iv: ArrayBuffer): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("chacha20")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @scala.inline
  def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: Null, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any], newNodeCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: Null, newWebCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: Null, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any], newNodeCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: SubtleCrypto): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any], newNodeCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newSubtle.asInstanceOf[js.Any], newWebCrypto.asInstanceOf[js.Any], newNodeCrypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createAesCbc(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAesCbc")().asInstanceOf[js.Any]
  
  @scala.inline
  def hmacSha256(key: ArrayBuffer, data: ArrayBuffer): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha256")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @scala.inline
  def random(len: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(len.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def sha256(data: ArrayBuffer): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @scala.inline
  def sha512(data: ArrayBuffer): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
  
  @JSImport("kdbxweb", "CryptoEngine.subtle")
  @js.native
  val subtle: SubtleCrypto | Null = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.webCrypto")
  @js.native
  val webCrypto: Crypto | Null = js.native
}
