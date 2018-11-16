package typings
package html2canvasLib.Html2CanvasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Html2CanvasOptions extends js.Object {
  /** Whether to allow cross-origin images to taint the canvas */
  var allowTaint: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to parse and render the element asynchronously */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** Canvas background color, if none is specified in DOM. Set null for transparent */
  var backgroundColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Existing canvas element to use as a base for drawing on */
  var canvas: js.UndefOr[js.Any] = js.undefined
  /** Whether to use ForeignObject rendering if the browser supports it */
  var foreignObjectRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Define the heigt of the canvas in pixels. If null, renders with full height of the window. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Predicate function which removes the matching elements from the render. */
  var ignoreElements: js.UndefOr[js.Function1[/* element */ stdLib.HTMLElement, scala.Boolean]] = js.undefined
  /** Timeout for loading images, in milliseconds. Setting it to 0 will result in no timeout. */
  var imageTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Whether to render each letter seperately. Necessary if letter-spacing is used. */
  var letterRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to log events in the console. */
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  /** Callback function which is called when the Document has been cloned for rendering, can be used to modify the contents that will be rendered without affecting the original source document. */
  var onclone: js.UndefOr[html2canvasLib.Anon_Doc] = js.undefined
  /** Url to the proxy which is to be used for loading cross-origin images. If left empty, cross-origin images won't be loaded. */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to cleanup the cloned DOM elements html2canvas creates temporarily */
  var removeContainer: js.UndefOr[scala.Boolean] = js.undefined
  /** The scale to use for rendering. Defaults to the browsers device pixel ratio. */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** The x-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollX: js.UndefOr[scala.Double] = js.undefined
  /** The y-scroll position to used when rendering element, (for example if the Element uses position: fixed ) */
  var scrollY: js.UndefOr[scala.Double] = js.undefined
  /** Use svg powered rendering where available (FF11+). */
  var svgRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to test each image if it taints the canvas before drawing them */
  var taintTest: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to attempt to load cross-origin images as CORS served, before reverting back to proxy. */
  var useCORS: js.UndefOr[scala.Boolean] = js.undefined
  /** Define the width of the canvas in pixels. If null, renders with full width of the window. */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Window height to use when rendering Element, which may affect things like Media queries */
  var windowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Window width to use when rendering Element, which may affect things like Media queries */
  var windowWidth: js.UndefOr[scala.Double] = js.undefined
  /** Crop canvas x-coordinate */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Crop canvas y-coordinate */
  var y: js.UndefOr[scala.Double] = js.undefined
}

