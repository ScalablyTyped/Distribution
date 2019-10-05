package typings.integrateDashAdaptiveDashSimpson

import typings.integrateDashAdaptiveDashSimpson.integrateDashAdaptiveDashSimpsonMod.Func
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("integrate-adaptive-simpson", JSImport.Namespace)
@js.native
object integrateDashAdaptiveDashSimpsonMod extends js.Object {
  def apply(f: Func, a: Double, b: Double): Double = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double): Double = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): Double = js.native
  type Func = js.Function1[/* val */ Double, Double]
}

