package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/publisher", "Publisher")
@js.native
class Publisher protected ()
  extends nodeLib.eventsMod.EventEmitter
     with IPublisherEventEmitter {
  def this(namespace: java.lang.String, name: java.lang.String, port: scala.Double) = this()
  def this(namespace: java.lang.String, name: java.lang.String, port: scala.Double, commPort: scala.Double) = this()
  var client: js.UndefOr[nodeLib.dgramMod.Socket] = js.native
  var commPort: js.UndefOr[scala.Double] = js.native
  val id: java.lang.String = js.native
  var interfaces: js.UndefOr[js.Array[Interface]] = js.native
  var interval: scala.Double = js.native
  var name: java.lang.String = js.native
  var namespace: java.lang.String = js.native
  val path: /* / */ java.lang.String = js.native
  var port: scala.Double = js.native
  var running: scala.Boolean = js.native
  var timer: js.UndefOr[nodeLib.NodeJSNs.Timer] = js.native
  /* protected */ def buildMessage(ip: java.lang.String): PublisherMessage = js.native
  /* protected */ def getInterfaces(): js.Array[Interface] = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_error(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* protected */ def sayHello(): scala.Unit = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
}

