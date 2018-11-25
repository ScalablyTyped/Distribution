package typings
package atIonicDiscoverLib.distCommMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/comm", "CommServer")
@js.native
class CommServer protected ()
  extends nodeLib.eventsMod.EventEmitter
     with ICommServerEventEmitter {
  def this(namespace: java.lang.String, /**
       * Unique identifier of the publisher.
       */
  id: java.lang.String, /**
       * Port of communication server.
       */
  port: scala.Double) = this()
  val clients: nodeLib.Set[wsLib.wsMod.namespaced] = js.native
  /**
       * Unique identifier of the publisher.
       */
  var id: java.lang.String = js.native
  var namespace: java.lang.String = js.native
  var parseData: js.Any = js.native
  /**
       * Port of communication server.
       */
  var port: scala.Double = js.native
  var server: js.UndefOr[wsLib.wsMod.Server] = js.native
  def start(): stdLib.Promise[scala.Unit] = js.native
  def stop(): stdLib.Promise[scala.Unit] = js.native
}

