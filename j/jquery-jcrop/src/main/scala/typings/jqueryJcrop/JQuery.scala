package typings.jqueryJcrop

import typings.jqueryJcrop.JQuery.Jcrop.Api
import typings.jqueryJcrop.JQuery.Jcrop.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def Jcrop(): JQuery = js.native
  def Jcrop(options: Unit, callback: js.ThisFunction0[/* this */ Api, Unit]): JQuery = js.native
  def Jcrop(options: Options): JQuery = js.native
  def Jcrop(options: Options, callback: js.ThisFunction0[/* this */ Api, Unit]): JQuery = js.native
}
object JQuery {
  
  object Jcrop {
    
    trait Api extends StObject {
      
      /** Animate selection to new selection, format: [ x,y,x2,y2 ] */
      def animateTo(selection: js.Tuple4[Double, Double, Double, Double]): Unit
      
      /** Disables Jcrop interactivity */
      def disable(): Unit
      
      /** Enables Jcrop interactivity */
      def enable(): Unit
      
      /** Release current selection */
      def release(): Unit
      
      /** Remove Jcrop entirely */
      def remove(): Unit
      
      /** Set selection, format: [ x,y,x2,y2 ] */
      def setSelect(selection: js.Tuple4[Double, Double, Double, Double]): Unit
      
      /** Query current selection values (interface)  */
      def tellScaled(): SelectionInfo
      
      /** Query current selection values (true size) */
      def tellSelect(): SelectionInfo
    }
    object Api {
      
      inline def apply(
        animateTo: js.Tuple4[Double, Double, Double, Double] => Unit,
        disable: () => Unit,
        enable: () => Unit,
        release: () => Unit,
        remove: () => Unit,
        setSelect: js.Tuple4[Double, Double, Double, Double] => Unit,
        tellScaled: () => SelectionInfo,
        tellSelect: () => SelectionInfo
      ): Api = {
        val __obj = js.Dynamic.literal(animateTo = js.Any.fromFunction1(animateTo), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction0(remove), setSelect = js.Any.fromFunction1(setSelect), tellScaled = js.Any.fromFunction0(tellScaled), tellSelect = js.Any.fromFunction0(tellSelect))
        __obj.asInstanceOf[Api]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
        
        inline def setAnimateTo(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = StObject.set(x, "animateTo", js.Any.fromFunction1(value))
        
        inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
        
        inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
        
        inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
        
        inline def setSetSelect(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = StObject.set(x, "setSelect", js.Any.fromFunction1(value))
        
        inline def setTellScaled(value: () => SelectionInfo): Self = StObject.set(x, "tellScaled", js.Any.fromFunction0(value))
        
        inline def setTellSelect(value: () => SelectionInfo): Self = StObject.set(x, "tellSelect", js.Any.fromFunction0(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jqueryJcrop.jqueryJcropStrings.n
      - typings.jqueryJcrop.jqueryJcropStrings.s
      - typings.jqueryJcrop.jqueryJcropStrings.e
      - typings.jqueryJcrop.jqueryJcropStrings.w
    */
    trait CardinalDirection extends StObject
    object CardinalDirection {
      
      inline def e: typings.jqueryJcrop.jqueryJcropStrings.e = "e".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.e]
      
      inline def n: typings.jqueryJcrop.jqueryJcropStrings.n = "n".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.n]
      
      inline def s: typings.jqueryJcrop.jqueryJcropStrings.s = "s".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.s]
      
      inline def w: typings.jqueryJcrop.jqueryJcropStrings.w = "w".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.w]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jqueryJcrop.jqueryJcropStrings.nw
      - typings.jqueryJcrop.jqueryJcropStrings.ne
      - typings.jqueryJcrop.jqueryJcropStrings.se
      - typings.jqueryJcrop.jqueryJcropStrings.sw
    */
    trait IntermediateDirection extends StObject
    object IntermediateDirection {
      
      inline def ne: typings.jqueryJcrop.jqueryJcropStrings.ne = "ne".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.ne]
      
      inline def nw: typings.jqueryJcrop.jqueryJcropStrings.nw = "nw".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.nw]
      
      inline def se: typings.jqueryJcrop.jqueryJcropStrings.se = "se".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.se]
      
      inline def sw: typings.jqueryJcrop.jqueryJcropStrings.sw = "sw".asInstanceOf[typings.jqueryJcrop.jqueryJcropStrings.sw]
    }
    
    type JCropEventHandler = js.Function1[/* c */ SelectionInfo, Unit]
    
    trait Options extends StObject {
      
      var addClass: js.UndefOr[String] = js.undefined
      
      var allowMove: js.UndefOr[Boolean] = js.undefined
      
