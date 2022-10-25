package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubSub[Events /* <: StringDictionary[Any] */] extends EventEmitter[Events] {
  
  def getPeers(): js.Array[PeerId] = js.native
  
  def getSubscribers(topic: String): js.Array[PeerId] = js.native
  
  def getTopics(): js.Array[String] = js.native
  
  var globalSignaturePolicy: /* "StrictSign" */ String = js.native
  
  var multicodecs: js.Array[String] = js.native
  
  def publish(topic: String, data: js.typedarray.Uint8Array): js.Promise[PublishResult] = js.native
  
  def subscribe(topic: String): Unit = js.native
  
  var topicValidators: Map[String, TopicValidatorFn] = js.native
  
  def unsubscribe(topic: String): Unit = js.native
}
