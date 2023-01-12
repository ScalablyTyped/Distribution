package typings.iframeResizer

import typings.iframeResizer.iframeResizerBooleans.`false`
import typings.iframeResizer.iframeResizerStrings.auto
import typings.iframeResizer.iframeResizerStrings.child
import typings.iframeResizer.iframeResizerStrings.parent
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // leave this declaration outside the namespace so the 'require'd import is still callable
  inline def apply(options: IFrameOptions, target: String): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
  inline def apply(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
  
  @JSImport("iframe-resizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iframeResizer(options: IFrameOptions, target: String): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("iframeResizer")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
  inline def iframeResizer(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("iframeResizer")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.iframeResizer.iframeResizerStrings.bodyOffset
    - typings.iframeResizer.iframeResizerStrings.bodyScroll
    - typings.iframeResizer.iframeResizerStrings.documentElementOffset
    - typings.iframeResizer.iframeResizerStrings.documentElementScroll
    - typings.iframeResizer.iframeResizerStrings.max
    - typings.iframeResizer.iframeResizerStrings.min
    - typings.iframeResizer.iframeResizerStrings.grow
    - typings.iframeResizer.iframeResizerStrings.lowestElement
    - typings.iframeResizer.iframeResizerStrings.taggedElement
  */
  trait HeightCalculationMethod extends StObject
  object HeightCalculationMethod {
    
    inline def bodyOffset: typings.iframeResizer.iframeResizerStrings.bodyOffset = "bodyOffset".asInstanceOf[typings.iframeResizer.iframeResizerStrings.bodyOffset]
    
    inline def bodyScroll: typings.iframeResizer.iframeResizerStrings.bodyScroll = "bodyScroll".asInstanceOf[typings.iframeResizer.iframeResizerStrings.bodyScroll]
    
    inline def documentElementOffset: typings.iframeResizer.iframeResizerStrings.documentElementOffset = "documentElementOffset".asInstanceOf[typings.iframeResizer.iframeResizerStrings.documentElementOffset]
    
    inline def documentElementScroll: typings.iframeResizer.iframeResizerStrings.documentElementScroll = "documentElementScroll".asInstanceOf[typings.iframeResizer.iframeResizerStrings.documentElementScroll]
    
    inline def grow: typings.iframeResizer.iframeResizerStrings.grow = "grow".asInstanceOf[typings.iframeResizer.iframeResizerStrings.grow]
    
    inline def lowestElement: typings.iframeResizer.iframeResizerStrings.lowestElement = "lowestElement".asInstanceOf[typings.iframeResizer.iframeResizerStrings.lowestElement]
    
    inline def max: typings.iframeResizer.iframeResizerStrings.max = "max".asInstanceOf[typings.iframeResizer.iframeResizerStrings.max]
    
    inline def min: typings.iframeResizer.iframeResizerStrings.min = "min".asInstanceOf[typings.iframeResizer.iframeResizerStrings.min]
    
    inline def taggedElement: typings.iframeResizer.iframeResizerStrings.taggedElement = "taggedElement".asInstanceOf[typings.iframeResizer.iframeResizerStrings.taggedElement]
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameComponent
    extends StObject
       with HTMLIFrameElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var iFrameResizer: IFrameObject = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  trait IFrameMessageData extends StObject {
    
    var iframe: IFrameComponent
    
    var message: Any
  }
  object IFrameMessageData {
    
    inline def apply(iframe: IFrameComponent, message: Any): IFrameMessageData = {
      val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameMessageData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameMessageData] (val x: Self) extends AnyVal {
      
      inline def setIframe(value: IFrameComponent): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameObject extends StObject {
    
    def close(): Unit = js.native
    
    def moveToAnchor(anchor: String): Unit = js.native
    
    def resize(): Unit = js.native
    
    def sendMessage(message: Any): Unit = js.native
    def sendMessage(message: Any, targetOrigin: String): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  trait IFrameOptions extends StObject {
    
    /**
      * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
      * Disable if using size method with custom dimensions.
      */
    var autoResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override the body background style in the iFrame.
      */
    var bodyBackground: js.UndefOr[String] = js.undefined
    
    /**
      * Override the default body margin style in the iFrame. A string can be any valid value for the
      * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
      */
    var bodyMargin: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Override the default body padding style in the iFrame. A string can be any valid value for the
      * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
      */
    var bodyPadding: js.UndefOr[Double | String] = js.undefined
    
    /**
      * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
      * If your iFrame navigates between different domains, ports or protocols; then you will need to
      * provide an array of URLs or disable this option.
      */
    var checkOrigin: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
      */
    var closedCallback: js.UndefOr[js.Function1[/* iframeId */ String, Unit]] = js.undefined
    
    /**
      * Height calculation method.
      */
    var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.undefined
    
    /**
      * Set iFrame Id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
      */
    var inPageLinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial setup callback function.
      */
    var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, Unit]] = js.undefined
    
    /**
      * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
      * setInterval, to check for changes to the page size.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Setting the log option to true will make the scripts in both the host page and the iFrame output
      * everything they do to the JavaScript console so you can see the communication between the two scripts.
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set maximum height of iFrame.
      */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Set maximum width of iFrame.
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
      */
    var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, Unit]] = js.undefined
    
    /**
      * Set minimum height of iFrame.
      */
    var minHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Set minimum width of iFrame.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
      * can be resized independently of the browser window. Selecting this value can cause issues with some
      * height calculation methods on mobile devices.
      */
    var resizeFrom: js.UndefOr[parent | child] = js.undefined
    
    /**
      * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
      * and the type of event that triggered the iFrame to resize.
      */
    var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, Unit]] = js.undefined
    
    /**
      * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
      * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
      * If this callback function returns false, it will stop the library from repositioning the page, so that
      * you can implement your own animated page scrolling instead.
      */
    var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, Boolean]] = js.undefined
    
    /**
      * Enable scroll bars in iFrame.
      */
    var scrolling: js.UndefOr[Boolean | auto] = js.undefined
    
    /**
      * Resize iFrame to content height.
      */
    var sizeHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Resize iFrame to content width.
      */
    var sizeWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
      */
    var tolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Width calculation method.
      */
    var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.undefined
  }
  object IFrameOptions {
    
    inline def apply(): IFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFrameOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setBodyBackground(value: String): Self = StObject.set(x, "bodyBackground", value.asInstanceOf[js.Any])
      
      inline def setBodyBackgroundUndefined: Self = StObject.set(x, "bodyBackground", js.undefined)
      
      inline def setBodyMargin(value: Double | String): Self = StObject.set(x, "bodyMargin", value.asInstanceOf[js.Any])
      
      inline def setBodyMarginUndefined: Self = StObject.set(x, "bodyMargin", js.undefined)
      
      inline def setBodyPadding(value: Double | String): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
      
      inline def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
      
      inline def setCheckOrigin(value: Boolean | js.Array[String]): Self = StObject.set(x, "checkOrigin", value.asInstanceOf[js.Any])
      
      inline def setCheckOriginUndefined: Self = StObject.set(x, "checkOrigin", js.undefined)
      
      inline def setCheckOriginVarargs(value: String*): Self = StObject.set(x, "checkOrigin", js.Array(value*))
      
      inline def setClosedCallback(value: /* iframeId */ String => Unit): Self = StObject.set(x, "closedCallback", js.Any.fromFunction1(value))
      
      inline def setClosedCallbackUndefined: Self = StObject.set(x, "closedCallback", js.undefined)
      
      inline def setHeightCalculationMethod(value: HeightCalculationMethod): Self = StObject.set(x, "heightCalculationMethod", value.asInstanceOf[js.Any])
      
      inline def setHeightCalculationMethodUndefined: Self = StObject.set(x, "heightCalculationMethod", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInPageLinks(value: Boolean): Self = StObject.set(x, "inPageLinks", value.asInstanceOf[js.Any])
      
      inline def setInPageLinksUndefined: Self = StObject.set(x, "inPageLinks", js.undefined)
      
      inline def setInitCallback(value: /* iframe */ IFrameComponent => Unit): Self = StObject.set(x, "initCallback", js.Any.fromFunction1(value))
      
      inline def setInitCallbackUndefined: Self = StObject.set(x, "initCallback", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMessageCallback(value: /* data */ IFrameMessageData => Unit): Self = StObject.set(x, "messageCallback", js.Any.fromFunction1(value))
      
      inline def setMessageCallbackUndefined: Self = StObject.set(x, "messageCallback", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setResizeFrom(value: parent | child): Self = StObject.set(x, "resizeFrom", value.asInstanceOf[js.Any])
      
      inline def setResizeFromUndefined: Self = StObject.set(x, "resizeFrom", js.undefined)
      
      inline def setResizedCallback(value: /* data */ IFrameResizedData => Unit): Self = StObject.set(x, "resizedCallback", js.Any.fromFunction1(value))
      
      inline def setResizedCallbackUndefined: Self = StObject.set(x, "resizedCallback", js.undefined)
      
      inline def setScrollCallback(value: /* data */ IFrameScrollData => Boolean): Self = StObject.set(x, "scrollCallback", js.Any.fromFunction1(value))
      
      inline def setScrollCallbackUndefined: Self = StObject.set(x, "scrollCallback", js.undefined)
      
      inline def setScrolling(value: Boolean | auto): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSizeHeight(value: Boolean): Self = StObject.set(x, "sizeHeight", value.asInstanceOf[js.Any])
      
      inline def setSizeHeightUndefined: Self = StObject.set(x, "sizeHeight", js.undefined)
      
      inline def setSizeWidth(value: Boolean): Self = StObject.set(x, "sizeWidth", value.asInstanceOf[js.Any])
      
      inline def setSizeWidthUndefined: Self = StObject.set(x, "sizeWidth", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      
      inline def setWidthCalculationMethod(value: WidthCalculationMethod): Self = StObject.set(x, "widthCalculationMethod", value.asInstanceOf[js.Any])
      
      inline def setWidthCalculationMethodUndefined: Self = StObject.set(x, "widthCalculationMethod", js.undefined)
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFramePage extends StObject {
    
    /**
      * Turn autoResizing of the iFrame on and off. Returns bool of current state.
      */
    def autoResize(): Boolean = js.native
    def autoResize(resize: Boolean): Boolean = js.native
    
    /**
      * Remove the iFrame from the parent page.
      */
    def close(): Unit = js.native
    
    /**
      * Returns the ID of the iFrame that the page is contained in.
      */
    def getId(): String = js.native
    
    /**
      * Ask the containing page for its positioning coordinates.
      *
      * Your callback function will be recalled when the parent page is scrolled or resized.
      *
      * Pass false to disable the callback.
      */
    def getPageInfo(callback: js.Function1[/* data */ PageInfo, Unit]): Unit = js.native
    @JSName("getPageInfo")
    def getPageInfo_false(callback: `false`): Unit = js.native
    
    /**
      * Scroll the parent page to the coordinates x and y
      */
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Scroll the parent page to the coordinates x and y relative to the position of the iFrame.
      */
    def scrollToOffset(x: Double, y: Double): Unit = js.native
    
    /**
      * Send data to the containing page, message can be any data type that can be serialized into JSON. The `targetOrigin`
      * option is used to restrict where the message is sent to; to stop an attacker mimicking your parent page.
      * See the MDN documentation on postMessage for more details.
      */
    def sendMessage(message: Any): Unit = js.native
    def sendMessage(message: Any, targetOrigin: String): Unit = js.native
    
    /**
      * Change the method use to workout the height of the iFrame.
      */
    def setHeightCalculationMethod(method: HeightCalculationMethod): Unit = js.native
    
    /**
      * Set default target origin.
      */
    def setTargetOrigin(targetOrigin: String): Unit = js.native
    
    /**
      * Change the method use to workout the width of the iFrame.
      */
    def setWidthCalculationMethod(method: WidthCalculationMethod): Unit = js.native
    
    /**
      * Manually force iFrame to resize. To use passed arguments you need first to disable the `autoResize` option to
      * prevent auto resizing and enable the `sizeWidth` option if you wish to set the width.
      */
    def size(): Unit = js.native
    def size(customHeight: String): Unit = js.native
    def size(customHeight: String, customWidth: String): Unit = js.native
    def size(customHeight: Unit, customWidth: String): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  trait IFramePageOptions extends StObject {
    
    /**
      * These option can be used to override the option set in the parent page
      */
    var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[Double]] = js.undefined
    
    /**
      * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
      */
    var messageCallback: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
    
    /**
      * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
      */
    var readyCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * This option allows you to restrict the domain of the parent page,
      * to prevent other sites mimicking your parent page.
      */
    var targetOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * These option can be used to override the option set in the parent page
      */
    var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[Double]] = js.undefined
  }
  object IFramePageOptions {
    
    inline def apply(): IFramePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFramePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFramePageOptions] (val x: Self) extends AnyVal {
      
      inline def setHeightCalculationMethod(value: HeightCalculationMethod | js.Function0[Double]): Self = StObject.set(x, "heightCalculationMethod", value.asInstanceOf[js.Any])
      
      inline def setHeightCalculationMethodFunction0(value: () => Double): Self = StObject.set(x, "heightCalculationMethod", js.Any.fromFunction0(value))
      
      inline def setHeightCalculationMethodUndefined: Self = StObject.set(x, "heightCalculationMethod", js.undefined)
      
      inline def setMessageCallback(value: /* message */ Any => Unit): Self = StObject.set(x, "messageCallback", js.Any.fromFunction1(value))
      
      inline def setMessageCallbackUndefined: Self = StObject.set(x, "messageCallback", js.undefined)
      
      inline def setReadyCallback(value: () => Unit): Self = StObject.set(x, "readyCallback", js.Any.fromFunction0(value))
      
      inline def setReadyCallbackUndefined: Self = StObject.set(x, "readyCallback", js.undefined)
      
      inline def setTargetOrigin(value: String): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setWidthCalculationMethod(value: WidthCalculationMethod | js.Function0[Double]): Self = StObject.set(x, "widthCalculationMethod", value.asInstanceOf[js.Any])
      
      inline def setWidthCalculationMethodFunction0(value: () => Double): Self = StObject.set(x, "widthCalculationMethod", js.Any.fromFunction0(value))
      
      inline def setWidthCalculationMethodUndefined: Self = StObject.set(x, "widthCalculationMethod", js.undefined)
    }
  }
  
  // tslint:disable-next-line:interface-name
  trait IFrameResizedData extends StObject {
    
    var height: Double
    
    var iframe: IFrameComponent
    
    var `type`: String
    
    var width: Double
  }
  object IFrameResizedData {
    
    inline def apply(height: Double, iframe: IFrameComponent, `type`: String, width: Double): IFrameResizedData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameResizedData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameResizedData] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIframe(value: IFrameComponent): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  trait IFrameScrollData extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object IFrameScrollData {
    
    inline def apply(x: Double, y: Double): IFrameScrollData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameScrollData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameScrollData] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageInfo extends StObject {
    
    /**
      * The height of the viewport in pixels
      */
    var clientHeight: Double
    
    /**
      * The width of the viewport in pixels
      */
    var clientWidth: Double
    
    /**
      * The height of the iframe in pixels
      */
    var iframeHeight: Double
    
    /**
      * The width of the iframe in pixels
      */
    var iframeWidth: Double
    
    /**
      * The number of pixels between the left edge of the containing page and the left edge of the iframe
      */
    var offsetLeft: Double
    
    /**
      * The number of pixels between the top edge of the containing page and the top edge of the iframe
      */
    var offsetTop: Double
    
    /**
      * The number of pixels between the left edge of the iframe and the left edge of the iframe viewport
      */
    var scrollLeft: Double
    
    /**
      * The number of pixels between the top edge of the iframe and the top edge of the iframe viewport
      */
    var scrollTop: Double
  }
  object PageInfo {
    
    inline def apply(
      clientHeight: Double,
      clientWidth: Double,
      iframeHeight: Double,
      iframeWidth: Double,
      offsetLeft: Double,
      offsetTop: Double,
      scrollLeft: Double,
      scrollTop: Double
    ): PageInfo = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], iframeHeight = iframeHeight.asInstanceOf[js.Any], iframeWidth = iframeWidth.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setIframeHeight(value: Double): Self = StObject.set(x, "iframeHeight", value.asInstanceOf[js.Any])
      
      inline def setIframeWidth(value: Double): Self = StObject.set(x, "iframeWidth", value.asInstanceOf[js.Any])
      
      inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iframeResizer.iframeResizerStrings.bodyOffset
    - typings.iframeResizer.iframeResizerStrings.bodyScroll
    - typings.iframeResizer.iframeResizerStrings.documentElementOffset
    - typings.iframeResizer.iframeResizerStrings.documentElementScroll
    - typings.iframeResizer.iframeResizerStrings.max
    - typings.iframeResizer.iframeResizerStrings.min
    - typings.iframeResizer.iframeResizerStrings.scroll
    - typings.iframeResizer.iframeResizerStrings.rightMostElement
    - typings.iframeResizer.iframeResizerStrings.taggedElement
  */
  trait WidthCalculationMethod extends StObject
  object WidthCalculationMethod {
    
    inline def bodyOffset: typings.iframeResizer.iframeResizerStrings.bodyOffset = "bodyOffset".asInstanceOf[typings.iframeResizer.iframeResizerStrings.bodyOffset]
    
    inline def bodyScroll: typings.iframeResizer.iframeResizerStrings.bodyScroll = "bodyScroll".asInstanceOf[typings.iframeResizer.iframeResizerStrings.bodyScroll]
    
    inline def documentElementOffset: typings.iframeResizer.iframeResizerStrings.documentElementOffset = "documentElementOffset".asInstanceOf[typings.iframeResizer.iframeResizerStrings.documentElementOffset]
    
    inline def documentElementScroll: typings.iframeResizer.iframeResizerStrings.documentElementScroll = "documentElementScroll".asInstanceOf[typings.iframeResizer.iframeResizerStrings.documentElementScroll]
    
    inline def max: typings.iframeResizer.iframeResizerStrings.max = "max".asInstanceOf[typings.iframeResizer.iframeResizerStrings.max]
    
    inline def min: typings.iframeResizer.iframeResizerStrings.min = "min".asInstanceOf[typings.iframeResizer.iframeResizerStrings.min]
    
    inline def rightMostElement: typings.iframeResizer.iframeResizerStrings.rightMostElement = "rightMostElement".asInstanceOf[typings.iframeResizer.iframeResizerStrings.rightMostElement]
    
    inline def scroll: typings.iframeResizer.iframeResizerStrings.scroll = "scroll".asInstanceOf[typings.iframeResizer.iframeResizerStrings.scroll]
    
    inline def taggedElement: typings.iframeResizer.iframeResizerStrings.taggedElement = "taggedElement".asInstanceOf[typings.iframeResizer.iframeResizerStrings.taggedElement]
  }
}
