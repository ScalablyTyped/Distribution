package typings.libp2pInterfacePubsub.mod

import typings.itPushable.mod.Pushable_
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStreams extends EventEmitter[PeerStreamEvents] {
  
  def attachInboundStream(stream: Stream): AsyncIterable[Uint8ArrayList] = js.native
  
  def attachOutboundStream(stream: Stream): js.Promise[Pushable_[Uint8ArrayList, Unit, Any]] = js.native
  
  def close(): Unit = js.native
  
  var id: PeerId = js.native
  
  var inboundStream: js.UndefOr[AsyncIterable[Uint8ArrayList]] = js.native
  
  var isWritable: Boolean = js.native
  
  var outboundStream: js.UndefOr[Pushable_[Uint8ArrayList, Unit, Any]] = js.native
  
  var protocol: String = js.native
  
  def write(buf: js.typedarray.Uint8Array): Unit = js.native
  def write(buf: Uint8ArrayList): Unit = js.native
}
