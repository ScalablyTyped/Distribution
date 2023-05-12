package typings.libp2pCrypto

import typings.libp2pCrypto.distSrcCiphersInterfaceMod.AESCipher
import typings.libp2pCrypto.distSrcCiphersInterfaceMod.CreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCiphersAesGcmDotbrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): AESCipher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AESCipher]
  inline def create(opts: CreateOptions): AESCipher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[AESCipher]
  
  object derivedEmptyPasswordKey {
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey.alg")
    @js.native
    def alg: String = js.native
    inline def alg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alg")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey.ext")
    @js.native
    def ext: Boolean = js.native
    inline def ext_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ext")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey.k")
    @js.native
    def k: String = js.native
    inline def k_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("k")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey.key_ops")
    @js.native
    def keyOps: js.Array[String] = js.native
    
    inline def keyOps_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key_ops")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", "derivedEmptyPasswordKey.kty")
    @js.native
    def kty: String = js.native
    inline def kty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kty")(x.asInstanceOf[js.Any])
  }
}
