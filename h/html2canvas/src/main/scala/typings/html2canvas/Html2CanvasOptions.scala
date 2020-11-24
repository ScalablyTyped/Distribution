package typings.html2canvas

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Html2CanvasOptions extends js.Object {
  
  /** Whether to allow cross-origin images to taint the canvas */
  var allowTaint: js.UndefOr[Boolean] = js.native
  
  /** Whether to parse and render the element asynchronously */
  var async: js.UndefOr[Boolean] = js.native
  
  /** Canvas background color, if none is specified in DOM. Set null for transparent */
  var backgroundColor: js.UndefOr[String | Null] = js.native
  
  /** Existing canvas element to use as a base for drawing on */
  var canvas: js.UndefOr[js.Any] = js.native
  
  /** Whether to use ForeignObject rendering if the browser supports it */
  var foreignObjectRendering: js.UndefOr[Boolean] = js.native
  
  /** Define the heigt of the canvas in pixels. If null, renders with full height of the window. */
  var height: js.UndefOr[Double] = js.native
  
  /** Predicate function which removes the matching elements from the render. */
  var ignoreElements: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.native
  
  /** Timeout for loading images, in milliseconds. Setting it to 0 will result in no timeout. */
  var imageTimeout: js.UndefOr[Double] = js.native
  
  /** Whether to render each letter seperately. Necessary if letter-spacing is used. */
  var letterRendering: js.UndefOr[Boolean] = js.native
  
  /** Whether to log events in the console. */
  var logging: js.UndefOr[Boolean] = js.native
  
  /** Callback function which is called when the Document has been cloned for rendering, can be used to modify the contents that will be rendered without affecting the original source document. */
  var onclone: js.UndefOr[js.Function1[/* doc */ HTMLDocument, Unit]] = js.native
  
  /** Url to the proxy which is to be used for loading cross-origin images. If left empty, cross-origin images won't be loaded. */
  var proxy: js.UndefOr[String] = js.native
  
  /** Whether to cleanup the cloned DOM elements html2canvas creates temporarily */
  var removeContainer: js.UndefOr[Boolean] = js.native
  
  /** The scale to use for rendering. Defaults to the browsers device pixel ratio. */
  var scale: js.UndefOr[Double] = js.native
  
  /** The x-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollX: js.UndefOr[Double] = js.native
  
  /** The y-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollY: js.UndefOr[Double] = js.native
  
  /** Use svg powered rendering where available (FF11+). */
  var svgRendering: js.UndefOr[Boolean] = js.native
  
  /** Whether to test each image if it taints the canvas before drawing them */
  var taintTest: js.UndefOr[Boolean] = js.native
  
  /** Whether to attempt to load cross-origin images as CORS served, before reverting back to proxy. */
  var useCORS: js.UndefOr[Boolean] = js.native
  
  /** Define the width of the canvas in pixels. If null, renders with full width of the window. */
  var width: js.UndefOr[Double] = js.native
  
  /** Window height to use when rendering Element, which may affect things like Media queries */
  var windowHeight: js.UndefOr[Double] = js.native
  
  /** Window width to use when rendering Element, which may affect things like Media queries */
  var windowWidth: js.UndefOr[Double] = js.native
  
  /** Crop canvas x-coordinate */
  var x: js.UndefOr[Double] = js.native
  
  /** Crop canvas y-coordinate */
  var y: js.UndefOr[Double] = js.native
}
object Html2CanvasOptions {
  
  @scala.inline
  def apply(): Html2CanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html2CanvasOptions]
  }
  
  @scala.inline
  implicit class Html2CanvasOptionsOps[Self <: Html2CanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowTaint(value: Boolean): Self = this.set("allowTaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaint: Self = this.set("allowTaint", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    
    @scala.inline
    def setCanvas(value: js.Any): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setForeignObjectRendering(value: Boolean): Self = this.set("foreignObjectRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignObjectRendering: Self = this.set("foreignObjectRendering", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIgnoreElements(value: /* element */ HTMLElement => Boolean): Self = this.set("ignoreElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIgnoreElements: Self = this.set("ignoreElements", js.undefined)
    
    @scala.inline
    def setImageTimeout(value: Double): Self = this.set("imageTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTimeout: Self = this.set("imageTimeout", js.undefined)
    
    @scala.inline
    def setLetterRendering(value: Boolean): Self = this.set("letterRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterRendering: Self = this.set("letterRendering", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setOnclone(value: /* doc */ HTMLDocument => Unit): Self = this.set("onclone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclone: Self = this.set("onclone", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRemoveContainer(value: Boolean): Self = this.set("removeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveContainer: Self = this.set("removeContainer", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScrollX(value: Double): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: Double): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
    
    @scala.inline
    def setSvgRendering(value: Boolean): Self = this.set("svgRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgRendering: Self = this.set("svgRendering", js.undefined)
    
    @scala.inline
    def setTaintTest(value: Boolean): Self = this.set("taintTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaintTest: Self = this.set("taintTest", js.undefined)
    
    @scala.inline
    def setUseCORS(value: Boolean): Self = this.set("useCORS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCORS: Self = this.set("useCORS", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowHeight: Self = this.set("windowHeight", js.undefined)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowWidth: Self = this.set("windowWidth", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