      var allowResize: js.UndefOr[Boolean] = js.undefined
      
      // Basic Settings
      var allowSelect: js.UndefOr[Boolean] = js.undefined
      
      var animationDelay: js.UndefOr[Double] = js.undefined
      
      /** Aspect ratio of w/h (e.g. 1 for square)  */
      var aspectRatio: js.UndefOr[Double] = js.undefined
      
      var baseClass: js.UndefOr[String] = js.undefined
      
      /** Set color of background container @default 'black' */
      var bgColor: js.UndefOr[String] = js.undefined
      
      var bgFade: js.UndefOr[Boolean] = js.undefined
      
      /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
      var bgOpacity: js.UndefOr[Double] = js.undefined
      
      var borderOpacity: js.UndefOr[Double] = js.undefined
      
      var boundary: js.UndefOr[Double] = js.undefined
      
      /** Maximum height of cropping area @default 0 (no limit) */
      var boxHeight: js.UndefOr[Double] = js.undefined
      
      /** Maximum width of cropping area @default 0 (no limit) */
      var boxWidth: js.UndefOr[Double] = js.undefined
      
      var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
      
      var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
      
      var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.undefined
      
      var dragEdges: js.UndefOr[Boolean] = js.undefined
      
      var drawBorders: js.UndefOr[Boolean] = js.undefined
      
      var fadeTime: js.UndefOr[Double] = js.undefined
      
      var fixedSupport: js.UndefOr[Boolean] = js.undefined
      
      var handleOpacity: js.UndefOr[Double] = js.undefined
      
      var handleSize: js.UndefOr[Double | Null] = js.undefined
      
      var keySupport: js.UndefOr[Boolean] = js.undefined
      
      /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
      var maxSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      var minSelect: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
      var minSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      /** Called when the selection is moving */
      var onChange: js.UndefOr[JCropEventHandler] = js.undefined
      
      /** Called when double-clicked */
      var onDblClick: js.UndefOr[JCropEventHandler] = js.undefined
      
      /** Called when the selection is released */
      var onRelease: js.UndefOr[JCropEventHandler] = js.undefined
      
      /** Called when selection is completed */
      var onSelect: js.UndefOr[JCropEventHandler] = js.undefined
      
      /** Set an initial selection area; [x, y, x2, y2] */
      var setSelect: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
      
      var shade: js.UndefOr[Boolean | Null] = js.undefined
      
      var swingSpeed: js.UndefOr[Double] = js.undefined
      
      var touchSupport: js.UndefOr[Boolean | Null] = js.undefined
      
      var trackDocument: js.UndefOr[Boolean] = js.undefined
      
      /** Specify the true size of the image */
      var trueSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
        
        inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
        
        inline def setAllowMove(value: Boolean): Self = StObject.set(x, "allowMove", value.asInstanceOf[js.Any])
        
        inline def setAllowMoveUndefined: Self = StObject.set(x, "allowMove", js.undefined)
        
        inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
        
        inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
        
        inline def setAllowSelect(value: Boolean): Self = StObject.set(x, "allowSelect", value.asInstanceOf[js.Any])
        
        inline def setAllowSelectUndefined: Self = StObject.set(x, "allowSelect", js.undefined)
        
