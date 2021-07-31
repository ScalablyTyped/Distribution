package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventPaused
import typings.kurentoClient.anon.EventRecording
import typings.kurentoClient.anon.EventStopped
import typings.kurentoClient.kurentoClientStrings.Paused
import typings.kurentoClient.kurentoClientStrings.Recording
import typings.kurentoClient.kurentoClientStrings.Stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderEndpoint
  extends StObject
     with UriEndpoint {
  
  def getMaxOutputBitrate(): js.Promise[Double] = js.native
  def getMaxOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMinOutputBitrate(): js.Promise[Double] = js.native
  def getMinOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  @JSName("on")
  def on_Paused(eventName: Paused, callback: js.Function1[/* event */ EventPaused, Unit]): RecorderEndpoint = js.native
  @JSName("on")
  def on_Recording(eventName: Recording, callback: js.Function1[/* event */ EventRecording, Unit]): RecorderEndpoint = js.native
  @JSName("on")
  def on_Stopped(eventName: Stopped, callback: js.Function1[/* event */ EventStopped, Unit]): RecorderEndpoint = js.native
  
  def record(): js.Promise[Unit] = js.native
  def record(callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMaxOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMaxOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  
  def setMinOutputBitrate(bitrate: Double): js.Promise[Double] = js.native
  def setMinOutputBitrate(bitrate: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  
  def stopAndWait(): js.Promise[Unit] = js.native
  def stopAndWait(callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  var stopOnEndOfStream: Boolean = js.native
  
  var uri: String = js.native
}
