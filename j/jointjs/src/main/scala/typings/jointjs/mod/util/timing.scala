package typings.jointjs.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "util.timing")
@js.native
object timing extends js.Object {
  
  def back(): TimingFunction = js.native
  def back(s: Double): TimingFunction = js.native
  
  var bounce: TimingFunction = js.native
  
  def clamp(f: TimingFunction): TimingFunction = js.native
  def clamp(f: TimingFunction, min: js.UndefOr[scala.Nothing], max: Double): TimingFunction = js.native
  def clamp(f: TimingFunction, min: Double): TimingFunction = js.native
  def clamp(f: TimingFunction, min: Double, max: Double): TimingFunction = js.native
  
  var cubic: TimingFunction = js.native
  
  def elastic(): TimingFunction = js.native
  def elastic(x: Double): TimingFunction = js.native
  
  var exponential: TimingFunction = js.native
  
  var inout: TimingFunction = js.native
  
  var linear: TimingFunction = js.native
  
  var quad: TimingFunction = js.native
  
  def reflect(f: TimingFunction): TimingFunction = js.native
  
  def reverse(f: TimingFunction): TimingFunction = js.native
  
  type TimingFunction = js.Function1[/* time */ Double, Double]
}
