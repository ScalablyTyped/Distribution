package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcUtilsArithmeticMod {
  
  @JSImport("image-q/dist/types/src/utils/arithmetic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def degrees2radians(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degrees2radians")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def inRange0to255(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inRange0to255")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def inRange0to255Rounded(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inRange0to255Rounded")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def intInRange(value: Double, low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intInRange")(value.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def max3(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("max3")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def min3(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("min3")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arrayToSort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
