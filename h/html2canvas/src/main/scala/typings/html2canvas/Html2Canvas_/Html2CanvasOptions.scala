package typings.html2canvas.Html2Canvas_

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html2CanvasOptions extends js.Object {
  /** Whether to allow cross-origin images to taint the canvas */
  var allowTaint: js.UndefOr[Boolean] = js.undefined
  /** Whether to parse and render the element asynchronously */
  var async: js.UndefOr[Boolean] = js.undefined
  /** Canvas background color, if none is specified in DOM. Set null for transparent */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  /** Existing canvas element to use as a base for drawing on */
  var canvas: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    allowTaint: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    canvas: js.Any = null,
    foreignObjectRendering: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    ignoreElements: /* element */ HTMLElement => Boolean = null,
    imageTimeout: Int | Double = null,
    letterRendering: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    onclone: /* doc */ HTMLDocument => Unit = null,
    proxy: String = null,
    removeContainer: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    scrollX: Int | Double = null,
    scrollY: Int | Double = null,
    svgRendering: js.UndefOr[Boolean] = js.undefined,
    taintTest: js.UndefOr[Boolean] = js.undefined,
    useCORS: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    windowHeight: Int | Double = null,
    windowWidth: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Html2CanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTaint)) __obj.updateDynamic("allowTaint")(allowTaint.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignObjectRendering)) __obj.updateDynamic("foreignObjectRendering")(foreignObjectRendering.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreElements != null) __obj.updateDynamic("ignoreElements")(js.Any.fromFunction1(ignoreElements))
    if (imageTimeout != null) __obj.updateDynamic("imageTimeout")(imageTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(letterRendering)) __obj.updateDynamic("letterRendering")(letterRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (onclone != null) __obj.updateDynamic("onclone")(js.Any.fromFunction1(onclone))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(removeContainer)) __obj.updateDynamic("removeContainer")(removeContainer.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scrollX != null) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (scrollY != null) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (!js.isUndefined(svgRendering)) __obj.updateDynamic("svgRendering")(svgRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(taintTest)) __obj.updateDynamic("taintTest")(taintTest.asInstanceOf[js.Any])
    if (!js.isUndefined(useCORS)) __obj.updateDynamic("useCORS")(useCORS.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html2CanvasOptions]
  }
}

