package typings.integrateAdaptiveSimpson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod {
  
  inline def apply(f: Func, a: Double, b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(f: Func, a: Double, b: Double, tol: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any], maxdepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(f: Func, a: Double, b: Double, tol: Unit, maxdepth: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tol.asInstanceOf[js.Any], maxdepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Func = js.Function1[/* val */ Double, Double]
}
