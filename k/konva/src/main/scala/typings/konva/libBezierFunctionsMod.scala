package typings.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBezierFunctionsMod {
  
  @JSImport("konva/lib/BezierFunctions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("konva/lib/BezierFunctions", "binomialCoefficients")
  @js.native
  val binomialCoefficients: js.Array[js.Array[Double]] = js.native
  
  @JSImport("konva/lib/BezierFunctions", "cValues")
  @js.native
  val cValues: js.Array[js.Array[Double]] = js.native
  
  inline def getCubicArcLength(xs: js.Array[Double], ys: js.Array[Double], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCubicArcLength")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getQuadraticArcLength(xs: js.Array[Double], ys: js.Array[Double], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuadraticArcLength")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def t2length(length: Double, totalLength: Double, func: js.Function1[/* t */ Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("t2length")(length.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("konva/lib/BezierFunctions", "tValues")
  @js.native
  val tValues: js.Array[js.Array[Double]] = js.native
}
