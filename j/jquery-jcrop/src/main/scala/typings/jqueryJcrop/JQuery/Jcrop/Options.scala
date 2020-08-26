package typings.jqueryJcrop.JQuery.Jcrop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addClass: js.UndefOr[String] = js.native
  var allowMove: js.UndefOr[Boolean] = js.native
  var allowResize: js.UndefOr[Boolean] = js.native
  // Basic Settings
  var allowSelect: js.UndefOr[Boolean] = js.native
  var animationDelay: js.UndefOr[Double] = js.native
  /** Aspect ratio of w/h (e.g. 1 for square)  */
  var aspectRatio: js.UndefOr[Double] = js.native
  var baseClass: js.UndefOr[String] = js.native
  /** Set color of background container @default 'black' */
  var bgColor: js.UndefOr[String] = js.native
  var bgFade: js.UndefOr[Boolean] = js.native
  /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
  var bgOpacity: js.UndefOr[Double] = js.native
  var borderOpacity: js.UndefOr[Double] = js.native
  var boundary: js.UndefOr[Double] = js.native
  /** Maximum height of cropping area @default 0 (no limit) */
  var boxHeight: js.UndefOr[Double] = js.native
  /** Maximum width of cropping area @default 0 (no limit) */
  var boxWidth: js.UndefOr[Double] = js.native
  var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.native
  var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.native
  var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.native
  var dragEdges: js.UndefOr[Boolean] = js.native
  var drawBorders: js.UndefOr[Boolean] = js.native
  var fadeTime: js.UndefOr[Double] = js.native
  var fixedSupport: js.UndefOr[Boolean] = js.native
  var handleOpacity: js.UndefOr[Double] = js.native
  var handleSize: js.UndefOr[Double | Null] = js.native
  var keySupport: js.UndefOr[Boolean] = js.native
  /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
  var maxSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var minSelect: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
  var minSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Called when the selection is moving */
  var onChange: js.UndefOr[JCropEventHandler] = js.native
  /** Called when double-clicked */
  var onDblClick: js.UndefOr[JCropEventHandler] = js.native
  /** Called when the selection is released */
  var onRelease: js.UndefOr[JCropEventHandler] = js.native
  /** Called when selection is completed */
  var onSelect: js.UndefOr[JCropEventHandler] = js.native
  /** Set an initial selection area; [x, y, x2, y2] */
  var setSelect: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var shade: js.UndefOr[Boolean | Null] = js.native
  var swingSpeed: js.UndefOr[Double] = js.native
  var touchSupport: js.UndefOr[Boolean | Null] = js.native
  var trackDocument: js.UndefOr[Boolean] = js.native
  /** Specify the true size of the image */
  var trueSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAddClass(value: String): Self = this.set("addClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setAllowMove(value: Boolean): Self = this.set("allowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMove: Self = this.set("allowMove", js.undefined)
    @scala.inline
    def setAllowResize(value: Boolean): Self = this.set("allowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResize: Self = this.set("allowResize", js.undefined)
    @scala.inline
    def setAllowSelect(value: Boolean): Self = this.set("allowSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelect: Self = this.set("allowSelect", js.undefined)
    @scala.inline
    def setAnimationDelay(value: Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setBgFade(value: Boolean): Self = this.set("bgFade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgFade: Self = this.set("bgFade", js.undefined)
    @scala.inline
    def setBgOpacity(value: Double): Self = this.set("bgOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgOpacity: Self = this.set("bgOpacity", js.undefined)
    @scala.inline
    def setBorderOpacity(value: Double): Self = this.set("borderOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOpacity: Self = this.set("borderOpacity", js.undefined)
    @scala.inline
    def setBoundary(value: Double): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setBoxHeight(value: Double): Self = this.set("boxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxHeight: Self = this.set("boxHeight", js.undefined)
    @scala.inline
    def setBoxWidth(value: Double): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxWidth: Self = this.set("boxWidth", js.undefined)
    @scala.inline
    def setCreateBordersVarargs(value: CardinalDirection*): Self = this.set("createBorders", js.Array(value :_*))
    @scala.inline
    def setCreateBorders(value: js.Array[CardinalDirection]): Self = this.set("createBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateBorders: Self = this.set("createBorders", js.undefined)
    @scala.inline
    def setCreateDragbarsVarargs(value: CardinalDirection*): Self = this.set("createDragbars", js.Array(value :_*))
    @scala.inline
    def setCreateDragbars(value: js.Array[CardinalDirection]): Self = this.set("createDragbars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDragbars: Self = this.set("createDragbars", js.undefined)
    @scala.inline
    def setCreateHandlesVarargs(value: (CardinalDirection | IntermediateDirection)*): Self = this.set("createHandles", js.Array(value :_*))
    @scala.inline
    def setCreateHandles(value: js.Array[CardinalDirection | IntermediateDirection]): Self = this.set("createHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateHandles: Self = this.set("createHandles", js.undefined)
    @scala.inline
    def setDragEdges(value: Boolean): Self = this.set("dragEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEdges: Self = this.set("dragEdges", js.undefined)
    @scala.inline
    def setDrawBorders(value: Boolean): Self = this.set("drawBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBorders: Self = this.set("drawBorders", js.undefined)
    @scala.inline
    def setFadeTime(value: Double): Self = this.set("fadeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeTime: Self = this.set("fadeTime", js.undefined)
    @scala.inline
    def setFixedSupport(value: Boolean): Self = this.set("fixedSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedSupport: Self = this.set("fixedSupport", js.undefined)
    @scala.inline
    def setHandleOpacity(value: Double): Self = this.set("handleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleOpacity: Self = this.set("handleOpacity", js.undefined)
    @scala.inline
    def setHandleSize(value: Double): Self = this.set("handleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleSize: Self = this.set("handleSize", js.undefined)
    @scala.inline
    def setHandleSizeNull: Self = this.set("handleSize", null)
    @scala.inline
    def setKeySupport(value: Boolean): Self = this.set("keySupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySupport: Self = this.set("keySupport", js.undefined)
    @scala.inline
    def setMaxSize(value: js.Tuple2[Double, Double]): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSelect(value: js.Tuple2[Double, Double]): Self = this.set("minSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSelect: Self = this.set("minSelect", js.undefined)
    @scala.inline
    def setMinSize(value: js.Tuple2[Double, Double]): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setOnChange(value: /* c */ SelectionInfo => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDblClick(value: /* c */ SelectionInfo => Unit): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnRelease(value: /* c */ SelectionInfo => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    @scala.inline
    def setOnSelect(value: /* c */ SelectionInfo => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSetSelect(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("setSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSelect: Self = this.set("setSelect", js.undefined)
    @scala.inline
    def setShade(value: Boolean): Self = this.set("shade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShade: Self = this.set("shade", js.undefined)
    @scala.inline
    def setShadeNull: Self = this.set("shade", null)
    @scala.inline
    def setSwingSpeed(value: Double): Self = this.set("swingSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwingSpeed: Self = this.set("swingSpeed", js.undefined)
    @scala.inline
    def setTouchSupport(value: Boolean): Self = this.set("touchSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSupport: Self = this.set("touchSupport", js.undefined)
    @scala.inline
    def setTouchSupportNull: Self = this.set("touchSupport", null)
    @scala.inline
    def setTrackDocument(value: Boolean): Self = this.set("trackDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackDocument: Self = this.set("trackDocument", js.undefined)
    @scala.inline
    def setTrueSize(value: js.Tuple2[Double, Double]): Self = this.set("trueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueSize: Self = this.set("trueSize", js.undefined)
  }
  
}

