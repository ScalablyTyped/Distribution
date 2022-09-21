package typings.jsboxmuller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generates normally-distributed pseudo-random numbers using the polar form of the
    * Box-Muller transform (https://en.wikipedia.org/wiki/Box%E2%80%93Muller_transform).
    *
    * Note that the documentation for the jsboxmuller package incorrectly referrs to the
    * second argument as "variance", when it is really standard deviation (the square root
    * of variance); it is labeled correctly here.
    *
    * @param mean - The mean of the normal distribution; defaults to 0 if not provided.
    * @param stdDev - The standarad deviation of the distribtion; defaults to 1 if not provided.
    */
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(mean: Double): Double = ^.asInstanceOf[js.Dynamic].apply(mean.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(mean: Double, stdDev: Double): Double = (^.asInstanceOf[js.Dynamic].apply(mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(mean: Unit, stdDev: Double): Double = (^.asInstanceOf[js.Dynamic].apply(mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("jsboxmuller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
