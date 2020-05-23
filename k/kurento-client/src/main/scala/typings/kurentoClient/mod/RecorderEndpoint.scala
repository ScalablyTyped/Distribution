package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderEndpoint
  extends ClientInstance
     with MediaObject
     with MediaElement {
  var stopOnEndOfStream: Boolean = js.native
  var uri: String = js.native
  def getMaxOutputBitrate(): js.Promise[Double] = js.native
  def getMaxOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMinOutputBitrate(): js.Promise[Double] = js.native
  def getMinOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  def record(): js.Promise[Unit] = js.native
  def record(callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setMaxOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMaxOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  def setMinOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMinOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  def stopAndWait(): js.Promise[Unit] = js.native
  def stopAndWait(callback: Callback[Unit]): js.Promise[Unit] = js.native
}

