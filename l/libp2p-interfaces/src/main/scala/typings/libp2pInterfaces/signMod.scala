package typings.libp2pInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p-interfaces/src/pubsub/message/sign", "SignPrefix")
  @js.native
  val SignPrefix: js.Any = js.native
  
  @scala.inline
  def messagePublicKey(message: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("messagePublicKey")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def signMessage(peerId: typings.peerId.mod.^, message: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(peerId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def verifySignature(message: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
