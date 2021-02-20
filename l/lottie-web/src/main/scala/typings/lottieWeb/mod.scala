package typings.lottieWeb

import org.scalablytyped.runtime.Shortcut
import typings.lottieWeb.lottieWebStrings.canvas
import typings.lottieWeb.lottieWebStrings.html
import typings.lottieWeb.lottieWebStrings.svg
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lottie-web", JSImport.Default)
  @js.native
  val default: LottiePlayer = js.native
  
  @js.native
  trait AnimationConfig extends StObject {
    
    var assetsPath: js.UndefOr[String] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var container: Element = js.native
    
    var initialSegment: js.UndefOr[AnimationSegment] = js.native
    
    var loop: js.UndefOr[Boolean | Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var renderer: js.UndefOr[svg | canvas | html] = js.native
    
    var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.native
  }
  object AnimationConfig {
    
    @scala.inline
    def apply(container: Element): AnimationConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfig]
    }
    
    @scala.inline
    implicit class AnimationConfigMutableBuilder[Self <: AnimationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegment(value: AnimationSegment): Self = StObject.set(x, "initialSegment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegmentUndefined: Self = StObject.set(x, "initialSegment", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRenderer(value: svg | canvas | html): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  /* Inlined lottie-web.lottie-web.AnimationConfig & {  animationData :any | undefined} */
  @js.native
  trait AnimationConfigWithData extends StObject {
    
    var animationData: js.UndefOr[js.Any] = js.native
    
    var assetsPath: js.UndefOr[String] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var container: Element = js.native
    
    var initialSegment: js.UndefOr[AnimationSegment] = js.native
    
    var loop: js.UndefOr[Boolean | Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var renderer: js.UndefOr[svg | canvas | html] = js.native
    
    var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.native
  }
  object AnimationConfigWithData {
    
    @scala.inline
    def apply(container: Element): AnimationConfigWithData = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigWithData]
    }
    
    @scala.inline
    implicit class AnimationConfigWithDataMutableBuilder[Self <: AnimationConfigWithData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationData(value: js.Any): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDataUndefined: Self = StObject.set(x, "animationData", js.undefined)
      
      @scala.inline
      def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegment(value: AnimationSegment): Self = StObject.set(x, "initialSegment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegmentUndefined: Self = StObject.set(x, "initialSegment", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRenderer(value: svg | canvas | html): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  /* Inlined lottie-web.lottie-web.AnimationConfig & {  path :string | undefined} */
  @js.native
  trait AnimationConfigWithPath extends StObject {
    
    var assetsPath: js.UndefOr[String] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var container: Element = js.native
    
    var initialSegment: js.UndefOr[AnimationSegment] = js.native
    
    var loop: js.UndefOr[Boolean | Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var renderer: js.UndefOr[svg | canvas | html] = js.native
    
    var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.native
  }
  object AnimationConfigWithPath {
    
    @scala.inline
    def apply(container: Element): AnimationConfigWithPath = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigWithPath]
    }
    
    @scala.inline
    implicit class AnimationConfigWithPathMutableBuilder[Self <: AnimationConfigWithPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegment(value: AnimationSegment): Self = StObject.set(x, "initialSegment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSegmentUndefined: Self = StObject.set(x, "initialSegment", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRenderer(value: svg | canvas | html): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lottieWeb.lottieWebNumbers.`1`
    - typings.lottieWeb.lottieWebNumbers.`-1`
  */
  trait AnimationDirection extends StObject
  object AnimationDirection {
    
    @scala.inline
    def `-1`: typings.lottieWeb.lottieWebNumbers.`-1` = -1.asInstanceOf[typings.lottieWeb.lottieWebNumbers.`-1`]
    
    @scala.inline
    def `1`: typings.lottieWeb.lottieWebNumbers.`1` = 1.asInstanceOf[typings.lottieWeb.lottieWebNumbers.`1`]
  }
  
  type AnimationEventCallback[T] = js.Function1[/* args */ T, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lottieWeb.lottieWebStrings.enterFrame
    - typings.lottieWeb.lottieWebStrings.loopComplete
    - typings.lottieWeb.lottieWebStrings.complete
    - typings.lottieWeb.lottieWebStrings.segmentStart
    - typings.lottieWeb.lottieWebStrings.destroy
    - typings.lottieWeb.lottieWebStrings.config_ready
    - typings.lottieWeb.lottieWebStrings.data_ready
    - typings.lottieWeb.lottieWebStrings.DOMLoaded
    - typings.lottieWeb.lottieWebStrings.error
    - typings.lottieWeb.lottieWebStrings.data_failed
    - typings.lottieWeb.lottieWebStrings.loaded_images
  */
  trait AnimationEventName extends StObject
  object AnimationEventName {
    
    @scala.inline
    def DOMLoaded: typings.lottieWeb.lottieWebStrings.DOMLoaded = "DOMLoaded".asInstanceOf[typings.lottieWeb.lottieWebStrings.DOMLoaded]
    
    @scala.inline
    def complete: typings.lottieWeb.lottieWebStrings.complete = "complete".asInstanceOf[typings.lottieWeb.lottieWebStrings.complete]
    
    @scala.inline
    def config_ready: typings.lottieWeb.lottieWebStrings.config_ready = "config_ready".asInstanceOf[typings.lottieWeb.lottieWebStrings.config_ready]
    
    @scala.inline
    def data_failed: typings.lottieWeb.lottieWebStrings.data_failed = "data_failed".asInstanceOf[typings.lottieWeb.lottieWebStrings.data_failed]
    
    @scala.inline
    def data_ready: typings.lottieWeb.lottieWebStrings.data_ready = "data_ready".asInstanceOf[typings.lottieWeb.lottieWebStrings.data_ready]
    
    @scala.inline
    def destroy: typings.lottieWeb.lottieWebStrings.destroy = "destroy".asInstanceOf[typings.lottieWeb.lottieWebStrings.destroy]
    
    @scala.inline
    def enterFrame: typings.lottieWeb.lottieWebStrings.enterFrame = "enterFrame".asInstanceOf[typings.lottieWeb.lottieWebStrings.enterFrame]
    
    @scala.inline
    def error: typings.lottieWeb.lottieWebStrings.error = "error".asInstanceOf[typings.lottieWeb.lottieWebStrings.error]
    
    @scala.inline
    def loaded_images: typings.lottieWeb.lottieWebStrings.loaded_images = "loaded_images".asInstanceOf[typings.lottieWeb.lottieWebStrings.loaded_images]
    
    @scala.inline
    def loopComplete: typings.lottieWeb.lottieWebStrings.loopComplete = "loopComplete".asInstanceOf[typings.lottieWeb.lottieWebStrings.loopComplete]
    
    @scala.inline
    def segmentStart: typings.lottieWeb.lottieWebStrings.segmentStart = "segmentStart".asInstanceOf[typings.lottieWeb.lottieWebStrings.segmentStart]
  }
  
  @js.native
  trait AnimationItem extends StObject {
    
    def addEventListener[T](name: AnimationEventName, callback: AnimationEventCallback[T]): js.Function0[Unit] = js.native
    
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
    
    def goToAndPlay(value: Double): Unit = js.native
    def goToAndPlay(value: Double, isFrame: js.UndefOr[scala.Nothing], name: String): Unit = js.native
    def goToAndPlay(value: Double, isFrame: Boolean): Unit = js.native
    def goToAndPlay(value: Double, isFrame: Boolean, name: String): Unit = js.native
    
    def goToAndStop(value: Double): Unit = js.native
    def goToAndStop(value: Double, isFrame: js.UndefOr[scala.Nothing], name: String): Unit = js.native
    def goToAndStop(value: Double, isFrame: Boolean): Unit = js.native
    def goToAndStop(value: Double, isFrame: Boolean, name: String): Unit = js.native
    
    def hide(): Unit = js.native
    
    def includeLayers(data: js.Any): Unit = js.native
    
    var isLoaded: Boolean = js.native
    
    var isPaused: Boolean = js.native
    
    var isSubframeEnabled: Boolean = js.native
    
    var loop: Boolean = js.native
    
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
    
    def removeEventListener[T](name: AnimationEventName): Unit = js.native
    def removeEventListener[T](name: AnimationEventName, callback: AnimationEventCallback[T]): Unit = js.native
    
    var renderer: js.Any = js.native
    
    def resetSegments(forceFlag: Boolean): Unit = js.native
    
    def resize(): Unit = js.native
    
    var segmentPos: Double = js.native
    
    var segments: AnimationSegment | js.Array[AnimationSegment] = js.native
    
    def setDirection(direction: AnimationDirection): Unit = js.native
    
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
    
    def triggerEvent[T](name: AnimationEventName, args: T): Unit = js.native
  }
  
  type AnimationSegment = js.Tuple2[Double, Double]
  
  @js.native
  trait BaseRendererConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var imagePreserveAspectRatio: js.UndefOr[String] = js.native
  }
  object BaseRendererConfig {
    
    @scala.inline
    def apply(): BaseRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRendererConfig]
    }
    
    @scala.inline
    implicit class BaseRendererConfigMutableBuilder[Self <: BaseRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
    }
  }
  
  /* Inlined lottie-web.lottie-web.BaseRendererConfig & {  clearCanvas :boolean | undefined,   context :std.CanvasRenderingContext2D | undefined,   progressiveLoad :boolean | undefined,   preserveAspectRatio :string | undefined} */
  @js.native
  trait CanvasRendererConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var clearCanvas: js.UndefOr[Boolean] = js.native
    
    var context: js.UndefOr[CanvasRenderingContext2D] = js.native
    
    var imagePreserveAspectRatio: js.UndefOr[String] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var progressiveLoad: js.UndefOr[Boolean] = js.native
  }
  object CanvasRendererConfig {
    
    @scala.inline
    def apply(): CanvasRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasRendererConfig]
    }
    
    @scala.inline
    implicit class CanvasRendererConfigMutableBuilder[Self <: CanvasRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
    }
  }
  
  @js.native
  trait FilterSizeConfig extends StObject {
    
    var height: String = js.native
    
    var width: String = js.native
    
    var x: String = js.native
    
    var y: String = js.native
  }
  object FilterSizeConfig {
    
    @scala.inline
    def apply(height: String, width: String, x: String, y: String): FilterSizeConfig = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSizeConfig]
    }
    
    @scala.inline
    implicit class FilterSizeConfigMutableBuilder[Self <: FilterSizeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined lottie-web.lottie-web.BaseRendererConfig & {  hideOnTransparent :boolean | undefined} */
  @js.native
  trait HTMLRendererConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var hideOnTransparent: js.UndefOr[Boolean] = js.native
    
    var imagePreserveAspectRatio: js.UndefOr[String] = js.native
  }
  object HTMLRendererConfig {
    
    @scala.inline
    def apply(): HTMLRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLRendererConfig]
    }
    
    @scala.inline
    implicit class HTMLRendererConfigMutableBuilder[Self <: HTMLRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
      
      @scala.inline
      def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
    }
  }
  
  @js.native
  trait LottiePlayer extends StObject {
    
    def destroy(): Unit = js.native
    def destroy(name: String): Unit = js.native
    
    def loadAnimation(params: AnimationConfigWithData): AnimationItem = js.native
    def loadAnimation(params: AnimationConfigWithPath): AnimationItem = js.native
    
    def pause(): Unit = js.native
    def pause(name: String): Unit = js.native
    
    def play(): Unit = js.native
    def play(name: String): Unit = js.native
    
    def registerAnimation(element: Element): Unit = js.native
    def registerAnimation(element: Element, animationData: js.Any): Unit = js.native
    
    def searchAnimations(): Unit = js.native
    def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: js.UndefOr[scala.Nothing], renderer: String): Unit = js.native
    def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: Boolean): Unit = js.native
    def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: Boolean, renderer: String): Unit = js.native
    def searchAnimations(animationData: js.Any): Unit = js.native
    def searchAnimations(animationData: js.Any, standalone: js.UndefOr[scala.Nothing], renderer: String): Unit = js.native
    def searchAnimations(animationData: js.Any, standalone: Boolean): Unit = js.native
    def searchAnimations(animationData: js.Any, standalone: Boolean, renderer: String): Unit = js.native
    
    def setDirection(direction: AnimationDirection): Unit = js.native
    def setDirection(direction: AnimationDirection, name: String): Unit = js.native
    
    def setLocationHref(href: String): Unit = js.native
    
    def setQuality(quality: String): Unit = js.native
    def setQuality(quality: Double): Unit = js.native
    
    def setSpeed(speed: Double): Unit = js.native
    def setSpeed(speed: Double, name: String): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(name: String): Unit = js.native
  }
  
  /* Inlined lottie-web.lottie-web.BaseRendererConfig & {  title :string | undefined,   description :string | undefined,   preserveAspectRatio :string | undefined,   progressiveLoad :boolean | undefined,   hideOnTransparent :boolean | undefined,   viewBoxOnly :boolean | undefined,   viewBoxSize :string | undefined,   focusable :boolean | undefined,   filterSize :lottie-web.lottie-web.FilterSizeConfig | undefined} */
  @js.native
  trait SVGRendererConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var filterSize: js.UndefOr[FilterSizeConfig] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var hideOnTransparent: js.UndefOr[Boolean] = js.native
    
    var imagePreserveAspectRatio: js.UndefOr[String] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var progressiveLoad: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var viewBoxOnly: js.UndefOr[Boolean] = js.native
    
    var viewBoxSize: js.UndefOr[String] = js.native
  }
  object SVGRendererConfig {
    
    @scala.inline
    def apply(): SVGRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGRendererConfig]
    }
    
    @scala.inline
    implicit class SVGRendererConfigMutableBuilder[Self <: SVGRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFilterSize(value: FilterSizeConfig): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSizeUndefined: Self = StObject.set(x, "filterSize", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
      
      @scala.inline
      def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setViewBoxOnly(value: Boolean): Self = StObject.set(x, "viewBoxOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxOnlyUndefined: Self = StObject.set(x, "viewBoxOnly", js.undefined)
      
      @scala.inline
      def setViewBoxSize(value: String): Self = StObject.set(x, "viewBoxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxSizeUndefined: Self = StObject.set(x, "viewBoxSize", js.undefined)
    }
  }
  
  type _To = LottiePlayer
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LottiePlayer = default
}
