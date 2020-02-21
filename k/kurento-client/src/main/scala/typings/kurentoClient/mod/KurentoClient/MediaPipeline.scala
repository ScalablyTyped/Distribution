package typings.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPipeline
  extends ClientInstance
     with MediaObject {
  def getGstreamerDot(): js.Promise[String] = js.native
  def getGstreamerDot(callback: Callback[String]): js.Promise[String] = js.native
  def getLatencyStats(): js.Promise[Boolean] = js.native
  def getLatencyStats(callback: Callback[Boolean]): js.Promise[Boolean] = js.native
  def setLatencyStats(): js.Promise[String] = js.native
  def setLatencyStats(callback: Callback[String]): js.Promise[String] = js.native
}

