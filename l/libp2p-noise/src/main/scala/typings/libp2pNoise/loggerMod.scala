package typings.libp2pNoise

import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.libp2pNoise.libp2pMod.KeyPair
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("libp2p-noise/dist/src/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def logCipherState(session: NoiseSession): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logCipherState")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logLocalEphemeralKeys(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalEphemeralKeys")().asInstanceOf[Unit]
  @scala.inline
  def logLocalEphemeralKeys(e: KeyPair): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalEphemeralKeys")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logLocalStaticKeys(s: KeyPair): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalStaticKeys")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logRemoteEphemeralKey(re: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logRemoteEphemeralKey")(re.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logRemoteStaticKey(rs: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logRemoteStaticKey")(rs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("libp2p-noise/dist/src/logger", "logger")
  @js.native
  val logger: js.Any = js.native
}
