package typings.integrateAdaptiveSimpson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod {
  
  @JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
  @js.native
  def apply(f: Func, a: Double, b: Double): js.Array[Double] = js.native
  @JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
  @js.native
  def apply(f: Func, a: Double, b: Double, tol: js.UndefOr[scala.Nothing], maxdepth: Double): js.Array[Double] = js.native
  @JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
  @js.native
  def apply(f: Func, a: Double, b: Double, tol: Double): js.Array[Double] = js.native
  @JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
  @js.native
  def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): js.Array[Double] = js.native
  
  type Func = js.Function1[/* val */ Double, Double]
}
