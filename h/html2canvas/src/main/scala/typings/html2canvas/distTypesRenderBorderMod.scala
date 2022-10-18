package typings.html2canvas

import typings.html2canvas.distTypesRenderBoundCurvesMod.BoundCurves
import typings.html2canvas.distTypesRenderPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderBorderMod {
  
  @JSImport("html2canvas/dist/types/render/border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePathForBorder(curves: BoundCurves, borderSide: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePathForBorder")(curves.asInstanceOf[js.Any], borderSide.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def parsePathForBorderDoubleInner(curves: BoundCurves, borderSide: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePathForBorderDoubleInner")(curves.asInstanceOf[js.Any], borderSide.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def parsePathForBorderDoubleOuter(curves: BoundCurves, borderSide: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePathForBorderDoubleOuter")(curves.asInstanceOf[js.Any], borderSide.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def parsePathForBorderStroke(curves: BoundCurves, borderSide: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePathForBorderStroke")(curves.asInstanceOf[js.Any], borderSide.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
}
