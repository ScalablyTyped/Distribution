package typings
package jqueryDashJcropLib.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addClass: js.UndefOr[java.lang.String] = js.undefined
  var allowMove: js.UndefOr[scala.Boolean] = js.undefined
  var allowResize: js.UndefOr[scala.Boolean] = js.undefined
  // Basic Settings
  var allowSelect: js.UndefOr[scala.Boolean] = js.undefined
  var animationDelay: js.UndefOr[scala.Double] = js.undefined
  /** Aspect ratio of w/h (e.g. 1 for square)  */
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  /** Set color of background container @default 'black' */
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var bgFade: js.UndefOr[scala.Boolean] = js.undefined
  /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
  var bgOpacity: js.UndefOr[scala.Double] = js.undefined
  var borderOpacity: js.UndefOr[scala.Double] = js.undefined
  var boundary: js.UndefOr[scala.Double] = js.undefined
  /** Maximum height of cropping area @default 0 (no limit) */
  var boxHeight: js.UndefOr[scala.Double] = js.undefined
  /** Maximum width of cropping area @default 0 (no limit) */
  var boxWidth: js.UndefOr[scala.Double] = js.undefined
  var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.undefined
  var dragEdges: js.UndefOr[scala.Boolean] = js.undefined
  var drawBorders: js.UndefOr[scala.Boolean] = js.undefined
  var fadeTime: js.UndefOr[scala.Double] = js.undefined
  var fixedSupport: js.UndefOr[scala.Boolean] = js.undefined
  var handleOpacity: js.UndefOr[scala.Double] = js.undefined
  var handleSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var keySupport: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
  var maxSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var minSelect: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
  var minSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Called when the selection is moving */
  var onChange: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when double-clicked */
  var onDblClick: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when the selection is released */
  var onRelease: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when selection is completed */
  var onSelect: js.UndefOr[JCropEventHandler] = js.undefined
  /** Set an initial selection area; [x, y, x2, y2] */
  var setSelect: js.UndefOr[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.undefined
  var shade: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var swingSpeed: js.UndefOr[scala.Double] = js.undefined
  var touchSupport: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var trackDocument: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the true size of the image */
  var trueSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

