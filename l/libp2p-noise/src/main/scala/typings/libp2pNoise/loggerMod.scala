package typings.libp2pNoise

import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  def logCipherState(session: NoiseSession): Unit = js.native
  
  def logLocalEphemeralKeys(): Unit = js.native
  def logLocalEphemeralKeys(e: KeyPair): Unit = js.native
  
  def logLocalStaticKeys(s: KeyPair): Unit = js.native
  
  def logRemoteEphemeralKey(re: Buffer): Unit = js.native
  
  def logRemoteStaticKey(rs: Buffer): Unit = js.native
  
  val logger: js.Any = js.native
}
