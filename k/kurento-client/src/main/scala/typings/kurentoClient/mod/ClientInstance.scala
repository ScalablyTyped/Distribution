package typings.kurentoClient.mod

import typings.kurentoClient.kurentoClientStrings.OnIceCandidate
import typings.kurentoClient.kurentoClientStrings.Paused
import typings.kurentoClient.kurentoClientStrings.Recording
import typings.kurentoClient.kurentoClientStrings.Stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInstance extends js.Object {
  def close(): Unit = js.native
  @JSName("create")
  def create_MediaPipeline(`type`: typings.kurentoClient.kurentoClientStrings.MediaPipeline): js.Promise[MediaPipeline] = js.native
  @JSName("create")
  def create_RecorderEndpoint(
    `type`: typings.kurentoClient.kurentoClientStrings.RecorderEndpoint,
    options: RecorderEndpointOptions
  ): js.Promise[RecorderEndpoint] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(`type`: typings.kurentoClient.kurentoClientStrings.WebRtcEndpoint): js.Promise[WebRtcEndpoint] = js.native
  def getMediaobjectById(objectId: String): js.Promise[MediaPipeline | WebRtcEndpoint | RecorderEndpoint] = js.native
  @JSName("on")
  def on_Error(
    event: typings.kurentoClient.kurentoClientStrings.Error,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnIceCandidate(event: OnIceCandidate, callback: js.Function1[/* event */ IceCandidate, Unit]): Unit = js.native
  @JSName("on")
  def on_Paused(event: Paused, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_Recording(event: Recording, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_Stopped(event: Stopped, callback: js.Function0[Unit]): Unit = js.native
}

