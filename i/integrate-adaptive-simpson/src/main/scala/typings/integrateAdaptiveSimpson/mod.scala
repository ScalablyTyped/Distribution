package typings.integrateAdaptiveSimpson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(f: Func, a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(f: Func, a: Double, b: Double, tol: Double): Double = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): Double = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any], maxdepth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(f: Func, a: Double, b: Double, tol: Unit, maxdepth: Double): Double = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any], maxdepth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("integrate-adaptive-simpson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Func = js.Function1[/* val */ Double, Double]
}
