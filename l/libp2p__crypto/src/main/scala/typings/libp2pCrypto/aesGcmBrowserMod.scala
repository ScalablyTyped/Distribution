package typings.libp2pCrypto

import typings.libp2pCrypto.interfaceMod.AESCipher
import typings.libp2pCrypto.interfaceMod.CreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aesGcmBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/ciphers/aes-gcm.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): AESCipher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AESCipher]
  inline def create(opts: CreateOptions): AESCipher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[AESCipher]
}
