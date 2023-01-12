package typings.jspdf.mod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html2CanvasOptions extends StObject {
  
  /** Whether to allow cross-origin images to taint the canvas */
  var allowTaint: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to parse and render the element asynchronously */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /** Canvas background color, if none is specified in DOM. Set null for transparent */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  /** Existing canvas element to use as a base for drawing on */
  var canvas: js.UndefOr[Any] = js.undefined
  
  /** Whether to use ForeignObject rendering if the browser supports it */
  var foreignObjectRendering: js.UndefOr[Boolean] = js.undefined
  
  /** Define the heigt of the canvas in pixels. If null, renders with full height of the window. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Predicate function which removes the matching elements from the render. */
  var ignoreElements: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
  
  /** Timeout for loading images, in milliseconds. Setting it to 0 will result in no timeout. */
  var imageTimeout: js.UndefOr[Double] = js.undefined
  
  /** Whether to render each letter seperately. Necessary if letter-spacing is used. */
  var letterRendering: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to log events in the console. */
  var logging: js.UndefOr[Boolean] = js.undefined
  
  /** Callback function which is called when the Document has been cloned for rendering, can be used to modify the contents that will be rendered without affecting the original source document. */
  var onclone: js.UndefOr[js.Function1[/* doc */ HTMLDocument, Unit]] = js.undefined
  
  /** Url to the proxy which is to be used for loading cross-origin images. If left empty, cross-origin images won't be loaded. */
  var proxy: js.UndefOr[String] = js.undefined
  
  /** Whether to cleanup the cloned DOM elements html2canvas creates temporarily */
  var removeContainer: js.UndefOr[Boolean] = js.undefined
  
  /** The scale to use for rendering. Defaults to the browsers device pixel ratio. */
  var scale: js.UndefOr[Double] = js.undefined
  
  /** The x-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollX: js.UndefOr[Double] = js.undefined
  
  /** The y-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollY: js.UndefOr[Double] = js.undefined
  
  /** Use svg powered rendering where available (FF11+). */
  var svgRendering: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to test each image if it taints the canvas before drawing them */
  var taintTest: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to attempt to load cross-origin images as CORS served, before reverting back to proxy. */
  var useCORS: js.UndefOr[Boolean] = js.undefined
  
  /** Define the width of the canvas in pixels. If null, renders with full width of the window. */
  var width: js.UndefOr[Double] = js.undefined
  
  /** Window height to use when rendering Element, which may affect things like Media queries */
  var windowHeight: js.UndefOr[Double] = js.undefined
  
  /** Window width to use when rendering Element, which may affect things like Media queries */
  var windowWidth: js.UndefOr[Double] = js.undefined
  
  /** Crop canvas x-coordinate */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Crop canvas y-coordinate */
  var y: js.UndefOr[Double] = js.undefined
}
object Html2CanvasOptions {
  
  inline def apply(): Html2CanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html2CanvasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Html2CanvasOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowTaint(value: Boolean): Self = StObject.set(x, "allowTaint", value.asInstanceOf[js.Any])
    
    inline def setAllowTaintUndefined: Self = StObject.set(x, "allowTaint", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCanvas(value: Any): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setForeignObjectRendering(value: Boolean): Self = StObject.set(x, "foreignObjectRendering", value.asInstanceOf[js.Any])
    
    inline def setForeignObjectRenderingUndefined: Self = StObject.set(x, "foreignObjectRendering", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIgnoreElements(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "ignoreElements", js.Any.fromFunction1(value))
    
    inline def setIgnoreElementsUndefined: Self = StObject.set(x, "ignoreElements", js.undefined)
    
    inline def setImageTimeout(value: Double): Self = StObject.set(x, "imageTimeout", value.asInstanceOf[js.Any])
    
    inline def setImageTimeoutUndefined: Self = StObject.set(x, "imageTimeout", js.undefined)
    
    inline def setLetterRendering(value: Boolean): Self = StObject.set(x, "letterRendering", value.asInstanceOf[js.Any])
    
    inline def setLetterRenderingUndefined: Self = StObject.set(x, "letterRendering", js.undefined)
    
    inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setOnclone(value: /* doc */ HTMLDocument => Unit): Self = StObject.set(x, "onclone", js.Any.fromFunction1(value))
    
    inline def setOncloneUndefined: Self = StObject.set(x, "onclone", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRemoveContainer(value: Boolean): Self = StObject.set(x, "removeContainer", value.asInstanceOf[js.Any])
    
    inline def setRemoveContainerUndefined: Self = StObject.set(x, "removeContainer", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    
    inline def setSvgRendering(value: Boolean): Self = StObject.set(x, "svgRendering", value.asInstanceOf[js.Any])
    
    inline def setSvgRenderingUndefined: Self = StObject.set(x, "svgRendering", js.undefined)
    
    inline def setTaintTest(value: Boolean): Self = StObject.set(x, "taintTest", value.asInstanceOf[js.Any])
    
    inline def setTaintTestUndefined: Self = StObject.set(x, "taintTest", js.undefined)
    
    inline def setUseCORS(value: Boolean): Self = StObject.set(x, "useCORS", value.asInstanceOf[js.Any])
    
    inline def setUseCORSUndefined: Self = StObject.set(x, "useCORS", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    inline def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
