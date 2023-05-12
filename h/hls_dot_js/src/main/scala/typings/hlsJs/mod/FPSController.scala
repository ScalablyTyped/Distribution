package typings.hlsJs.mod

import typings.hlsJs.mod.Events.MEDIA_ATTACHING
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "FPSController")
@js.native
open class FPSController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  def checkFPS(video: HTMLVideoElement, decodedFrames: Double, droppedFrames: Double): Unit = js.native
  
  def checkFPSInterval(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var isVideoPlaybackQualityAvailable: Any = js.native
  
  /* private */ var lastDecodedFrames: Any = js.native
  
  /* private */ var lastDroppedFrames: Any = js.native
  
  /* private */ var lastTime: Any = js.native
  
  /* private */ var media: Any = js.native
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  def setStreamController(streamController: StreamController): Unit = js.native
  
  /* private */ var streamController: Any = js.native
  
  /* private */ var timer: Any = js.native
  
  /* protected */ def unregisterListeners(): Unit = js.native
}
