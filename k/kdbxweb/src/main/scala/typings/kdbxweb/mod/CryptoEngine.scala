package typings.kdbxweb.mod

import typings.kdbxweb.cryptoEngineMod.Argon2Fn
import typings.kdbxweb.cryptoEngineMod.Argon2Type
import typings.kdbxweb.cryptoEngineMod.Argon2Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CryptoEngine {
  
  @JSImport("kdbxweb", "CryptoEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.AesCbc")
  @js.native
  abstract class AesCbc ()
    extends typings.kdbxweb.cryptoEngineMod.AesCbc
  
  @JSImport("kdbxweb", "CryptoEngine.Argon2TypeArgon2d")
  @js.native
  val Argon2TypeArgon2d: /* 0 */ Double = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.Argon2TypeArgon2id")
  @js.native
  val Argon2TypeArgon2id: /* 2 */ Double = js.native
  
  inline def argon2(
    password: js.typedarray.ArrayBuffer,
    salt: js.typedarray.ArrayBuffer,
    memory: Double,
    iterations: Double,
    length: Double,
    parallelism: Double,
    `type`: Argon2Type,
    version: Argon2Version
  ): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("argon2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], memory.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], length.asInstanceOf[js.Any], parallelism.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def chacha20(data: js.typedarray.ArrayBuffer, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("chacha20")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def createAesCbc(): typings.kdbxweb.cryptoEngineMod.AesCbc = ^.asInstanceOf[js.Dynamic].applyDynamic("createAesCbc")().asInstanceOf[typings.kdbxweb.cryptoEngineMod.AesCbc]
  
  inline def hmacSha256(key: js.typedarray.ArrayBuffer, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha256")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def random(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def setArgon2Impl(impl: Argon2Fn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setArgon2Impl")(impl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sha256(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def sha512(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
