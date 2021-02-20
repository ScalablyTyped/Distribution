package typings.libp2pInterfaces

import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", "SignPrefix")
  @js.native
  val SignPrefix: js.Any = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", "messagePublicKey")
  @js.native
  def messagePublicKey(message: js.Any): js.Promise[_] = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", "signMessage")
  @js.native
  def signMessage(peerId: ^, message: js.Any): js.Promise[_] = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", "verifySignature")
  @js.native
  def verifySignature(message: js.Any): js.Promise[Boolean] = js.native
}
