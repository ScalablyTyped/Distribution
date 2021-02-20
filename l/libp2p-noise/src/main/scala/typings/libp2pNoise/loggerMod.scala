package typings.libp2pNoise

import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("libp2p-noise/dist/src/logger", "logCipherState")
  @js.native
  def logCipherState(session: NoiseSession): Unit = js.native
  
  @JSImport("libp2p-noise/dist/src/logger", "logLocalEphemeralKeys")
  @js.native
  def logLocalEphemeralKeys(): Unit = js.native
  @JSImport("libp2p-noise/dist/src/logger", "logLocalEphemeralKeys")
  @js.native
  def logLocalEphemeralKeys(e: KeyPair): Unit = js.native
  
  @JSImport("libp2p-noise/dist/src/logger", "logLocalStaticKeys")
  @js.native
  def logLocalStaticKeys(s: KeyPair): Unit = js.native
  
  @JSImport("libp2p-noise/dist/src/logger", "logRemoteEphemeralKey")
  @js.native
  def logRemoteEphemeralKey(re: Buffer): Unit = js.native
  
  @JSImport("libp2p-noise/dist/src/logger", "logRemoteStaticKey")
  @js.native
  def logRemoteStaticKey(rs: Buffer): Unit = js.native
  
  @JSImport("libp2p-noise/dist/src/logger", "logger")
  @js.native
  val logger: js.Any = js.native
}
