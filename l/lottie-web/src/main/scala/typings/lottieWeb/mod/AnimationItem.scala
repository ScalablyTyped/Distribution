package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationItem extends StObject {
  
  def addEventListener[T /* <: AnimationEventName */](
    name: T,
    callback: AnimationEventCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.lottie-web.AnimationEvents[T] */ js.Any
    ]
  ): js.Function0[Unit] = js.native
  
  var animationID: String = js.native
  
  var assetsPath: String = js.native
  
  var autoplay: Boolean = js.native
  
  var currentFrame: Double = js.native
  
  var currentRawFrame: Double = js.native
  
  def destroy(): Unit = js.native
  def destroy(name: String): Unit = js.native
  
  var firstFrame: Double = js.native
  
  var frameMult: Double = js.native
  
  var frameRate: Double = js.native
  
  def getDuration(): Double = js.native
  def getDuration(inFrames: Boolean): Double = js.native
  
  def goToAndPlay(value: String): Unit = js.native
  def goToAndPlay(value: String, isFrame: Boolean): Unit = js.native
  def goToAndPlay(value: String, isFrame: Boolean, name: String): Unit = js.native
  def goToAndPlay(value: String, isFrame: Unit, name: String): Unit = js.native
  def goToAndPlay(value: Double): Unit = js.native
  def goToAndPlay(value: Double, isFrame: Boolean): Unit = js.native
  def goToAndPlay(value: Double, isFrame: Boolean, name: String): Unit = js.native
  def goToAndPlay(value: Double, isFrame: Unit, name: String): Unit = js.native
  
  def goToAndStop(value: String): Unit = js.native
  def goToAndStop(value: String, isFrame: Boolean): Unit = js.native
  def goToAndStop(value: String, isFrame: Boolean, name: String): Unit = js.native
  def goToAndStop(value: String, isFrame: Unit, name: String): Unit = js.native
  def goToAndStop(value: Double): Unit = js.native
  def goToAndStop(value: Double, isFrame: Boolean): Unit = js.native
  def goToAndStop(value: Double, isFrame: Boolean, name: String): Unit = js.native
  def goToAndStop(value: Double, isFrame: Unit, name: String): Unit = js.native
  
  def hide(): Unit = js.native
  
  def includeLayers(data: Any): Unit = js.native
  
  var isLoaded: Boolean = js.native
  
  var isPaused: Boolean = js.native
  
  var isSubframeEnabled: Boolean = js.native
  
  var loop: Boolean | Double = js.native
  
  var name: String = js.native
  
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  
  def play(): Unit = js.native
  def play(name: String): Unit = js.native
  
  var playCount: Double = js.native
  
  var playDirection: Double = js.native
  
  def playSegments(segments: js.Array[AnimationSegment]): Unit = js.native
  def playSegments(segments: js.Array[AnimationSegment], forceFlag: Boolean): Unit = js.native
  def playSegments(segments: AnimationSegment): Unit = js.native
  def playSegments(segments: AnimationSegment, forceFlag: Boolean): Unit = js.native
  
  var playSpeed: Double = js.native
  
  def removeEventListener[T /* <: AnimationEventName */](name: T): Unit = js.native
  def removeEventListener[T /* <: AnimationEventName */](
    name: T,
    callback: AnimationEventCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.lottie-web.AnimationEvents[T] */ js.Any
    ]
  ): Unit = js.native
  
  var renderer: Any = js.native
  
  def resetSegments(forceFlag: Boolean): Unit = js.native
  
  def resize(): Unit = js.native
  
  var segmentPos: Double = js.native
  
  var segments: AnimationSegment | js.Array[AnimationSegment] = js.native
  
  def setDirection(direction: AnimationDirection): Unit = js.native
  
  def setLoop(isLooping: Boolean): Unit = js.native
  
  def setSegment(init: Double, end: Double): Unit = js.native
  
  def setSpeed(speed: Double): Unit = js.native
  
  def setSubframe(useSubFrames: Boolean): Unit = js.native
  
  def show(): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(name: String): Unit = js.native
  
  var timeCompleted: Double = js.native
  
  def togglePause(): Unit = js.native
  def togglePause(name: String): Unit = js.native
  
  var totalFrames: Double = js.native
  
  def triggerEvent[T /* <: AnimationEventName */](
    name: T,
    args: /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.lottie-web.AnimationEvents[T] */ js.Any
  ): Unit = js.native
}
