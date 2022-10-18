package typings.libp2pPubsub

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.PubSubRPCMessage
import typings.libp2pInterfacePubsub.mod.SignedMessage
import typings.libp2pPubsub.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSignMod {
  
  @JSImport("@libp2p/pubsub/dist/src/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/pubsub/dist/src/sign", "SignPrefix")
  @js.native
  val SignPrefix: js.typedarray.Uint8Array = js.native
  
  inline def messagePublicKey(message: SignedMessage): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("messagePublicKey")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def signMessage(
    peerId: PeerId,
    message: Data,
    encode: js.Function1[/* rpc */ PubSubRPCMessage, js.typedarray.Uint8Array]
  ): js.Promise[SignedMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(peerId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignedMessage]]
  
  inline def verifySignature(message: SignedMessage, encode: js.Function1[/* rpc */ PubSubRPCMessage, js.typedarray.Uint8Array]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(message.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
