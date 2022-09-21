package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.imageMod.CSSRadialGradientImage
import typings.html2canvas.imageMod.GradientColorStop
import typings.html2canvas.imageMod.GradientCorner
import typings.html2canvas.imageMod.UnprocessedGradientColorStop
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateGradientDirection(angle: Double, width: Double, height: Double): js.Tuple5[Double, Double, Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateGradientDirection")(angle.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Tuple5[Double, Double, Double, Double, Double]]
  inline def calculateGradientDirection(angle: GradientCorner, width: Double, height: Double): js.Tuple5[Double, Double, Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateGradientDirection")(angle.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Tuple5[Double, Double, Double, Double, Double]]
  
  inline def calculateRadius(gradient: CSSRadialGradientImage, x: Double, y: Double, width: Double, height: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateRadius")(gradient.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def parseColorStop(context: Context, args: js.Array[CSSValue]): UnprocessedGradientColorStop = (^.asInstanceOf[js.Dynamic].applyDynamic("parseColorStop")(context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[UnprocessedGradientColorStop]
  
  inline def processColorStops(stops: js.Array[UnprocessedGradientColorStop], lineLength: Double): js.Array[GradientColorStop] = (^.asInstanceOf[js.Dynamic].applyDynamic("processColorStops")(stops.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[GradientColorStop]]
}
