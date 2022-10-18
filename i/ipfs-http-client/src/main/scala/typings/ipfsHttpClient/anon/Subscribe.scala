package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfaces.distSrcEventsMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribe extends StObject {
  
  def ls(): js.Promise[js.Array[String]] = js.native
  def ls(options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[String]] = js.native
  
  def peers(topic: String): js.Promise[js.Array[PeerId]] = js.native
  def peers(topic: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[PeerId]] = js.native
  
  def publish(topic: String, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def publish(topic: String, data: js.typedarray.Uint8Array, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  
  def subscribe(topic: String, handler: EventHandler[Message]): js.Promise[Unit] = js.native
  def subscribe(
    topic: String,
    handler: EventHandler[Message],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.SubscribeOptions */ Any) & HTTPClientExtraOptions & OnError
  ): js.Promise[Unit] = js.native
  
  def unsubscribe(topic: String): js.Promise[Unit] = js.native
  def unsubscribe(topic: String, handler: EventHandler[Message]): js.Promise[Unit] = js.native
}
