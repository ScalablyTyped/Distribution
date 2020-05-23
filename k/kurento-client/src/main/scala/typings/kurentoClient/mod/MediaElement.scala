package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaElement extends js.Object {
  def connect(sink: MediaElement): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def getSinkConnections(): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
}

