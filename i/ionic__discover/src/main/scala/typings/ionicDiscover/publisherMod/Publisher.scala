package typings.ionicDiscover.publisherMod

import typings.node.NodeJS.Timer
import typings.node.dgramMod.Socket
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/discover/dist/publisher", "Publisher")
@js.native
class Publisher protected ()
  extends EventEmitter
     with IPublisherEventEmitter {
  def this(namespace: String, name: String, port: Double) = this()
  def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  
  /* protected */ def buildMessage(ip: String): PublisherMessage = js.native
  
  var client: js.UndefOr[Socket] = js.native
  
  var commPort: js.UndefOr[Double] = js.native
  
  /* protected */ def getInterfaces(): js.Array[Interface] = js.native
  
  val id: String = js.native
  
  var interfaces: js.UndefOr[js.Array[Interface]] = js.native
  
  var interval: Double = js.native
  
  var name: String = js.native
  
  var namespace: String = js.native
  
  val path: /* "/" */ String = js.native
  
  var port: Double = js.native
  
  var running: Boolean = js.native
  
  /* protected */ def sayHello(): Unit = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  def stop(): Unit = js.native
  
  var timer: js.UndefOr[Timer] = js.native
}
