package typings.lottieWeb

import org.scalablytyped.runtime.Shortcut
import typings.lottieWeb.anon.Play
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lottie-web", JSImport.Default)
  @js.native
  val default: LottiePlayer = js.native
  
  trait AnimationConfig[T /* <: RendererType */] extends StObject {
    
    var assetsPath: js.UndefOr[String] = js.undefined
    
    var audioFactory: js.UndefOr[js.Function1[/* assetPath */ String, Play]] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var container: Element
    
    var initialSegment: js.UndefOr[AnimationSegment] = js.undefined
    
    var loop: js.UndefOr[Boolean | Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var renderer: js.UndefOr[T] = js.undefined
    
    var rendererSettings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.anon.Canvas[T] */ js.Any
      ] = js.undefined
  }
  object AnimationConfig {
    
    inline def apply[T /* <: RendererType */](container: Element): AnimationConfig[T] = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfig[T]]
    }
    
    extension [Self <: AnimationConfig[?], T /* <: RendererType */](x: Self & AnimationConfig[T]) {
      
      inline def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      inline def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      inline def setAudioFactory(value: /* assetPath */ String => Play): Self = StObject.set(x, "audioFactory", js.Any.fromFunction1(value))
      
      inline def setAudioFactoryUndefined: Self = StObject.set(x, "audioFactory", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setInitialSegment(value: AnimationSegment): Self = StObject.set(x, "initialSegment", value.asInstanceOf[js.Any])
      
      inline def setInitialSegmentUndefined: Self = StObject.set(x, "initialSegment", js.undefined)
      
      inline def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRenderer(value: T): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.anon.Canvas[T] */ js.Any
      ): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      inline def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  trait AnimationConfigWithData[T /* <: RendererType */]
    extends StObject
       with AnimationConfig[T] {
    
    var animationData: js.UndefOr[Any] = js.undefined
  }
  object AnimationConfigWithData {
    
    inline def apply[T /* <: RendererType */](container: Element): AnimationConfigWithData[T] = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigWithData[T]]
    }
    
    extension [Self <: AnimationConfigWithData[?], T /* <: RendererType */](x: Self & AnimationConfigWithData[T]) {
      
      inline def setAnimationData(value: Any): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
      
      inline def setAnimationDataUndefined: Self = StObject.set(x, "animationData", js.undefined)
    }
  }
  
  trait AnimationConfigWithPath[T /* <: RendererType */]
    extends StObject
       with AnimationConfig[T] {
    
    var path: js.UndefOr[String] = js.undefined
  }
  object AnimationConfigWithPath {
    
    inline def apply[T /* <: RendererType */](container: Element): AnimationConfigWithPath[T] = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigWithPath[T]]
    }
    
    extension [Self <: AnimationConfigWithPath[?], T /* <: RendererType */](x: Self & AnimationConfigWithPath[T]) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lottieWeb.lottieWebNumbers.`1`
    - typings.lottieWeb.lottieWebNumbers.`-1`
  */
  trait AnimationDirection extends StObject
  object AnimationDirection {
    
    inline def `-1`: typings.lottieWeb.lottieWebNumbers.`-1` = -1.asInstanceOf[typings.lottieWeb.lottieWebNumbers.`-1`]
    
    inline def `1`: typings.lottieWeb.lottieWebNumbers.`1` = 1.asInstanceOf[typings.lottieWeb.lottieWebNumbers.`1`]
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
    
    inline def DOMLoaded: typings.lottieWeb.lottieWebStrings.DOMLoaded = "DOMLoaded".asInstanceOf[typings.lottieWeb.lottieWebStrings.DOMLoaded]
    
    inline def complete: typings.lottieWeb.lottieWebStrings.complete = "complete".asInstanceOf[typings.lottieWeb.lottieWebStrings.complete]
    
    inline def config_ready: typings.lottieWeb.lottieWebStrings.config_ready = "config_ready".asInstanceOf[typings.lottieWeb.lottieWebStrings.config_ready]
    
    inline def data_failed: typings.lottieWeb.lottieWebStrings.data_failed = "data_failed".asInstanceOf[typings.lottieWeb.lottieWebStrings.data_failed]
    
    inline def data_ready: typings.lottieWeb.lottieWebStrings.data_ready = "data_ready".asInstanceOf[typings.lottieWeb.lottieWebStrings.data_ready]
    
    inline def destroy: typings.lottieWeb.lottieWebStrings.destroy = "destroy".asInstanceOf[typings.lottieWeb.lottieWebStrings.destroy]
    
    inline def enterFrame: typings.lottieWeb.lottieWebStrings.enterFrame = "enterFrame".asInstanceOf[typings.lottieWeb.lottieWebStrings.enterFrame]
    
    inline def error: typings.lottieWeb.lottieWebStrings.error = "error".asInstanceOf[typings.lottieWeb.lottieWebStrings.error]
    
    inline def loaded_images: typings.lottieWeb.lottieWebStrings.loaded_images = "loaded_images".asInstanceOf[typings.lottieWeb.lottieWebStrings.loaded_images]
    
    inline def loopComplete: typings.lottieWeb.lottieWebStrings.loopComplete = "loopComplete".asInstanceOf[typings.lottieWeb.lottieWebStrings.loopComplete]
    
    inline def segmentStart: typings.lottieWeb.lottieWebStrings.segmentStart = "segmentStart".asInstanceOf[typings.lottieWeb.lottieWebStrings.segmentStart]
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
    
    def removeEventListener[T](name: AnimationEventName): Unit = js.native
    def removeEventListener[T](name: AnimationEventName, callback: AnimationEventCallback[T]): Unit = js.native
    
    var renderer: Any = js.native
    
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
  
  trait BaseRendererConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var imagePreserveAspectRatio: js.UndefOr[String] = js.undefined
  }
  object BaseRendererConfig {
    
    inline def apply(): BaseRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRendererConfig]
    }
    
    extension [Self <: BaseRendererConfig](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setImagePreserveAspectRatio(value: String): Self = StObject.set(x, "imagePreserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setImagePreserveAspectRatioUndefined: Self = StObject.set(x, "imagePreserveAspectRatio", js.undefined)
    }
  }
  
  trait CanvasRendererConfig
    extends StObject
       with BaseRendererConfig {
    
    var clearCanvas: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var progressiveLoad: js.UndefOr[Boolean] = js.undefined
  }
  object CanvasRendererConfig {
    
    inline def apply(): CanvasRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasRendererConfig]
    }
    
    extension [Self <: CanvasRendererConfig](x: Self) {
      
      inline def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      inline def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
    }
  }
  
  trait FilterSizeConfig extends StObject {
    
    var height: String
    
    var width: String
    
    var x: String
    
    var y: String
  }
  object FilterSizeConfig {
    
    inline def apply(height: String, width: String, x: String, y: String): FilterSizeConfig = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSizeConfig]
    }
    
    extension [Self <: FilterSizeConfig](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTMLRendererConfig
    extends StObject
       with BaseRendererConfig {
    
    var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLRendererConfig {
    
    inline def apply(): HTMLRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLRendererConfig]
    }
    
    extension [Self <: HTMLRendererConfig](x: Self) {
      
      inline def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      inline def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
    }
  }
  
  @js.native
  trait LottiePlayer extends StObject {
    
    def destroy(): Unit = js.native
    def destroy(name: String): Unit = js.native
    
    def loadAnimation[T /* <: RendererType */](params: AnimationConfigWithData[T]): AnimationItem = js.native
    def loadAnimation[T /* <: RendererType */](params: AnimationConfigWithPath[T]): AnimationItem = js.native
    
    def pause(): Unit = js.native
    def pause(name: String): Unit = js.native
    
    def play(): Unit = js.native
    def play(name: String): Unit = js.native
    
    def registerAnimation(element: Element): Unit = js.native
    def registerAnimation(element: Element, animationData: Any): Unit = js.native
    
    def searchAnimations(): Unit = js.native
    def searchAnimations(animationData: Any): Unit = js.native
    def searchAnimations(animationData: Any, standalone: Boolean): Unit = js.native
    def searchAnimations(animationData: Any, standalone: Boolean, renderer: String): Unit = js.native
    def searchAnimations(animationData: Any, standalone: Unit, renderer: String): Unit = js.native
    def searchAnimations(animationData: Unit, standalone: Boolean): Unit = js.native
    def searchAnimations(animationData: Unit, standalone: Boolean, renderer: String): Unit = js.native
    def searchAnimations(animationData: Unit, standalone: Unit, renderer: String): Unit = js.native
    
    def setDirection(direction: AnimationDirection): Unit = js.native
    def setDirection(direction: AnimationDirection, name: String): Unit = js.native
    
    def setIDPrefix(prefix: String): Unit = js.native
    
    def setLocationHref(href: String): Unit = js.native
    
    def setQuality(quality: String): Unit = js.native
    def setQuality(quality: Double): Unit = js.native
    
    def setSpeed(speed: Double): Unit = js.native
    def setSpeed(speed: Double, name: String): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(name: String): Unit = js.native
    
    def updateDocumentData(path: js.Array[String | Double], documentData: TextDocumentData, index: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lottieWeb.lottieWebStrings.svg
    - typings.lottieWeb.lottieWebStrings.canvas
    - typings.lottieWeb.lottieWebStrings.html
  */
  trait RendererType extends StObject
  object RendererType {
    
    inline def canvas: typings.lottieWeb.lottieWebStrings.canvas = "canvas".asInstanceOf[typings.lottieWeb.lottieWebStrings.canvas]
    
    inline def html: typings.lottieWeb.lottieWebStrings.html = "html".asInstanceOf[typings.lottieWeb.lottieWebStrings.html]
    
    inline def svg: typings.lottieWeb.lottieWebStrings.svg = "svg".asInstanceOf[typings.lottieWeb.lottieWebStrings.svg]
  }
  
  trait SVGRendererConfig
    extends StObject
       with BaseRendererConfig {
    
    var description: js.UndefOr[String] = js.undefined
    
    var filterSize: js.UndefOr[FilterSizeConfig] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var progressiveLoad: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var viewBoxOnly: js.UndefOr[Boolean] = js.undefined
    
    var viewBoxSize: js.UndefOr[String] = js.undefined
  }
  object SVGRendererConfig {
    
    inline def apply(): SVGRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGRendererConfig]
    }
    
    extension [Self <: SVGRendererConfig](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFilterSize(value: FilterSizeConfig): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
      
      inline def setFilterSizeUndefined: Self = StObject.set(x, "filterSize", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      inline def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setViewBoxOnly(value: Boolean): Self = StObject.set(x, "viewBoxOnly", value.asInstanceOf[js.Any])
      
      inline def setViewBoxOnlyUndefined: Self = StObject.set(x, "viewBoxOnly", js.undefined)
      
      inline def setViewBoxSize(value: String): Self = StObject.set(x, "viewBoxSize", value.asInstanceOf[js.Any])
      
      inline def setViewBoxSizeUndefined: Self = StObject.set(x, "viewBoxSize", js.undefined)
    }
  }
  
  trait TextDocumentData extends StObject {
    
    var ca: js.UndefOr[Double] = js.undefined
    
    var f: js.UndefOr[String] = js.undefined
    
    var fc: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    var j: js.UndefOr[Double] = js.undefined
    
    var lh: js.UndefOr[Double] = js.undefined
    
    var ls: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[Double] = js.undefined
    
    var t: js.UndefOr[String] = js.undefined
    
    var tr: js.UndefOr[Double] = js.undefined
  }
  object TextDocumentData {
    
    inline def apply(): TextDocumentData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDocumentData]
    }
    
    extension [Self <: TextDocumentData](x: Self) {
      
      inline def setCa(value: Double): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setFc(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
      
      inline def setFcUndefined: Self = StObject.set(x, "fc", js.undefined)
      
      inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      inline def setLh(value: Double): Self = StObject.set(x, "lh", value.asInstanceOf[js.Any])
      
      inline def setLhUndefined: Self = StObject.set(x, "lh", js.undefined)
      
      inline def setLs(value: Double): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      
      inline def setLsUndefined: Self = StObject.set(x, "ls", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      inline def setTr(value: Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    }
  }
  
  type _To = LottiePlayer
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LottiePlayer = default
}
