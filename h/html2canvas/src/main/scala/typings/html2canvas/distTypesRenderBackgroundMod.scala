package typings.html2canvas

import typings.html2canvas.distTypesCssLayoutBoundsMod.Bounds
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundClipMod.BACKGROUND_CLIP
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundOriginMod.BACKGROUND_ORIGIN
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundRepeatMod.BACKGROUND_REPEAT
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BackgroundSizeInfo
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typings.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typings.html2canvas.distTypesRenderPathMod.Path
import typings.html2canvas.distTypesRenderVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderBackgroundMod {
  
  @JSImport("html2canvas/dist/types/render/background", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateBackgroundPaintingArea(backgroundClip: BACKGROUND_CLIP, element: ElementContainer): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackgroundPaintingArea")(backgroundClip.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def calculateBackgroundPositioningArea(backgroundOrigin: BACKGROUND_ORIGIN, element: ElementContainer): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackgroundPositioningArea")(backgroundOrigin.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def calculateBackgroundRendering(
    container: ElementContainer,
    index: Double,
    intrinsicSize: js.Tuple3[Double | Null, Double | Null, Double | Null]
  ): js.Tuple5[js.Array[Path], Double, Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackgroundRendering")(container.asInstanceOf[js.Any], index.asInstanceOf[js.Any], intrinsicSize.asInstanceOf[js.Any])).asInstanceOf[js.Tuple5[js.Array[Path], Double, Double, Double, Double]]
  
  inline def calculateBackgroundRepeatPath(
    repeat: BACKGROUND_REPEAT,
    hasXY: js.Tuple2[Double, Double],
    hasWidthHeight: js.Tuple2[Double, Double],
    backgroundPositioningArea: Bounds,
    backgroundPaintingArea: Bounds
  ): js.Tuple4[Vector, Vector, Vector, Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackgroundRepeatPath")(repeat.asInstanceOf[js.Any], hasXY.asInstanceOf[js.Any], hasWidthHeight.asInstanceOf[js.Any], backgroundPositioningArea.asInstanceOf[js.Any], backgroundPaintingArea.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[Vector, Vector, Vector, Vector]]
  
  inline def calculateBackgroundSize(
    size: js.Array[BackgroundSizeInfo],
    hasIntrinsicWidthIntrinsicHeightIntrinsicProportion: js.Tuple3[Double | Null, Double | Null, Double | Null],
    bounds: Bounds
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackgroundSize")(size.asInstanceOf[js.Any], hasIntrinsicWidthIntrinsicHeightIntrinsicProportion.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getBackgroundValueForIndex[T](values: js.Array[T], index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundValueForIndex")(values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isAuto(token: CSSValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuto")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
