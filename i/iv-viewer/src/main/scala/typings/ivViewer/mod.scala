package typings.ivViewer

import typings.ivViewer.anon.Container
import typings.ivViewer.anon.X
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iv-viewer", JSImport.Namespace)
  @js.native
  class ^ () extends ImageViewer {
    def this(element: Element) = this()
    def this(element: Null, options: Options) = this()
    def this(element: Element, options: Options) = this()
  }
  @JSImport("iv-viewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iv-viewer", "FullScreenViewer")
  @js.native
  class FullScreenViewer () extends ImageViewer {
    def this(options: Options) = this()
    
    @JSName("_elements")
    var _elements_FullScreenViewer: FullScreenElements = js.native
    
    @JSName("_events")
    var _events_FullScreenViewer: FullScreenEvents = js.native
    
    /* protected */ def _initFullScreenEvents(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(imageSrc: String): Unit = js.native
    def show(imageSrc: String, hiResImageSrc: String): Unit = js.native
  }
  
  @JSImport("iv-viewer", "ImageViewer")
  @js.native
  class ImageViewer () extends StObject {
    def this(element: Element) = this()
    def this(element: Null, options: Options) = this()
    def this(element: Element, options: Options) = this()
    
    /* protected */ def _calculateDimensions(): Unit = js.native
    
    /* protected */ def _doubleTapToZoom(): Unit = js.native
    
    var _elements: Elements = js.native
    
    var _events: Events = js.native
    
    /* protected */ def _findContainerAndImageSrc(): Container = js.native
    /* protected */ def _findContainerAndImageSrc(element: String): Container = js.native
    /* protected */ def _findContainerAndImageSrc(element: Element): Container = js.native
    
    var _frames: Frames = js.native
    
    /* protected */ def _getImageCurrentDim(): Unit = js.native
    
    var _images: Images = js.native
    
    /* protected */ def _init(): Unit = js.native
    
    /* protected */ def _initDom(): Unit = js.native
    
    /* protected */ def _initEvents(): Unit = js.native
    
    /* protected */ def _initImageSlider(): Unit = js.native
    
    /* protected */ def _initSnapSlider(): Unit = js.native
    
    /* protected */ def _initZoomSlider(): Unit = js.native
    
    /* protected */ def _loadHighResImage(): Unit = js.native
    
    /* protected */ def _loadImages(): Unit = js.native
    
    var _options: Options = js.native
    
    /* protected */ def _pinchAndZoom(): Unit = js.native
    
    /* protected */ def _scrollZoom(): Unit = js.native
    
    var _sliders: Sliders = js.native
    
    /* protected */ def _snapViewEvents(): Unit = js.native
    
    var _state: State = js.native
    
    def destroy(): Unit = js.native
    
    def hideSnapView(): Unit = js.native
    
    def load(imageSrc: String): Unit = js.native
    def load(imageSrc: String, hiResImageSrc: String): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def resetZoom(): Unit = js.native
    def resetZoom(animate: Boolean): Unit = js.native
    
    def showSnapView(): Unit = js.native
    def showSnapView(noTimeout: Boolean): Unit = js.native
    
    def zoom(perc: Double): Unit = js.native
    def zoom(perc: Double, point: X): Unit = js.native
  }
  
  /* static member */
  @JSImport("iv-viewer", "defaults")
  @js.native
  def defaults: Options = js.native
  @scala.inline
  def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  trait Dim extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object Dim {
    
    @scala.inline
    def apply(h: Double, w: Double): Dim = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dim]
    }
    
    @scala.inline
    implicit class DimMutableBuilder[Self <: Dim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var container: Element | Null
    
    var domElement: Element | Null
    
    var image: js.UndefOr[Element | Null] = js.undefined
    
    var imageWrap: js.UndefOr[Element | Null] = js.undefined
    
    var snapHandle: js.UndefOr[Element | Null] = js.undefined
    
    var snapImage: js.UndefOr[Element | Null] = js.undefined
    
    var snapImageWrap: js.UndefOr[Element | Null] = js.undefined
    
    var snapView: js.UndefOr[Element | Null] = js.undefined
    
    var zoomHandle: js.UndefOr[Element | Null] = js.undefined
  }
  object Elements {
    
    @scala.inline
    def apply(): Elements = {
      val __obj = js.Dynamic.literal(container = null, domElement = null)
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setDomElement(value: Element): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomElementNull: Self = StObject.set(x, "domElement", null)
      
      @scala.inline
      def setImage(value: Element): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setImageWrap(value: Element): Self = StObject.set(x, "imageWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageWrapNull: Self = StObject.set(x, "imageWrap", null)
      
      @scala.inline
      def setImageWrapUndefined: Self = StObject.set(x, "imageWrap", js.undefined)
      
      @scala.inline
      def setSnapHandle(value: Element): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapHandleNull: Self = StObject.set(x, "snapHandle", null)
      
      @scala.inline
      def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
      
      @scala.inline
      def setSnapImage(value: Element): Self = StObject.set(x, "snapImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapImageNull: Self = StObject.set(x, "snapImage", null)
      
      @scala.inline
      def setSnapImageUndefined: Self = StObject.set(x, "snapImage", js.undefined)
      
      @scala.inline
      def setSnapImageWrap(value: Element): Self = StObject.set(x, "snapImageWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapImageWrapNull: Self = StObject.set(x, "snapImageWrap", null)
      
      @scala.inline
      def setSnapImageWrapUndefined: Self = StObject.set(x, "snapImageWrap", js.undefined)
      
      @scala.inline
      def setSnapView(value: Element): Self = StObject.set(x, "snapView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapViewNull: Self = StObject.set(x, "snapView", null)
      
      @scala.inline
      def setSnapViewUndefined: Self = StObject.set(x, "snapView", js.undefined)
      
      @scala.inline
      def setZoomHandle(value: Element): Self = StObject.set(x, "zoomHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomHandleNull: Self = StObject.set(x, "zoomHandle", null)
      
      @scala.inline
      def setZoomHandleUndefined: Self = StObject.set(x, "zoomHandle", js.undefined)
    }
  }
  
  trait Events extends StObject {
    
    var hiResImageLoad: js.UndefOr[IVEvent] = js.undefined
    
    var imageLoad: js.UndefOr[IVEvent] = js.undefined
    
    var mouseEnterSnapView: js.UndefOr[IVEvent] = js.undefined
    
    var mouseLeaveSnapView: js.UndefOr[IVEvent] = js.undefined
    
    var onWindowResize: js.UndefOr[IVEvent] = js.undefined
    
    var pinchStart: js.UndefOr[IVEvent] = js.undefined
    
    var snapViewOnMouseMove: js.UndefOr[IVEvent] = js.undefined
  }
  object Events {
    
    @scala.inline
    def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHiResImageLoad(value: () => Unit): Self = StObject.set(x, "hiResImageLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHiResImageLoadUndefined: Self = StObject.set(x, "hiResImageLoad", js.undefined)
      
      @scala.inline
      def setImageLoad(value: () => Unit): Self = StObject.set(x, "imageLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImageLoadUndefined: Self = StObject.set(x, "imageLoad", js.undefined)
      
      @scala.inline
      def setMouseEnterSnapView(value: () => Unit): Self = StObject.set(x, "mouseEnterSnapView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseEnterSnapViewUndefined: Self = StObject.set(x, "mouseEnterSnapView", js.undefined)
      
      @scala.inline
      def setMouseLeaveSnapView(value: () => Unit): Self = StObject.set(x, "mouseLeaveSnapView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseLeaveSnapViewUndefined: Self = StObject.set(x, "mouseLeaveSnapView", js.undefined)
      
      @scala.inline
      def setOnWindowResize(value: () => Unit): Self = StObject.set(x, "onWindowResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnWindowResizeUndefined: Self = StObject.set(x, "onWindowResize", js.undefined)
      
      @scala.inline
      def setPinchStart(value: () => Unit): Self = StObject.set(x, "pinchStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPinchStartUndefined: Self = StObject.set(x, "pinchStart", js.undefined)
      
      @scala.inline
      def setSnapViewOnMouseMove(value: () => Unit): Self = StObject.set(x, "snapViewOnMouseMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSnapViewOnMouseMoveUndefined: Self = StObject.set(x, "snapViewOnMouseMove", js.undefined)
    }
  }
  
  trait Frames extends StObject {
    
    var slideMomentumCheck: js.UndefOr[Double] = js.undefined
    
    var sliderMomentumFrame: js.UndefOr[Double] = js.undefined
    
    var snapViewTimeout: js.UndefOr[Double] = js.undefined
    
    var zoomFrame: js.UndefOr[Double] = js.undefined
  }
  object Frames {
    
    @scala.inline
    def apply(): Frames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frames]
    }
    
    @scala.inline
    implicit class FramesMutableBuilder[Self <: Frames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlideMomentumCheck(value: Double): Self = StObject.set(x, "slideMomentumCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideMomentumCheckUndefined: Self = StObject.set(x, "slideMomentumCheck", js.undefined)
      
      @scala.inline
      def setSliderMomentumFrame(value: Double): Self = StObject.set(x, "sliderMomentumFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderMomentumFrameUndefined: Self = StObject.set(x, "sliderMomentumFrame", js.undefined)
      
      @scala.inline
      def setSnapViewTimeout(value: Double): Self = StObject.set(x, "snapViewTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapViewTimeoutUndefined: Self = StObject.set(x, "snapViewTimeout", js.undefined)
      
      @scala.inline
      def setZoomFrame(value: Double): Self = StObject.set(x, "zoomFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFrameUndefined: Self = StObject.set(x, "zoomFrame", js.undefined)
    }
  }
  
  trait FullScreenElements
    extends StObject
       with Elements {
    
    var fullScreen: Element | Null
  }
  object FullScreenElements {
    
    @scala.inline
    def apply(): FullScreenElements = {
      val __obj = js.Dynamic.literal(container = null, domElement = null, fullScreen = null)
      __obj.asInstanceOf[FullScreenElements]
    }
    
    @scala.inline
    implicit class FullScreenElementsMutableBuilder[Self <: FullScreenElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullScreen(value: Element): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenNull: Self = StObject.set(x, "fullScreen", null)
    }
  }
  
  trait FullScreenEvents
    extends StObject
       with Events {
    
    var onCloseBtnClick: js.UndefOr[IVEvent] = js.undefined
  }
  object FullScreenEvents {
    
    @scala.inline
    def apply(): FullScreenEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenEvents]
    }
    
    @scala.inline
    implicit class FullScreenEventsMutableBuilder[Self <: FullScreenEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCloseBtnClick(value: () => Unit): Self = StObject.set(x, "onCloseBtnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseBtnClickUndefined: Self = StObject.set(x, "onCloseBtnClick", js.undefined)
    }
  }
  
  type IVEvent = js.Function0[Unit]
  
  type IVImage = String | Null
  
  trait Images extends StObject {
    
    var hiResImageSrc: IVImage
    
    var imageSrc: IVImage
  }
  object Images {
    
    @scala.inline
    def apply(): Images = {
      val __obj = js.Dynamic.literal(hiResImageSrc = null, imageSrc = null)
      __obj.asInstanceOf[Images]
    }
    
    @scala.inline
    implicit class ImagesMutableBuilder[Self <: Images] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHiResImageSrc(value: IVImage): Self = StObject.set(x, "hiResImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiResImageSrcNull: Self = StObject.set(x, "hiResImageSrc", null)
      
      @scala.inline
      def setImageSrc(value: IVImage): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSrcNull: Self = StObject.set(x, "imageSrc", null)
    }
  }
  
  trait Options extends StObject {
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var refreshOnResize: js.UndefOr[Boolean] = js.undefined
    
    var snapView: js.UndefOr[Boolean] = js.undefined
    
    var zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined
    
    var zoomValue: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshOnResizeUndefined: Self = StObject.set(x, "refreshOnResize", js.undefined)
      
      @scala.inline
      def setSnapView(value: Boolean): Self = StObject.set(x, "snapView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapViewUndefined: Self = StObject.set(x, "snapView", js.undefined)
      
      @scala.inline
      def setZoomOnMouseWheel(value: Boolean): Self = StObject.set(x, "zoomOnMouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnMouseWheelUndefined: Self = StObject.set(x, "zoomOnMouseWheel", js.undefined)
      
      @scala.inline
      def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomValueUndefined: Self = StObject.set(x, "zoomValue", js.undefined)
    }
  }
  
  trait Slider extends StObject {
    
    var container: Element | Null
    
    def destroy(): Unit
    
    def endHandler(): Unit
    
    def init(): Unit
    
    def isSliderEnabled(): Boolean
    
    def moveHandler(event: Event): Unit
    
    def onEnd(): Unit
    
    def onMove(): Unit
    
    def onStart(): Unit
    
    def removeListeners(): Unit
    
    def startHandler(event: Event): Unit
  }
  object Slider {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      endHandler: () => Unit,
      init: () => Unit,
      isSliderEnabled: () => Boolean,
      moveHandler: Event => Unit,
      onEnd: () => Unit,
      onMove: () => Unit,
      onStart: () => Unit,
      removeListeners: () => Unit,
      startHandler: Event => Unit
    ): Slider = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), endHandler = js.Any.fromFunction0(endHandler), init = js.Any.fromFunction0(init), isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), moveHandler = js.Any.fromFunction1(moveHandler), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart), removeListeners = js.Any.fromFunction0(removeListeners), startHandler = js.Any.fromFunction1(startHandler), container = null)
      __obj.asInstanceOf[Slider]
    }
    
    @scala.inline
    implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndHandler(value: () => Unit): Self = StObject.set(x, "endHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSliderEnabled(value: () => Boolean): Self = StObject.set(x, "isSliderEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveHandler(value: Event => Unit): Self = StObject.set(x, "moveHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMove(value: () => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListeners(value: () => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartHandler(value: Event => Unit): Self = StObject.set(x, "startHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait SliderOptions extends StObject {
    
    def isSliderEnabled(): Boolean
    
    def onEnd(): Unit
    
    def onMove(): Unit
    
    def onStart(): Unit
  }
  object SliderOptions {
    
    @scala.inline
    def apply(isSliderEnabled: () => Boolean, onEnd: () => Unit, onMove: () => Unit, onStart: () => Unit): SliderOptions = {
      val __obj = js.Dynamic.literal(isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart))
      __obj.asInstanceOf[SliderOptions]
    }
    
    @scala.inline
    implicit class SliderOptionsMutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSliderEnabled(value: () => Boolean): Self = StObject.set(x, "isSliderEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMove(value: () => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    }
  }
  
  trait Sliders extends StObject {
    
    var imageSlider: js.UndefOr[Slider] = js.undefined
    
    var snapSlider: js.UndefOr[Slider] = js.undefined
    
    var zoomSlider: js.UndefOr[Slider] = js.undefined
  }
  object Sliders {
    
    @scala.inline
    def apply(): Sliders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sliders]
    }
    
    @scala.inline
    implicit class SlidersMutableBuilder[Self <: Sliders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlider(value: Slider): Self = StObject.set(x, "imageSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSliderUndefined: Self = StObject.set(x, "imageSlider", js.undefined)
      
      @scala.inline
      def setSnapSlider(value: Slider): Self = StObject.set(x, "snapSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapSliderUndefined: Self = StObject.set(x, "snapSlider", js.undefined)
      
      @scala.inline
      def setZoomSlider(value: Slider): Self = StObject.set(x, "zoomSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSliderUndefined: Self = StObject.set(x, "zoomSlider", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var containerDim: js.UndefOr[Dim] = js.undefined
    
    var imageDim: js.UndefOr[Dim] = js.undefined
    
    var loaded: js.UndefOr[Boolean] = js.undefined
    
    var snapHandleDim: js.UndefOr[Dim] = js.undefined
    
    var snapImageDim: js.UndefOr[Dim] = js.undefined
    
    var snapViewVisible: js.UndefOr[Boolean] = js.undefined
    
    var zoomSliderLength: js.UndefOr[Double] = js.undefined
    
    var zoomValue: js.UndefOr[Double] = js.undefined
    
    var zooming: js.UndefOr[Boolean] = js.undefined
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerDim(value: Dim): Self = StObject.set(x, "containerDim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerDimUndefined: Self = StObject.set(x, "containerDim", js.undefined)
      
      @scala.inline
      def setImageDim(value: Dim): Self = StObject.set(x, "imageDim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDimUndefined: Self = StObject.set(x, "imageDim", js.undefined)
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setSnapHandleDim(value: Dim): Self = StObject.set(x, "snapHandleDim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapHandleDimUndefined: Self = StObject.set(x, "snapHandleDim", js.undefined)
      
      @scala.inline
      def setSnapImageDim(value: Dim): Self = StObject.set(x, "snapImageDim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapImageDimUndefined: Self = StObject.set(x, "snapImageDim", js.undefined)
      
      @scala.inline
      def setSnapViewVisible(value: Boolean): Self = StObject.set(x, "snapViewVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapViewVisibleUndefined: Self = StObject.set(x, "snapViewVisible", js.undefined)
      
      @scala.inline
      def setZoomSliderLength(value: Double): Self = StObject.set(x, "zoomSliderLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSliderLengthUndefined: Self = StObject.set(x, "zoomSliderLength", js.undefined)
      
      @scala.inline
      def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomValueUndefined: Self = StObject.set(x, "zoomValue", js.undefined)
      
      @scala.inline
      def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
}
