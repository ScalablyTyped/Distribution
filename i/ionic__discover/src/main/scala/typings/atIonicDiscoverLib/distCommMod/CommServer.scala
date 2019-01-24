package typings
package atIonicDiscoverLib.distCommMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/comm", "CommServer")
@js.native
class CommServer protected ()
  extends nodeLib.eventsMod.EventEmitter {
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
  @JSName("on")
  def on_connect(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.connect,
    listener: js.Function1[/* data */ CommServerConnectionPayload, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: atIonicDiscoverLib.atIonicDiscoverLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def stop(): js.Promise[scala.Unit] = js.native
}

