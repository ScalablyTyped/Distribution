package typings.libp2pNoise

import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.std.AsyncIterableIterator
import typings.std.Iterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("libp2p-noise/dist/src/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptStream(handshake: IHandshake): IReturnEncryptionWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[IReturnEncryptionWrapper]
  
  inline def encryptStream(handshake: IHandshake): IReturnEncryptionWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[IReturnEncryptionWrapper]
  
  type IReturnEncryptionWrapper = js.Function1[/* source */ Iterable[Uint8Array], AsyncIterableIterator[Uint8Array]]
}
