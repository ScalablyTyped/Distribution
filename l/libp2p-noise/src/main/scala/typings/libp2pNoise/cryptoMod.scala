package typings.libp2pNoise

import typings.libp2pNoise.handshakeInterfaceMod.IHandshake
import typings.std.AsyncIterableIterator
import typings.std.Iterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  
  def decryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  def encryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  type IReturnEncryptionWrapper = js.Function1[/* source */ Iterable[Uint8Array], AsyncIterableIterator[Uint8Array]]
}
