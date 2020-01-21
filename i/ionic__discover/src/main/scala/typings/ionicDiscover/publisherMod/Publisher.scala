package typings.ionicDiscover.publisherMod

import typings.ionicDiscover.ionicDiscoverStrings.Slash
import typings.ionicDiscover.ionicDiscoverStrings.error
import typings.node.NodeJS.Timer
import typings.node.dgramMod.Socket
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/publisher", "Publisher")
@js.native
class Publisher protected ()
  extends EventEmitter
     with IPublisherEventEmitter {
  def this(namespace: String, name: String, port: Double) = this()
  def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  var client: js.UndefOr[Socket] = js.native
  var commPort: js.UndefOr[Double] = js.native
  val id: String = js.native
  var interfaces: js.UndefOr[js.Array[Interface]] = js.native
  var interval: Double = js.native
  var name: String = js.native
  var namespace: String = js.native
  val path: Slash = js.native
  var port: Double = js.native
  var running: Boolean = js.native
  var timer: js.UndefOr[Timer] = js.native
  /* protected */ def buildMessage(ip: String): PublisherMessage = js.native
  /* protected */ def getInterfaces(): js.Array[Interface] = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /* protected */ def sayHello(): Unit = js.native
  def start(): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
}

