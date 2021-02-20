package typings.libp2pNoise

import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.std.AsyncIterableIterator
import typings.std.Iterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("libp2p-noise/dist/src/crypto", "decryptStream")
  @js.native
  def decryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  @JSImport("libp2p-noise/dist/src/crypto", "encryptStream")
  @js.native
  def encryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  type IReturnEncryptionWrapper = js.Function1[/* source */ Iterable[Uint8Array], AsyncIterableIterator[Uint8Array]]
}