        inline def setAnimationDelay(value: Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
        
        inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
        
        inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
        
        inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
        
        inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
        
        inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
        
        inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
        
        inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
        
        inline def setBgFade(value: Boolean): Self = StObject.set(x, "bgFade", value.asInstanceOf[js.Any])
        
        inline def setBgFadeUndefined: Self = StObject.set(x, "bgFade", js.undefined)
        
        inline def setBgOpacity(value: Double): Self = StObject.set(x, "bgOpacity", value.asInstanceOf[js.Any])
        
        inline def setBgOpacityUndefined: Self = StObject.set(x, "bgOpacity", js.undefined)
        
        inline def setBorderOpacity(value: Double): Self = StObject.set(x, "borderOpacity", value.asInstanceOf[js.Any])
        
        inline def setBorderOpacityUndefined: Self = StObject.set(x, "borderOpacity", js.undefined)
        
        inline def setBoundary(value: Double): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
        
        inline def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
        
        inline def setBoxHeightUndefined: Self = StObject.set(x, "boxHeight", js.undefined)
        
        inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
        
        inline def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
        
        inline def setCreateBorders(value: js.Array[CardinalDirection]): Self = StObject.set(x, "createBorders", value.asInstanceOf[js.Any])
        
        inline def setCreateBordersUndefined: Self = StObject.set(x, "createBorders", js.undefined)
        
        inline def setCreateBordersVarargs(value: CardinalDirection*): Self = StObject.set(x, "createBorders", js.Array(value*))
        
        inline def setCreateDragbars(value: js.Array[CardinalDirection]): Self = StObject.set(x, "createDragbars", value.asInstanceOf[js.Any])
        
        inline def setCreateDragbarsUndefined: Self = StObject.set(x, "createDragbars", js.undefined)
        
        inline def setCreateDragbarsVarargs(value: CardinalDirection*): Self = StObject.set(x, "createDragbars", js.Array(value*))
        
        inline def setCreateHandles(value: js.Array[CardinalDirection | IntermediateDirection]): Self = StObject.set(x, "createHandles", value.asInstanceOf[js.Any])
        
        inline def setCreateHandlesUndefined: Self = StObject.set(x, "createHandles", js.undefined)
        
        inline def setCreateHandlesVarargs(value: (CardinalDirection | IntermediateDirection)*): Self = StObject.set(x, "createHandles", js.Array(value*))
        
        inline def setDragEdges(value: Boolean): Self = StObject.set(x, "dragEdges", value.asInstanceOf[js.Any])
        
        inline def setDragEdgesUndefined: Self = StObject.set(x, "dragEdges", js.undefined)
        
        inline def setDrawBorders(value: Boolean): Self = StObject.set(x, "drawBorders", value.asInstanceOf[js.Any])
        
        inline def setDrawBordersUndefined: Self = StObject.set(x, "drawBorders", js.undefined)
        
        inline def setFadeTime(value: Double): Self = StObject.set(x, "fadeTime", value.asInstanceOf[js.Any])
        
        inline def setFadeTimeUndefined: Self = StObject.set(x, "fadeTime", js.undefined)
        
        inline def setFixedSupport(value: Boolean): Self = StObject.set(x, "fixedSupport", value.asInstanceOf[js.Any])
        
        inline def setFixedSupportUndefined: Self = StObject.set(x, "fixedSupport", js.undefined)
        
        inline def setHandleOpacity(value: Double): Self = StObject.set(x, "handleOpacity", value.asInstanceOf[js.Any])
        
        inline def setHandleOpacityUndefined: Self = StObject.set(x, "handleOpacity", js.undefined)
        
        inline def setHandleSize(value: Double): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
        
        inline def setHandleSizeNull: Self = StObject.set(x, "handleSize", null)
        
        inline def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
        
        inline def setKeySupport(value: Boolean): Self = StObject.set(x, "keySupport", value.asInstanceOf[js.Any])
        
        inline def setKeySupportUndefined: Self = StObject.set(x, "keySupport", js.undefined)
        
        inline def setMaxSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
        
        inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
        
        inline def setMinSelect(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minSelect", value.asInstanceOf[js.Any])
        
        inline def setMinSelectUndefined: Self = StObject.set(x, "minSelect", js.undefined)
        
        inline def setMinSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
        
        inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
        
        inline def setOnChange(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnDblClick(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
        
        inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
        
        inline def setOnRelease(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
        
        inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
        
        inline def setOnSelect(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        inline def setSetSelect(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "setSelect", value.asInstanceOf[js.Any])
        
        inline def setSetSelectUndefined: Self = StObject.set(x, "setSelect", js.undefined)
        
        inline def setShade(value: Boolean): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
        
        inline def setShadeNull: Self = StObject.set(x, "shade", null)
        
        inline def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
        
        inline def setSwingSpeed(value: Double): Self = StObject.set(x, "swingSpeed", value.asInstanceOf[js.Any])
        
        inline def setSwingSpeedUndefined: Self = StObject.set(x, "swingSpeed", js.undefined)
        
        inline def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
        
        inline def setTouchSupportNull: Self = StObject.set(x, "touchSupport", null)
        
        inline def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
        
        inline def setTrackDocument(value: Boolean): Self = StObject.set(x, "trackDocument", value.asInstanceOf[js.Any])
        
        inline def setTrackDocumentUndefined: Self = StObject.set(x, "trackDocument", js.undefined)
        
        inline def setTrueSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "trueSize", value.asInstanceOf[js.Any])
        
        inline def setTrueSizeUndefined: Self = StObject.set(x, "trueSize", js.undefined)
      }
    }
    
    trait SelectionInfo extends StObject {
      
      var h: Double
      
      var w: Double
      
      var x: Double
      
      var x2: Double
      
      var y: Double
      
      var y2: Double
    }
    object SelectionInfo {
      
      inline def apply(h: Double, w: Double, x: Double, x2: Double, y: Double, y2: Double): SelectionInfo = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectionInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SelectionInfo] (val x: Self) extends AnyVal {
        
        inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      }
    }
  }
}
