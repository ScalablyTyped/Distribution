package typings.libp2pInterfaces

import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-interfaces/src/pubsub/message/sign", JSImport.Namespace)
@js.native
object signMod extends js.Object {
  
  val SignPrefix: js.Any = js.native
  
  def messagePublicKey(message: js.Any): js.Promise[_] = js.native
  
  def signMessage(peerId: ^, message: js.Any): js.Promise[_] = js.native
  
  def verifySignature(message: js.Any): js.Promise[Boolean] = js.native
}
