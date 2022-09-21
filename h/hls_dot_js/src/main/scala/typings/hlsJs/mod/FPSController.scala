package typings.hlsJs.mod

import typings.hlsJs.mod.Events.MEDIA_ATTACHING
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSController
  extends StObject
     with ComponentAPI {
  
  def checkFPS(video: HTMLVideoElement, decodedFrames: Double, droppedFrames: Double): Unit
  
  def checkFPSInterval(): Unit
  
  /* private */ var hls: Any
  
  /* private */ var isVideoPlaybackQualityAvailable: Any
  
  /* private */ var lastDecodedFrames: Any
  
  /* private */ var lastDroppedFrames: Any
  
  /* private */ var lastTime: Any
  
  /* private */ var media: Any
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit
  
  /* protected */ def registerListeners(): Unit
  
  def setStreamController(streamController: StreamController): Unit
  
  /* private */ var streamController: Any
  
  /* private */ var timer: Any
  
  /* protected */ def unregisterListeners(): Unit
}
object FPSController {
  
  inline def apply(
    checkFPS: (HTMLVideoElement, Double, Double) => Unit,
    checkFPSInterval: () => Unit,
    destroy: () => Unit,
    hls: Any,
    isVideoPlaybackQualityAvailable: Any,
    lastDecodedFrames: Any,
    lastDroppedFrames: Any,
    lastTime: Any,
    media: Any,
    onMediaAttaching: (MEDIA_ATTACHING, MediaAttachingData) => Unit,
    registerListeners: () => Unit,
    setStreamController: StreamController => Unit,
    streamController: Any,
    timer: Any,
    unregisterListeners: () => Unit
  ): FPSController = {
    val __obj = js.Dynamic.literal(checkFPS = js.Any.fromFunction3(checkFPS), checkFPSInterval = js.Any.fromFunction0(checkFPSInterval), destroy = js.Any.fromFunction0(destroy), hls = hls.asInstanceOf[js.Any], isVideoPlaybackQualityAvailable = isVideoPlaybackQualityAvailable.asInstanceOf[js.Any], lastDecodedFrames = lastDecodedFrames.asInstanceOf[js.Any], lastDroppedFrames = lastDroppedFrames.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], onMediaAttaching = js.Any.fromFunction2(onMediaAttaching), registerListeners = js.Any.fromFunction0(registerListeners), setStreamController = js.Any.fromFunction1(setStreamController), streamController = streamController.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], unregisterListeners = js.Any.fromFunction0(unregisterListeners))
    __obj.asInstanceOf[FPSController]
  }
  
  extension [Self <: FPSController](x: Self) {
    
    inline def setCheckFPS(value: (HTMLVideoElement, Double, Double) => Unit): Self = StObject.set(x, "checkFPS", js.Any.fromFunction3(value))
    
    inline def setCheckFPSInterval(value: () => Unit): Self = StObject.set(x, "checkFPSInterval", js.Any.fromFunction0(value))
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setIsVideoPlaybackQualityAvailable(value: Any): Self = StObject.set(x, "isVideoPlaybackQualityAvailable", value.asInstanceOf[js.Any])
    
    inline def setLastDecodedFrames(value: Any): Self = StObject.set(x, "lastDecodedFrames", value.asInstanceOf[js.Any])
    
    inline def setLastDroppedFrames(value: Any): Self = StObject.set(x, "lastDroppedFrames", value.asInstanceOf[js.Any])
    
    inline def setLastTime(value: Any): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOnMediaAttaching(value: (MEDIA_ATTACHING, MediaAttachingData) => Unit): Self = StObject.set(x, "onMediaAttaching", js.Any.fromFunction2(value))
    
    inline def setRegisterListeners(value: () => Unit): Self = StObject.set(x, "registerListeners", js.Any.fromFunction0(value))
    
    inline def setSetStreamController(value: StreamController => Unit): Self = StObject.set(x, "setStreamController", js.Any.fromFunction1(value))
    
    inline def setStreamController(value: Any): Self = StObject.set(x, "streamController", value.asInstanceOf[js.Any])
    
    inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setUnregisterListeners(value: () => Unit): Self = StObject.set(x, "unregisterListeners", js.Any.fromFunction0(value))
  }
}
