package typings.html2canvas

import typings.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typings.html2canvas.distTypesRenderPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderBoundCurvesMod {
  
  @JSImport("html2canvas/dist/types/render/bound-curves", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/bound-curves", "BoundCurves")
  @js.native
  open class BoundCurves protected () extends StObject {
    def this(element: ElementContainer) = this()
    
    val bottomLeftBorderBox: Path = js.native
    
    val bottomLeftBorderDoubleInnerBox: Path = js.native
    
    val bottomLeftBorderDoubleOuterBox: Path = js.native
    
    val bottomLeftBorderStroke: Path = js.native
    
    val bottomLeftContentBox: Path = js.native
    
    val bottomLeftPaddingBox: Path = js.native
    
    val bottomRightBorderBox: Path = js.native
    
    val bottomRightBorderDoubleInnerBox: Path = js.native
    
    val bottomRightBorderDoubleOuterBox: Path = js.native
    
    val bottomRightBorderStroke: Path = js.native
    
    val bottomRightContentBox: Path = js.native
    
    val bottomRightPaddingBox: Path = js.native
    
    val topLeftBorderBox: Path = js.native
    
    val topLeftBorderDoubleInnerBox: Path = js.native
    
    val topLeftBorderDoubleOuterBox: Path = js.native
    
    val topLeftBorderStroke: Path = js.native
    
    val topLeftContentBox: Path = js.native
    
    val topLeftPaddingBox: Path = js.native
    
    val topRightBorderBox: Path = js.native
    
    val topRightBorderDoubleInnerBox: Path = js.native
    
    val topRightBorderDoubleOuterBox: Path = js.native
    
    val topRightBorderStroke: Path = js.native
    
    val topRightContentBox: Path = js.native
    
    val topRightPaddingBox: Path = js.native
  }
  
  inline def calculateBorderBoxPath(curves: BoundCurves): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateBorderBoxPath")(curves.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  
  inline def calculateContentBoxPath(curves: BoundCurves): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateContentBoxPath")(curves.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  
  inline def calculatePaddingBoxPath(curves: BoundCurves): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePaddingBoxPath")(curves.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
}
